// Generated from /media/josue/Elements/bato/p/OLC2_Proyecto1_202202481/api/Language.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, INT=49, DECIMAL=50, RUNE=51, STRING=52, 
		BOOL=53, ID=54, WS=55, COMENTARIO=56, COMENTARIO_MULTILINEA=57;
	public static final int
		RULE_program = 0, RULE_dcl = 1, RULE_varDcl = 2, RULE_stmt = 3, RULE_forInit = 4, 
		RULE_incdec = 5, RULE_slice1 = 6, RULE_slice2 = 7, RULE_type = 8, RULE_exprList = 9, 
		RULE_expr = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "dcl", "varDcl", "stmt", "forInit", "incdec", "slice1", "slice2", 
			"type", "exprList", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'var'", "'='", "'fmt.Println('", "')'", "'{'", "'}'", "'if'", 
			"'else'", "'switch'", "'case'", "':'", "'default'", "'for'", "'range'", 
			"'break'", "'continue'", "'return'", "'++'", "'--'", "':='", "'[]'", 
			"'['", "']'", "'[][]'", "','", "'int'", "'float64'", "'string'", "'bool'", 
			"'rune'", "'('", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'+='", "'-='", 
			"'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INT", "DECIMAL", "RUNE", "STRING", "BOOL", "ID", "WS", "COMENTARIO", 
			"COMENTARIO_MULTILINEA"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<DclContext> dcl() {
			return getRuleContexts(DclContext.class);
		}
		public DclContext dcl(int i) {
			return getRuleContext(DclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35465877130790228L) != 0)) {
				{
				{
				setState(22);
				dcl();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DclContext extends ParserRuleContext {
		public VarDclContext varDcl() {
			return getRuleContext(VarDclContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dcl);
		int _la;
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				varDcl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				stmt();
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(30);
					match(T__0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDcl; }
	}

	public final VarDclContext varDcl() throws RecognitionException {
		VarDclContext _localctx = new VarDclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__1);
			setState(36);
			match(ID);
			setState(37);
			type();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(38);
				match(T__2);
				setState(39);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForClassicStmtContext extends StmtContext {
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ForClassicStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStmtContext extends StmtContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SwitchStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStmtContext extends StmtContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public PrintStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncDecStmtContext extends StmtContext {
		public IncdecContext incdec() {
			return getRuleContext(IncdecContext.class,0);
		}
		public IncDecStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStmtContext extends StmtContext {
		public List<DclContext> dcl() {
			return getRuleContexts(DclContext.class);
		}
		public DclContext dcl(int i) {
			return getRuleContext(DclContext.class,i);
		}
		public BlockStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForRangeStmtContext extends StmtContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ForRangeStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForWhileStmtContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ForWhileStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStmtContext extends StmtContext {
		public ContinueStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public IfStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStmtContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends StmtContext {
		public BreakStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Slice1xdContext extends StmtContext {
		public Slice1Context slice1() {
			return getRuleContext(Slice1Context.class,0);
		}
		public Slice1xdContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Slice2xdContext extends StmtContext {
		public Slice2Context slice2() {
			return getRuleContext(Slice2Context.class,0);
		}
		public Slice2xdContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				expr(0);
				}
				break;
			case 2:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(T__3);
				setState(44);
				exprList();
				setState(45);
				match(T__4);
				}
				break;
			case 3:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(T__5);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35465877130790228L) != 0)) {
					{
					{
					setState(48);
					dcl();
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(54);
				match(T__6);
				}
				break;
			case 4:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				match(T__7);
				setState(56);
				expr(0);
				setState(57);
				stmt();
				setState(60);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(58);
					match(T__8);
					setState(59);
					stmt();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new SwitchStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				match(T__9);
				setState(63);
				expr(0);
				setState(64);
				match(T__5);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(65);
					match(T__10);
					setState(66);
					expr(0);
					setState(67);
					match(T__11);
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35465877130790228L) != 0)) {
						{
						{
						setState(68);
						stmt();
						}
						}
						setState(73);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(79);
					match(T__12);
					setState(80);
					match(T__11);
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35465877130790228L) != 0)) {
						{
						{
						setState(81);
						stmt();
						}
						}
						setState(86);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(89);
				match(T__6);
				}
				break;
			case 6:
				_localctx = new ForWhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				match(T__13);
				setState(92);
				expr(0);
				setState(93);
				stmt();
				}
				break;
			case 7:
				_localctx = new ForClassicStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(95);
				match(T__13);
				setState(96);
				forInit();
				setState(97);
				match(T__0);
				setState(98);
				expr(0);
				setState(99);
				match(T__0);
				setState(100);
				expr(0);
				setState(101);
				stmt();
				}
				break;
			case 8:
				_localctx = new ForRangeStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(103);
				match(T__13);
				setState(104);
				match(ID);
				setState(105);
				match(T__14);
				setState(106);
				expr(0);
				setState(107);
				stmt();
				}
				break;
			case 9:
				_localctx = new IncDecStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(109);
				incdec();
				}
				break;
			case 10:
				_localctx = new Slice1xdContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(110);
				slice1();
				}
				break;
			case 11:
				_localctx = new Slice2xdContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(111);
				slice2();
				}
				break;
			case 12:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(112);
				match(T__15);
				}
				break;
			case 13:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(113);
				match(T__16);
				}
				break;
			case 14:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(114);
				match(T__17);
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(115);
					expr(0);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public VarDclContext varDcl() {
			return getRuleContext(VarDclContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forInit);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				varDcl();
				}
				break;
			case T__31:
			case T__32:
			case T__33:
			case INT:
			case DECIMAL:
			case RUNE:
			case STRING:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncdecContext extends ParserRuleContext {
		public Token op;
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public IncdecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incdec; }
	}

	public final IncdecContext incdec() throws RecognitionException {
		IncdecContext _localctx = new IncdecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_incdec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ID);
			setState(125);
			((IncdecContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==T__19) ) {
				((IncdecContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Slice1Context extends ParserRuleContext {
		public Slice1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice1; }
	 
		public Slice1Context() { }
		public void copyFrom(Slice1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Slice1StmtContext extends Slice1Context {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public Slice1StmtContext(Slice1Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Slice3StmtContext extends Slice1Context {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Slice3StmtContext(Slice1Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Slice2StmtContext extends Slice1Context {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Slice2StmtContext(Slice1Context ctx) { copyFrom(ctx); }
	}

	public final Slice1Context slice1() throws RecognitionException {
		Slice1Context _localctx = new Slice1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_slice1);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Slice1StmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(ID);
				setState(128);
				match(T__20);
				setState(129);
				match(T__21);
				setState(130);
				type();
				setState(131);
				match(T__5);
				setState(132);
				exprList();
				setState(133);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new Slice2StmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(T__1);
				setState(136);
				match(ID);
				setState(137);
				match(T__21);
				setState(138);
				type();
				}
				break;
			case 3:
				_localctx = new Slice3StmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(ID);
				setState(140);
				match(T__22);
				setState(141);
				expr(0);
				setState(142);
				match(T__23);
				setState(143);
				match(T__2);
				setState(144);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Slice2Context extends ParserRuleContext {
		public Slice2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice2; }
	 
		public Slice2Context() { }
		public void copyFrom(Slice2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Slice5StmtContext extends Slice2Context {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Slice5StmtContext(Slice2Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Slice4StmtContext extends Slice2Context {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExprListContext> exprList() {
			return getRuleContexts(ExprListContext.class);
		}
		public ExprListContext exprList(int i) {
			return getRuleContext(ExprListContext.class,i);
		}
		public Slice4StmtContext(Slice2Context ctx) { copyFrom(ctx); }
	}

	public final Slice2Context slice2() throws RecognitionException {
		Slice2Context _localctx = new Slice2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_slice2);
		int _la;
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new Slice4StmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(ID);
				setState(149);
				match(T__20);
				setState(150);
				match(T__24);
				setState(151);
				type();
				setState(152);
				match(T__5);
				setState(153);
				exprList();
				setState(154);
				match(T__6);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__25) {
					{
					{
					setState(155);
					match(T__25);
					setState(156);
					match(T__5);
					setState(157);
					exprList();
					setState(158);
					match(T__6);
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new Slice5StmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(ID);
				setState(166);
				match(T__22);
				setState(167);
				expr(0);
				setState(168);
				match(T__23);
				setState(169);
				match(T__22);
				setState(170);
				expr(0);
				setState(171);
				match(T__23);
				setState(172);
				match(T__2);
				setState(173);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4160749568L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			expr(0);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(180);
				match(T__25);
				setState(181);
				expr(0);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Slice6StmtContext extends ExprContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Slice6StmtContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ModContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelationalContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LogicalContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddAssignContext extends ExprContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AddAssignContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(LanguageParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ExprContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public IdentifierContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalContext extends ExprContext {
		public TerminalNode DECIMAL() { return getToken(LanguageParser.DECIMAL, 0); }
		public DecimalContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(LanguageParser.BOOL, 0); }
		public BoolContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparisonContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Slice7StmtContext extends ExprContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Slice7StmtContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ExprContext {
		public Token op;
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegateContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncDecExprContext extends ExprContext {
		public IncdecContext incdec() {
			return getRuleContext(IncdecContext.class,0);
		}
		public IncDecExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuneContext extends ExprContext {
		public TerminalNode RUNE() { return getToken(LanguageParser.RUNE, 0); }
		public RuneContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubAssignContext extends ExprContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SubAssignContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(188);
				match(T__31);
				setState(189);
				expr(0);
				setState(190);
				match(T__4);
				}
				break;
			case 2:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(T__32);
				setState(193);
				expr(24);
				}
				break;
			case 3:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(T__33);
				setState(195);
				expr(23);
				}
				break;
			case 4:
				{
				_localctx = new AddAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(ID);
				setState(197);
				match(T__38);
				setState(198);
				expr(19);
				}
				break;
			case 5:
				{
				_localctx = new SubAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(ID);
				setState(200);
				match(T__39);
				setState(201);
				expr(18);
				}
				break;
			case 6:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				match(ID);
				setState(203);
				((AssignContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__20) ) {
					((AssignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(204);
				expr(11);
				}
				break;
			case 7:
				{
				_localctx = new Slice6StmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(ID);
				setState(206);
				match(T__22);
				setState(207);
				expr(0);
				setState(208);
				match(T__23);
				}
				break;
			case 8:
				{
				_localctx = new Slice7StmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(ID);
				setState(211);
				match(T__22);
				setState(212);
				expr(0);
				setState(213);
				match(T__23);
				setState(214);
				match(T__22);
				setState(215);
				expr(0);
				setState(216);
				match(T__23);
				}
				break;
			case 9:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(INT);
				}
				break;
			case 10:
				{
				_localctx = new DecimalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(DECIMAL);
				}
				break;
			case 11:
				{
				_localctx = new RuneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(RUNE);
				}
				break;
			case 12:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(STRING);
				}
				break;
			case 13:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(BOOL);
				}
				break;
			case 14:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(ID);
				}
				break;
			case 15:
				{
				_localctx = new IncDecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				incdec();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(257);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(228);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__34 || _la==T__35) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(229);
						expr(23);
						}
						break;
					case 2:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(231);
						match(T__36);
						setState(232);
						expr(22);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(234);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__37) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(235);
						expr(21);
						}
						break;
					case 4:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(237);
						((RelationalContext)_localctx).op = match(T__40);
						setState(238);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(240);
						((RelationalContext)_localctx).op = match(T__41);
						setState(241);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(243);
						((RelationalContext)_localctx).op = match(T__42);
						setState(244);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(246);
						((RelationalContext)_localctx).op = match(T__43);
						setState(247);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ComparisonContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(248);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(249);
						((ComparisonContext)_localctx).op = match(T__44);
						setState(250);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new ComparisonContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(252);
						((ComparisonContext)_localctx).op = match(T__45);
						setState(253);
						expr(13);
						}
						break;
					case 10:
						{
						_localctx = new LogicalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(254);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(255);
						((LogicalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__46 || _la==T__47) ) {
							((LogicalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(256);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00019\u0107\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001 \b\u0001\u0003\u0001\"\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002)\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u00032\b\u0003\n\u0003\f\u00035\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003=\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003F\b\u0003\n\u0003\f\u0003I\t\u0003\u0005\u0003K\b\u0003"+
		"\n\u0003\f\u0003N\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"S\b\u0003\n\u0003\f\u0003V\t\u0003\u0003\u0003X\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003u\b\u0003\u0003\u0003w\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0003\u0004{\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0093\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00a1\b\u0007\n\u0007"+
		"\f\u0007\u00a4\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00b0\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u00b7\b\t\n\t\f\t\u00ba\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e2\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0102\b\n\n\n\f\n\u0105\t\n\u0001\n\u0000\u0001"+
		"\u0014\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000"+
		"\u0006\u0001\u0000\u0013\u0014\u0001\u0000\u001b\u001f\u0002\u0000\u0003"+
		"\u0003\u0015\u0015\u0001\u0000#$\u0002\u0000!!&&\u0001\u0000/0\u0131\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004#\u0001"+
		"\u0000\u0000\u0000\u0006v\u0001\u0000\u0000\u0000\bz\u0001\u0000\u0000"+
		"\u0000\n|\u0001\u0000\u0000\u0000\f\u0092\u0001\u0000\u0000\u0000\u000e"+
		"\u00af\u0001\u0000\u0000\u0000\u0010\u00b1\u0001\u0000\u0000\u0000\u0012"+
		"\u00b3\u0001\u0000\u0000\u0000\u0014\u00e1\u0001\u0000\u0000\u0000\u0016"+
		"\u0018\u0003\u0002\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018"+
		"\u001b\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0001\u0000\u0000\u0000\u001a\u0001\u0001\u0000\u0000\u0000\u001b"+
		"\u0019\u0001\u0000\u0000\u0000\u001c\"\u0003\u0004\u0002\u0000\u001d\u001f"+
		"\u0003\u0006\u0003\u0000\u001e \u0005\u0001\u0000\u0000\u001f\u001e\u0001"+
		"\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000"+
		"\u0000!\u001c\u0001\u0000\u0000\u0000!\u001d\u0001\u0000\u0000\u0000\""+
		"\u0003\u0001\u0000\u0000\u0000#$\u0005\u0002\u0000\u0000$%\u00056\u0000"+
		"\u0000%(\u0003\u0010\b\u0000&\'\u0005\u0003\u0000\u0000\')\u0003\u0014"+
		"\n\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\u0005\u0001"+
		"\u0000\u0000\u0000*w\u0003\u0014\n\u0000+,\u0005\u0004\u0000\u0000,-\u0003"+
		"\u0012\t\u0000-.\u0005\u0005\u0000\u0000.w\u0001\u0000\u0000\u0000/3\u0005"+
		"\u0006\u0000\u000002\u0003\u0002\u0001\u000010\u0001\u0000\u0000\u0000"+
		"25\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u000046\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u00006w\u0005\u0007"+
		"\u0000\u000078\u0005\b\u0000\u000089\u0003\u0014\n\u00009<\u0003\u0006"+
		"\u0003\u0000:;\u0005\t\u0000\u0000;=\u0003\u0006\u0003\u0000<:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=w\u0001\u0000\u0000\u0000>?\u0005"+
		"\n\u0000\u0000?@\u0003\u0014\n\u0000@L\u0005\u0006\u0000\u0000AB\u0005"+
		"\u000b\u0000\u0000BC\u0003\u0014\n\u0000CG\u0005\f\u0000\u0000DF\u0003"+
		"\u0006\u0003\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000JA\u0001\u0000\u0000\u0000KN\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MW\u0001"+
		"\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0005\r\u0000\u0000PT\u0005"+
		"\f\u0000\u0000QS\u0003\u0006\u0003\u0000RQ\u0001\u0000\u0000\u0000SV\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WO\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0005\u0007"+
		"\u0000\u0000Zw\u0001\u0000\u0000\u0000[\\\u0005\u000e\u0000\u0000\\]\u0003"+
		"\u0014\n\u0000]^\u0003\u0006\u0003\u0000^w\u0001\u0000\u0000\u0000_`\u0005"+
		"\u000e\u0000\u0000`a\u0003\b\u0004\u0000ab\u0005\u0001\u0000\u0000bc\u0003"+
		"\u0014\n\u0000cd\u0005\u0001\u0000\u0000de\u0003\u0014\n\u0000ef\u0003"+
		"\u0006\u0003\u0000fw\u0001\u0000\u0000\u0000gh\u0005\u000e\u0000\u0000"+
		"hi\u00056\u0000\u0000ij\u0005\u000f\u0000\u0000jk\u0003\u0014\n\u0000"+
		"kl\u0003\u0006\u0003\u0000lw\u0001\u0000\u0000\u0000mw\u0003\n\u0005\u0000"+
		"nw\u0003\f\u0006\u0000ow\u0003\u000e\u0007\u0000pw\u0005\u0010\u0000\u0000"+
		"qw\u0005\u0011\u0000\u0000rt\u0005\u0012\u0000\u0000su\u0003\u0014\n\u0000"+
		"ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000"+
		"\u0000v*\u0001\u0000\u0000\u0000v+\u0001\u0000\u0000\u0000v/\u0001\u0000"+
		"\u0000\u0000v7\u0001\u0000\u0000\u0000v>\u0001\u0000\u0000\u0000v[\u0001"+
		"\u0000\u0000\u0000v_\u0001\u0000\u0000\u0000vg\u0001\u0000\u0000\u0000"+
		"vm\u0001\u0000\u0000\u0000vn\u0001\u0000\u0000\u0000vo\u0001\u0000\u0000"+
		"\u0000vp\u0001\u0000\u0000\u0000vq\u0001\u0000\u0000\u0000vr\u0001\u0000"+
		"\u0000\u0000w\u0007\u0001\u0000\u0000\u0000x{\u0003\u0004\u0002\u0000"+
		"y{\u0003\u0014\n\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000"+
		"{\t\u0001\u0000\u0000\u0000|}\u00056\u0000\u0000}~\u0007\u0000\u0000\u0000"+
		"~\u000b\u0001\u0000\u0000\u0000\u007f\u0080\u00056\u0000\u0000\u0080\u0081"+
		"\u0005\u0015\u0000\u0000\u0081\u0082\u0005\u0016\u0000\u0000\u0082\u0083"+
		"\u0003\u0010\b\u0000\u0083\u0084\u0005\u0006\u0000\u0000\u0084\u0085\u0003"+
		"\u0012\t\u0000\u0085\u0086\u0005\u0007\u0000\u0000\u0086\u0093\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0005\u0002\u0000\u0000\u0088\u0089\u00056\u0000"+
		"\u0000\u0089\u008a\u0005\u0016\u0000\u0000\u008a\u0093\u0003\u0010\b\u0000"+
		"\u008b\u008c\u00056\u0000\u0000\u008c\u008d\u0005\u0017\u0000\u0000\u008d"+
		"\u008e\u0003\u0014\n\u0000\u008e\u008f\u0005\u0018\u0000\u0000\u008f\u0090"+
		"\u0005\u0003\u0000\u0000\u0090\u0091\u0003\u0014\n\u0000\u0091\u0093\u0001"+
		"\u0000\u0000\u0000\u0092\u007f\u0001\u0000\u0000\u0000\u0092\u0087\u0001"+
		"\u0000\u0000\u0000\u0092\u008b\u0001\u0000\u0000\u0000\u0093\r\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u00056\u0000\u0000\u0095\u0096\u0005\u0015\u0000"+
		"\u0000\u0096\u0097\u0005\u0019\u0000\u0000\u0097\u0098\u0003\u0010\b\u0000"+
		"\u0098\u0099\u0005\u0006\u0000\u0000\u0099\u009a\u0003\u0012\t\u0000\u009a"+
		"\u00a2\u0005\u0007\u0000\u0000\u009b\u009c\u0005\u001a\u0000\u0000\u009c"+
		"\u009d\u0005\u0006\u0000\u0000\u009d\u009e\u0003\u0012\t\u0000\u009e\u009f"+
		"\u0005\u0007\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009b"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00b0"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u00056\u0000\u0000\u00a6\u00a7\u0005\u0017\u0000\u0000\u00a7\u00a8\u0003"+
		"\u0014\n\u0000\u00a8\u00a9\u0005\u0018\u0000\u0000\u00a9\u00aa\u0005\u0017"+
		"\u0000\u0000\u00aa\u00ab\u0003\u0014\n\u0000\u00ab\u00ac\u0005\u0018\u0000"+
		"\u0000\u00ac\u00ad\u0005\u0003\u0000\u0000\u00ad\u00ae\u0003\u0014\n\u0000"+
		"\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u0094\u0001\u0000\u0000\u0000"+
		"\u00af\u00a5\u0001\u0000\u0000\u0000\u00b0\u000f\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0007\u0001\u0000\u0000\u00b2\u0011\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b8\u0003\u0014\n\u0000\u00b4\u00b5\u0005\u001a\u0000\u0000\u00b5"+
		"\u00b7\u0003\u0014\n\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00ba"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b9\u0013\u0001\u0000\u0000\u0000\u00ba\u00b8"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0006\n\uffff\uffff\u0000\u00bc\u00bd"+
		"\u0005 \u0000\u0000\u00bd\u00be\u0003\u0014\n\u0000\u00be\u00bf\u0005"+
		"\u0005\u0000\u0000\u00bf\u00e2\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005"+
		"!\u0000\u0000\u00c1\u00e2\u0003\u0014\n\u0018\u00c2\u00c3\u0005\"\u0000"+
		"\u0000\u00c3\u00e2\u0003\u0014\n\u0017\u00c4\u00c5\u00056\u0000\u0000"+
		"\u00c5\u00c6\u0005\'\u0000\u0000\u00c6\u00e2\u0003\u0014\n\u0013\u00c7"+
		"\u00c8\u00056\u0000\u0000\u00c8\u00c9\u0005(\u0000\u0000\u00c9\u00e2\u0003"+
		"\u0014\n\u0012\u00ca\u00cb\u00056\u0000\u0000\u00cb\u00cc\u0007\u0002"+
		"\u0000\u0000\u00cc\u00e2\u0003\u0014\n\u000b\u00cd\u00ce\u00056\u0000"+
		"\u0000\u00ce\u00cf\u0005\u0017\u0000\u0000\u00cf\u00d0\u0003\u0014\n\u0000"+
		"\u00d0\u00d1\u0005\u0018\u0000\u0000\u00d1\u00e2\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u00056\u0000\u0000\u00d3\u00d4\u0005\u0017\u0000\u0000\u00d4"+
		"\u00d5\u0003\u0014\n\u0000\u00d5\u00d6\u0005\u0018\u0000\u0000\u00d6\u00d7"+
		"\u0005\u0017\u0000\u0000\u00d7\u00d8\u0003\u0014\n\u0000\u00d8\u00d9\u0005"+
		"\u0018\u0000\u0000\u00d9\u00e2\u0001\u0000\u0000\u0000\u00da\u00e2\u0005"+
		"1\u0000\u0000\u00db\u00e2\u00052\u0000\u0000\u00dc\u00e2\u00053\u0000"+
		"\u0000\u00dd\u00e2\u00054\u0000\u0000\u00de\u00e2\u00055\u0000\u0000\u00df"+
		"\u00e2\u00056\u0000\u0000\u00e0\u00e2\u0003\n\u0005\u0000\u00e1\u00bb"+
		"\u0001\u0000\u0000\u0000\u00e1\u00c0\u0001\u0000\u0000\u0000\u00e1\u00c2"+
		"\u0001\u0000\u0000\u0000\u00e1\u00c4\u0001\u0000\u0000\u0000\u00e1\u00c7"+
		"\u0001\u0000\u0000\u0000\u00e1\u00ca\u0001\u0000\u0000\u0000\u00e1\u00cd"+
		"\u0001\u0000\u0000\u0000\u00e1\u00d2\u0001\u0000\u0000\u0000\u00e1\u00da"+
		"\u0001\u0000\u0000\u0000\u00e1\u00db\u0001\u0000\u0000\u0000\u00e1\u00dc"+
		"\u0001\u0000\u0000\u0000\u00e1\u00dd\u0001\u0000\u0000\u0000\u00e1\u00de"+
		"\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e2\u0103\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\n\u0016\u0000\u0000\u00e4\u00e5\u0007\u0003\u0000\u0000\u00e5\u0102\u0003"+
		"\u0014\n\u0017\u00e6\u00e7\n\u0015\u0000\u0000\u00e7\u00e8\u0005%\u0000"+
		"\u0000\u00e8\u0102\u0003\u0014\n\u0016\u00e9\u00ea\n\u0014\u0000\u0000"+
		"\u00ea\u00eb\u0007\u0004\u0000\u0000\u00eb\u0102\u0003\u0014\n\u0015\u00ec"+
		"\u00ed\n\u0011\u0000\u0000\u00ed\u00ee\u0005)\u0000\u0000\u00ee\u0102"+
		"\u0003\u0014\n\u0012\u00ef\u00f0\n\u0010\u0000\u0000\u00f0\u00f1\u0005"+
		"*\u0000\u0000\u00f1\u0102\u0003\u0014\n\u0011\u00f2\u00f3\n\u000f\u0000"+
		"\u0000\u00f3\u00f4\u0005+\u0000\u0000\u00f4\u0102\u0003\u0014\n\u0010"+
		"\u00f5\u00f6\n\u000e\u0000\u0000\u00f6\u00f7\u0005,\u0000\u0000\u00f7"+
		"\u0102\u0003\u0014\n\u000f\u00f8\u00f9\n\r\u0000\u0000\u00f9\u00fa\u0005"+
		"-\u0000\u0000\u00fa\u0102\u0003\u0014\n\u000e\u00fb\u00fc\n\f\u0000\u0000"+
		"\u00fc\u00fd\u0005.\u0000\u0000\u00fd\u0102\u0003\u0014\n\r\u00fe\u00ff"+
		"\n\b\u0000\u0000\u00ff\u0100\u0007\u0005\u0000\u0000\u0100\u0102\u0003"+
		"\u0014\n\t\u0101\u00e3\u0001\u0000\u0000\u0000\u0101\u00e6\u0001\u0000"+
		"\u0000\u0000\u0101\u00e9\u0001\u0000\u0000\u0000\u0101\u00ec\u0001\u0000"+
		"\u0000\u0000\u0101\u00ef\u0001\u0000\u0000\u0000\u0101\u00f2\u0001\u0000"+
		"\u0000\u0000\u0101\u00f5\u0001\u0000\u0000\u0000\u0101\u00f8\u0001\u0000"+
		"\u0000\u0000\u0101\u00fb\u0001\u0000\u0000\u0000\u0101\u00fe\u0001\u0000"+
		"\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0015\u0001\u0000"+
		"\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0014\u0019\u001f!(3"+
		"<GLTWtvz\u0092\u00a2\u00af\u00b8\u00e1\u0101\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}