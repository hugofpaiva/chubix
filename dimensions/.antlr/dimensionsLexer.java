// Generated from /Users/paiva/Documents/Universidade/Engenharia Informática/2º Ano/2º Semestre/Compiladores/compilers/dimensions/dimensions.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dimensionsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ID=12, SYMB=13, INT=14, DOUBLE=15, WS=16, LINE_COMMENT=17, 
		ERROR=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "ID", "SYMB", "INT", "DOUBLE", "WS", "LINE_COMMENT", 
		"ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'dim'", "'('", "')'", "'unit'", "':'", "'^'", "'*'", "'/'", 
		"'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"ID", "SYMB", "INT", "DOUBLE", "WS", "LINE_COMMENT", "ERROR"
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


	public dimensionsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "dimensions.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\7\rE\n\r\f"+
		"\r\16\rH\13\r\3\16\3\16\7\16L\n\16\f\16\16\16O\13\16\3\17\6\17R\n\17\r"+
		"\17\16\17S\3\20\6\20W\n\20\r\20\16\20X\3\20\3\20\6\20]\n\20\r\20\16\20"+
		"^\5\20a\n\20\3\21\6\21d\n\21\r\21\16\21e\3\21\3\21\3\22\3\22\7\22l\n\22"+
		"\f\22\16\22o\13\22\3\22\3\22\3\23\3\23\3m\2\24\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\b"+
		"\5\2C\\aac|\6\2\62;C\\aac|\4\2C\\c|\4\3\2`c|\3\2\62;\5\2\13\f\17\17\""+
		"\"\2{\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61"+
		"\3\2\2\2\r\66\3\2\2\2\178\3\2\2\2\21:\3\2\2\2\23<\3\2\2\2\25>\3\2\2\2"+
		"\27@\3\2\2\2\31B\3\2\2\2\33I\3\2\2\2\35Q\3\2\2\2\37V\3\2\2\2!c\3\2\2\2"+
		"#i\3\2\2\2%r\3\2\2\2\'(\7=\2\2(\4\3\2\2\2)*\7f\2\2*+\7k\2\2+,\7o\2\2,"+
		"\6\3\2\2\2-.\7*\2\2.\b\3\2\2\2/\60\7+\2\2\60\n\3\2\2\2\61\62\7w\2\2\62"+
		"\63\7p\2\2\63\64\7k\2\2\64\65\7v\2\2\65\f\3\2\2\2\66\67\7<\2\2\67\16\3"+
		"\2\2\289\7`\2\29\20\3\2\2\2:;\7,\2\2;\22\3\2\2\2<=\7\61\2\2=\24\3\2\2"+
		"\2>?\7-\2\2?\26\3\2\2\2@A\7/\2\2A\30\3\2\2\2BF\t\2\2\2CE\t\3\2\2DC\3\2"+
		"\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\32\3\2\2\2HF\3\2\2\2IM\t\4\2\2JL\t"+
		"\5\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\34\3\2\2\2OM\3\2\2\2P"+
		"R\t\6\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\36\3\2\2\2UW\t\6\2"+
		"\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y`\3\2\2\2Z\\\7\60\2\2[]\t\6"+
		"\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`Z\3\2\2\2`a\3"+
		"\2\2\2a \3\2\2\2bd\t\7\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3"+
		"\2\2\2gh\b\21\2\2h\"\3\2\2\2im\7%\2\2jl\13\2\2\2kj\3\2\2\2lo\3\2\2\2m"+
		"n\3\2\2\2mk\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\f\2\2q$\3\2\2\2rs\13\2\2\2"+
		"s&\3\2\2\2\13\2FMSX^`em\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}