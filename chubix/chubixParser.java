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
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(39);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(38);
						function();
						}
						break;
					}
					setState(41);
					match(T__0);
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(47);
			instList();
			setState(48);
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
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(50);
						instruction();
						}
						break;
					}
					setState(53);
					match(T__0);
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				forLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				breakLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				continueLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				whileLoop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(66);
				declare();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(67);
				callFunction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(68);
				returnFunc();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(69);
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
			setState(72);
			match(T__1);
			setState(73);
			match(T__2);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__20) | (1L << T__21) | (1L << T__33) | (1L << BOOLEAN) | (1L << ID) | (1L << DOUBLE) | (1L << INTEGER) | (1L << STRING))) != 0)) {
				{
				setState(74);
				expr(0);
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
			setState(79);
			if (!(insideFunc > 0)) throw new FailedPredicateException(this, "insideFunc > 0");
			setState(80);
			match(T__4);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__20) | (1L << T__21) | (1L << T__33) | (1L << BOOLEAN) | (1L << ID) | (1L << DOUBLE) | (1L << INTEGER) | (1L << STRING))) != 0)) {
				{
				setState(81);
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
			setState(84);
			if (!(insideFunc==0)) throw new FailedPredicateException(this, "insideFunc==0");
			insideFunc++;
			setState(86);
			match(T__5);
			setState(87);
			((FunctionContext)_localctx).ret_type = type();
			setState(88);
			((FunctionContext)_localctx).func_name = match(ID);
			setState(89);
			match(T__2);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << ID))) != 0)) {
				{
				setState(90);
				declare();
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(91);
					match(T__6);
					setState(92);
					declare();
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(100);
			match(T__3);
			setState(101);
			match(T__7);
			setState(102);
			instList();
			setState(103);
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
			setState(106);
			((CallFunctionContext)_localctx).func_name = match(ID);
			setState(107);
			match(T__2);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__20) | (1L << T__21) | (1L << T__33) | (1L << BOOLEAN) | (1L << ID) | (1L << DOUBLE) | (1L << INTEGER) | (1L << STRING))) != 0)) {
				{
				setState(108);
				expr(0);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(109);
					match(T__6);
					setState(110);
					expr(0);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(118);
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
			setState(120);
			match(ID);
			setState(121);
			match(T__9);
			setState(122);
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
			setState(124);
			declare();
			setState(125);
			match(T__9);
			setState(126);
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
			setState(128);
			type();
			setState(129);
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
			setState(131);
			match(T__10);
			setState(132);
			match(T__2);
			setState(133);
			expr(0);
			setState(134);
			match(T__3);
			setState(135);
			match(T__7);
			setState(136);
			((ConditionalContext)_localctx).trueSL = instList();
			setState(137);
			match(T__8);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(138);
				match(T__11);
				setState(139);
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
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				_localctx = new ConditionalElseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				conditional();
				}
				break;
			case T__7:
				_localctx = new InstElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(T__7);
				setState(144);
				instList();
				setState(145);
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
			setState(150);
			match(T__12);
			setState(151);
			match(T__2);
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(152);
				declAssig();
				}
				break;
			case 2:
				{
				setState(153);
				((ForLoopContext)_localctx).var = assignment();
				}
				break;
			}
			setState(156);
			match(T__0);
			setState(157);
			((ForLoopContext)_localctx).varBreak = expr(0);
			setState(158);
			match(T__0);
			setState(159);
			((ForLoopContext)_localctx).varInc = assignment();
			setState(160);
			match(T__3);
			setState(161);
			match(T__7);
			setState(162);
			instList();
			setState(163);
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
			setState(167);
			match(T__13);
			setState(168);
			match(T__2);
			setState(169);
			expr(0);
			setState(170);
			match(T__3);
			setState(171);
			match(T__7);
			setState(172);
			((WhileLoopContext)_localctx).condSL = instList();
			setState(173);
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
			setState(176);
			if (!(insideLoop > 0)) throw new FailedPredicateException(this, "insideLoop > 0");
			setState(177);
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
			setState(179);
			if (!(insideLoop > 0)) throw new FailedPredicateException(this, "insideLoop > 0");
			setState(180);
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
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(T__16);
				}
				break;
			case T__17:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(T__17);
				}
				break;
			case T__18:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(T__18);
				}
				break;
			case T__19:
				_localctx = new StrTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				match(T__19);
				}
				break;
			case ID:
				_localctx = new DimensionTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
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
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new SignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(190);
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
				setState(191);
				expr(14);
				}
				break;
			case 2:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(T__2);
				setState(193);
				expr(0);
				setState(194);
				match(T__3);
				}
				break;
			case 3:
				{
				_localctx = new DoubleSumMinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(ID);
				setState(197);
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
				setState(198);
				match(T__33);
				setState(199);
				match(T__2);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(200);
					match(STRING);
					}
				}

				setState(203);
				match(T__3);
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(204);
					match(T__34);
					setState(205);
					unitdim(0);
					setState(206);
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
				setState(210);
				match(DOUBLE);
				setState(215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(211);
					match(T__34);
					setState(212);
					unitdim(0);
					setState(213);
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
				setState(217);
				match(INTEGER);
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(218);
					match(T__34);
					setState(219);
					unitdim(0);
					setState(220);
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
				setState(224);
				match(BOOLEAN);
				}
				break;
			case 8:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				match(STRING);
				}
				break;
			case 10:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				callFunction();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(242);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						((PowExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(231);
						match(T__22);
						setState(232);
						((PowExprContext)_localctx).e2 = expr(13);
						}
						break;
					case 2:
						{
						_localctx = new MultDivRestExprContext(new ExprContext(_parentctx, _parentState));
						((MultDivRestExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(234);
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
						setState(235);
						((MultDivRestExprContext)_localctx).e2 = expr(13);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						((AddSubExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(237);
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
						setState(238);
						((AddSubExprContext)_localctx).e2 = expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ConditionalExprContext(new ExprContext(_parentctx, _parentState));
						((ConditionalExprContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(240);
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
						setState(241);
						((ConditionalExprContext)_localctx).e2 = expr(11);
						}
						break;
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new DimUnnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20 || _la==T__21) {
					{
					setState(248);
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

				setState(251);
				match(T__2);
				setState(252);
				unitdim(0);
				setState(253);
				match(T__3);
				}
				break;
			case 2:
				{
				_localctx = new DimIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20 || _la==T__21) {
					{
					setState(255);
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

				setState(258);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(270);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new DimMultDivContext(new UnitdimContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_unitdim);
						setState(261);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(262);
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
						setState(263);
						unitdim(4);
						}
						break;
					case 2:
						{
						_localctx = new DimPowerContext(new UnitdimContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_unitdim);
						setState(264);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(265);
						match(T__22);
						{
						setState(267);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__20 || _la==T__21) {
							{
							setState(266);
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

						setState(269);
						match(INTEGER);
						}
						}
						break;
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0116\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\5\2*\n\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3"+
		"\2\3\2\3\3\5\3\66\n\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4I\n\4\3\5\3\5\3\5\5\5N\n\5\3\5\3\5\3\6\3\6"+
		"\3\6\5\6U\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7`\n\7\f\7\16\7c\13"+
		"\7\5\7e\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\br\n\b\f\b\16"+
		"\bu\13\b\5\bw\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008f\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u0096\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u009d\n\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00be\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00cc\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d3\n\23\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u00da\n\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00e1\n\23\3\23\3\23\3\23\3\23\5\23\u00e7\n\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00f5\n\23\f\23\16\23\u00f8"+
		"\13\23\3\24\3\24\5\24\u00fc\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u0103\n"+
		"\24\3\24\5\24\u0106\n\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u010e\n\24"+
		"\3\24\7\24\u0111\n\24\f\24\16\24\u0114\13\24\3\24\2\4$&\25\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&\2\6\3\2\27\30\3\2\"#\3\2\32\33\3\2\34"+
		"!\2\u0134\2.\3\2\2\2\4:\3\2\2\2\6H\3\2\2\2\bJ\3\2\2\2\nQ\3\2\2\2\fV\3"+
		"\2\2\2\16l\3\2\2\2\20z\3\2\2\2\22~\3\2\2\2\24\u0082\3\2\2\2\26\u0085\3"+
		"\2\2\2\30\u0095\3\2\2\2\32\u0097\3\2\2\2\34\u00a8\3\2\2\2\36\u00b2\3\2"+
		"\2\2 \u00b5\3\2\2\2\"\u00bd\3\2\2\2$\u00e6\3\2\2\2&\u0105\3\2\2\2(*\5"+
		"\f\7\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2\2+-\7\3\2\2,)\3\2\2\2-\60\3\2\2\2."+
		",\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\5\4\3\2\62\63\7\2\2"+
		"\3\63\3\3\2\2\2\64\66\5\6\4\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2"+
		"\2\679\7\3\2\28\65\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\5\3\2\2\2<:"+
		"\3\2\2\2=I\5\b\5\2>I\5\20\t\2?I\5\26\f\2@I\5\32\16\2AI\5\36\20\2BI\5 "+
		"\21\2CI\5\34\17\2DI\5\24\13\2EI\5\16\b\2FI\5\n\6\2GI\5\22\n\2H=\3\2\2"+
		"\2H>\3\2\2\2H?\3\2\2\2H@\3\2\2\2HA\3\2\2\2HB\3\2\2\2HC\3\2\2\2HD\3\2\2"+
		"\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\7\3\2\2\2JK\7\4\2\2KM\7\5\2\2LN\5$\23"+
		"\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\6\2\2P\t\3\2\2\2QR\6\6\2\2RT\7\7"+
		"\2\2SU\5$\23\2TS\3\2\2\2TU\3\2\2\2U\13\3\2\2\2VW\6\7\3\2WX\b\7\1\2XY\7"+
		"\b\2\2YZ\5\"\22\2Z[\7(\2\2[d\7\5\2\2\\a\5\24\13\2]^\7\t\2\2^`\5\24\13"+
		"\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2ca\3\2\2\2d\\\3\2"+
		"\2\2de\3\2\2\2ef\3\2\2\2fg\7\6\2\2gh\7\n\2\2hi\5\4\3\2ij\7\13\2\2jk\b"+
		"\7\1\2k\r\3\2\2\2lm\7(\2\2mv\7\5\2\2ns\5$\23\2op\7\t\2\2pr\5$\23\2qo\3"+
		"\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3\2\2\2vn\3\2\2\2vw\3"+
		"\2\2\2wx\3\2\2\2xy\7\6\2\2y\17\3\2\2\2z{\7(\2\2{|\7\f\2\2|}\5$\23\2}\21"+
		"\3\2\2\2~\177\5\24\13\2\177\u0080\7\f\2\2\u0080\u0081\5$\23\2\u0081\23"+
		"\3\2\2\2\u0082\u0083\5\"\22\2\u0083\u0084\7(\2\2\u0084\25\3\2\2\2\u0085"+
		"\u0086\7\r\2\2\u0086\u0087\7\5\2\2\u0087\u0088\5$\23\2\u0088\u0089\7\6"+
		"\2\2\u0089\u008a\7\n\2\2\u008a\u008b\5\4\3\2\u008b\u008e\7\13\2\2\u008c"+
		"\u008d\7\16\2\2\u008d\u008f\5\30\r\2\u008e\u008c\3\2\2\2\u008e\u008f\3"+
		"\2\2\2\u008f\27\3\2\2\2\u0090\u0096\5\26\f\2\u0091\u0092\7\n\2\2\u0092"+
		"\u0093\5\4\3\2\u0093\u0094\7\13\2\2\u0094\u0096\3\2\2\2\u0095\u0090\3"+
		"\2\2\2\u0095\u0091\3\2\2\2\u0096\31\3\2\2\2\u0097\u0098\b\16\1\2\u0098"+
		"\u0099\7\17\2\2\u0099\u009c\7\5\2\2\u009a\u009d\5\22\n\2\u009b\u009d\5"+
		"\20\t\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\7\3\2\2\u009f\u00a0\5$\23\2\u00a0\u00a1\7\3\2\2\u00a1\u00a2\5\20"+
		"\t\2\u00a2\u00a3\7\6\2\2\u00a3\u00a4\7\n\2\2\u00a4\u00a5\5\4\3\2\u00a5"+
		"\u00a6\7\13\2\2\u00a6\u00a7\b\16\1\2\u00a7\33\3\2\2\2\u00a8\u00a9\b\17"+
		"\1\2\u00a9\u00aa\7\20\2\2\u00aa\u00ab\7\5\2\2\u00ab\u00ac\5$\23\2\u00ac"+
		"\u00ad\7\6\2\2\u00ad\u00ae\7\n\2\2\u00ae\u00af\5\4\3\2\u00af\u00b0\7\13"+
		"\2\2\u00b0\u00b1\b\17\1\2\u00b1\35\3\2\2\2\u00b2\u00b3\6\20\4\2\u00b3"+
		"\u00b4\7\21\2\2\u00b4\37\3\2\2\2\u00b5\u00b6\6\21\5\2\u00b6\u00b7\7\22"+
		"\2\2\u00b7!\3\2\2\2\u00b8\u00be\7\23\2\2\u00b9\u00be\7\24\2\2\u00ba\u00be"+
		"\7\25\2\2\u00bb\u00be\7\26\2\2\u00bc\u00be\7(\2\2\u00bd\u00b8\3\2\2\2"+
		"\u00bd\u00b9\3\2\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc"+
		"\3\2\2\2\u00be#\3\2\2\2\u00bf\u00c0\b\23\1\2\u00c0\u00c1\t\2\2\2\u00c1"+
		"\u00e7\5$\23\20\u00c2\u00c3\7\5\2\2\u00c3\u00c4\5$\23\2\u00c4\u00c5\7"+
		"\6\2\2\u00c5\u00e7\3\2\2\2\u00c6\u00c7\7(\2\2\u00c7\u00e7\t\3\2\2\u00c8"+
		"\u00c9\7$\2\2\u00c9\u00cb\7\5\2\2\u00ca\u00cc\7+\2\2\u00cb\u00ca\3\2\2"+
		"\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d2\7\6\2\2\u00ce\u00cf"+
		"\7%\2\2\u00cf\u00d0\5&\24\2\u00d0\u00d1\7&\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00ce\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00e7\3\2\2\2\u00d4\u00d9\7)"+
		"\2\2\u00d5\u00d6\7%\2\2\u00d6\u00d7\5&\24\2\u00d7\u00d8\7&\2\2\u00d8\u00da"+
		"\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00e7\3\2\2\2\u00db"+
		"\u00e0\7*\2\2\u00dc\u00dd\7%\2\2\u00dd\u00de\5&\24\2\u00de\u00df\7&\2"+
		"\2\u00df\u00e1\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e7"+
		"\3\2\2\2\u00e2\u00e7\7\'\2\2\u00e3\u00e7\7(\2\2\u00e4\u00e7\7+\2\2\u00e5"+
		"\u00e7\5\16\b\2\u00e6\u00bf\3\2\2\2\u00e6\u00c2\3\2\2\2\u00e6\u00c6\3"+
		"\2\2\2\u00e6\u00c8\3\2\2\2\u00e6\u00d4\3\2\2\2\u00e6\u00db\3\2\2\2\u00e6"+
		"\u00e2\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2"+
		"\2\2\u00e7\u00f6\3\2\2\2\u00e8\u00e9\f\17\2\2\u00e9\u00ea\7\31\2\2\u00ea"+
		"\u00f5\5$\23\17\u00eb\u00ec\f\16\2\2\u00ec\u00ed\t\4\2\2\u00ed\u00f5\5"+
		"$\23\17\u00ee\u00ef\f\r\2\2\u00ef\u00f0\t\2\2\2\u00f0\u00f5\5$\23\16\u00f1"+
		"\u00f2\f\f\2\2\u00f2\u00f3\t\5\2\2\u00f3\u00f5\5$\23\r\u00f4\u00e8\3\2"+
		"\2\2\u00f4\u00eb\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7%\3\2\2\2"+
		"\u00f8\u00f6\3\2\2\2\u00f9\u00fb\b\24\1\2\u00fa\u00fc\t\2\2\2\u00fb\u00fa"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7\5\2\2\u00fe"+
		"\u00ff\5&\24\2\u00ff\u0100\7\6\2\2\u0100\u0106\3\2\2\2\u0101\u0103\t\2"+
		"\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\7(\2\2\u0105\u00f9\3\2\2\2\u0105\u0102\3\2\2\2\u0106\u0112\3\2"+
		"\2\2\u0107\u0108\f\5\2\2\u0108\u0109\t\4\2\2\u0109\u0111\5&\24\6\u010a"+
		"\u010b\f\6\2\2\u010b\u010d\7\31\2\2\u010c\u010e\t\2\2\2\u010d\u010c\3"+
		"\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\7*\2\2\u0110"+
		"\u0107\3\2\2\2\u0110\u010a\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\'\3\2\2\2\u0114\u0112\3\2\2\2\36).\65:"+
		"HMTadsv\u008e\u0095\u009c\u00bd\u00cb\u00d2\u00d9\u00e0\u00e6\u00f4\u00f6"+
		"\u00fb\u0102\u0105\u010d\u0110\u0112";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}