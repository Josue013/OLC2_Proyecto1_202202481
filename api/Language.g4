grammar Language;

options { caseInsensitive = false; }

// antlr4 -Dlanguage=CSharp -o analyzer -package analyzer -visitor *.g4

program: dcl*;

dcl: varDcl | stmt;

varDcl: 'var' ID type ('=' expr)?;

stmt:
	expr 														# ExprStmt
	| 'fmt.Println(' exprList ')'		# PrintStmt
	| '{' dcl* '}'									# BlockStmt
	// Sentences of control
	| 'if' expr stmt ('else' stmt)? # IfStmt
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

	// Logical operations
	| expr op = ('&&' | '||') expr	# Logical
	
	// Primitive data types
	| INT			# Int
	| DECIMAL	# Decimal
	| RUNE		# Rune
	| STRING	# String
	| BOOL		# Bool
	| ID			# Identifier
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