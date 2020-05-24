// Generated from chubix.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
		COMMENT=46, ERROR=47;
	public static final int
		RULE_main = 0, RULE_instList = 1, RULE_instruction = 2, RULE_print = 3, 
		RULE_input = 4, RULE_returnFunc = 5, RULE_function = 6, RULE_callFunction = 7, 
		RULE_assignment = 8, RULE_declare = 9, RULE_conditional = 10, RULE_elseCond = 11, 
		RULE_forLoop = 12, RULE_whileLoop = 13, RULE_breakLoop = 14, RULE_continueLoop = 15, 
		RULE_type = 16, RULE_expr = 17, RULE_unitdim = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "instList", "instruction", "print", "input", "returnFunc", "function", 
			"callFunction", "assignment", "declare", "conditional", "elseCond", "forLoop", 
			"whileLoop", "breakLoop", "continueLoop", "type", "expr", "unitdim"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'print'", "'('", "')'", "'input'", "'return'", "'function'", 
			"','", "'{'", "'}'", "'='", "'['", "']'", "'if'", "'else'", "'for'", 
			"'while'", "'break'", "'continue'", "'Integer'", "'Double'", "'Boolean'", 
			"'String'", "'+'", "'-'", "'^'", "'*'", "'/'", "'%'", "'//'", "'=='", 
			"'!='", "'<'", "'>'", "'>='", "'<='", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "BOOLEAN", "ID", "DOUBLE", "INTEGER", "STRING", "WS", 
			"LINE_COMMENT", "COMMENT", "ERROR"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			instList();
			setState(39);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterInstList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitInstList(this);
		}
	}

	public final InstListContext instList() throws RecognitionException {
		InstListContext _localctx = new InstListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(41);
						instruction();
						}
						break;
					}
					setState(44);
					match(T__0);
					}
					} 
				}
				setState(49);
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
		public ReturnFuncContext returnFunc() {
			return getRuleContext(ReturnFuncContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				forLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				breakLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				continueLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				whileLoop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
				declare();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(58);
				callFunction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(59);
				function();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(60);
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

	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(chubixParser.STRING, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__1);
			setState(64);
			match(T__2);
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__23:
			case T__24:
			case BOOLEAN:
			case ID:
			case DOUBLE:
			case INTEGER:
				{
				setState(65);
				expr(0);
				}
				break;
			case STRING:
				{
				setState(66);
				match(STRING);
				}
				break;
			case T__3:
				break;
			default:
				break;
			}
			setState(69);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__4);
			setState(72);
			match(T__2);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(73);
				match(STRING);
				}
			}

			setState(76);
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

	public static class ReturnFuncContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterReturnFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitReturnFunc(this);
		}
	}

	public final ReturnFuncContext returnFunc() throws RecognitionException {
		ReturnFuncContext _localctx = new ReturnFuncContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			if (!(insideFunc > 0)) throw new FailedPredicateException(this, "insideFunc > 0");
			setState(79);
			match(T__5);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__23) | (1L << T__24) | (1L << BOOLEAN) | (1L << ID) | (1L << DOUBLE) | (1L << INTEGER))) != 0)) {
				{
				setState(80);
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
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			if (!(insideFunc==0)) throw new FailedPredicateException(this, "insideFunc==0");
			insideFunc++;
			setState(85);
			match(T__6);
			setState(86);
			((FunctionContext)_localctx).ret_type = type();
			setState(87);
			((FunctionContext)_localctx).func_name = match(ID);
			setState(88);
			match(T__2);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << ID))) != 0)) {
				{
				setState(89);
				declare();
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(90);
					match(T__7);
					setState(91);
					declare();
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(99);
			match(T__3);
			setState(100);
			match(T__8);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(101);
					instruction();
					setState(102);
					match(T__0);
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(109);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitCallFunction(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			((CallFunctionContext)_localctx).func_name = match(ID);
			setState(113);
			match(T__2);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__23) | (1L << T__24) | (1L << BOOLEAN) | (1L << ID) | (1L << DOUBLE) | (1L << INTEGER))) != 0)) {
				{
				setState(114);
				expr(0);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(115);
					match(T__7);
					setState(116);
					expr(0);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(124);
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
		public UnitdimContext unitdim() {
			return getRuleContext(UnitdimContext.class,0);
		}
		public AssignVarContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterAssignVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitAssignVar(this);
		}
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
		public UnitdimContext unitdim() {
			return getRuleContext(UnitdimContext.class,0);
		}
		public DefineVarContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterDefineVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitDefineVar(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new AssignVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(ID);
				setState(127);
				match(T__10);
				setState(131);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__23:
				case T__24:
				case BOOLEAN:
				case ID:
				case DOUBLE:
				case INTEGER:
					{
					setState(128);
					expr(0);
					}
					break;
				case T__4:
					{
					setState(129);
					input();
					}
					break;
				case STRING:
					{
					setState(130);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(133);
					match(T__11);
					setState(134);
					unitdim(0);
					setState(135);
					match(T__12);
					}
				}

				}
				break;
			case 2:
				_localctx = new DefineVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				declare();
				setState(140);
				match(T__10);
				setState(144);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__23:
				case T__24:
				case BOOLEAN:
				case ID:
				case DOUBLE:
				case INTEGER:
					{
					setState(141);
					expr(0);
					}
					break;
				case T__4:
					{
					setState(142);
					input();
					}
					break;
				case STRING:
					{
					setState(143);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(146);
					match(T__11);
					setState(147);
					unitdim(0);
					setState(148);
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

	public static class DeclareContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(chubixParser.ID, 0); }
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitDeclare(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			type();
			setState(155);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__13);
			setState(158);
			match(T__2);
			setState(159);
			expr(0);
			setState(160);
			match(T__3);
			setState(161);
			match(T__8);
			setState(162);
			((ConditionalContext)_localctx).trueSL = instList();
			setState(163);
			match(T__9);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(164);
				match(T__14);
				setState(165);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterElseCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitElseCond(this);
		}
	}

	public final ElseCondContext elseCond() throws RecognitionException {
		ElseCondContext _localctx = new ElseCondContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseCond);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				conditional();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(T__8);
				setState(170);
				instList();
				setState(171);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			insideLoop++;
			setState(176);
			match(T__15);
			setState(177);
			match(T__2);
			setState(178);
			((ForLoopContext)_localctx).var = assignment();
			setState(179);
			match(T__0);
			setState(180);
			((ForLoopContext)_localctx).varBreak = expr(0);
			setState(181);
			match(T__0);
			setState(182);
			assignment();
			setState(183);
			match(T__3);
			setState(184);
			match(T__8);
			setState(185);
			instList();
			setState(186);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			insideLoop++;
			setState(190);
			match(T__16);
			setState(191);
			match(T__2);
			setState(192);
			expr(0);
			setState(193);
			match(T__3);
			setState(194);
			match(T__8);
			setState(195);
			((WhileLoopContext)_localctx).condSL = instList();
			setState(196);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterBreakLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitBreakLoop(this);
		}
	}

	public final BreakLoopContext breakLoop() throws RecognitionException {
		BreakLoopContext _localctx = new BreakLoopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_breakLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			if (!(insideLoop > 0)) throw new FailedPredicateException(this, "insideLoop > 0");
			setState(200);
			match(T__17);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterContinueLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitContinueLoop(this);
		}
	}

	public final ContinueLoopContext continueLoop() throws RecognitionException {
		ContinueLoopContext _localctx = new ContinueLoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_continueLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			if (!(insideLoop > 0)) throw new FailedPredicateException(this, "insideLoop > 0");
			setState(203);
			match(T__18);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitDoubleType(this);
		}
	}
	public static class DimensionTypeContext extends TypeContext {
		public TerminalNode ID() { return getToken(chubixParser.ID, 0); }
		public DimensionTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterDimensionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitDimensionType(this);
		}
	}
	public static class StrTypeContext extends TypeContext {
		public StrTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterStrType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitStrType(this);
		}
	}
	public static class IntTypeContext extends TypeContext {
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitIntType(this);
		}
	}
	public static class BoolTypeContext extends TypeContext {
		public BoolTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitBoolType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(T__19);
				}
				break;
			case T__20:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(T__20);
				}
				break;
			case T__21:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new StrTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(T__22);
				}
				break;
			case ID:
				_localctx = new DimensionTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
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
		public UnitdimContext unitdim() {
			return getRuleContext(UnitdimContext.class,0);
		}
		public DoubleExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterDoubleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitDoubleExpr(this);
		}
	}
	public static class DoubleSumMinContext extends ExprContext {
		public Token op;
		public TerminalNode ID() { return getToken(chubixParser.ID, 0); }
		public DoubleSumMinContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterDoubleSumMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitDoubleSumMin(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitAddSubExpr(this);
		}
	}
	public static class IntegerExprContext extends ExprContext {
		public TerminalNode INTEGER() { return getToken(chubixParser.INTEGER, 0); }
		public UnitdimContext unitdim() {
			return getRuleContext(UnitdimContext.class,0);
		}
		public IntegerExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterIntegerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitIntegerExpr(this);
		}
	}
	public static class SignExprContext extends ExprContext {
		public Token sign;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterSignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitSignExpr(this);
		}
	}
	public static class BooleanExprContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(chubixParser.BOOLEAN, 0); }
		public BooleanExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitBooleanExpr(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterMultDivRestExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitMultDivRestExpr(this);
		}
	}
	public static class PowExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitPowExpr(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitParenExpr(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterConditionalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitConditionalExpr(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(chubixParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitIdExpr(this);
		}
	}
	public static class FunctionExprContext extends ExprContext {
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public FunctionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitFunctionExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new SignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(213);
				((SignExprContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__23 || _la==T__24) ) {
					((SignExprContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(214);
				expr(12);
				}
				break;
			case 2:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(T__2);
				setState(216);
				expr(0);
				setState(217);
				match(T__3);
				}
				break;
			case 3:
				{
				_localctx = new DoubleSumMinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(ID);
				setState(220);
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
				setState(221);
				match(DOUBLE);
				setState(226);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(222);
					match(T__11);
					setState(223);
					unitdim(0);
					setState(224);
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
				setState(228);
				match(INTEGER);
				setState(233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(229);
					match(T__11);
					setState(230);
					unitdim(0);
					setState(231);
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
				setState(235);
				match(BOOLEAN);
				}
				break;
			case 7:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				callFunction();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(252);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(241);
						match(T__25);
						setState(242);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new MultDivRestExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(243);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(244);
						((MultDivRestExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
							((MultDivRestExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(245);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(246);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(247);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(248);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ConditionalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(250);
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
						setState(251);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class UnitdimContext extends ParserRuleContext {
		public UnitdimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitdim; }
	 
		public UnitdimContext() { }
		public void copyFrom(UnitdimContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DimPowerContext extends UnitdimContext {
		public Token op;
		public List<UnitdimContext> unitdim() {
			return getRuleContexts(UnitdimContext.class);
		}
		public UnitdimContext unitdim(int i) {
			return getRuleContext(UnitdimContext.class,i);
		}
		public TerminalNode INTEGER() { return getToken(chubixParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(chubixParser.DOUBLE, 0); }
		public DimPowerContext(UnitdimContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterDimPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitDimPower(this);
		}
	}
	public static class DimUnnContext extends UnitdimContext {
		public Token op;
		public UnitdimContext unitdim() {
			return getRuleContext(UnitdimContext.class,0);
		}
		public DimUnnContext(UnitdimContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterDimUnn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitDimUnn(this);
		}
	}
	public static class DimSumMinContext extends UnitdimContext {
		public Token op;
		public List<UnitdimContext> unitdim() {
			return getRuleContexts(UnitdimContext.class);
		}
		public UnitdimContext unitdim(int i) {
			return getRuleContext(UnitdimContext.class,i);
		}
		public DimSumMinContext(UnitdimContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterDimSumMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitDimSumMin(this);
		}
	}
	public static class DimMultDivContext extends UnitdimContext {
		public Token op;
		public List<UnitdimContext> unitdim() {
			return getRuleContexts(UnitdimContext.class);
		}
		public UnitdimContext unitdim(int i) {
			return getRuleContext(UnitdimContext.class,i);
		}
		public DimMultDivContext(UnitdimContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterDimMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitDimMultDiv(this);
		}
	}
	public static class DimIDContext extends UnitdimContext {
		public Token op;
		public TerminalNode ID() { return getToken(chubixParser.ID, 0); }
		public DimIDContext(UnitdimContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterDimID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitDimID(this);
		}
	}

	public final UnitdimContext unitdim() throws RecognitionException {
		return unitdim(0);
	}

	private UnitdimContext unitdim(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UnitdimContext _localctx = new UnitdimContext(_ctx, _parentState);
		UnitdimContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_unitdim, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new DimUnnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23 || _la==T__24) {
					{
					setState(258);
					((DimUnnContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__23 || _la==T__24) ) {
						((DimUnnContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(261);
				match(T__2);
				setState(262);
				unitdim(0);
				setState(263);
				match(T__3);
				}
				break;
			case 2:
				{
				_localctx = new DimIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__23 || _la==T__24) {
					{
					setState(265);
					((DimIDContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__23 || _la==T__24) ) {
						((DimIDContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(268);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(290);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new DimMultDivContext(new UnitdimContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_unitdim);
						setState(271);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(272);
						((DimMultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
							((DimMultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(273);
						unitdim(5);
						}
						break;
					case 2:
						{
						_localctx = new DimSumMinContext(new UnitdimContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_unitdim);
						setState(274);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(275);
						((DimSumMinContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((DimSumMinContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(276);
						unitdim(4);
						}
						break;
					case 3:
						{
						_localctx = new DimPowerContext(new UnitdimContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_unitdim);
						setState(277);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(278);
						match(T__25);
						setState(288);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
						case 1:
							{
							setState(279);
							unitdim(0);
							}
							break;
						case 2:
							{
							setState(281);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==T__23 || _la==T__24) {
								{
								setState(280);
								((DimPowerContext)_localctx).op = _input.LT(1);
								_la = _input.LA(1);
								if ( !(_la==T__23 || _la==T__24) ) {
									((DimPowerContext)_localctx).op = (Token)_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
							}

							setState(283);
							match(INTEGER);
							}
							break;
						case 3:
							{
							setState(285);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==T__23 || _la==T__24) {
								{
								setState(284);
								((DimPowerContext)_localctx).op = _input.LT(1);
								_la = _input.LA(1);
								if ( !(_la==T__23 || _la==T__24) ) {
									((DimPowerContext)_localctx).op = (Token)_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
							}

							setState(287);
							match(DOUBLE);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		case 5:
			return returnFunc_sempred((ReturnFuncContext)_localctx, predIndex);
		case 6:
			return function_sempred((FunctionContext)_localctx, predIndex);
		case 14:
			return breakLoop_sempred((BreakLoopContext)_localctx, predIndex);
		case 15:
			return continueLoop_sempred((ContinueLoopContext)_localctx, predIndex);
		case 17:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 18:
			return unitdim_sempred((UnitdimContext)_localctx, predIndex);
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
	private boolean function_sempred(FunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return insideFunc==0;
		}
		return true;
	}
	private boolean breakLoop_sempred(BreakLoopContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return insideLoop > 0;
		}
		return true;
	}
	private boolean continueLoop_sempred(ContinueLoopContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return insideLoop > 0;
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean unitdim_sempred(UnitdimContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u012a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\5\3-\n\3\3\3\7\3\60\n\3\f\3\16\3"+
		"\63\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5"+
		"\3\5\3\5\5\5F\n\5\3\5\3\5\3\6\3\6\3\6\5\6M\n\6\3\6\3\6\3\7\3\7\3\7\5\7"+
		"T\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b_\n\b\f\b\16\bb\13\b\5\b"+
		"d\n\b\3\b\3\b\3\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\7\tx\n\t\f\t\16\t{\13\t\5\t}\n\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u0086\n\n\3\n\3\n\3\n\3\n\5\n\u008c\n\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0093\n\n\3\n\3\n\3\n\3\n\5\n\u0099\n\n\5\n\u009b\n\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a9\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00b0\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00d5\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00e5\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ec\n\23\3\23\3\23\3\23\5"+
		"\23\u00f1\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u00ff\n\23\f\23\16\23\u0102\13\23\3\24\3\24\5\24\u0106\n\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u010d\n\24\3\24\5\24\u0110\n\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u011c\n\24\3\24\3\24"+
		"\5\24\u0120\n\24\3\24\5\24\u0123\n\24\7\24\u0125\n\24\f\24\16\24\u0128"+
		"\13\24\3\24\2\4$&\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\7\3"+
		"\2\32\33\3\2\'(\3\2\35 \3\2!&\3\2\35\36\2\u014f\2(\3\2\2\2\4\61\3\2\2"+
		"\2\6?\3\2\2\2\bA\3\2\2\2\nI\3\2\2\2\fP\3\2\2\2\16U\3\2\2\2\20r\3\2\2\2"+
		"\22\u009a\3\2\2\2\24\u009c\3\2\2\2\26\u009f\3\2\2\2\30\u00af\3\2\2\2\32"+
		"\u00b1\3\2\2\2\34\u00bf\3\2\2\2\36\u00c9\3\2\2\2 \u00cc\3\2\2\2\"\u00d4"+
		"\3\2\2\2$\u00f0\3\2\2\2&\u010f\3\2\2\2()\5\4\3\2)*\7\2\2\3*\3\3\2\2\2"+
		"+-\5\6\4\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2.\60\7\3\2\2/,\3\2\2\2\60\63\3"+
		"\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\5\3\2\2\2\63\61\3\2\2\2\64@\5\b\5"+
		"\2\65@\5\22\n\2\66@\5\26\f\2\67@\5\32\16\28@\5\36\20\29@\5 \21\2:@\5\34"+
		"\17\2;@\5\24\13\2<@\5\20\t\2=@\5\16\b\2>@\5\f\7\2?\64\3\2\2\2?\65\3\2"+
		"\2\2?\66\3\2\2\2?\67\3\2\2\2?8\3\2\2\2?9\3\2\2\2?:\3\2\2\2?;\3\2\2\2?"+
		"<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\7\3\2\2\2AB\7\4\2\2BE\7\5\2\2CF\5$\23\2"+
		"DF\7-\2\2EC\3\2\2\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7\6\2\2H\t\3\2\2\2"+
		"IJ\7\7\2\2JL\7\5\2\2KM\7-\2\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\6\2\2"+
		"O\13\3\2\2\2PQ\6\7\2\2QS\7\b\2\2RT\5$\23\2SR\3\2\2\2ST\3\2\2\2T\r\3\2"+
		"\2\2UV\6\b\3\2VW\b\b\1\2WX\7\t\2\2XY\5\"\22\2YZ\7*\2\2Zc\7\5\2\2[`\5\24"+
		"\13\2\\]\7\n\2\2]_\5\24\13\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2"+
		"ad\3\2\2\2b`\3\2\2\2c[\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\6\2\2fl\7\13\2"+
		"\2gh\5\6\4\2hi\7\3\2\2ik\3\2\2\2jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2"+
		"\2mo\3\2\2\2nl\3\2\2\2op\7\f\2\2pq\b\b\1\2q\17\3\2\2\2rs\7*\2\2s|\7\5"+
		"\2\2ty\5$\23\2uv\7\n\2\2vx\5$\23\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2"+
		"\2\2z}\3\2\2\2{y\3\2\2\2|t\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7\6\2\2\177"+
		"\21\3\2\2\2\u0080\u0081\7*\2\2\u0081\u0085\7\r\2\2\u0082\u0086\5$\23\2"+
		"\u0083\u0086\5\n\6\2\u0084\u0086\7-\2\2\u0085\u0082\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0085\u0084\3\2\2\2\u0086\u008b\3\2\2\2\u0087\u0088\7\16\2\2"+
		"\u0088\u0089\5&\24\2\u0089\u008a\7\17\2\2\u008a\u008c\3\2\2\2\u008b\u0087"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u009b\3\2\2\2\u008d\u008e\5\24\13\2"+
		"\u008e\u0092\7\r\2\2\u008f\u0093\5$\23\2\u0090\u0093\5\n\6\2\u0091\u0093"+
		"\7-\2\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093"+
		"\u0098\3\2\2\2\u0094\u0095\7\16\2\2\u0095\u0096\5&\24\2\u0096\u0097\7"+
		"\17\2\2\u0097\u0099\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0080\3\2\2\2\u009a\u008d\3\2\2\2\u009b\23\3\2\2"+
		"\2\u009c\u009d\5\"\22\2\u009d\u009e\7*\2\2\u009e\25\3\2\2\2\u009f\u00a0"+
		"\7\20\2\2\u00a0\u00a1\7\5\2\2\u00a1\u00a2\5$\23\2\u00a2\u00a3\7\6\2\2"+
		"\u00a3\u00a4\7\13\2\2\u00a4\u00a5\5\4\3\2\u00a5\u00a8\7\f\2\2\u00a6\u00a7"+
		"\7\21\2\2\u00a7\u00a9\5\30\r\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2"+
		"\u00a9\27\3\2\2\2\u00aa\u00b0\5\26\f\2\u00ab\u00ac\7\13\2\2\u00ac\u00ad"+
		"\5\4\3\2\u00ad\u00ae\7\f\2\2\u00ae\u00b0\3\2\2\2\u00af\u00aa\3\2\2\2\u00af"+
		"\u00ab\3\2\2\2\u00b0\31\3\2\2\2\u00b1\u00b2\b\16\1\2\u00b2\u00b3\7\22"+
		"\2\2\u00b3\u00b4\7\5\2\2\u00b4\u00b5\5\22\n\2\u00b5\u00b6\7\3\2\2\u00b6"+
		"\u00b7\5$\23\2\u00b7\u00b8\7\3\2\2\u00b8\u00b9\5\22\n\2\u00b9\u00ba\7"+
		"\6\2\2\u00ba\u00bb\7\13\2\2\u00bb\u00bc\5\4\3\2\u00bc\u00bd\7\f\2\2\u00bd"+
		"\u00be\b\16\1\2\u00be\33\3\2\2\2\u00bf\u00c0\b\17\1\2\u00c0\u00c1\7\23"+
		"\2\2\u00c1\u00c2\7\5\2\2\u00c2\u00c3\5$\23\2\u00c3\u00c4\7\6\2\2\u00c4"+
		"\u00c5\7\13\2\2\u00c5\u00c6\5\4\3\2\u00c6\u00c7\7\f\2\2\u00c7\u00c8\b"+
		"\17\1\2\u00c8\35\3\2\2\2\u00c9\u00ca\6\20\4\2\u00ca\u00cb\7\24\2\2\u00cb"+
		"\37\3\2\2\2\u00cc\u00cd\6\21\5\2\u00cd\u00ce\7\25\2\2\u00ce!\3\2\2\2\u00cf"+
		"\u00d5\7\26\2\2\u00d0\u00d5\7\27\2\2\u00d1\u00d5\7\30\2\2\u00d2\u00d5"+
		"\7\31\2\2\u00d3\u00d5\7*\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d4"+
		"\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5#\3\2\2\2"+
		"\u00d6\u00d7\b\23\1\2\u00d7\u00d8\t\2\2\2\u00d8\u00f1\5$\23\16\u00d9\u00da"+
		"\7\5\2\2\u00da\u00db\5$\23\2\u00db\u00dc\7\6\2\2\u00dc\u00f1\3\2\2\2\u00dd"+
		"\u00de\7*\2\2\u00de\u00f1\t\3\2\2\u00df\u00e4\7+\2\2\u00e0\u00e1\7\16"+
		"\2\2\u00e1\u00e2\5&\24\2\u00e2\u00e3\7\17\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e0\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00f1\3\2\2\2\u00e6\u00eb\7,"+
		"\2\2\u00e7\u00e8\7\16\2\2\u00e8\u00e9\5&\24\2\u00e9\u00ea\7\17\2\2\u00ea"+
		"\u00ec\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f1\3\2"+
		"\2\2\u00ed\u00f1\7)\2\2\u00ee\u00f1\7*\2\2\u00ef\u00f1\5\20\t\2\u00f0"+
		"\u00d6\3\2\2\2\u00f0\u00d9\3\2\2\2\u00f0\u00dd\3\2\2\2\u00f0\u00df\3\2"+
		"\2\2\u00f0\u00e6\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f1\u0100\3\2\2\2\u00f2\u00f3\f\r\2\2\u00f3\u00f4\7\34"+
		"\2\2\u00f4\u00ff\5$\23\r\u00f5\u00f6\f\f\2\2\u00f6\u00f7\t\4\2\2\u00f7"+
		"\u00ff\5$\23\r\u00f8\u00f9\f\13\2\2\u00f9\u00fa\t\2\2\2\u00fa\u00ff\5"+
		"$\23\f\u00fb\u00fc\f\n\2\2\u00fc\u00fd\t\5\2\2\u00fd\u00ff\5$\23\13\u00fe"+
		"\u00f2\3\2\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe\u00fb\3\2"+
		"\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"%\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0105\b\24\1\2\u0104\u0106\t\2\2\2"+
		"\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108"+
		"\7\5\2\2\u0108\u0109\5&\24\2\u0109\u010a\7\6\2\2\u010a\u0110\3\2\2\2\u010b"+
		"\u010d\t\2\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u0110\7*\2\2\u010f\u0103\3\2\2\2\u010f\u010c\3\2\2\2\u0110"+
		"\u0126\3\2\2\2\u0111\u0112\f\6\2\2\u0112\u0113\t\6\2\2\u0113\u0125\5&"+
		"\24\7\u0114\u0115\f\5\2\2\u0115\u0116\t\2\2\2\u0116\u0125\5&\24\6\u0117"+
		"\u0118\f\7\2\2\u0118\u0122\7\34\2\2\u0119\u0123\5&\24\2\u011a\u011c\t"+
		"\2\2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u0123\7,\2\2\u011e\u0120\t\2\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0123\7+\2\2\u0122\u0119\3\2\2\2\u0122"+
		"\u011b\3\2\2\2\u0122\u011f\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0111\3\2"+
		"\2\2\u0124\u0114\3\2\2\2\u0124\u0117\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\'\3\2\2\2\u0128\u0126\3\2\2\2"+
		"\",\61?ELS`cly|\u0085\u008b\u0092\u0098\u009a\u00a8\u00af\u00d4\u00e4"+
		"\u00eb\u00f0\u00fe\u0100\u0105\u010c\u010f\u011b\u011f\u0122\u0124\u0126";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}