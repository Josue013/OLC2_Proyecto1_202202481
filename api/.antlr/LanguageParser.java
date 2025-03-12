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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, INT=57, DECIMAL=58, RUNE=59, STRING=60, 
		BOOL=61, ID=62, WS=63, COMENTARIO=64, COMENTARIO_MULTILINEA=65;
	public static final int
		RULE_program = 0, RULE_dcl = 1, RULE_varDcl = 2, RULE_funcDCl = 3, RULE_params = 4, 
		RULE_stmt = 5, RULE_forInit = 6, RULE_incdec = 7, RULE_slice1 = 8, RULE_slice2 = 9, 
		RULE_arrayContent = 10, RULE_type = 11, RULE_exprList = 12, RULE_expr = 13, 
		RULE_call = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "dcl", "varDcl", "funcDCl", "params", "stmt", "forInit", "incdec", 
			"slice1", "slice2", "arrayContent", "type", "exprList", "expr", "call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'var'", "'='", "'func'", "'('", "')'", "'{'", "'}'", "','", 
			"'fmt.Println('", "'if'", "'else'", "'switch'", "'case'", "':'", "'default'", 
			"'for'", "':='", "'range'", "'break'", "'continue'", "'return'", "'++'", 
			"'--'", "'[]'", "'['", "']'", "'[][]'", "'int'", "'float64'", "'string'", 
			"'bool'", "'rune'", "'strconv.Atoi'", "'strconv.ParseFloat'", "'reflect.TypeOf'", 
			"'slices.Index'", "'strings.Join'", "'len'", "'append'", "'-'", "'!'", 
			"'*'", "'/'", "'%'", "'+'", "'+='", "'-='", "'<'", "'<='", "'>'", "'>='", 
			"'=='", "'!='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "INT", "DECIMAL", 
			"RUNE", "STRING", "BOOL", "ID", "WS", "COMENTARIO", "COMENTARIO_MULTILINEA"
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9079265627699555508L) != 0)) {
				{
				{
				setState(30);
				dcl();
				}
				}
				setState(35);
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
		public FuncDClContext funcDCl() {
			return getRuleContext(FuncDClContext.class,0);
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
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				varDcl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				funcDCl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				stmt();
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(39);
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
			setState(44);
			match(T__1);
			setState(45);
			match(ID);
			setState(46);
			type();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(47);
				match(T__2);
				setState(48);
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
	public static class FuncDClContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<DclContext> dcl() {
			return getRuleContexts(DclContext.class);
		}
		public DclContext dcl(int i) {
			return getRuleContext(DclContext.class,i);
		}
		public FuncDClContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDCl; }
	}

	public final FuncDClContext funcDCl() throws RecognitionException {
		FuncDClContext _localctx = new FuncDClContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDCl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__3);
			setState(52);
			match(ID);
			setState(53);
			match(T__4);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(54);
				params();
				}
			}

			setState(57);
			match(T__5);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16642998272L) != 0)) {
				{
				setState(58);
				type();
				}
			}

			setState(61);
			match(T__6);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9079265627699555508L) != 0)) {
				{
				{
				setState(62);
				dcl();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(T__7);
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
	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LanguageParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(ID);
			setState(71);
			type();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(72);
				match(T__8);
				setState(73);
				match(ID);
				setState(74);
				type();
				}
				}
				setState(79);
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
		public List<TerminalNode> ID() { return getTokens(LanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LanguageParser.ID, i);
		}
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
		enterRule(_localctx, 10, RULE_stmt);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				expr(0);
				}
				break;
			case 2:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(T__9);
				setState(82);
				exprList();
				setState(83);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(T__6);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9079265627699555508L) != 0)) {
					{
					{
					setState(86);
					dcl();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				match(T__7);
				}
				break;
			case 4:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(T__10);
				setState(94);
				expr(0);
				setState(95);
				stmt();
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(96);
					match(T__11);
					setState(97);
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
				setState(100);
				match(T__12);
				setState(101);
				expr(0);
				setState(102);
				match(T__6);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(103);
					match(T__13);
					setState(104);
					expr(0);
					setState(105);
					match(T__14);
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9079265627699555492L) != 0)) {
						{
						{
						setState(106);
						stmt();
						}
						}
						setState(111);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(117);
					match(T__15);
					setState(118);
					match(T__14);
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9079265627699555492L) != 0)) {
						{
						{
						setState(119);
						stmt();
						}
						}
						setState(124);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(127);
				match(T__7);
				}
				break;
			case 6:
				_localctx = new ForWhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				match(T__16);
				setState(130);
				expr(0);
				setState(131);
				stmt();
				}
				break;
			case 7:
				_localctx = new ForClassicStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(133);
				match(T__16);
				setState(134);
				forInit();
				setState(135);
				match(T__0);
				setState(136);
				expr(0);
				setState(137);
				match(T__0);
				setState(138);
				expr(0);
				setState(139);
				stmt();
				}
				break;
			case 8:
				_localctx = new ForRangeStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(141);
				match(T__16);
				setState(142);
				match(ID);
				setState(143);
				match(T__8);
				setState(144);
				match(ID);
				setState(145);
				match(T__17);
				setState(146);
				match(T__18);
				setState(147);
				expr(0);
				setState(148);
				stmt();
				}
				break;
			case 9:
				_localctx = new IncDecStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(150);
				incdec();
				}
				break;
			case 10:
				_localctx = new Slice1xdContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(151);
				slice1();
				}
				break;
			case 11:
				_localctx = new Slice2xdContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(152);
				slice2();
				}
				break;
			case 12:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(153);
				match(T__19);
				}
				break;
			case 13:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(154);
				match(T__20);
				}
				break;
			case 14:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(155);
				match(T__21);
				setState(157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(156);
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
		enterRule(_localctx, 12, RULE_forInit);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				varDcl();
				}
				break;
			case T__4:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case INT:
			case DECIMAL:
			case RUNE:
			case STRING:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
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
		enterRule(_localctx, 14, RULE_incdec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(ID);
			setState(166);
			((IncdecContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
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
		enterRule(_localctx, 16, RULE_slice1);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new Slice1StmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(ID);
				setState(169);
				match(T__17);
				setState(170);
				match(T__24);
				setState(171);
				type();
				setState(172);
				match(T__6);
				setState(173);
				exprList();
				setState(174);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new Slice2StmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(T__1);
				setState(177);
				match(ID);
				setState(178);
				match(T__24);
				setState(179);
				type();
				}
				break;
			case 3:
				_localctx = new Slice3StmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(ID);
				setState(181);
				match(T__25);
				setState(182);
				expr(0);
				setState(183);
				match(T__26);
				setState(184);
				match(T__2);
				setState(185);
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
		public List<ArrayContentContext> arrayContent() {
			return getRuleContexts(ArrayContentContext.class);
		}
		public ArrayContentContext arrayContent(int i) {
			return getRuleContext(ArrayContentContext.class,i);
		}
		public Slice4StmtContext(Slice2Context ctx) { copyFrom(ctx); }
	}

	public final Slice2Context slice2() throws RecognitionException {
		Slice2Context _localctx = new Slice2Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_slice2);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new Slice4StmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(ID);
				setState(190);
				match(T__17);
				setState(191);
				match(T__27);
				setState(192);
				type();
				setState(193);
				match(T__6);
				setState(194);
				arrayContent();
				setState(195);
				match(T__8);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(196);
					arrayContent();
					setState(197);
					match(T__8);
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new Slice5StmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(ID);
				setState(207);
				match(T__25);
				setState(208);
				expr(0);
				setState(209);
				match(T__26);
				setState(210);
				match(T__25);
				setState(211);
				expr(0);
				setState(212);
				match(T__26);
				setState(213);
				match(T__2);
				setState(214);
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
	public static class ArrayContentContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ArrayContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayContent; }
	}

	public final ArrayContentContext arrayContent() throws RecognitionException {
		ArrayContentContext _localctx = new ArrayContentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrayContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__6);
			setState(219);
			exprList();
			setState(220);
			match(T__7);
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
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16642998272L) != 0)) ) {
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
		enterRule(_localctx, 24, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			expr(0);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(225);
				match(T__8);
				setState(226);
				expr(0);
				}
				}
				setState(231);
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
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JoinCallContext extends ExprContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public JoinCallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(LanguageParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParseFloatCallContext extends ExprContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ParseFloatCallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LenCallContext extends ExprContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public LenCallContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class TypeOfCallContext extends ExprContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public TypeOfCallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public CallExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubAssignContext extends ExprContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SubAssignContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class AddAssignContext extends ExprContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AddAssignContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class IndexCallContext extends ExprContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public IndexCallContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class AtoiCallContext extends ExprContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public AtoiCallContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class AppendCallContext extends ExprContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public AppendCallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuneContext extends ExprContext {
		public TerminalNode RUNE() { return getToken(LanguageParser.RUNE, 0); }
		public RuneContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(233);
				match(T__4);
				setState(234);
				expr(0);
				setState(235);
				match(T__5);
				}
				break;
			case 2:
				{
				_localctx = new AtoiCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				match(T__33);
				setState(238);
				call();
				}
				break;
			case 3:
				{
				_localctx = new ParseFloatCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				match(T__34);
				setState(240);
				call();
				}
				break;
			case 4:
				{
				_localctx = new TypeOfCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				match(T__35);
				setState(242);
				call();
				}
				break;
			case 5:
				{
				_localctx = new IndexCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				match(T__36);
				setState(244);
				call();
				}
				break;
			case 6:
				{
				_localctx = new JoinCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				match(T__37);
				setState(246);
				call();
				}
				break;
			case 7:
				{
				_localctx = new LenCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				match(T__38);
				setState(248);
				call();
				}
				break;
			case 8:
				{
				_localctx = new AppendCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				match(T__39);
				setState(250);
				call();
				}
				break;
			case 9:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				match(T__40);
				setState(252);
				expr(24);
				}
				break;
			case 10:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				match(T__41);
				setState(254);
				expr(23);
				}
				break;
			case 11:
				{
				_localctx = new AddAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255);
				match(ID);
				setState(256);
				match(T__46);
				setState(257);
				expr(19);
				}
				break;
			case 12:
				{
				_localctx = new SubAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258);
				match(ID);
				setState(259);
				match(T__47);
				setState(260);
				expr(18);
				}
				break;
			case 13:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261);
				match(ID);
				setState(262);
				((AssignContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__17) ) {
					((AssignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(263);
				expr(10);
				}
				break;
			case 14:
				{
				_localctx = new Slice6StmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264);
				match(ID);
				setState(265);
				match(T__25);
				setState(266);
				expr(0);
				setState(267);
				match(T__26);
				}
				break;
			case 15:
				{
				_localctx = new Slice7StmtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				match(ID);
				setState(270);
				match(T__25);
				setState(271);
				expr(0);
				setState(272);
				match(T__26);
				setState(273);
				match(T__25);
				setState(274);
				expr(0);
				setState(275);
				match(T__26);
				}
				break;
			case 16:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277);
				match(INT);
				}
				break;
			case 17:
				{
				_localctx = new DecimalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(278);
				match(DECIMAL);
				}
				break;
			case 18:
				{
				_localctx = new RuneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279);
				match(RUNE);
				}
				break;
			case 19:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(280);
				match(STRING);
				}
				break;
			case 20:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(281);
				match(BOOL);
				}
				break;
			case 21:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(282);
				match(ID);
				}
				break;
			case 22:
				{
				_localctx = new IncDecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				incdec();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(322);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(286);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(287);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__42 || _la==T__43) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(288);
						expr(23);
						}
						break;
					case 2:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(289);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(290);
						match(T__44);
						setState(291);
						expr(22);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(292);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(293);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__40 || _la==T__45) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(294);
						expr(21);
						}
						break;
					case 4:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(295);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(296);
						((RelationalContext)_localctx).op = match(T__48);
						setState(297);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(298);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(299);
						((RelationalContext)_localctx).op = match(T__49);
						setState(300);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(301);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(302);
						((RelationalContext)_localctx).op = match(T__50);
						setState(303);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(304);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(305);
						((RelationalContext)_localctx).op = match(T__51);
						setState(306);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ComparisonContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(307);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(308);
						((ComparisonContext)_localctx).op = match(T__52);
						setState(309);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new ComparisonContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(310);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(311);
						((ComparisonContext)_localctx).op = match(T__53);
						setState(312);
						expr(13);
						}
						break;
					case 10:
						{
						_localctx = new LogicalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(313);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(314);
						((LogicalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__54 || _la==T__55) ) {
							((LogicalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(315);
						expr(12);
						}
						break;
					case 11:
						{
						_localctx = new CallExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(316);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(318); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(317);
								call();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(320); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__4);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9079265627692072992L) != 0)) {
				{
				setState(328);
				exprList();
				}
			}

			setState(331);
			match(T__5);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
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
			return precpred(_ctx, 11);
		case 10:
			return precpred(_ctx, 25);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001A\u014e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001)\b\u0001\u0003\u0001+\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00022\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00038\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003<\b\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003@\b\u0003\n\u0003\f\u0003C\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004L\b"+
		"\u0004\n\u0004\f\u0004O\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005X\b\u0005\n\u0005"+
		"\f\u0005[\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005c\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005l\b"+
		"\u0005\n\u0005\f\u0005o\t\u0005\u0005\u0005q\b\u0005\n\u0005\f\u0005t"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005y\b\u0005\n\u0005"+
		"\f\u0005|\t\u0005\u0003\u0005~\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u009e\b\u0005\u0003\u0005"+
		"\u00a0\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u00a4\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00bc\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u00c8\b\t\n\t\f\t\u00cb\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d9"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00e4\b\f\n\f\f\f\u00e7\t\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u011d\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0004\r\u013f\b\r\u000b\r\f\r\u0140\u0005\r\u0143\b"+
		"\r\n\r\f\r\u0146\t\r\u0001\u000e\u0001\u000e\u0003\u000e\u014a\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0000\u0001\u001a\u000f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000"+
		"\u0006\u0001\u0000\u0017\u0018\u0001\u0000\u001d!\u0002\u0000\u0003\u0003"+
		"\u0012\u0012\u0001\u0000+,\u0002\u0000))..\u0001\u000078\u0183\u0000!"+
		"\u0001\u0000\u0000\u0000\u0002*\u0001\u0000\u0000\u0000\u0004,\u0001\u0000"+
		"\u0000\u0000\u00063\u0001\u0000\u0000\u0000\bF\u0001\u0000\u0000\u0000"+
		"\n\u009f\u0001\u0000\u0000\u0000\f\u00a3\u0001\u0000\u0000\u0000\u000e"+
		"\u00a5\u0001\u0000\u0000\u0000\u0010\u00bb\u0001\u0000\u0000\u0000\u0012"+
		"\u00d8\u0001\u0000\u0000\u0000\u0014\u00da\u0001\u0000\u0000\u0000\u0016"+
		"\u00de\u0001\u0000\u0000\u0000\u0018\u00e0\u0001\u0000\u0000\u0000\u001a"+
		"\u011c\u0001\u0000\u0000\u0000\u001c\u0147\u0001\u0000\u0000\u0000\u001e"+
		" \u0003\u0002\u0001\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001"+
		"\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"\u0001\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$+\u0003"+
		"\u0004\u0002\u0000%+\u0003\u0006\u0003\u0000&(\u0003\n\u0005\u0000\')"+
		"\u0005\u0001\u0000\u0000(\'\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)+\u0001\u0000\u0000\u0000*$\u0001\u0000\u0000\u0000*%\u0001\u0000"+
		"\u0000\u0000*&\u0001\u0000\u0000\u0000+\u0003\u0001\u0000\u0000\u0000"+
		",-\u0005\u0002\u0000\u0000-.\u0005>\u0000\u0000.1\u0003\u0016\u000b\u0000"+
		"/0\u0005\u0003\u0000\u000002\u0003\u001a\r\u00001/\u0001\u0000\u0000\u0000"+
		"12\u0001\u0000\u0000\u00002\u0005\u0001\u0000\u0000\u000034\u0005\u0004"+
		"\u0000\u000045\u0005>\u0000\u000057\u0005\u0005\u0000\u000068\u0003\b"+
		"\u0004\u000076\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009;\u0005\u0006\u0000\u0000:<\u0003\u0016\u000b\u0000"+
		";:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000"+
		"\u0000=A\u0005\u0007\u0000\u0000>@\u0003\u0002\u0001\u0000?>\u0001\u0000"+
		"\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000"+
		"DE\u0005\b\u0000\u0000E\u0007\u0001\u0000\u0000\u0000FG\u0005>\u0000\u0000"+
		"GM\u0003\u0016\u000b\u0000HI\u0005\t\u0000\u0000IJ\u0005>\u0000\u0000"+
		"JL\u0003\u0016\u000b\u0000KH\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\t\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000P\u00a0\u0003\u001a\r\u0000QR\u0005"+
		"\n\u0000\u0000RS\u0003\u0018\f\u0000ST\u0005\u0006\u0000\u0000T\u00a0"+
		"\u0001\u0000\u0000\u0000UY\u0005\u0007\u0000\u0000VX\u0003\u0002\u0001"+
		"\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000\\\u00a0\u0005\b\u0000\u0000]^\u0005\u000b\u0000\u0000"+
		"^_\u0003\u001a\r\u0000_b\u0003\n\u0005\u0000`a\u0005\f\u0000\u0000ac\u0003"+
		"\n\u0005\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u00a0"+
		"\u0001\u0000\u0000\u0000de\u0005\r\u0000\u0000ef\u0003\u001a\r\u0000f"+
		"r\u0005\u0007\u0000\u0000gh\u0005\u000e\u0000\u0000hi\u0003\u001a\r\u0000"+
		"im\u0005\u000f\u0000\u0000jl\u0003\n\u0005\u0000kj\u0001\u0000\u0000\u0000"+
		"lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pg\u0001\u0000"+
		"\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000s}\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"uv\u0005\u0010\u0000\u0000vz\u0005\u000f\u0000\u0000wy\u0003\n\u0005\u0000"+
		"xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000"+
		"\u0000z{\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000}u\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0005\b\u0000\u0000\u0080\u00a0\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005\u0011\u0000\u0000\u0082\u0083\u0003"+
		"\u001a\r\u0000\u0083\u0084\u0003\n\u0005\u0000\u0084\u00a0\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0005\u0011\u0000\u0000\u0086\u0087\u0003\f\u0006"+
		"\u0000\u0087\u0088\u0005\u0001\u0000\u0000\u0088\u0089\u0003\u001a\r\u0000"+
		"\u0089\u008a\u0005\u0001\u0000\u0000\u008a\u008b\u0003\u001a\r\u0000\u008b"+
		"\u008c\u0003\n\u0005\u0000\u008c\u00a0\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005\u0011\u0000\u0000\u008e\u008f\u0005>\u0000\u0000\u008f\u0090\u0005"+
		"\t\u0000\u0000\u0090\u0091\u0005>\u0000\u0000\u0091\u0092\u0005\u0012"+
		"\u0000\u0000\u0092\u0093\u0005\u0013\u0000\u0000\u0093\u0094\u0003\u001a"+
		"\r\u0000\u0094\u0095\u0003\n\u0005\u0000\u0095\u00a0\u0001\u0000\u0000"+
		"\u0000\u0096\u00a0\u0003\u000e\u0007\u0000\u0097\u00a0\u0003\u0010\b\u0000"+
		"\u0098\u00a0\u0003\u0012\t\u0000\u0099\u00a0\u0005\u0014\u0000\u0000\u009a"+
		"\u00a0\u0005\u0015\u0000\u0000\u009b\u009d\u0005\u0016\u0000\u0000\u009c"+
		"\u009e\u0003\u001a\r\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009fP\u0001"+
		"\u0000\u0000\u0000\u009fQ\u0001\u0000\u0000\u0000\u009fU\u0001\u0000\u0000"+
		"\u0000\u009f]\u0001\u0000\u0000\u0000\u009fd\u0001\u0000\u0000\u0000\u009f"+
		"\u0081\u0001\u0000\u0000\u0000\u009f\u0085\u0001\u0000\u0000\u0000\u009f"+
		"\u008d\u0001\u0000\u0000\u0000\u009f\u0096\u0001\u0000\u0000\u0000\u009f"+
		"\u0097\u0001\u0000\u0000\u0000\u009f\u0098\u0001\u0000\u0000\u0000\u009f"+
		"\u0099\u0001\u0000\u0000\u0000\u009f\u009a\u0001\u0000\u0000\u0000\u009f"+
		"\u009b\u0001\u0000\u0000\u0000\u00a0\u000b\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a4\u0003\u0004\u0002\u0000\u00a2\u00a4\u0003\u001a\r\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\r\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005>\u0000\u0000\u00a6\u00a7\u0007\u0000"+
		"\u0000\u0000\u00a7\u000f\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005>\u0000"+
		"\u0000\u00a9\u00aa\u0005\u0012\u0000\u0000\u00aa\u00ab\u0005\u0019\u0000"+
		"\u0000\u00ab\u00ac\u0003\u0016\u000b\u0000\u00ac\u00ad\u0005\u0007\u0000"+
		"\u0000\u00ad\u00ae\u0003\u0018\f\u0000\u00ae\u00af\u0005\b\u0000\u0000"+
		"\u00af\u00bc\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u0002\u0000\u0000"+
		"\u00b1\u00b2\u0005>\u0000\u0000\u00b2\u00b3\u0005\u0019\u0000\u0000\u00b3"+
		"\u00bc\u0003\u0016\u000b\u0000\u00b4\u00b5\u0005>\u0000\u0000\u00b5\u00b6"+
		"\u0005\u001a\u0000\u0000\u00b6\u00b7\u0003\u001a\r\u0000\u00b7\u00b8\u0005"+
		"\u001b\u0000\u0000\u00b8\u00b9\u0005\u0003\u0000\u0000\u00b9\u00ba\u0003"+
		"\u001a\r\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00a8\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b0\u0001\u0000\u0000\u0000\u00bb\u00b4\u0001\u0000"+
		"\u0000\u0000\u00bc\u0011\u0001\u0000\u0000\u0000\u00bd\u00be\u0005>\u0000"+
		"\u0000\u00be\u00bf\u0005\u0012\u0000\u0000\u00bf\u00c0\u0005\u001c\u0000"+
		"\u0000\u00c0\u00c1\u0003\u0016\u000b\u0000\u00c1\u00c2\u0005\u0007\u0000"+
		"\u0000\u00c2\u00c3\u0003\u0014\n\u0000\u00c3\u00c9\u0005\t\u0000\u0000"+
		"\u00c4\u00c5\u0003\u0014\n\u0000\u00c5\u00c6\u0005\t\u0000\u0000\u00c6"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c4\u0001\u0000\u0000\u0000\u00c8"+
		"\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\b\u0000\u0000\u00cd\u00d9"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005>\u0000\u0000\u00cf\u00d0\u0005"+
		"\u001a\u0000\u0000\u00d0\u00d1\u0003\u001a\r\u0000\u00d1\u00d2\u0005\u001b"+
		"\u0000\u0000\u00d2\u00d3\u0005\u001a\u0000\u0000\u00d3\u00d4\u0003\u001a"+
		"\r\u0000\u00d4\u00d5\u0005\u001b\u0000\u0000\u00d5\u00d6\u0005\u0003\u0000"+
		"\u0000\u00d6\u00d7\u0003\u001a\r\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d8\u00bd\u0001\u0000\u0000\u0000\u00d8\u00ce\u0001\u0000\u0000\u0000"+
		"\u00d9\u0013\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0007\u0000\u0000"+
		"\u00db\u00dc\u0003\u0018\f\u0000\u00dc\u00dd\u0005\b\u0000\u0000\u00dd"+
		"\u0015\u0001\u0000\u0000\u0000\u00de\u00df\u0007\u0001\u0000\u0000\u00df"+
		"\u0017\u0001\u0000\u0000\u0000\u00e0\u00e5\u0003\u001a\r\u0000\u00e1\u00e2"+
		"\u0005\t\u0000\u0000\u00e2\u00e4\u0003\u001a\r\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u0019\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e9\u0006"+
		"\r\uffff\uffff\u0000\u00e9\u00ea\u0005\u0005\u0000\u0000\u00ea\u00eb\u0003"+
		"\u001a\r\u0000\u00eb\u00ec\u0005\u0006\u0000\u0000\u00ec\u011d\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0005\"\u0000\u0000\u00ee\u011d\u0003\u001c\u000e"+
		"\u0000\u00ef\u00f0\u0005#\u0000\u0000\u00f0\u011d\u0003\u001c\u000e\u0000"+
		"\u00f1\u00f2\u0005$\u0000\u0000\u00f2\u011d\u0003\u001c\u000e\u0000\u00f3"+
		"\u00f4\u0005%\u0000\u0000\u00f4\u011d\u0003\u001c\u000e\u0000\u00f5\u00f6"+
		"\u0005&\u0000\u0000\u00f6\u011d\u0003\u001c\u000e\u0000\u00f7\u00f8\u0005"+
		"\'\u0000\u0000\u00f8\u011d\u0003\u001c\u000e\u0000\u00f9\u00fa\u0005("+
		"\u0000\u0000\u00fa\u011d\u0003\u001c\u000e\u0000\u00fb\u00fc\u0005)\u0000"+
		"\u0000\u00fc\u011d\u0003\u001a\r\u0018\u00fd\u00fe\u0005*\u0000\u0000"+
		"\u00fe\u011d\u0003\u001a\r\u0017\u00ff\u0100\u0005>\u0000\u0000\u0100"+
		"\u0101\u0005/\u0000\u0000\u0101\u011d\u0003\u001a\r\u0013\u0102\u0103"+
		"\u0005>\u0000\u0000\u0103\u0104\u00050\u0000\u0000\u0104\u011d\u0003\u001a"+
		"\r\u0012\u0105\u0106\u0005>\u0000\u0000\u0106\u0107\u0007\u0002\u0000"+
		"\u0000\u0107\u011d\u0003\u001a\r\n\u0108\u0109\u0005>\u0000\u0000\u0109"+
		"\u010a\u0005\u001a\u0000\u0000\u010a\u010b\u0003\u001a\r\u0000\u010b\u010c"+
		"\u0005\u001b\u0000\u0000\u010c\u011d\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0005>\u0000\u0000\u010e\u010f\u0005\u001a\u0000\u0000\u010f\u0110\u0003"+
		"\u001a\r\u0000\u0110\u0111\u0005\u001b\u0000\u0000\u0111\u0112\u0005\u001a"+
		"\u0000\u0000\u0112\u0113\u0003\u001a\r\u0000\u0113\u0114\u0005\u001b\u0000"+
		"\u0000\u0114\u011d\u0001\u0000\u0000\u0000\u0115\u011d\u00059\u0000\u0000"+
		"\u0116\u011d\u0005:\u0000\u0000\u0117\u011d\u0005;\u0000\u0000\u0118\u011d"+
		"\u0005<\u0000\u0000\u0119\u011d\u0005=\u0000\u0000\u011a\u011d\u0005>"+
		"\u0000\u0000\u011b\u011d\u0003\u000e\u0007\u0000\u011c\u00e8\u0001\u0000"+
		"\u0000\u0000\u011c\u00ed\u0001\u0000\u0000\u0000\u011c\u00ef\u0001\u0000"+
		"\u0000\u0000\u011c\u00f1\u0001\u0000\u0000\u0000\u011c\u00f3\u0001\u0000"+
		"\u0000\u0000\u011c\u00f5\u0001\u0000\u0000\u0000\u011c\u00f7\u0001\u0000"+
		"\u0000\u0000\u011c\u00f9\u0001\u0000\u0000\u0000\u011c\u00fb\u0001\u0000"+
		"\u0000\u0000\u011c\u00fd\u0001\u0000\u0000\u0000\u011c\u00ff\u0001\u0000"+
		"\u0000\u0000\u011c\u0102\u0001\u0000\u0000\u0000\u011c\u0105\u0001\u0000"+
		"\u0000\u0000\u011c\u0108\u0001\u0000\u0000\u0000\u011c\u010d\u0001\u0000"+
		"\u0000\u0000\u011c\u0115\u0001\u0000\u0000\u0000\u011c\u0116\u0001\u0000"+
		"\u0000\u0000\u011c\u0117\u0001\u0000\u0000\u0000\u011c\u0118\u0001\u0000"+
		"\u0000\u0000\u011c\u0119\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000"+
		"\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d\u0144\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\n\u0016\u0000\u0000\u011f\u0120\u0007\u0003\u0000"+
		"\u0000\u0120\u0143\u0003\u001a\r\u0017\u0121\u0122\n\u0015\u0000\u0000"+
		"\u0122\u0123\u0005-\u0000\u0000\u0123\u0143\u0003\u001a\r\u0016\u0124"+
		"\u0125\n\u0014\u0000\u0000\u0125\u0126\u0007\u0004\u0000\u0000\u0126\u0143"+
		"\u0003\u001a\r\u0015\u0127\u0128\n\u0011\u0000\u0000\u0128\u0129\u0005"+
		"1\u0000\u0000\u0129\u0143\u0003\u001a\r\u0012\u012a\u012b\n\u0010\u0000"+
		"\u0000\u012b\u012c\u00052\u0000\u0000\u012c\u0143\u0003\u001a\r\u0011"+
		"\u012d\u012e\n\u000f\u0000\u0000\u012e\u012f\u00053\u0000\u0000\u012f"+
		"\u0143\u0003\u001a\r\u0010\u0130\u0131\n\u000e\u0000\u0000\u0131\u0132"+
		"\u00054\u0000\u0000\u0132\u0143\u0003\u001a\r\u000f\u0133\u0134\n\r\u0000"+
		"\u0000\u0134\u0135\u00055\u0000\u0000\u0135\u0143\u0003\u001a\r\u000e"+
		"\u0136\u0137\n\f\u0000\u0000\u0137\u0138\u00056\u0000\u0000\u0138\u0143"+
		"\u0003\u001a\r\r\u0139\u013a\n\u000b\u0000\u0000\u013a\u013b\u0007\u0005"+
		"\u0000\u0000\u013b\u0143\u0003\u001a\r\f\u013c\u013e\n\u0019\u0000\u0000"+
		"\u013d\u013f\u0003\u001c\u000e\u0000\u013e\u013d\u0001\u0000\u0000\u0000"+
		"\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000"+
		"\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0143\u0001\u0000\u0000\u0000"+
		"\u0142\u011e\u0001\u0000\u0000\u0000\u0142\u0121\u0001\u0000\u0000\u0000"+
		"\u0142\u0124\u0001\u0000\u0000\u0000\u0142\u0127\u0001\u0000\u0000\u0000"+
		"\u0142\u012a\u0001\u0000\u0000\u0000\u0142\u012d\u0001\u0000\u0000\u0000"+
		"\u0142\u0130\u0001\u0000\u0000\u0000\u0142\u0133\u0001\u0000\u0000\u0000"+
		"\u0142\u0136\u0001\u0000\u0000\u0000\u0142\u0139\u0001\u0000\u0000\u0000"+
		"\u0142\u013c\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000"+
		"\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000"+
		"\u0145\u001b\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000"+
		"\u0147\u0149\u0005\u0005\u0000\u0000\u0148\u014a\u0003\u0018\f\u0000\u0149"+
		"\u0148\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u0005\u0006\u0000\u0000\u014c"+
		"\u001d\u0001\u0000\u0000\u0000\u001a!(*17;AMYbmrz}\u009d\u009f\u00a3\u00bb"+
		"\u00c9\u00d8\u00e5\u011c\u0140\u0142\u0144\u0149";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}