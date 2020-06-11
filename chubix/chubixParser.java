// Generated from chubix.g4 by ANTLR 4.8

  import java.util.HashMap;

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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, BOOLEAN=37, ID=38, DOUBLE=39, 
		INTEGER=40, STRING=41, WS=42, LINE_COMMENT=43, COMMENT=44, ERROR=45;
	public static final int
		RULE_main = 0, RULE_instList = 1, RULE_instruction = 2, RULE_print = 3, 
		RULE_returnFunc = 4, RULE_function = 5, RULE_callFunction = 6, RULE_assignment = 7, 
		RULE_declAssig = 8, RULE_declare = 9, RULE_conditional = 10, RULE_elseCond = 11, 
		RULE_forLoop = 12, RULE_whileLoop = 13, RULE_breakLoop = 14, RULE_continueLoop = 15, 
		RULE_type = 16, RULE_expr = 17, RULE_unitdim = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "instList", "instruction", "print", "returnFunc", "function", 
			"callFunction", "assignment", "declAssig", "declare", "conditional", 
			"elseCond", "forLoop", "whileLoop", "breakLoop", "continueLoop", "type", 
			"expr", "unitdim"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'print'", "'('", "')'", "'return'", "'function'", "','", 
			"'{'", "'}'", "'='", "'if'", "'else'", "'for'", "'while'", "'break'", 
			"'continue'", "'Integer'", "'Double'", "'Boolean'", "'String'", "'+'", 
			"'-'", "'^'", "'*'", "'/'", "'=='", "'!='", "'<'", "'>'", "'>='", "'<='", 
			"'++'", "'--'", "'input'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "BOOLEAN", "ID", "DOUBLE", "INTEGER", "STRING", "WS", "LINE_COMMENT", 
			"COMMENT", "ERROR"
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
	  public static final HashMap<String, Symbol> symbolTable = new HashMap<String, Symbol>();

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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitInstList(this);
			else return visitor.visitChildren(this);
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
		public DeclAssigContext declAssig() {
			return getRuleContext(DeclAssigContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
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
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(61);
				declAssig();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__1);
			setState(65);
			match(T__2);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__20) | (1L << T__21) | (1L << T__33) | (1L << BOOLEAN) | (1L << ID) | (1L << DOUBLE) | (1L << INTEGER) | (1L << STRING))) != 0)) {
				{
				setState(66);
				expr(0);
				}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitReturnFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnFuncContext returnFunc() throws RecognitionException {
		ReturnFuncContext _localctx = new ReturnFuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			if (!(insideFunc > 0)) throw new FailedPredicateException(this, "insideFunc > 0");
			setState(72);
			match(T__4);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__20) | (1L << T__21) | (1L << T__33) | (1L << BOOLEAN) | (1L << ID) | (1L << DOUBLE) | (1L << INTEGER) | (1L << STRING))) != 0)) {
				{
				setState(73);
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
		public InstListContext instList() {
			return getRuleContext(InstListContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			if (!(insideFunc==0)) throw new FailedPredicateException(this, "insideFunc==0");
			insideFunc++;
			setState(78);
			match(T__5);
			setState(79);
			((FunctionContext)_localctx).ret_type = type();
			setState(80);
			((FunctionContext)_localctx).func_name = match(ID);
			setState(81);
			match(T__2);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				setState(82);
				declare();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(83);
					match(T__6);
					setState(84);
					declare();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(92);
			match(T__3);
			setState(93);
			match(T__7);
			setState(94);
			instList();
			setState(95);
			match(T__8);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			((CallFunctionContext)_localctx).func_name = match(ID);
			setState(99);
			match(T__2);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__20) | (1L << T__21) | (1L << T__33) | (1L << BOOLEAN) | (1L << ID) | (1L << DOUBLE) | (1L << INTEGER) | (1L << STRING))) != 0)) {
				{
				setState(100);
				expr(0);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(101);
					match(T__6);
					setState(102);
					expr(0);
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
		public TerminalNode ID() { return getToken(chubixParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ID);
			setState(113);
			match(T__9);
			setState(114);
			expr(0);
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

	public static class DeclAssigContext extends ParserRuleContext {
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclAssigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declAssig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterDeclAssig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitDeclAssig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitDeclAssig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclAssigContext declAssig() throws RecognitionException {
		DeclAssigContext _localctx = new DeclAssigContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declAssig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			declare();
			setState(117);
			match(T__9);
			setState(118);
			expr(0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			type();
			setState(121);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__10);
			setState(124);
			match(T__2);
			setState(125);
			expr(0);
			setState(126);
			match(T__3);
			setState(127);
			match(T__7);
			setState(128);
			((ConditionalContext)_localctx).trueSL = instList();
			setState(129);
			match(T__8);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(130);
				match(T__11);
				setState(131);
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
		public ElseCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseCond; }
	 
		public ElseCondContext() { }
		public void copyFrom(ElseCondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InstElseContext extends ElseCondContext {
		public InstListContext instList() {
			return getRuleContext(InstListContext.class,0);
		}
		public InstElseContext(ElseCondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterInstElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitInstElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitInstElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalElseContext extends ElseCondContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ConditionalElseContext(ElseCondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterConditionalElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitConditionalElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitConditionalElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseCondContext elseCond() throws RecognitionException {
		ElseCondContext _localctx = new ElseCondContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseCond);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				_localctx = new ConditionalElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				conditional();
				}
				break;
			case T__7:
				_localctx = new InstElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(T__7);
				setState(136);
				instList();
				setState(137);
				match(T__8);
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
		public AssignmentContext varInc;
		public InstListContext instList() {
			return getRuleContext(InstListContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public DeclAssigContext declAssig() {
			return getRuleContext(DeclAssigContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			insideLoop++;
			setState(142);
			match(T__12);
			setState(143);
			match(T__2);
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(144);
				declAssig();
				}
				break;
			case 2:
				{
				setState(145);
				((ForLoopContext)_localctx).var = assignment();
				}
				break;
			}
			setState(148);
			match(T__0);
			setState(149);
			((ForLoopContext)_localctx).varBreak = expr(0);
			setState(150);
			match(T__0);
			setState(151);
			((ForLoopContext)_localctx).varInc = assignment();
			setState(152);
			match(T__3);
			setState(153);
			match(T__7);
			setState(154);
			instList();
			setState(155);
			match(T__8);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			insideLoop++;
			setState(159);
			match(T__13);
			setState(160);
			match(T__2);
			setState(161);
			expr(0);
			setState(162);
			match(T__3);
			setState(163);
			match(T__7);
			setState(164);
			((WhileLoopContext)_localctx).condSL = instList();
			setState(165);
			match(T__8);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitBreakLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakLoopContext breakLoop() throws RecognitionException {
		BreakLoopContext _localctx = new BreakLoopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_breakLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			if (!(insideLoop > 0)) throw new FailedPredicateException(this, "insideLoop > 0");
			setState(169);
			match(T__14);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitContinueLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueLoopContext continueLoop() throws RecognitionException {
		ContinueLoopContext _localctx = new ContinueLoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_continueLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			if (!(insideLoop > 0)) throw new FailedPredicateException(this, "insideLoop > 0");
			setState(172);
			match(T__15);
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
		public Type res;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
			this.res = ctx.res;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitDoubleType(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitDimensionType(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitStrType(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(T__16);
				}
				break;
			case T__17:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new StrTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(T__19);
				}
				break;
			case ID:
				_localctx = new DimensionTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(178);
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
		public Type exprType;
		public String varName;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.exprType = ctx.exprType;
			this.varName = ctx.varName;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitDoubleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubExprContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitIntegerExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitBooleanExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputExprContext extends ExprContext {
		public TerminalNode STRING() { return getToken(chubixParser.STRING, 0); }
		public UnitdimContext unitdim() {
			return getRuleContext(UnitdimContext.class,0);
		}
		public InputExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterInputExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitInputExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitInputExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExprContext extends ExprContext {
		public TerminalNode STRING() { return getToken(chubixParser.STRING, 0); }
		public StringExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitDoubleSumMin(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitSignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultDivRestExprContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitMultDivRestExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExprContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExprContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitConditionalExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
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
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new SignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(182);
				((SignExprContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
					((SignExprContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(183);
				expr(14);
				}
				break;
			case 2:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(T__2);
				setState(185);
				expr(0);
				setState(186);
				match(T__3);
				}
				break;
			case 3:
				{
				_localctx = new DoubleSumMinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(ID);
				setState(189);
				((DoubleSumMinContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__32) ) {
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
				_localctx = new InputExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(T__33);
				setState(191);
				match(T__2);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(192);
					match(STRING);
					}
				}

				setState(195);
				match(T__3);
				setState(200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(196);
					match(T__34);
					setState(197);
					unitdim(0);
					setState(198);
					match(T__35);
					}
					break;
				}
				}
				break;
			case 5:
				{
				_localctx = new DoubleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				match(DOUBLE);
				setState(207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(203);
					match(T__34);
					setState(204);
					unitdim(0);
					setState(205);
					match(T__35);
					}
					break;
				}
				}
				break;
			case 6:
				{
				_localctx = new IntegerExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(INTEGER);
				setState(214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(210);
					match(T__34);
					setState(211);
					unitdim(0);
					setState(212);
					match(T__35);
					}
					break;
				}
				}
				break;
			case 7:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				match(BOOLEAN);
				}
				break;
			case 8:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218);
				match(STRING);
				}
				break;
			case 10:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				callFunction();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(234);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						((PowExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(223);
						match(T__22);
						setState(224);
						((PowExprContext)_localctx).e2 = expr(13);
						}
						break;
					case 2:
						{
						_localctx = new MultDivRestExprContext(new ExprContext(_parentctx, _parentState));
						((MultDivRestExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(226);
						((MultDivRestExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((MultDivRestExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(227);
						((MultDivRestExprContext)_localctx).e2 = expr(13);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						((AddSubExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(229);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(230);
						((AddSubExprContext)_localctx).e2 = expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ConditionalExprContext(new ExprContext(_parentctx, _parentState));
						((ConditionalExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(232);
						((ConditionalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
							((ConditionalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(233);
						((ConditionalExprContext)_localctx).e2 = expr(11);
						}
						break;
					}
					} 
				}
				setState(238);
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

	public static class UnitdimContext extends ParserRuleContext {
		public DimensionsType unitdimType;
		public UnitdimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitdim; }
	 
		public UnitdimContext() { }
		public void copyFrom(UnitdimContext ctx) {
			super.copyFrom(ctx);
			this.unitdimType = ctx.unitdimType;
		}
	}
	public static class DimPowerContext extends UnitdimContext {
		public Token op;
		public UnitdimContext unitdim() {
			return getRuleContext(UnitdimContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(chubixParser.INTEGER, 0); }
		public DimPowerContext(UnitdimContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).enterDimPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chubixListener ) ((chubixListener)listener).exitDimPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitDimPower(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitDimUnn(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitDimMultDiv(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chubixVisitor ) return ((chubixVisitor<? extends T>)visitor).visitDimID(this);
			else return visitor.visitChildren(this);
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
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new DimUnnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20 || _la==T__21) {
					{
					setState(240);
					((DimUnnContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__20 || _la==T__21) ) {
						((DimUnnContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(243);
				match(T__2);
				setState(244);
				unitdim(0);
				setState(245);
				match(T__3);
				}
				break;
			case 2:
				{
				_localctx = new DimIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20 || _la==T__21) {
					{
					setState(247);
					((DimIDContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__20 || _la==T__21) ) {
						((DimIDContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(250);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(262);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new DimMultDivContext(new UnitdimContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_unitdim);
						setState(253);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(254);
						((DimMultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((DimMultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(255);
						unitdim(4);
						}
						break;
					case 2:
						{
						_localctx = new DimPowerContext(new UnitdimContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_unitdim);
						setState(256);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(257);
						match(T__22);
						{
						setState(259);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__20 || _la==T__21) {
							{
							setState(258);
							((DimPowerContext)_localctx).op = _input.LT(1);
							_la = _input.LA(1);
							if ( !(_la==T__20 || _la==T__21) ) {
								((DimPowerContext)_localctx).op = (Token)_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
						}

						setState(261);
						match(INTEGER);
						}
						}
						break;
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		case 4:
			return returnFunc_sempred((ReturnFuncContext)_localctx, predIndex);
		case 5:
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
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean unitdim_sempred(UnitdimContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u010e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\5\3-\n\3\3\3\7\3\60\n\3\f\3\16\3"+
		"\63\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\5"+
		"\3\5\3\5\5\5F\n\5\3\5\3\5\3\6\3\6\3\6\5\6M\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\5\7]\n\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\7\bj\n\b\f\b\16\bm\13\b\5\bo\n\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u0087\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u008e\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0095\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00b6\n\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c4\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00cb\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d2\n"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d9\n\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00df\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u00ed\n\23\f\23\16\23\u00f0\13\23\3\24\3\24\5\24\u00f4\n\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00fb\n\24\3\24\5\24\u00fe\n\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u0106\n\24\3\24\7\24\u0109\n\24\f\24\16\24\u010c"+
		"\13\24\3\24\2\4$&\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\6\3"+
		"\2\27\30\3\2\"#\3\2\32\33\3\2\34!\2\u012b\2(\3\2\2\2\4\61\3\2\2\2\6@\3"+
		"\2\2\2\bB\3\2\2\2\nI\3\2\2\2\fN\3\2\2\2\16d\3\2\2\2\20r\3\2\2\2\22v\3"+
		"\2\2\2\24z\3\2\2\2\26}\3\2\2\2\30\u008d\3\2\2\2\32\u008f\3\2\2\2\34\u00a0"+
		"\3\2\2\2\36\u00aa\3\2\2\2 \u00ad\3\2\2\2\"\u00b5\3\2\2\2$\u00de\3\2\2"+
		"\2&\u00fd\3\2\2\2()\5\4\3\2)*\7\2\2\3*\3\3\2\2\2+-\5\6\4\2,+\3\2\2\2,"+
		"-\3\2\2\2-.\3\2\2\2.\60\7\3\2\2/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61"+
		"\62\3\2\2\2\62\5\3\2\2\2\63\61\3\2\2\2\64A\5\b\5\2\65A\5\20\t\2\66A\5"+
		"\26\f\2\67A\5\32\16\28A\5\36\20\29A\5 \21\2:A\5\34\17\2;A\5\24\13\2<A"+
		"\5\16\b\2=A\5\f\7\2>A\5\n\6\2?A\5\22\n\2@\64\3\2\2\2@\65\3\2\2\2@\66\3"+
		"\2\2\2@\67\3\2\2\2@8\3\2\2\2@9\3\2\2\2@:\3\2\2\2@;\3\2\2\2@<\3\2\2\2@"+
		"=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\7\3\2\2\2BC\7\4\2\2CE\7\5\2\2DF\5$\23\2"+
		"ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7\6\2\2H\t\3\2\2\2IJ\6\6\2\2JL\7\7\2"+
		"\2KM\5$\23\2LK\3\2\2\2LM\3\2\2\2M\13\3\2\2\2NO\6\7\3\2OP\b\7\1\2PQ\7\b"+
		"\2\2QR\5\"\22\2RS\7(\2\2S\\\7\5\2\2TY\5\24\13\2UV\7\t\2\2VX\5\24\13\2"+
		"WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2\\T\3\2\2"+
		"\2\\]\3\2\2\2]^\3\2\2\2^_\7\6\2\2_`\7\n\2\2`a\5\4\3\2ab\7\13\2\2bc\b\7"+
		"\1\2c\r\3\2\2\2de\7(\2\2en\7\5\2\2fk\5$\23\2gh\7\t\2\2hj\5$\23\2ig\3\2"+
		"\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2nf\3\2\2\2no\3\2"+
		"\2\2op\3\2\2\2pq\7\6\2\2q\17\3\2\2\2rs\7(\2\2st\7\f\2\2tu\5$\23\2u\21"+
		"\3\2\2\2vw\5\24\13\2wx\7\f\2\2xy\5$\23\2y\23\3\2\2\2z{\5\"\22\2{|\7(\2"+
		"\2|\25\3\2\2\2}~\7\r\2\2~\177\7\5\2\2\177\u0080\5$\23\2\u0080\u0081\7"+
		"\6\2\2\u0081\u0082\7\n\2\2\u0082\u0083\5\4\3\2\u0083\u0086\7\13\2\2\u0084"+
		"\u0085\7\16\2\2\u0085\u0087\5\30\r\2\u0086\u0084\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\27\3\2\2\2\u0088\u008e\5\26\f\2\u0089\u008a\7\n\2\2\u008a"+
		"\u008b\5\4\3\2\u008b\u008c\7\13\2\2\u008c\u008e\3\2\2\2\u008d\u0088\3"+
		"\2\2\2\u008d\u0089\3\2\2\2\u008e\31\3\2\2\2\u008f\u0090\b\16\1\2\u0090"+
		"\u0091\7\17\2\2\u0091\u0094\7\5\2\2\u0092\u0095\5\22\n\2\u0093\u0095\5"+
		"\20\t\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\7\3\2\2\u0097\u0098\5$\23\2\u0098\u0099\7\3\2\2\u0099\u009a\5\20"+
		"\t\2\u009a\u009b\7\6\2\2\u009b\u009c\7\n\2\2\u009c\u009d\5\4\3\2\u009d"+
		"\u009e\7\13\2\2\u009e\u009f\b\16\1\2\u009f\33\3\2\2\2\u00a0\u00a1\b\17"+
		"\1\2\u00a1\u00a2\7\20\2\2\u00a2\u00a3\7\5\2\2\u00a3\u00a4\5$\23\2\u00a4"+
		"\u00a5\7\6\2\2\u00a5\u00a6\7\n\2\2\u00a6\u00a7\5\4\3\2\u00a7\u00a8\7\13"+
		"\2\2\u00a8\u00a9\b\17\1\2\u00a9\35\3\2\2\2\u00aa\u00ab\6\20\4\2\u00ab"+
		"\u00ac\7\21\2\2\u00ac\37\3\2\2\2\u00ad\u00ae\6\21\5\2\u00ae\u00af\7\22"+
		"\2\2\u00af!\3\2\2\2\u00b0\u00b6\7\23\2\2\u00b1\u00b6\7\24\2\2\u00b2\u00b6"+
		"\7\25\2\2\u00b3\u00b6\7\26\2\2\u00b4\u00b6\7(\2\2\u00b5\u00b0\3\2\2\2"+
		"\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4"+
		"\3\2\2\2\u00b6#\3\2\2\2\u00b7\u00b8\b\23\1\2\u00b8\u00b9\t\2\2\2\u00b9"+
		"\u00df\5$\23\20\u00ba\u00bb\7\5\2\2\u00bb\u00bc\5$\23\2\u00bc\u00bd\7"+
		"\6\2\2\u00bd\u00df\3\2\2\2\u00be\u00bf\7(\2\2\u00bf\u00df\t\3\2\2\u00c0"+
		"\u00c1\7$\2\2\u00c1\u00c3\7\5\2\2\u00c2\u00c4\7+\2\2\u00c3\u00c2\3\2\2"+
		"\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00ca\7\6\2\2\u00c6\u00c7"+
		"\7%\2\2\u00c7\u00c8\5&\24\2\u00c8\u00c9\7&\2\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00c6\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00df\3\2\2\2\u00cc\u00d1\7)"+
		"\2\2\u00cd\u00ce\7%\2\2\u00ce\u00cf\5&\24\2\u00cf\u00d0\7&\2\2\u00d0\u00d2"+
		"\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00df\3\2\2\2\u00d3"+
		"\u00d8\7*\2\2\u00d4\u00d5\7%\2\2\u00d5\u00d6\5&\24\2\u00d6\u00d7\7&\2"+
		"\2\u00d7\u00d9\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00df"+
		"\3\2\2\2\u00da\u00df\7\'\2\2\u00db\u00df\7(\2\2\u00dc\u00df\7+\2\2\u00dd"+
		"\u00df\5\16\b\2\u00de\u00b7\3\2\2\2\u00de\u00ba\3\2\2\2\u00de\u00be\3"+
		"\2\2\2\u00de\u00c0\3\2\2\2\u00de\u00cc\3\2\2\2\u00de\u00d3\3\2\2\2\u00de"+
		"\u00da\3\2\2\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2"+
		"\2\2\u00df\u00ee\3\2\2\2\u00e0\u00e1\f\17\2\2\u00e1\u00e2\7\31\2\2\u00e2"+
		"\u00ed\5$\23\17\u00e3\u00e4\f\16\2\2\u00e4\u00e5\t\4\2\2\u00e5\u00ed\5"+
		"$\23\17\u00e6\u00e7\f\r\2\2\u00e7\u00e8\t\2\2\2\u00e8\u00ed\5$\23\16\u00e9"+
		"\u00ea\f\f\2\2\u00ea\u00eb\t\5\2\2\u00eb\u00ed\5$\23\r\u00ec\u00e0\3\2"+
		"\2\2\u00ec\u00e3\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ed"+
		"\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef%\3\2\2\2"+
		"\u00f0\u00ee\3\2\2\2\u00f1\u00f3\b\24\1\2\u00f2\u00f4\t\2\2\2\u00f3\u00f2"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\7\5\2\2\u00f6"+
		"\u00f7\5&\24\2\u00f7\u00f8\7\6\2\2\u00f8\u00fe\3\2\2\2\u00f9\u00fb\t\2"+
		"\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fe\7(\2\2\u00fd\u00f1\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fe\u010a\3\2"+
		"\2\2\u00ff\u0100\f\5\2\2\u0100\u0101\t\4\2\2\u0101\u0109\5&\24\6\u0102"+
		"\u0103\f\6\2\2\u0103\u0105\7\31\2\2\u0104\u0106\t\2\2\2\u0105\u0104\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\7*\2\2\u0108"+
		"\u00ff\3\2\2\2\u0108\u0102\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\'\3\2\2\2\u010c\u010a\3\2\2\2\34,\61@E"+
		"LY\\kn\u0086\u008d\u0094\u00b5\u00c3\u00ca\u00d1\u00d8\u00de\u00ec\u00ee"+
		"\u00f3\u00fa\u00fd\u0105\u0108\u010a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}