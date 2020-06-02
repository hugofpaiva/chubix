// Generated from dimensions.g4 by ANTLR 4.8

    import java.util.Map;
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
public class dimensionsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, INTEGER=15, DOUBLE=16, WS=17, 
		LINE_COMMENT=18, ERROR=19;
	public static final int
		RULE_main = 0, RULE_statList = 1, RULE_stat = 2, RULE_dim = 3, RULE_unit = 4, 
		RULE_expr = 5, RULE_unitdim = 6, RULE_type = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "statList", "stat", "dim", "unit", "expr", "unitdim", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'dim'", "'('", "':'", "')'", "'unit'", "'^'", "'*'", "'/'", 
			"'+'", "'-'", "'Integer'", "'Double'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "INTEGER", "DOUBLE", "WS", "LINE_COMMENT", "ERROR"
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
	public String getGrammarFileName() { return "dimensions.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    static protected Map<String,DimensionsType> dimTable = new HashMap<>();

	public dimensionsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public StatListContext statList() {
			return getRuleContext(StatListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(dimensionsParser.EOF, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimensionsVisitor ) return ((dimensionsVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			statList();
			setState(17);
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

	public static class StatListContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public StatListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).enterStatList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).exitStatList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimensionsVisitor ) return ((dimensionsVisitor<? extends T>)visitor).visitStatList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatListContext statList() throws RecognitionException {
		StatListContext _localctx = new StatListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5))) != 0)) {
				{
				{
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==T__5) {
					{
					setState(19);
					stat();
					}
				}

				setState(22);
				match(T__0);
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

	public static class StatContext extends ParserRuleContext {
		public DimContext dim() {
			return getRuleContext(DimContext.class,0);
		}
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimensionsVisitor ) return ((dimensionsVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				dim();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				unit();
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

	public static class DimContext extends ParserRuleContext {
		public DimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim; }
	 
		public DimContext() { }
		public void copyFrom(DimContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelativeDimContext extends DimContext {
		public List<TerminalNode> ID() { return getTokens(dimensionsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimensionsParser.ID, i);
		}
		public UnitdimContext unitdim() {
			return getRuleContext(UnitdimContext.class,0);
		}
		public RelativeDimContext(DimContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).enterRelativeDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).exitRelativeDim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimensionsVisitor ) return ((dimensionsVisitor<? extends T>)visitor).visitRelativeDim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDimContext extends DimContext {
		public List<TerminalNode> ID() { return getTokens(dimensionsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimensionsParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PrimitiveDimContext(DimContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).enterPrimitiveDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).exitPrimitiveDim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimensionsVisitor ) return ((dimensionsVisitor<? extends T>)visitor).visitPrimitiveDim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimContext dim() throws RecognitionException {
		DimContext _localctx = new DimContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dim);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new PrimitiveDimContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(T__1);
				setState(33);
				match(ID);
				setState(34);
				match(T__2);
				setState(35);
				match(ID);
				setState(36);
				match(T__3);
				{
				setState(37);
				type();
				}
				setState(38);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new RelativeDimContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(T__1);
				setState(41);
				match(ID);
				setState(42);
				match(T__2);
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(43);
					match(ID);
					setState(44);
					match(T__3);
					}
					break;
				}
				setState(47);
				unitdim(0);
				setState(48);
				match(T__4);
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

	public static class UnitContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(dimensionsParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(dimensionsParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).exitUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimensionsVisitor ) return ((dimensionsVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__5);
			setState(53);
			match(ID);
			setState(54);
			match(T__2);
			setState(55);
			match(ID);
			setState(56);
			match(T__3);
			setState(57);
			expr(0);
			setState(58);
			match(T__4);
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
	public static class ExprUnnContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprUnnContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).enterExprUnn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).exitExprUnn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimensionsVisitor ) return ((dimensionsVisitor<? extends T>)visitor).visitExprUnn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDoubleContext extends ExprContext {
		public Token op;
		public TerminalNode DOUBLE() { return getToken(dimensionsParser.DOUBLE, 0); }
		public ExprDoubleContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).enterExprDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).exitExprDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimensionsVisitor ) return ((dimensionsVisitor<? extends T>)visitor).visitExprDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprSumMinContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprSumMinContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).enterExprSumMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).exitExprSumMin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimensionsVisitor ) return ((dimensionsVisitor<? extends T>)visitor).visitExprSumMin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIntContext extends ExprContext {
		public Token op;
		public TerminalNode INTEGER() { return getToken(dimensionsParser.INTEGER, 0); }
		public ExprIntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).enterExprInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).exitExprInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimensionsVisitor ) return ((dimensionsVisitor<? extends T>)visitor).visitExprInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMultDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprMultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).enterExprMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).exitExprMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimensionsVisitor ) return ((dimensionsVisitor<? extends T>)visitor).visitExprMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprPowerContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprPowerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).enterExprPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).exitExprPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimensionsVisitor ) return ((dimensionsVisitor<? extends T>)visitor).visitExprPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIDContext extends ExprContext {
		public Token op;
		public TerminalNode ID() { return getToken(dimensionsParser.ID, 0); }
		public ExprIDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).enterExprID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).exitExprID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimensionsVisitor ) return ((dimensionsVisitor<? extends T>)visitor).visitExprID(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new ExprUnnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9 || _la==T__10) {
					{
					setState(61);
					((ExprUnnContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__9 || _la==T__10) ) {
						((ExprUnnContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(64);
				match(T__2);
				setState(65);
				expr(0);
				setState(66);
				match(T__4);
				}
				break;
			case 2:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9 || _la==T__10) {
					{
					setState(68);
					((ExprIDContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__9 || _la==T__10) ) {
						((ExprIDContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(71);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new ExprIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9 || _la==T__10) {
					{
					setState(72);
					((ExprIntContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__9 || _la==T__10) ) {
						((ExprIntContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(75);
				match(INTEGER);
				}
				break;
			case 4:
				{
				_localctx = new ExprDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9 || _la==T__10) {
					{
					setState(76);
					((ExprDoubleContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__9 || _la==T__10) ) {
						((ExprDoubleContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(79);
				match(DOUBLE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(91);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExprPowerContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(82);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(83);
						match(T__6);
						setState(84);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ExprMultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(85);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(86);
						((ExprMultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
							((ExprMultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(87);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprSumMinContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(88);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(89);
						((ExprSumMinContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
							((ExprSumMinContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(90);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public TerminalNode INTEGER() { return getToken(dimensionsParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(dimensionsParser.DOUBLE, 0); }
		public DimPowerContext(UnitdimContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).enterDimPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).exitDimPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimensionsVisitor ) return ((dimensionsVisitor<? extends T>)visitor).visitDimPower(this);
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
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).enterDimUnn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).exitDimUnn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimensionsVisitor ) return ((dimensionsVisitor<? extends T>)visitor).visitDimUnn(this);
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
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).enterDimMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).exitDimMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimensionsVisitor ) return ((dimensionsVisitor<? extends T>)visitor).visitDimMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DimIDContext extends UnitdimContext {
		public Token op;
		public TerminalNode ID() { return getToken(dimensionsParser.ID, 0); }
		public DimIDContext(UnitdimContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).enterDimID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).exitDimID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimensionsVisitor ) return ((dimensionsVisitor<? extends T>)visitor).visitDimID(this);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_unitdim, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new DimUnnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9 || _la==T__10) {
					{
					setState(97);
					((DimUnnContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__9 || _la==T__10) ) {
						((DimUnnContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(100);
				match(T__2);
				setState(101);
				unitdim(0);
				setState(102);
				match(T__4);
				}
				break;
			case 2:
				{
				_localctx = new DimIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9 || _la==T__10) {
					{
					setState(104);
					((DimIDContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__9 || _la==T__10) ) {
						((DimIDContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(107);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new DimMultDivContext(new UnitdimContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_unitdim);
						setState(110);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(111);
						((DimMultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
							((DimMultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(112);
						unitdim(4);
						}
						break;
					case 2:
						{
						_localctx = new DimPowerContext(new UnitdimContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_unitdim);
						setState(113);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(114);
						match(T__6);
						setState(124);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
						case 1:
							{
							setState(115);
							unitdim(0);
							}
							break;
						case 2:
							{
							setState(117);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==T__9 || _la==T__10) {
								{
								setState(116);
								((DimPowerContext)_localctx).op = _input.LT(1);
								_la = _input.LA(1);
								if ( !(_la==T__9 || _la==T__10) ) {
									((DimPowerContext)_localctx).op = (Token)_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
							}

							setState(119);
							match(INTEGER);
							}
							break;
						case 3:
							{
							setState(121);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==T__9 || _la==T__10) {
								{
								setState(120);
								((DimPowerContext)_localctx).op = _input.LT(1);
								_la = _input.LA(1);
								if ( !(_la==T__9 || _la==T__10) ) {
									((DimPowerContext)_localctx).op = (Token)_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
							}

							setState(123);
							match(DOUBLE);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(130);
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

	public static class TypeContext extends ParserRuleContext {
		public Type res;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dimensionsListener ) ((dimensionsListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dimensionsVisitor ) return ((dimensionsVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(T__11);
				((TypeContext)_localctx).res =  new IntegerType();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(T__12);
				((TypeContext)_localctx).res =  new DoubleType();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 6:
			return unitdim_sempred((UnitdimContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean unitdim_sempred(UnitdimContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u008c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3"+
		"\3\5\3\27\n\3\3\3\7\3\32\n\3\f\3\16\3\35\13\3\3\4\3\4\5\4!\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\60\n\5\3\5\3\5\3\5\5"+
		"\5\65\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7A\n\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7H\n\7\3\7\3\7\5\7L\n\7\3\7\3\7\5\7P\n\7\3\7\5\7S\n\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7^\n\7\f\7\16\7a\13\7\3\b\3\b\5\be\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\bl\n\b\3\b\5\bo\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\bx\n\b\3\b\3\b\5\b|\n\b\3\b\5\b\177\n\b\7\b\u0081\n\b\f\b\16\b\u0084"+
		"\13\b\3\t\3\t\3\t\3\t\5\t\u008a\n\t\3\t\2\4\f\16\n\2\4\6\b\n\f\16\20\2"+
		"\4\3\2\f\r\3\2\n\13\2\u009c\2\22\3\2\2\2\4\33\3\2\2\2\6 \3\2\2\2\b\64"+
		"\3\2\2\2\n\66\3\2\2\2\fR\3\2\2\2\16n\3\2\2\2\20\u0089\3\2\2\2\22\23\5"+
		"\4\3\2\23\24\7\2\2\3\24\3\3\2\2\2\25\27\5\6\4\2\26\25\3\2\2\2\26\27\3"+
		"\2\2\2\27\30\3\2\2\2\30\32\7\3\2\2\31\26\3\2\2\2\32\35\3\2\2\2\33\31\3"+
		"\2\2\2\33\34\3\2\2\2\34\5\3\2\2\2\35\33\3\2\2\2\36!\5\b\5\2\37!\5\n\6"+
		"\2 \36\3\2\2\2 \37\3\2\2\2!\7\3\2\2\2\"#\7\4\2\2#$\7\20\2\2$%\7\5\2\2"+
		"%&\7\20\2\2&\'\7\6\2\2\'(\5\20\t\2()\7\7\2\2)\65\3\2\2\2*+\7\4\2\2+,\7"+
		"\20\2\2,/\7\5\2\2-.\7\20\2\2.\60\7\6\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3"+
		"\2\2\2\61\62\5\16\b\2\62\63\7\7\2\2\63\65\3\2\2\2\64\"\3\2\2\2\64*\3\2"+
		"\2\2\65\t\3\2\2\2\66\67\7\b\2\2\678\7\20\2\289\7\5\2\29:\7\20\2\2:;\7"+
		"\6\2\2;<\5\f\7\2<=\7\7\2\2=\13\3\2\2\2>@\b\7\1\2?A\t\2\2\2@?\3\2\2\2@"+
		"A\3\2\2\2AB\3\2\2\2BC\7\5\2\2CD\5\f\7\2DE\7\7\2\2ES\3\2\2\2FH\t\2\2\2"+
		"GF\3\2\2\2GH\3\2\2\2HI\3\2\2\2IS\7\20\2\2JL\t\2\2\2KJ\3\2\2\2KL\3\2\2"+
		"\2LM\3\2\2\2MS\7\21\2\2NP\t\2\2\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QS\7\22"+
		"\2\2R>\3\2\2\2RG\3\2\2\2RK\3\2\2\2RO\3\2\2\2S_\3\2\2\2TU\f\t\2\2UV\7\t"+
		"\2\2V^\5\f\7\tWX\f\b\2\2XY\t\3\2\2Y^\5\f\7\tZ[\f\7\2\2[\\\t\2\2\2\\^\5"+
		"\f\7\b]T\3\2\2\2]W\3\2\2\2]Z\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\r"+
		"\3\2\2\2a_\3\2\2\2bd\b\b\1\2ce\t\2\2\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2f"+
		"g\7\5\2\2gh\5\16\b\2hi\7\7\2\2io\3\2\2\2jl\t\2\2\2kj\3\2\2\2kl\3\2\2\2"+
		"lm\3\2\2\2mo\7\20\2\2nb\3\2\2\2nk\3\2\2\2o\u0082\3\2\2\2pq\f\5\2\2qr\t"+
		"\3\2\2r\u0081\5\16\b\6st\f\6\2\2t~\7\t\2\2u\177\5\16\b\2vx\t\2\2\2wv\3"+
		"\2\2\2wx\3\2\2\2xy\3\2\2\2y\177\7\21\2\2z|\t\2\2\2{z\3\2\2\2{|\3\2\2\2"+
		"|}\3\2\2\2}\177\7\22\2\2~u\3\2\2\2~w\3\2\2\2~{\3\2\2\2\177\u0081\3\2\2"+
		"\2\u0080p\3\2\2\2\u0080s\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\17\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086"+
		"\7\16\2\2\u0086\u008a\b\t\1\2\u0087\u0088\7\17\2\2\u0088\u008a\b\t\1\2"+
		"\u0089\u0085\3\2\2\2\u0089\u0087\3\2\2\2\u008a\21\3\2\2\2\27\26\33 /\64"+
		"@GKOR]_dknw{~\u0080\u0082\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}