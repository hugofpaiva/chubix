// Generated from /Users/paiva/Documents/Universidade/Engenharia Informática/2º Ano/2º Semestre/Compiladores/compilers/chubix/chubix.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class chubixParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		BOOLEAN=39, ID=40, DOUBLE=41, INTEGER=42, STRING=43, WS=44, LINE_COMMENT=45, 
		ERROR=46;
	public static final int
		RULE_main = 0, RULE_instList = 1, RULE_instruction = 2, RULE_print = 3, 
		RULE_input = 4, RULE_funcOp = 5, RULE_returnFunc = 6, RULE_function = 7, 
		RULE_callFunction = 8, RULE_assignment = 9, RULE_opdim = 10, RULE_declare = 11, 
		RULE_conditional = 12, RULE_elseCond = 13, RULE_forLoop = 14, RULE_whileLoop = 15, 
		RULE_breakLoop = 16, RULE_continueLoop = 17, RULE_type = 18, RULE_expr = 19;
	public static final String[] ruleNames = {
		"main", "instList", "instruction", "print", "input", "funcOp", "returnFunc", 
		"function", "callFunction", "assignment", "opdim", "declare", "conditional", 
		"elseCond", "forLoop", "whileLoop", "breakLoop", "continueLoop", "type", 
		"expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'print'", "'('", "')'", "'input'", "'return'", "'function'", 
		"','", "'{'", "'}'", "'='", "'['", "']'", "'^'", "'+'", "'-'", "'*'", 
		"'/'", "'if'", "'else'", "'for'", "'while'", "'break'", "'continue'", 
		"'Integer'", "'Double'", "'Boolean'", "'String'", "'%'", "'//'", "'=='", 
		"'!='", "'<'", "'>'", "'>='", "'<='", "'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "BOOLEAN", "ID", "DOUBLE", "INTEGER", "STRING", "WS", 
		"LINE_COMMENT", "ERROR"
	};
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
	public String getGrammarFileName() { return "chubix.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  int insideLoop = 0;
	  int insideFunc = 0;
	  public static final SymbolTable map = new SymbolTable();

	public chubixParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public InstListContext instList() {
			return getRuleContext(InstListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(chubixParser.EOF, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			instList();
			setState(41);
			match(EOF);
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

	public static class InstListContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public InstListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instList; }
	}

	public final InstListContext instList() throws RecognitionException {
		InstListContext _localctx = new InstListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(44);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(43);
						instruction();
						}
						break;
					}
					setState(46);
					match(T__0);
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class InstructionContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public BreakLoopContext breakLoop() {
			return getRuleContext(BreakLoopContext.class,0);
		}
		public ContinueLoopContext continueLoop() {
			return getRuleContext(ContinueLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				forLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				breakLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				continueLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(58);
				whileLoop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(59);
				declare();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(60);
				callFunction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(61);
				function();
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

	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(chubixParser.STRING, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__1);
			setState(65);
			match(T__2);
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__14:
			case T__15:
			case BOOLEAN:
			case ID:
			case DOUBLE:
			case INTEGER:
				{
				setState(66);
				expr(0);
				}
				break;
			case STRING:
				{
				setState(67);
				match(STRING);
				}
				break;
			case T__3:
				break;
			default:
				break;
			}
			setState(70);
			match(T__3);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(chubixParser.STRING, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__4);
			setState(73);
			match(T__2);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(74);
				match(STRING);
				}
			}

			setState(77);
			match(T__3);
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

	public static class FuncOpContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public BreakLoopContext breakLoop() {
			return getRuleContext(BreakLoopContext.class,0);
		}
		public ContinueLoopContext continueLoop() {
			return getRuleContext(ContinueLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public ReturnFuncContext returnFunc() {
			return getRuleContext(ReturnFuncContext.class,0);
		}
		public FuncOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcOp; }
	}

	public final FuncOpContext funcOp() throws RecognitionException {
		FuncOpContext _localctx = new FuncOpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcOp);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				forLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				breakLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				continueLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				whileLoop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(86);
				declare();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(87);
				returnFunc();
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

	public static class ReturnFuncContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnFunc; }
	}

	public final ReturnFuncContext returnFunc() throws RecognitionException {
		ReturnFuncContext _localctx = new ReturnFuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			if (!(insideFunc > 0)) throw new FailedPredicateException(this, "insideFunc > 0");
			setState(91);
			match(T__5);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__14) | (1L << T__15) | (1L << BOOLEAN) | (1L << ID) | (1L << DOUBLE) | (1L << INTEGER))) != 0)) {
				{
				setState(92);
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

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext ret_type;
		public Token func_name;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(chubixParser.ID, 0); }
		public List<DeclareContext> declare() {
			return getRuleContexts(DeclareContext.class);
		}
		public DeclareContext declare(int i) {
			return getRuleContext(DeclareContext.class,i);
		}
		public List<FuncOpContext> funcOp() {
			return getRuleContexts(FuncOpContext.class);
		}
		public FuncOpContext funcOp(int i) {
			return getRuleContext(FuncOpContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			insideFunc++;
			setState(96);
			match(T__6);
			setState(97);
			((FunctionContext)_localctx).ret_type = type();
			setState(98);
			((FunctionContext)_localctx).func_name = match(ID);
			setState(99);
			match(T__2);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << ID))) != 0)) {
				{
				setState(100);
				declare();
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(101);
					match(T__7);
					setState(102);
					declare();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(110);
			match(T__3);
			setState(111);
			match(T__8);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112);
					funcOp();
					setState(113);
					match(T__0);
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(120);
			match(T__9);
			insideFunc--;
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

	public static class CallFunctionContext extends ParserRuleContext {
		public Token func_name;
		public TerminalNode ID() { return getToken(chubixParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((CallFunctionContext)_localctx).func_name = match(ID);
			setState(124);
			match(T__2);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__14) | (1L << T__15) | (1L << BOOLEAN) | (1L << ID) | (1L << DOUBLE) | (1L << INTEGER))) != 0)) {
				{
				setState(125);
				expr(0);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(126);
					match(T__7);
					setState(127);
					expr(0);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(135);
			match(T__3);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignVarContext extends AssignmentContext {
		public TerminalNode ID() { return getToken(chubixParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode STRING() { return getToken(chubixParser.STRING, 0); }
		public OpdimContext opdim() {
			return getRuleContext(OpdimContext.class,0);
		}
		public AssignVarContext(AssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class DefineVarContext extends AssignmentContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode STRING() { return getToken(chubixParser.STRING, 0); }
		public OpdimContext opdim() {
			return getRuleContext(OpdimContext.class,0);
		}
		public DefineVarContext(AssignmentContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new AssignVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(ID);
				setState(138);
				match(T__10);
				setState(142);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__14:
				case T__15:
				case BOOLEAN:
				case ID:
				case DOUBLE:
				case INTEGER:
					{
					setState(139);
					expr(0);
					}
					break;
				case T__4:
					{
					setState(140);
					input();
					}
					break;
				case STRING:
					{
					setState(141);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(144);
					match(T__11);
					setState(145);
					opdim(0);
					setState(146);
					match(T__12);
					}
				}

				}
				break;
			case 2:
				_localctx = new DefineVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				declare();
				setState(151);
				match(T__10);
				setState(155);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__14:
				case T__15:
				case BOOLEAN:
				case ID:
				case DOUBLE:
				case INTEGER:
					{
					setState(152);
					expr(0);
					}
					break;
				case T__4:
					{
					setState(153);
					input();
					}
					break;
				case STRING:
					{
					setState(154);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(157);
					match(T__11);
					setState(158);
					opdim(0);
					setState(159);
					match(T__12);
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

	public static class OpdimContext extends ParserRuleContext {
		public OpdimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opdim; }
	 
		public OpdimContext() { }
		public void copyFrom(OpdimContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DimPowerContext extends OpdimContext {
		public Token op;
		public List<OpdimContext> opdim() {
			return getRuleContexts(OpdimContext.class);
		}
		public OpdimContext opdim(int i) {
			return getRuleContext(OpdimContext.class,i);
		}
		public TerminalNode INTEGER() { return getToken(chubixParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(chubixParser.DOUBLE, 0); }
		public DimPowerContext(OpdimContext ctx) { copyFrom(ctx); }
	}
	public static class DimUnnContext extends OpdimContext {
		public Token op;
		public OpdimContext opdim() {
			return getRuleContext(OpdimContext.class,0);
		}
		public DimUnnContext(OpdimContext ctx) { copyFrom(ctx); }
	}
	public static class DimSumMinContext extends OpdimContext {
		public Token op;
		public List<OpdimContext> opdim() {
			return getRuleContexts(OpdimContext.class);
		}
		public OpdimContext opdim(int i) {
			return getRuleContext(OpdimContext.class,i);
		}
		public DimSumMinContext(OpdimContext ctx) { copyFrom(ctx); }
	}
	public static class DimMultDivContext extends OpdimContext {
		public Token op;
		public List<OpdimContext> opdim() {
			return getRuleContexts(OpdimContext.class);
		}
		public OpdimContext opdim(int i) {
			return getRuleContext(OpdimContext.class,i);
		}
		public DimMultDivContext(OpdimContext ctx) { copyFrom(ctx); }
	}
	public static class DimIDContext extends OpdimContext {
		public Token op;
		public TerminalNode ID() { return getToken(chubixParser.ID, 0); }
		public DimIDContext(OpdimContext ctx) { copyFrom(ctx); }
	}

	public final OpdimContext opdim() throws RecognitionException {
		return opdim(0);
	}

	private OpdimContext opdim(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OpdimContext _localctx = new OpdimContext(_ctx, _parentState);
		OpdimContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_opdim, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new DimUnnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14 || _la==T__15) {
					{
					setState(166);
					((DimUnnContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__14 || _la==T__15) ) {
						((DimUnnContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(169);
				match(T__2);
				setState(170);
				opdim(0);
				setState(171);
				match(T__3);
				}
				break;
			case 2:
				{
				_localctx = new DimIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14 || _la==T__15) {
					{
					setState(173);
					((DimIDContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__14 || _la==T__15) ) {
						((DimIDContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(176);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(198);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new DimMultDivContext(new OpdimContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_opdim);
						setState(179);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(180);
						((DimMultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
							((DimMultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(181);
						opdim(5);
						}
						break;
					case 2:
						{
						_localctx = new DimSumMinContext(new OpdimContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_opdim);
						setState(182);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(183);
						((DimSumMinContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
							((DimSumMinContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(184);
						opdim(4);
						}
						break;
					case 3:
						{
						_localctx = new DimPowerContext(new OpdimContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_opdim);
						setState(185);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(186);
						match(T__13);
						setState(196);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
						case 1:
							{
							setState(187);
							opdim(0);
							}
							break;
						case 2:
							{
							setState(189);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==T__14 || _la==T__15) {
								{
								setState(188);
								((DimPowerContext)_localctx).op = _input.LT(1);
								_la = _input.LA(1);
								if ( !(_la==T__14 || _la==T__15) ) {
									((DimPowerContext)_localctx).op = (Token)_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
							}

							setState(191);
							match(INTEGER);
							}
							break;
						case 3:
							{
							setState(193);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==T__14 || _la==T__15) {
								{
								setState(192);
								((DimPowerContext)_localctx).op = _input.LT(1);
								_la = _input.LA(1);
								if ( !(_la==T__14 || _la==T__15) ) {
									((DimPowerContext)_localctx).op = (Token)_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
							}

							setState(195);
							match(DOUBLE);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(202);
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

	public static class DeclareContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(chubixParser.ID, 0); }
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			type();
			setState(204);
			match(ID);
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

	public static class ConditionalContext extends ParserRuleContext {
		public InstListContext trueSL;
		public ElseCondContext falseSL;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstListContext instList() {
			return getRuleContext(InstListContext.class,0);
		}
		public ElseCondContext elseCond() {
			return getRuleContext(ElseCondContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__18);
			setState(207);
			match(T__2);
			setState(208);
			expr(0);
			setState(209);
			match(T__3);
			setState(210);
			match(T__8);
			setState(211);
			((ConditionalContext)_localctx).trueSL = instList();
			setState(212);
			match(T__9);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(213);
				match(T__19);
				setState(214);
				((ConditionalContext)_localctx).falseSL = elseCond();
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

	public static class ElseCondContext extends ParserRuleContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public InstListContext instList() {
			return getRuleContext(InstListContext.class,0);
		}
		public ElseCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseCond; }
	}

	public final ElseCondContext elseCond() throws RecognitionException {
		ElseCondContext _localctx = new ElseCondContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elseCond);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				conditional();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(T__8);
				setState(219);
				instList();
				setState(220);
				match(T__9);
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

	public static class ForLoopContext extends ParserRuleContext {
		public AssignmentContext var;
		public ExprContext varBreak;
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public InstListContext instList() {
			return getRuleContext(InstListContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			insideLoop++;
			setState(225);
			match(T__20);
			setState(226);
			match(T__2);
			setState(227);
			((ForLoopContext)_localctx).var = assignment();
			setState(228);
			match(T__0);
			setState(229);
			((ForLoopContext)_localctx).varBreak = expr(0);
			setState(230);
			match(T__0);
			setState(231);
			assignment();
			setState(232);
			match(T__3);
			setState(233);
			match(T__8);
			setState(234);
			instList();
			setState(235);
			match(T__9);
			insideLoop--;
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

	public static class WhileLoopContext extends ParserRuleContext {
		public InstListContext condSL;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstListContext instList() {
			return getRuleContext(InstListContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			insideLoop++;
			setState(239);
			match(T__21);
			setState(240);
			match(T__2);
			setState(241);
			expr(0);
			setState(242);
			match(T__3);
			setState(243);
			match(T__8);
			setState(244);
			((WhileLoopContext)_localctx).condSL = instList();
			setState(245);
			match(T__9);
			insideLoop--;
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

	public static class BreakLoopContext extends ParserRuleContext {
		public BreakLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakLoop; }
	}

	public final BreakLoopContext breakLoop() throws RecognitionException {
		BreakLoopContext _localctx = new BreakLoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_breakLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			if (!(insideLoop > 0)) throw new FailedPredicateException(this, "insideLoop > 0");
			setState(249);
			match(T__22);
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

	public static class ContinueLoopContext extends ParserRuleContext {
		public ContinueLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueLoop; }
	}

	public final ContinueLoopContext continueLoop() throws RecognitionException {
		ContinueLoopContext _localctx = new ContinueLoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_continueLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			if (!(insideLoop > 0)) throw new FailedPredicateException(this, "insideLoop > 0");
			setState(252);
			match(T__23);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoubleTypeContext extends TypeContext {
		public DoubleTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class DimensionTypeContext extends TypeContext {
		public TerminalNode ID() { return getToken(chubixParser.ID, 0); }
		public DimensionTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class StrTypeContext extends TypeContext {
		public StrTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class IntTypeContext extends TypeContext {
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class BoolTypeContext extends TypeContext {
		public BoolTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_type);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(T__24);
				}
				break;
			case T__25:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(T__25);
				}
				break;
			case T__26:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(T__26);
				}
				break;
			case T__27:
				_localctx = new StrTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				match(T__27);
				}
				break;
			case ID:
				_localctx = new DimensionTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				match(ID);
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
	public static class DoubleExprContext extends ExprContext {
		public TerminalNode DOUBLE() { return getToken(chubixParser.DOUBLE, 0); }
		public OpdimContext opdim() {
			return getRuleContext(OpdimContext.class,0);
		}
		public DoubleExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class DoubleSumMinContext extends ExprContext {
		public Token op;
		public TerminalNode ID() { return getToken(chubixParser.ID, 0); }
		public DoubleSumMinContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AddSubExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IntegerExprContext extends ExprContext {
		public TerminalNode INTEGER() { return getToken(chubixParser.INTEGER, 0); }
		public OpdimContext opdim() {
			return getRuleContext(OpdimContext.class,0);
		}
		public IntegerExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SignExprContext extends ExprContext {
		public Token sign;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SignExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanExprContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(chubixParser.BOOLEAN, 0); }
		public BooleanExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MultDivRestExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultDivRestExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PowExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ConditionalExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ConditionalExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(chubixParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionExprContext extends ExprContext {
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public FunctionExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				_localctx = new SignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(262);
				((SignExprContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
					((SignExprContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(263);
				expr(12);
				}
				break;
			case 2:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264);
				match(T__2);
				setState(265);
				expr(0);
				setState(266);
				match(T__3);
				}
				break;
			case 3:
				{
				_localctx = new DoubleSumMinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
				match(ID);
				setState(269);
				((DoubleSumMinContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__36 || _la==T__37) ) {
					((DoubleSumMinContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				{
				_localctx = new DoubleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				match(DOUBLE);
				setState(275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(271);
					match(T__11);
					setState(272);
					opdim(0);
					setState(273);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 5:
				{
				_localctx = new IntegerExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277);
				match(INTEGER);
				setState(282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(278);
					match(T__11);
					setState(279);
					opdim(0);
					setState(280);
					match(T__12);
					}
					break;
				}
				}
				break;
			case 6:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284);
				match(BOOLEAN);
				}
				break;
			case 7:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286);
				callFunction();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(301);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(289);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(290);
						match(T__13);
						setState(291);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new MultDivRestExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(292);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(293);
						((MultDivRestExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__28) | (1L << T__29))) != 0)) ) {
							((MultDivRestExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(294);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(295);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(296);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(297);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ConditionalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(298);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(299);
						((ConditionalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
							((ConditionalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(300);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		case 6:
			return returnFunc_sempred((ReturnFuncContext)_localctx, predIndex);
		case 10:
			return opdim_sempred((OpdimContext)_localctx, predIndex);
		case 16:
			return breakLoop_sempred((BreakLoopContext)_localctx, predIndex);
		case 17:
			return continueLoop_sempred((ContinueLoopContext)_localctx, predIndex);
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean returnFunc_sempred(ReturnFuncContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return insideFunc > 0;
		}
		return true;
	}
	private boolean opdim_sempred(OpdimContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean breakLoop_sempred(BreakLoopContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return insideLoop > 0;
		}
		return true;
	}
	private boolean continueLoop_sempred(ContinueLoopContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return insideLoop > 0;
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0135\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\5\3/\n\3\3\3\7\3\62\n\3"+
		"\f\3\16\3\65\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\5"+
		"\3\5\3\5\3\5\5\5G\n\5\3\5\3\5\3\6\3\6\3\6\5\6N\n\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7[\n\7\3\b\3\b\3\b\5\b`\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\tj\n\t\f\t\16\tm\13\t\5\to\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\tv\n\t\f\t\16\ty\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u0083\n\n"+
		"\f\n\16\n\u0086\13\n\5\n\u0088\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u0091\n\13\3\13\3\13\3\13\3\13\5\13\u0097\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u009e\n\13\3\13\3\13\3\13\3\13\5\13\u00a4\n\13\5\13\u00a6\n"+
		"\13\3\f\3\f\5\f\u00aa\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b1\n\f\3\f\5\f\u00b4"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c0\n\f\3\f\3\f\5\f"+
		"\u00c4\n\f\3\f\5\f\u00c7\n\f\7\f\u00c9\n\f\f\f\16\f\u00cc\13\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00da\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00e1\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u0106\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0116\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u011d\n"+
		"\25\3\25\3\25\3\25\5\25\u0122\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u0130\n\25\f\25\16\25\u0133\13\25\3\25"+
		"\2\4\26(\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\7\3\2\21\22"+
		"\3\2\23\24\3\2\'(\4\2\23\24\37 \3\2!&\2\u0160\2*\3\2\2\2\4\63\3\2\2\2"+
		"\6@\3\2\2\2\bB\3\2\2\2\nJ\3\2\2\2\fZ\3\2\2\2\16\\\3\2\2\2\20a\3\2\2\2"+
		"\22}\3\2\2\2\24\u00a5\3\2\2\2\26\u00b3\3\2\2\2\30\u00cd\3\2\2\2\32\u00d0"+
		"\3\2\2\2\34\u00e0\3\2\2\2\36\u00e2\3\2\2\2 \u00f0\3\2\2\2\"\u00fa\3\2"+
		"\2\2$\u00fd\3\2\2\2&\u0105\3\2\2\2(\u0121\3\2\2\2*+\5\4\3\2+,\7\2\2\3"+
		",\3\3\2\2\2-/\5\6\4\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\62\7\3\2\2\61"+
		".\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\5\3\2\2\2\65\63"+
		"\3\2\2\2\66A\5\b\5\2\67A\5\24\13\28A\5\32\16\29A\5\36\20\2:A\5\"\22\2"+
		";A\5$\23\2<A\5 \21\2=A\5\30\r\2>A\5\22\n\2?A\5\20\t\2@\66\3\2\2\2@\67"+
		"\3\2\2\2@8\3\2\2\2@9\3\2\2\2@:\3\2\2\2@;\3\2\2\2@<\3\2\2\2@=\3\2\2\2@"+
		">\3\2\2\2@?\3\2\2\2A\7\3\2\2\2BC\7\4\2\2CF\7\5\2\2DG\5(\25\2EG\7-\2\2"+
		"FD\3\2\2\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\6\2\2I\t\3\2\2\2JK\7\7\2"+
		"\2KM\7\5\2\2LN\7-\2\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\6\2\2P\13\3\2"+
		"\2\2Q[\5\b\5\2R[\5\24\13\2S[\5\32\16\2T[\5\36\20\2U[\5\"\22\2V[\5$\23"+
		"\2W[\5 \21\2X[\5\30\r\2Y[\5\16\b\2ZQ\3\2\2\2ZR\3\2\2\2ZS\3\2\2\2ZT\3\2"+
		"\2\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\r\3\2\2\2\\]\6"+
		"\b\2\2]_\7\b\2\2^`\5(\25\2_^\3\2\2\2_`\3\2\2\2`\17\3\2\2\2ab\b\t\1\2b"+
		"c\7\t\2\2cd\5&\24\2de\7*\2\2en\7\5\2\2fk\5\30\r\2gh\7\n\2\2hj\5\30\r\2"+
		"ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2nf\3\2\2\2"+
		"no\3\2\2\2op\3\2\2\2pq\7\6\2\2qw\7\13\2\2rs\5\f\7\2st\7\3\2\2tv\3\2\2"+
		"\2ur\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\f\2"+
		"\2{|\b\t\1\2|\21\3\2\2\2}~\7*\2\2~\u0087\7\5\2\2\177\u0084\5(\25\2\u0080"+
		"\u0081\7\n\2\2\u0081\u0083\5(\25\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0088\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\177\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2"+
		"\2\u0089\u008a\7\6\2\2\u008a\23\3\2\2\2\u008b\u008c\7*\2\2\u008c\u0090"+
		"\7\r\2\2\u008d\u0091\5(\25\2\u008e\u0091\5\n\6\2\u008f\u0091\7-\2\2\u0090"+
		"\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0096\3\2"+
		"\2\2\u0092\u0093\7\16\2\2\u0093\u0094\5\26\f\2\u0094\u0095\7\17\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0092\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u00a6\3\2"+
		"\2\2\u0098\u0099\5\30\r\2\u0099\u009d\7\r\2\2\u009a\u009e\5(\25\2\u009b"+
		"\u009e\5\n\6\2\u009c\u009e\7-\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009c\3\2\2\2\u009e\u00a3\3\2\2\2\u009f\u00a0\7\16\2\2\u00a0"+
		"\u00a1\5\26\f\2\u00a1\u00a2\7\17\2\2\u00a2\u00a4\3\2\2\2\u00a3\u009f\3"+
		"\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u008b\3\2\2\2\u00a5"+
		"\u0098\3\2\2\2\u00a6\25\3\2\2\2\u00a7\u00a9\b\f\1\2\u00a8\u00aa\t\2\2"+
		"\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac"+
		"\7\5\2\2\u00ac\u00ad\5\26\f\2\u00ad\u00ae\7\6\2\2\u00ae\u00b4\3\2\2\2"+
		"\u00af\u00b1\t\2\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b4\7*\2\2\u00b3\u00a7\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4"+
		"\u00ca\3\2\2\2\u00b5\u00b6\f\6\2\2\u00b6\u00b7\t\3\2\2\u00b7\u00c9\5\26"+
		"\f\7\u00b8\u00b9\f\5\2\2\u00b9\u00ba\t\2\2\2\u00ba\u00c9\5\26\f\6\u00bb"+
		"\u00bc\f\7\2\2\u00bc\u00c6\7\20\2\2\u00bd\u00c7\5\26\f\2\u00be\u00c0\t"+
		"\2\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c7\7,\2\2\u00c2\u00c4\t\2\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\7+\2\2\u00c6\u00bd\3\2\2\2\u00c6"+
		"\u00bf\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00b5\3\2"+
		"\2\2\u00c8\u00b8\3\2\2\2\u00c8\u00bb\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\27\3\2\2\2\u00cc\u00ca\3\2\2"+
		"\2\u00cd\u00ce\5&\24\2\u00ce\u00cf\7*\2\2\u00cf\31\3\2\2\2\u00d0\u00d1"+
		"\7\25\2\2\u00d1\u00d2\7\5\2\2\u00d2\u00d3\5(\25\2\u00d3\u00d4\7\6\2\2"+
		"\u00d4\u00d5\7\13\2\2\u00d5\u00d6\5\4\3\2\u00d6\u00d9\7\f\2\2\u00d7\u00d8"+
		"\7\26\2\2\u00d8\u00da\5\34\17\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2"+
		"\2\u00da\33\3\2\2\2\u00db\u00e1\5\32\16\2\u00dc\u00dd\7\13\2\2\u00dd\u00de"+
		"\5\4\3\2\u00de\u00df\7\f\2\2\u00df\u00e1\3\2\2\2\u00e0\u00db\3\2\2\2\u00e0"+
		"\u00dc\3\2\2\2\u00e1\35\3\2\2\2\u00e2\u00e3\b\20\1\2\u00e3\u00e4\7\27"+
		"\2\2\u00e4\u00e5\7\5\2\2\u00e5\u00e6\5\24\13\2\u00e6\u00e7\7\3\2\2\u00e7"+
		"\u00e8\5(\25\2\u00e8\u00e9\7\3\2\2\u00e9\u00ea\5\24\13\2\u00ea\u00eb\7"+
		"\6\2\2\u00eb\u00ec\7\13\2\2\u00ec\u00ed\5\4\3\2\u00ed\u00ee\7\f\2\2\u00ee"+
		"\u00ef\b\20\1\2\u00ef\37\3\2\2\2\u00f0\u00f1\b\21\1\2\u00f1\u00f2\7\30"+
		"\2\2\u00f2\u00f3\7\5\2\2\u00f3\u00f4\5(\25\2\u00f4\u00f5\7\6\2\2\u00f5"+
		"\u00f6\7\13\2\2\u00f6\u00f7\5\4\3\2\u00f7\u00f8\7\f\2\2\u00f8\u00f9\b"+
		"\21\1\2\u00f9!\3\2\2\2\u00fa\u00fb\6\22\6\2\u00fb\u00fc\7\31\2\2\u00fc"+
		"#\3\2\2\2\u00fd\u00fe\6\23\7\2\u00fe\u00ff\7\32\2\2\u00ff%\3\2\2\2\u0100"+
		"\u0106\7\33\2\2\u0101\u0106\7\34\2\2\u0102\u0106\7\35\2\2\u0103\u0106"+
		"\7\36\2\2\u0104\u0106\7*\2\2\u0105\u0100\3\2\2\2\u0105\u0101\3\2\2\2\u0105"+
		"\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\'\3\2\2\2"+
		"\u0107\u0108\b\25\1\2\u0108\u0109\t\2\2\2\u0109\u0122\5(\25\16\u010a\u010b"+
		"\7\5\2\2\u010b\u010c\5(\25\2\u010c\u010d\7\6\2\2\u010d\u0122\3\2\2\2\u010e"+
		"\u010f\7*\2\2\u010f\u0122\t\4\2\2\u0110\u0115\7+\2\2\u0111\u0112\7\16"+
		"\2\2\u0112\u0113\5\26\f\2\u0113\u0114\7\17\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0111\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0122\3\2\2\2\u0117\u011c\7,"+
		"\2\2\u0118\u0119\7\16\2\2\u0119\u011a\5\26\f\2\u011a\u011b\7\17\2\2\u011b"+
		"\u011d\3\2\2\2\u011c\u0118\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0122\3\2"+
		"\2\2\u011e\u0122\7)\2\2\u011f\u0122\7*\2\2\u0120\u0122\5\22\n\2\u0121"+
		"\u0107\3\2\2\2\u0121\u010a\3\2\2\2\u0121\u010e\3\2\2\2\u0121\u0110\3\2"+
		"\2\2\u0121\u0117\3\2\2\2\u0121\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0120\3\2\2\2\u0122\u0131\3\2\2\2\u0123\u0124\f\r\2\2\u0124\u0125\7\20"+
		"\2\2\u0125\u0130\5(\25\r\u0126\u0127\f\f\2\2\u0127\u0128\t\5\2\2\u0128"+
		"\u0130\5(\25\r\u0129\u012a\f\13\2\2\u012a\u012b\t\2\2\2\u012b\u0130\5"+
		"(\25\f\u012c\u012d\f\n\2\2\u012d\u012e\t\6\2\2\u012e\u0130\5(\25\13\u012f"+
		"\u0123\3\2\2\2\u012f\u0126\3\2\2\2\u012f\u0129\3\2\2\2\u012f\u012c\3\2"+
		"\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		")\3\2\2\2\u0133\u0131\3\2\2\2#.\63@FMZ_knw\u0084\u0087\u0090\u0096\u009d"+
		"\u00a3\u00a5\u00a9\u00b0\u00b3\u00bf\u00c3\u00c6\u00c8\u00ca\u00d9\u00e0"+
		"\u0105\u0115\u011c\u0121\u012f\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}