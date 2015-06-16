// Generated from /home/developer/workspace/languages-parser/bnf-language/src/main/antlr/Bnf.g4 by ANTLR 4.5
package com.github.kn.language.parser.impl.model.backend.bnf;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BnfLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, ASSIGN=2, LPAREN=3, RPAREN=4, LBRACE=5, RBRACE=6, LEND=7, REND=8, 
		BAR=9, CAPTEXT=10, TEXT=11, STRINGLITERAL=12, WS=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ID", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LEND", "REND", 
		"BAR", "CAPTEXT", "TEXT", "STRINGLITERAL", "UPPERCASE_LETTER", "LOWERCASE_LETTER", 
		"DIGIT", "SYMBOL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'::='", "')'", "'('", "'}'", "'{'", "']'", "'['", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ID", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LEND", 
		"REND", "BAR", "CAPTEXT", "TEXT", "STRINGLITERAL", "WS"
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


	public BnfLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bnf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17`\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\6\fH\n\f\r\f\16\fI\3\r\3\r\7\rN\n\r\f\r\16\rQ\13\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\4)O\2\23\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\2\37\2!\2#\17"+
		"\3\2\4\n\2#),\61<B`b\u00a3\u0101\u0154\u0194\u2015\u2124\u2192\u2301\5"+
		"\2\13\f\17\17\"\"a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5.\3\2\2\2\7\62\3\2"+
		"\2\2\t\64\3\2\2\2\13\66\3\2\2\2\r8\3\2\2\2\17:\3\2\2\2\21<\3\2\2\2\23"+
		">\3\2\2\2\25@\3\2\2\2\27G\3\2\2\2\31K\3\2\2\2\33T\3\2\2\2\35V\3\2\2\2"+
		"\37X\3\2\2\2!Z\3\2\2\2#\\\3\2\2\2%)\7>\2\2&(\13\2\2\2\'&\3\2\2\2(+\3\2"+
		"\2\2)*\3\2\2\2)\'\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7@\2\2-\4\3\2\2\2./\7"+
		"<\2\2/\60\7<\2\2\60\61\7?\2\2\61\6\3\2\2\2\62\63\7+\2\2\63\b\3\2\2\2\64"+
		"\65\7*\2\2\65\n\3\2\2\2\66\67\7\177\2\2\67\f\3\2\2\289\7}\2\29\16\3\2"+
		"\2\2:;\7_\2\2;\20\3\2\2\2<=\7]\2\2=\22\3\2\2\2>?\7~\2\2?\24\3\2\2\2@A"+
		"\5\33\16\2AB\5\27\f\2B\26\3\2\2\2CH\5\33\16\2DH\5\35\17\2EH\5\37\20\2"+
		"FH\5!\21\2GC\3\2\2\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2"+
		"IJ\3\2\2\2J\30\3\2\2\2KO\7$\2\2LN\13\2\2\2ML\3\2\2\2NQ\3\2\2\2OP\3\2\2"+
		"\2OM\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7$\2\2S\32\3\2\2\2TU\4C\\\2U\34\3\2"+
		"\2\2VW\4c|\2W\36\3\2\2\2XY\4\62;\2Y \3\2\2\2Z[\t\2\2\2[\"\3\2\2\2\\]\t"+
		"\3\2\2]^\3\2\2\2^_\b\22\2\2_$\3\2\2\2\7\2)GIO\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}