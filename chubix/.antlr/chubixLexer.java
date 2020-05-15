// Generated from /Users/paiva/Documents/Universidade/Engenharia Informática/2º Ano/2º Semestre/Compiladores/compilers/chubix/chubix.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ID=2, SYMB=3, INT=4, DOUBLE=5, WS=6, LINE_COMMENT=7, ERROR=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "ID", "SYMB", "INT", "DOUBLE", "WS", "LINE_COMMENT", "ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ID", "SYMB", "INT", "DOUBLE", "WS", "LINE_COMMENT", "ERROR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\nG\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3"+
		"\7\3\30\n\3\f\3\16\3\33\13\3\3\4\3\4\7\4\37\n\4\f\4\16\4\"\13\4\3\5\6"+
		"\5%\n\5\r\5\16\5&\3\6\6\6*\n\6\r\6\16\6+\3\6\3\6\6\6\60\n\6\r\6\16\6\61"+
		"\5\6\64\n\6\3\7\6\7\67\n\7\r\7\16\78\3\7\3\7\3\b\3\b\7\b?\n\b\f\b\16\b"+
		"B\13\b\3\b\3\b\3\t\3\t\3@\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\b"+
		"\5\2C\\aac|\6\2\62;C\\aac|\4\2C\\c|\4\3\2`c|\3\2\62;\5\2\13\f\17\17\""+
		"\"\2N\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\25\3\2\2\2\7\34\3\2"+
		"\2\2\t$\3\2\2\2\13)\3\2\2\2\r\66\3\2\2\2\17<\3\2\2\2\21E\3\2\2\2\23\24"+
		"\7=\2\2\24\4\3\2\2\2\25\31\t\2\2\2\26\30\t\3\2\2\27\26\3\2\2\2\30\33\3"+
		"\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\6\3\2\2\2\33\31\3\2\2\2\34 \t\4"+
		"\2\2\35\37\t\5\2\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\b"+
		"\3\2\2\2\" \3\2\2\2#%\t\6\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2"+
		"\'\n\3\2\2\2(*\t\6\2\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\63\3\2"+
		"\2\2-/\7\60\2\2.\60\t\6\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62"+
		"\3\2\2\2\62\64\3\2\2\2\63-\3\2\2\2\63\64\3\2\2\2\64\f\3\2\2\2\65\67\t"+
		"\7\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29:\3\2\2\2:;\b\7"+
		"\2\2;\16\3\2\2\2<@\7%\2\2=?\13\2\2\2>=\3\2\2\2?B\3\2\2\2@A\3\2\2\2@>\3"+
		"\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\f\2\2D\20\3\2\2\2EF\13\2\2\2F\22\3\2\2"+
		"\2\13\2\31 &+\61\638@\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}