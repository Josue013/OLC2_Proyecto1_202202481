grammar Language;

options { caseInsensitive = false; }

// antlr4 -Dlanguage=CSharp -o analyzer -package analyzer -visitor *.g4

program: dcl*;

dcl: varDcl | stmt (';')?;

varDcl: 'var' ID type ('=' expr)?;

stmt:
	expr 														# ExprStmt
	| 'fmt.Println(' exprList ')'		# PrintStmt
	| '{' dcl* '}'									# BlockStmt
	// Sentences of control
	| 'if' expr stmt ('else' stmt)? # IfStmt
	| 'switch' expr '{' ('case' expr ':' stmt*)* ('default' ':' stmt*)? '}' # SwitchStmt
	// Loops
	| 'for' expr stmt 									# ForWhileStmt
	| 'for' forInit ';' expr ';' expr stmt # ForClassicStmt
	| 'for' ID 'range' expr stmt 				# ForRangeStmt
	// inc/dec
	//| ID op= ('++' | '--')							# IncDecStmt
	| incdec													# IncDecStmt
	// Slices
	| slice1													# Slice1xd
	| slice2													# Slice2xd
	// Sentencias de transferencia
	| 'break'													# BreakStmt
	| 'continue'											# ContinueStmt
	| 'return' expr?									# ReturnStmt
	;

forInit: varDcl | expr;

incdec: ID op= ('++' | '--')
;

slice1:
	// Declaracion con inicializacion de valores
	ID ':=' '[]' type '{' exprList '}' # Slice1Stmt
	// Declaracion de slice vacio
	| 'var' ID '[]' type # Slice2Stmt
	// Asignacion de valores
	| ID '[' expr ']' '=' expr # Slice3Stmt
	
;

slice2:
	// Definicion y asignacion de valores
	ID ':=' '[][]' type '{' exprList '}' (',' '{' exprList '}')* # Slice4Stmt
	// Asignacion de valores
	| ID '[' expr ']' '[' expr ']' '=' expr # Slice5Stmt
	
;

type: 'int' 
	| 'float64' 
	| 'string' 
	| 'bool' 
	| 'rune'
	;

exprList:
	expr (',' expr)* 
	; 

expr:

	'(' expr ')' # Parens

	// Arithmetic operations
	| '-' expr										# Negate
	| '!' expr										# Not
	| expr op = ('*' | '/') expr	# MulDiv
	| expr '%' expr								# Mod
	| expr op = ('+' | '-') expr	# AddSub
	| ID '+=' expr								# AddAssign
	| ID '-=' expr								# SubAssign

	// Relational operations
	| expr op = '<' expr	# Relational
	| expr op = '<=' expr	# Relational
	| expr op = '>' expr	# Relational
	| expr op = '>=' expr	# Relational

	// comparison operations
	| expr op = '==' expr	# Comparison
	| expr op = '!=' expr	# Comparison

	// Assignment operations
	| ID op=('=' | ':=') expr # Assign

	// Acceso vector
	| ID '[' expr ']' # Slice6Stmt

	// Acceso matriz
	| ID '[' expr ']' '[' expr ']' # Slice7Stmt

	// Logical operations
	| expr op = ('&&' | '||') expr	# Logical
	
	// Primitive data types
	| INT			# Int
	| DECIMAL	# Decimal
	| RUNE		# Rune
	| STRING	# String
	| BOOL		# Bool
	| ID			# Identifier

	| incdec		# IncDecExpr
	;

INT: [0-9]+;
DECIMAL: [0-9]+ ('.' [0-9]+);
RUNE: '\'' (ESC_SEQ | ~['\\]) '\'';
STRING: '"' (ESC_SEQ | ~["\\])* '"';
BOOL: 'true' | 'false';
ID: [a-zA-Z_][a-zA-Z0-9_]*;

// Skip
WS: [ \t\r\n]+ -> skip;
COMENTARIO: '//' .*? ('\n' | EOF) -> skip;
COMENTARIO_MULTILINEA: '/*' .*? '*/' -> skip;

// escape sequences
fragment ESC_SEQ: '\\' [btnr"\\];