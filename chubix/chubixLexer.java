// Generated from chubix.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class chubixLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "BOOLEAN", "ID", "DOUBLE", 
			"INTEGER", "STRING", "WS", "LINE_COMMENT", "COMMENT", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'print'", "'('", "')'", "'return'", "'function'", "','", 
			"'{'", "'}'", "'='", "'if'", "'else'", "'for'", "'while'", "'break'", 
			"'continue'", "'Integer'", "'Double'", "'Boolean'", "'String'", "'+'", 
			"'-'", "'^'", "'*'", "'/'", "'%'", "'//'", "'=='", "'!='", "'<'", "'>'", 
			"'>='", "'<='", "'++'", "'--'", "'input'", "'['", "']'"
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


	public chubixLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "chubix.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0141\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3"+
		"\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\5(\u00fd\n(\3)\3)\7)\u0101\n)\f)\16)\u0104\13)\3*\6*\u0107"+
		"\n*\r*\16*\u0108\3*\3*\7*\u010d\n*\f*\16*\u0110\13*\3+\6+\u0113\n+\r+"+
		"\16+\u0114\3,\3,\7,\u0119\n,\f,\16,\u011c\13,\3,\3,\3-\6-\u0121\n-\r-"+
		"\16-\u0122\3-\3-\3.\3.\7.\u0129\n.\f.\16.\u012c\13.\3.\3.\3.\3.\3/\3/"+
		"\3/\3/\7/\u0136\n/\f/\16/\u0139\13/\3/\3/\3/\3/\3/\3\60\3\60\5\u011a\u012a"+
		"\u0137\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\6\5\2C\\aac"+
		"|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u0149\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5c\3\2\2\2\7"+
		"i\3\2\2\2\tk\3\2\2\2\13m\3\2\2\2\rt\3\2\2\2\17}\3\2\2\2\21\177\3\2\2\2"+
		"\23\u0081\3\2\2\2\25\u0083\3\2\2\2\27\u0085\3\2\2\2\31\u0088\3\2\2\2\33"+
		"\u008d\3\2\2\2\35\u0091\3\2\2\2\37\u0097\3\2\2\2!\u009d\3\2\2\2#\u00a6"+
		"\3\2\2\2%\u00ae\3\2\2\2\'\u00b5\3\2\2\2)\u00bd\3\2\2\2+\u00c4\3\2\2\2"+
		"-\u00c6\3\2\2\2/\u00c8\3\2\2\2\61\u00ca\3\2\2\2\63\u00cc\3\2\2\2\65\u00ce"+
		"\3\2\2\2\67\u00d0\3\2\2\29\u00d3\3\2\2\2;\u00d6\3\2\2\2=\u00d9\3\2\2\2"+
		"?\u00db\3\2\2\2A\u00dd\3\2\2\2C\u00e0\3\2\2\2E\u00e3\3\2\2\2G\u00e6\3"+
		"\2\2\2I\u00e9\3\2\2\2K\u00ef\3\2\2\2M\u00f1\3\2\2\2O\u00fc\3\2\2\2Q\u00fe"+
		"\3\2\2\2S\u0106\3\2\2\2U\u0112\3\2\2\2W\u0116\3\2\2\2Y\u0120\3\2\2\2["+
		"\u0126\3\2\2\2]\u0131\3\2\2\2_\u013f\3\2\2\2ab\7=\2\2b\4\3\2\2\2cd\7r"+
		"\2\2de\7t\2\2ef\7k\2\2fg\7p\2\2gh\7v\2\2h\6\3\2\2\2ij\7*\2\2j\b\3\2\2"+
		"\2kl\7+\2\2l\n\3\2\2\2mn\7t\2\2no\7g\2\2op\7v\2\2pq\7w\2\2qr\7t\2\2rs"+
		"\7p\2\2s\f\3\2\2\2tu\7h\2\2uv\7w\2\2vw\7p\2\2wx\7e\2\2xy\7v\2\2yz\7k\2"+
		"\2z{\7q\2\2{|\7p\2\2|\16\3\2\2\2}~\7.\2\2~\20\3\2\2\2\177\u0080\7}\2\2"+
		"\u0080\22\3\2\2\2\u0081\u0082\7\177\2\2\u0082\24\3\2\2\2\u0083\u0084\7"+
		"?\2\2\u0084\26\3\2\2\2\u0085\u0086\7k\2\2\u0086\u0087\7h\2\2\u0087\30"+
		"\3\2\2\2\u0088\u0089\7g\2\2\u0089\u008a\7n\2\2\u008a\u008b\7u\2\2\u008b"+
		"\u008c\7g\2\2\u008c\32\3\2\2\2\u008d\u008e\7h\2\2\u008e\u008f\7q\2\2\u008f"+
		"\u0090\7t\2\2\u0090\34\3\2\2\2\u0091\u0092\7y\2\2\u0092\u0093\7j\2\2\u0093"+
		"\u0094\7k\2\2\u0094\u0095\7n\2\2\u0095\u0096\7g\2\2\u0096\36\3\2\2\2\u0097"+
		"\u0098\7d\2\2\u0098\u0099\7t\2\2\u0099\u009a\7g\2\2\u009a\u009b\7c\2\2"+
		"\u009b\u009c\7m\2\2\u009c \3\2\2\2\u009d\u009e\7e\2\2\u009e\u009f\7q\2"+
		"\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3"+
		"\7p\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7g\2\2\u00a5\"\3\2\2\2\u00a6\u00a7"+
		"\7K\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7g\2\2\u00aa"+
		"\u00ab\7i\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7t\2\2\u00ad$\3\2\2\2\u00ae"+
		"\u00af\7F\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2\7d\2\2"+
		"\u00b2\u00b3\7n\2\2\u00b3\u00b4\7g\2\2\u00b4&\3\2\2\2\u00b5\u00b6\7D\2"+
		"\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba"+
		"\7g\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7p\2\2\u00bc(\3\2\2\2\u00bd\u00be"+
		"\7U\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7k\2\2\u00c1"+
		"\u00c2\7p\2\2\u00c2\u00c3\7i\2\2\u00c3*\3\2\2\2\u00c4\u00c5\7-\2\2\u00c5"+
		",\3\2\2\2\u00c6\u00c7\7/\2\2\u00c7.\3\2\2\2\u00c8\u00c9\7`\2\2\u00c9\60"+
		"\3\2\2\2\u00ca\u00cb\7,\2\2\u00cb\62\3\2\2\2\u00cc\u00cd\7\61\2\2\u00cd"+
		"\64\3\2\2\2\u00ce\u00cf\7\'\2\2\u00cf\66\3\2\2\2\u00d0\u00d1\7\61\2\2"+
		"\u00d1\u00d2\7\61\2\2\u00d28\3\2\2\2\u00d3\u00d4\7?\2\2\u00d4\u00d5\7"+
		"?\2\2\u00d5:\3\2\2\2\u00d6\u00d7\7#\2\2\u00d7\u00d8\7?\2\2\u00d8<\3\2"+
		"\2\2\u00d9\u00da\7>\2\2\u00da>\3\2\2\2\u00db\u00dc\7@\2\2\u00dc@\3\2\2"+
		"\2\u00dd\u00de\7@\2\2\u00de\u00df\7?\2\2\u00dfB\3\2\2\2\u00e0\u00e1\7"+
		">\2\2\u00e1\u00e2\7?\2\2\u00e2D\3\2\2\2\u00e3\u00e4\7-\2\2\u00e4\u00e5"+
		"\7-\2\2\u00e5F\3\2\2\2\u00e6\u00e7\7/\2\2\u00e7\u00e8\7/\2\2\u00e8H\3"+
		"\2\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7r\2\2\u00ec"+
		"\u00ed\7w\2\2\u00ed\u00ee\7v\2\2\u00eeJ\3\2\2\2\u00ef\u00f0\7]\2\2\u00f0"+
		"L\3\2\2\2\u00f1\u00f2\7_\2\2\u00f2N\3\2\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5"+
		"\7t\2\2\u00f5\u00f6\7w\2\2\u00f6\u00fd\7g\2\2\u00f7\u00f8\7h\2\2\u00f8"+
		"\u00f9\7c\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fd\7g\2\2"+
		"\u00fc\u00f3\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fdP\3\2\2\2\u00fe\u0102\t"+
		"\2\2\2\u00ff\u0101\t\3\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103R\3\2\2\2\u0104\u0102\3\2\2\2"+
		"\u0105\u0107\t\4\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010e\7\60\2\2"+
		"\u010b\u010d\t\4\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010fT\3\2\2\2\u0110\u010e\3\2\2\2\u0111"+
		"\u0113\t\4\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2"+
		"\2\2\u0114\u0115\3\2\2\2\u0115V\3\2\2\2\u0116\u011a\7$\2\2\u0117\u0119"+
		"\13\2\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u011b\3\2\2\2"+
		"\u011a\u0118\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e"+
		"\7$\2\2\u011eX\3\2\2\2\u011f\u0121\t\5\2\2\u0120\u011f\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0125\b-\2\2\u0125Z\3\2\2\2\u0126\u012a\7%\2\2\u0127\u0129\13\2\2\2\u0128"+
		"\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u012b\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7\f\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0130\b.\2\2\u0130\\\3\2\2\2\u0131\u0132\7\61\2\2"+
		"\u0132\u0133\7,\2\2\u0133\u0137\3\2\2\2\u0134\u0136\13\2\2\2\u0135\u0134"+
		"\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7,\2\2\u013b\u013c\7\61"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\u013e\b/\2\2\u013e^\3\2\2\2\u013f\u0140"+
		"\13\2\2\2\u0140`\3\2\2\2\f\2\u00fc\u0102\u0108\u010e\u0114\u011a\u0122"+
		"\u012a\u0137\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}