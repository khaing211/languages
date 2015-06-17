// Generated from /home/developer/workspace/languages-parser/erlang-language/src/main/antlr/Erlang.g4 by ANTLR 4.5
package com.github.kn.language.parser.impl.model.backend.erlang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ErlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, TokAtom=64, TokVar=65, TokFloat=66, 
		TokInteger=67, TokChar=68, TokString=69, AttrName=70, Comment=71, WS=72;
	public static final int
		RULE_forms = 0, RULE_form = 1, RULE_tokAtom = 2, RULE_tokVar = 3, RULE_tokFloat = 4, 
		RULE_tokInteger = 5, RULE_tokChar = 6, RULE_tokString = 7, RULE_attribute = 8, 
		RULE_typeSpec = 9, RULE_specFun = 10, RULE_typedAttrVal = 11, RULE_typedRecordFields = 12, 
		RULE_typedExprs = 13, RULE_typedExpr = 14, RULE_typeSigs = 15, RULE_typeSig = 16, 
		RULE_typeGuards = 17, RULE_typeGuard = 18, RULE_topTypes = 19, RULE_topType = 20, 
		RULE_topType100 = 21, RULE_type200 = 22, RULE_type300 = 23, RULE_type400 = 24, 
		RULE_type500 = 25, RULE_type = 26, RULE_funType100 = 27, RULE_funType = 28, 
		RULE_fieldTypes = 29, RULE_fieldType = 30, RULE_binaryType = 31, RULE_binBaseType = 32, 
		RULE_binUnitType = 33, RULE_attrVal = 34, RULE_function = 35, RULE_functionClause = 36, 
		RULE_clauseArgs = 37, RULE_clauseGuard = 38, RULE_clauseBody = 39, RULE_expr = 40, 
		RULE_expr100 = 41, RULE_expr150 = 42, RULE_expr160 = 43, RULE_expr200 = 44, 
		RULE_expr300 = 45, RULE_expr400 = 46, RULE_expr500 = 47, RULE_expr600 = 48, 
		RULE_expr700 = 49, RULE_expr800 = 50, RULE_exprMax = 51, RULE_list = 52, 
		RULE_tail = 53, RULE_binary = 54, RULE_binElements = 55, RULE_binElement = 56, 
		RULE_bitExpr = 57, RULE_optBitSizeExpr = 58, RULE_optBitTypeList = 59, 
		RULE_bitTypeList = 60, RULE_bitType = 61, RULE_bitSizeExpr = 62, RULE_listComprehension = 63, 
		RULE_binaryComprehension = 64, RULE_lcExprs = 65, RULE_lcExpr = 66, RULE_tuple = 67, 
		RULE_recordExpr = 68, RULE_recordTuple = 69, RULE_recordFields = 70, RULE_recordField = 71, 
		RULE_functionCall = 72, RULE_ifExpr = 73, RULE_ifClauses = 74, RULE_ifClause = 75, 
		RULE_caseExpr = 76, RULE_crClauses = 77, RULE_crClause = 78, RULE_receiveExpr = 79, 
		RULE_funExpr = 80, RULE_atomOrVar = 81, RULE_integerOrVar = 82, RULE_funClauses = 83, 
		RULE_funClause = 84, RULE_tryExpr = 85, RULE_tryCatch = 86, RULE_tryClauses = 87, 
		RULE_tryClause = 88, RULE_argumentList = 89, RULE_exprs = 90, RULE_guard = 91, 
		RULE_atomic = 92, RULE_prefixOp = 93, RULE_multOp = 94, RULE_addOp = 95, 
		RULE_listOp = 96, RULE_compOp = 97, RULE_ruleClauses = 98, RULE_ruleClause = 99, 
		RULE_ruleBody = 100;
	public static final String[] ruleNames = {
		"forms", "form", "tokAtom", "tokVar", "tokFloat", "tokInteger", "tokChar", 
		"tokString", "attribute", "typeSpec", "specFun", "typedAttrVal", "typedRecordFields", 
		"typedExprs", "typedExpr", "typeSigs", "typeSig", "typeGuards", "typeGuard", 
		"topTypes", "topType", "topType100", "type200", "type300", "type400", 
		"type500", "type", "funType100", "funType", "fieldTypes", "fieldType", 
		"binaryType", "binBaseType", "binUnitType", "attrVal", "function", "functionClause", 
		"clauseArgs", "clauseGuard", "clauseBody", "expr", "expr100", "expr150", 
		"expr160", "expr200", "expr300", "expr400", "expr500", "expr600", "expr700", 
		"expr800", "exprMax", "list", "tail", "binary", "binElements", "binElement", 
		"bitExpr", "optBitSizeExpr", "optBitTypeList", "bitTypeList", "bitType", 
		"bitSizeExpr", "listComprehension", "binaryComprehension", "lcExprs", 
		"lcExpr", "tuple", "recordExpr", "recordTuple", "recordFields", "recordField", 
		"functionCall", "ifExpr", "ifClauses", "ifClause", "caseExpr", "crClauses", 
		"crClause", "receiveExpr", "funExpr", "atomOrVar", "integerOrVar", "funClauses", 
		"funClause", "tryExpr", "tryCatch", "tryClauses", "tryClause", "argumentList", 
		"exprs", "guard", "atomic", "prefixOp", "multOp", "addOp", "listOp", "compOp", 
		"ruleClauses", "ruleClause", "ruleBody"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'-'", "'('", "')'", "':'", "'/'", "'::'", "','", "'{'", 
		"'}'", "';'", "'when'", "'|'", "'..'", "'['", "']'", "'...'", "'#'", "'fun'", 
		"'->'", "'<<'", "'>>'", "'*'", "'catch'", "'='", "'!'", "'orelse'", "'andalso'", 
		"'begin'", "'end'", "'||'", "'<-'", "'<='", "'if'", "'case'", "'of'", 
		"'receive'", "'after'", "'try'", "'+'", "'bnot'", "'not'", "'div'", "'rem'", 
		"'band'", "'and'", "'bor'", "'bxor'", "'bsl'", "'bsr'", "'or'", "'xor'", 
		"'++'", "'--'", "'=='", "'/='", "'=<'", "'<'", "'>='", "'>'", "'=:='", 
		"'=/='", "':-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "TokAtom", "TokVar", "TokFloat", "TokInteger", 
		"TokChar", "TokString", "AttrName", "Comment", "WS"
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
	public String getGrammarFileName() { return "Erlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ErlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FormsContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ErlangParser.EOF, 0); }
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public FormsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterForms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitForms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitForms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormsContext forms() throws RecognitionException {
		FormsContext _localctx = new FormsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_forms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				form();
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==TokAtom || _la==AttrName );
			setState(207);
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

	public static class FormContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public RuleClausesContext ruleClauses() {
			return getRuleContext(RuleClausesContext.class,0);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_form);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(209);
				attribute();
				}
				break;
			case 2:
				{
				setState(210);
				function();
				}
				break;
			case 3:
				{
				setState(211);
				ruleClauses();
				}
				break;
			}
			setState(214);
			match(T__0);
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

	public static class TokAtomContext extends ParserRuleContext {
		public TerminalNode TokAtom() { return getToken(ErlangParser.TokAtom, 0); }
		public TokAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTokAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTokAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTokAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokAtomContext tokAtom() throws RecognitionException {
		TokAtomContext _localctx = new TokAtomContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tokAtom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(TokAtom);
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

	public static class TokVarContext extends ParserRuleContext {
		public TerminalNode TokVar() { return getToken(ErlangParser.TokVar, 0); }
		public TokVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTokVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTokVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTokVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokVarContext tokVar() throws RecognitionException {
		TokVarContext _localctx = new TokVarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tokVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(TokVar);
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

	public static class TokFloatContext extends ParserRuleContext {
		public TerminalNode TokFloat() { return getToken(ErlangParser.TokFloat, 0); }
		public TokFloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokFloat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTokFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTokFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTokFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokFloatContext tokFloat() throws RecognitionException {
		TokFloatContext _localctx = new TokFloatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tokFloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(TokFloat);
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

	public static class TokIntegerContext extends ParserRuleContext {
		public TerminalNode TokInteger() { return getToken(ErlangParser.TokInteger, 0); }
		public TokIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTokInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTokInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTokInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokIntegerContext tokInteger() throws RecognitionException {
		TokIntegerContext _localctx = new TokIntegerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tokInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(TokInteger);
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

	public static class TokCharContext extends ParserRuleContext {
		public TerminalNode TokChar() { return getToken(ErlangParser.TokChar, 0); }
		public TokCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTokChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTokChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTokChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokCharContext tokChar() throws RecognitionException {
		TokCharContext _localctx = new TokCharContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tokChar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(TokChar);
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

	public static class TokStringContext extends ParserRuleContext {
		public TerminalNode TokString() { return getToken(ErlangParser.TokString, 0); }
		public TokStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTokString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTokString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTokString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokStringContext tokString() throws RecognitionException {
		TokStringContext _localctx = new TokStringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tokString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(TokString);
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

	public static class AttributeContext extends ParserRuleContext {
		public TokAtomContext tokAtom() {
			return getRuleContext(TokAtomContext.class,0);
		}
		public AttrValContext attrVal() {
			return getRuleContext(AttrValContext.class,0);
		}
		public TypedAttrValContext typedAttrVal() {
			return getRuleContext(TypedAttrValContext.class,0);
		}
		public TerminalNode AttrName() { return getToken(ErlangParser.AttrName, 0); }
		public TypeSpecContext typeSpec() {
			return getRuleContext(TypeSpecContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attribute);
		try {
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(T__1);
				setState(229);
				tokAtom();
				setState(230);
				attrVal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(T__1);
				setState(233);
				tokAtom();
				setState(234);
				typedAttrVal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(T__1);
				setState(237);
				tokAtom();
				setState(238);
				match(T__2);
				setState(239);
				typedAttrVal();
				setState(240);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(AttrName);
				setState(243);
				typeSpec();
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

	public static class TypeSpecContext extends ParserRuleContext {
		public SpecFunContext specFun() {
			return getRuleContext(SpecFunContext.class,0);
		}
		public TypeSigsContext typeSigs() {
			return getRuleContext(TypeSigsContext.class,0);
		}
		public TypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTypeSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTypeSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecContext typeSpec() throws RecognitionException {
		TypeSpecContext _localctx = new TypeSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeSpec);
		try {
			setState(254);
			switch (_input.LA(1)) {
			case TokAtom:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				specFun();
				setState(247);
				typeSigs();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(T__2);
				setState(250);
				specFun();
				setState(251);
				typeSigs();
				setState(252);
				match(T__3);
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

	public static class SpecFunContext extends ParserRuleContext {
		public List<TokAtomContext> tokAtom() {
			return getRuleContexts(TokAtomContext.class);
		}
		public TokAtomContext tokAtom(int i) {
			return getRuleContext(TokAtomContext.class,i);
		}
		public TokIntegerContext tokInteger() {
			return getRuleContext(TokIntegerContext.class,0);
		}
		public SpecFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterSpecFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitSpecFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitSpecFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecFunContext specFun() throws RecognitionException {
		SpecFunContext _localctx = new SpecFunContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_specFun);
		try {
			setState(273);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				tokAtom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				tokAtom();
				setState(258);
				match(T__4);
				setState(259);
				tokAtom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				tokAtom();
				setState(262);
				match(T__5);
				setState(263);
				tokInteger();
				setState(264);
				match(T__6);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				tokAtom();
				setState(267);
				match(T__4);
				setState(268);
				tokAtom();
				setState(269);
				match(T__5);
				setState(270);
				tokInteger();
				setState(271);
				match(T__6);
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

	public static class TypedAttrValContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TypedRecordFieldsContext typedRecordFields() {
			return getRuleContext(TypedRecordFieldsContext.class,0);
		}
		public TopTypeContext topType() {
			return getRuleContext(TopTypeContext.class,0);
		}
		public TypedAttrValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedAttrVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTypedAttrVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTypedAttrVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTypedAttrVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedAttrValContext typedAttrVal() throws RecognitionException {
		TypedAttrValContext _localctx = new TypedAttrValContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typedAttrVal);
		try {
			setState(283);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				expr();
				setState(276);
				match(T__7);
				setState(277);
				typedRecordFields();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				expr();
				setState(280);
				match(T__6);
				setState(281);
				topType();
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

	public static class TypedRecordFieldsContext extends ParserRuleContext {
		public TypedExprsContext typedExprs() {
			return getRuleContext(TypedExprsContext.class,0);
		}
		public TypedRecordFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedRecordFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTypedRecordFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTypedRecordFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTypedRecordFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedRecordFieldsContext typedRecordFields() throws RecognitionException {
		TypedRecordFieldsContext _localctx = new TypedRecordFieldsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typedRecordFields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__8);
			setState(286);
			typedExprs();
			setState(287);
			match(T__9);
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

	public static class TypedExprsContext extends ParserRuleContext {
		public TypedExprContext typedExpr() {
			return getRuleContext(TypedExprContext.class,0);
		}
		public TypedExprsContext typedExprs() {
			return getRuleContext(TypedExprsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TypedExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTypedExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTypedExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTypedExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedExprsContext typedExprs() throws RecognitionException {
		TypedExprsContext _localctx = new TypedExprsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typedExprs);
		try {
			setState(302);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				typedExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				typedExpr();
				setState(291);
				match(T__7);
				setState(292);
				typedExprs();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				expr();
				setState(295);
				match(T__7);
				setState(296);
				typedExprs();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
				typedExpr();
				setState(299);
				match(T__7);
				setState(300);
				exprs();
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

	public static class TypedExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TopTypeContext topType() {
			return getRuleContext(TopTypeContext.class,0);
		}
		public TypedExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTypedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTypedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTypedExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedExprContext typedExpr() throws RecognitionException {
		TypedExprContext _localctx = new TypedExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typedExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			expr();
			setState(305);
			match(T__6);
			setState(306);
			topType();
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

	public static class TypeSigsContext extends ParserRuleContext {
		public List<TypeSigContext> typeSig() {
			return getRuleContexts(TypeSigContext.class);
		}
		public TypeSigContext typeSig(int i) {
			return getRuleContext(TypeSigContext.class,i);
		}
		public TypeSigsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSigs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTypeSigs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTypeSigs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTypeSigs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSigsContext typeSigs() throws RecognitionException {
		TypeSigsContext _localctx = new TypeSigsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeSigs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			typeSig();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(309);
				match(T__10);
				setState(310);
				typeSig();
				}
				}
				setState(315);
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

	public static class TypeSigContext extends ParserRuleContext {
		public FunTypeContext funType() {
			return getRuleContext(FunTypeContext.class,0);
		}
		public TypeGuardsContext typeGuards() {
			return getRuleContext(TypeGuardsContext.class,0);
		}
		public TypeSigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTypeSig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTypeSig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTypeSig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSigContext typeSig() throws RecognitionException {
		TypeSigContext _localctx = new TypeSigContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeSig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			funType();
			setState(319);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(317);
				match(T__11);
				setState(318);
				typeGuards();
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

	public static class TypeGuardsContext extends ParserRuleContext {
		public List<TypeGuardContext> typeGuard() {
			return getRuleContexts(TypeGuardContext.class);
		}
		public TypeGuardContext typeGuard(int i) {
			return getRuleContext(TypeGuardContext.class,i);
		}
		public TypeGuardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeGuards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTypeGuards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTypeGuards(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTypeGuards(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeGuardsContext typeGuards() throws RecognitionException {
		TypeGuardsContext _localctx = new TypeGuardsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeGuards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			typeGuard();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(322);
				match(T__7);
				setState(323);
				typeGuard();
				}
				}
				setState(328);
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

	public static class TypeGuardContext extends ParserRuleContext {
		public TokAtomContext tokAtom() {
			return getRuleContext(TokAtomContext.class,0);
		}
		public TopTypesContext topTypes() {
			return getRuleContext(TopTypesContext.class,0);
		}
		public TokVarContext tokVar() {
			return getRuleContext(TokVarContext.class,0);
		}
		public TopTypeContext topType() {
			return getRuleContext(TopTypeContext.class,0);
		}
		public TypeGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTypeGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTypeGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTypeGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeGuardContext typeGuard() throws RecognitionException {
		TypeGuardContext _localctx = new TypeGuardContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeGuard);
		try {
			setState(338);
			switch (_input.LA(1)) {
			case TokAtom:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				tokAtom();
				setState(330);
				match(T__2);
				setState(331);
				topTypes();
				setState(332);
				match(T__3);
				}
				break;
			case TokVar:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				tokVar();
				setState(335);
				match(T__6);
				setState(336);
				topType();
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

	public static class TopTypesContext extends ParserRuleContext {
		public List<TopTypeContext> topType() {
			return getRuleContexts(TopTypeContext.class);
		}
		public TopTypeContext topType(int i) {
			return getRuleContext(TopTypeContext.class,i);
		}
		public TopTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTopTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTopTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTopTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopTypesContext topTypes() throws RecognitionException {
		TopTypesContext _localctx = new TopTypesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_topTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			topType();
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(341);
				match(T__7);
				setState(342);
				topType();
				}
				}
				setState(347);
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

	public static class TopTypeContext extends ParserRuleContext {
		public TopType100Context topType100() {
			return getRuleContext(TopType100Context.class,0);
		}
		public TokVarContext tokVar() {
			return getRuleContext(TokVarContext.class,0);
		}
		public TopTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTopType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTopType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTopType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopTypeContext topType() throws RecognitionException {
		TopTypeContext _localctx = new TopTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_topType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(348);
				tokVar();
				setState(349);
				match(T__6);
				}
				break;
			}
			setState(353);
			topType100();
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

	public static class TopType100Context extends ParserRuleContext {
		public Type200Context type200() {
			return getRuleContext(Type200Context.class,0);
		}
		public TopType100Context topType100() {
			return getRuleContext(TopType100Context.class,0);
		}
		public TopType100Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topType100; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTopType100(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTopType100(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTopType100(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopType100Context topType100() throws RecognitionException {
		TopType100Context _localctx = new TopType100Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_topType100);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			type200();
			setState(358);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(356);
				match(T__12);
				setState(357);
				topType100();
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

	public static class Type200Context extends ParserRuleContext {
		public List<Type300Context> type300() {
			return getRuleContexts(Type300Context.class);
		}
		public Type300Context type300(int i) {
			return getRuleContext(Type300Context.class,i);
		}
		public Type200Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type200; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterType200(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitType200(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitType200(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type200Context type200() throws RecognitionException {
		Type200Context _localctx = new Type200Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_type200);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			type300(0);
			setState(363);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(361);
				match(T__13);
				setState(362);
				type300(0);
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

	public static class Type300Context extends ParserRuleContext {
		public Type400Context type400() {
			return getRuleContext(Type400Context.class,0);
		}
		public Type300Context type300() {
			return getRuleContext(Type300Context.class,0);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public Type300Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type300; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterType300(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitType300(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitType300(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type300Context type300() throws RecognitionException {
		return type300(0);
	}

	private Type300Context type300(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type300Context _localctx = new Type300Context(_ctx, _parentState);
		Type300Context _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_type300, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(366);
			type400(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type300Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type300);
					setState(368);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(369);
					addOp();
					setState(370);
					type400(0);
					}
					} 
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Type400Context extends ParserRuleContext {
		public Type500Context type500() {
			return getRuleContext(Type500Context.class,0);
		}
		public Type400Context type400() {
			return getRuleContext(Type400Context.class,0);
		}
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public Type400Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type400; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterType400(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitType400(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitType400(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type400Context type400() throws RecognitionException {
		return type400(0);
	}

	private Type400Context type400(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type400Context _localctx = new Type400Context(_ctx, _parentState);
		Type400Context _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_type400, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(378);
			type500();
			}
			_ctx.stop = _input.LT(-1);
			setState(386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type400Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type400);
					setState(380);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(381);
					multOp();
					setState(382);
					type500();
					}
					} 
				}
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class Type500Context extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PrefixOpContext prefixOp() {
			return getRuleContext(PrefixOpContext.class,0);
		}
		public Type500Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type500; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterType500(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitType500(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitType500(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type500Context type500() throws RecognitionException {
		Type500Context _localctx = new Type500Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_type500);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) {
				{
				setState(389);
				prefixOp();
				}
			}

			setState(392);
			type();
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
		public TopTypeContext topType() {
			return getRuleContext(TopTypeContext.class,0);
		}
		public TokVarContext tokVar() {
			return getRuleContext(TokVarContext.class,0);
		}
		public List<TokAtomContext> tokAtom() {
			return getRuleContexts(TokAtomContext.class);
		}
		public TokAtomContext tokAtom(int i) {
			return getRuleContext(TokAtomContext.class,i);
		}
		public TopTypesContext topTypes() {
			return getRuleContext(TopTypesContext.class,0);
		}
		public FieldTypesContext fieldTypes() {
			return getRuleContext(FieldTypesContext.class,0);
		}
		public BinaryTypeContext binaryType() {
			return getRuleContext(BinaryTypeContext.class,0);
		}
		public TokIntegerContext tokInteger() {
			return getRuleContext(TokIntegerContext.class,0);
		}
		public FunType100Context funType100() {
			return getRuleContext(FunType100Context.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_type);
		try {
			setState(461);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(T__2);
				setState(395);
				topType();
				setState(396);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				tokVar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				tokAtom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
				tokAtom();
				setState(401);
				match(T__2);
				setState(402);
				match(T__3);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(404);
				tokAtom();
				setState(405);
				match(T__2);
				setState(406);
				topTypes();
				setState(407);
				match(T__3);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(409);
				tokAtom();
				setState(410);
				match(T__4);
				setState(411);
				tokAtom();
				setState(412);
				match(T__2);
				setState(413);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(415);
				tokAtom();
				setState(416);
				match(T__4);
				setState(417);
				tokAtom();
				setState(418);
				match(T__2);
				setState(419);
				topTypes();
				setState(420);
				match(T__3);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(422);
				match(T__14);
				setState(423);
				match(T__15);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(424);
				match(T__14);
				setState(425);
				topType();
				setState(426);
				match(T__15);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(428);
				match(T__14);
				setState(429);
				topType();
				setState(430);
				match(T__7);
				setState(431);
				match(T__16);
				setState(432);
				match(T__15);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(434);
				match(T__8);
				setState(435);
				match(T__9);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(436);
				match(T__8);
				setState(437);
				topTypes();
				setState(438);
				match(T__9);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(440);
				match(T__17);
				setState(441);
				tokAtom();
				setState(442);
				match(T__8);
				setState(443);
				match(T__9);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(445);
				match(T__17);
				setState(446);
				tokAtom();
				setState(447);
				match(T__8);
				setState(448);
				fieldTypes();
				setState(449);
				match(T__9);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(451);
				binaryType();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(452);
				tokInteger();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(453);
				match(T__18);
				setState(454);
				match(T__2);
				setState(455);
				match(T__3);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(456);
				match(T__18);
				setState(457);
				match(T__2);
				setState(458);
				funType100();
				setState(459);
				match(T__3);
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

	public static class FunType100Context extends ParserRuleContext {
		public TopTypeContext topType() {
			return getRuleContext(TopTypeContext.class,0);
		}
		public FunTypeContext funType() {
			return getRuleContext(FunTypeContext.class,0);
		}
		public FunType100Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funType100; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFunType100(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFunType100(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitFunType100(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunType100Context funType100() throws RecognitionException {
		FunType100Context _localctx = new FunType100Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_funType100);
		try {
			setState(469);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(T__2);
				setState(464);
				match(T__16);
				setState(465);
				match(T__3);
				setState(466);
				match(T__19);
				setState(467);
				topType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				funType();
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

	public static class FunTypeContext extends ParserRuleContext {
		public TopTypeContext topType() {
			return getRuleContext(TopTypeContext.class,0);
		}
		public TopTypesContext topTypes() {
			return getRuleContext(TopTypesContext.class,0);
		}
		public FunTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFunType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFunType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitFunType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunTypeContext funType() throws RecognitionException {
		FunTypeContext _localctx = new FunTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_funType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(T__2);
			setState(473);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__8) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TokAtom - 64)) | (1L << (TokVar - 64)) | (1L << (TokInteger - 64)))) != 0)) {
				{
				setState(472);
				topTypes();
				}
			}

			setState(475);
			match(T__3);
			setState(476);
			match(T__19);
			setState(477);
			topType();
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

	public static class FieldTypesContext extends ParserRuleContext {
		public List<FieldTypeContext> fieldType() {
			return getRuleContexts(FieldTypeContext.class);
		}
		public FieldTypeContext fieldType(int i) {
			return getRuleContext(FieldTypeContext.class,i);
		}
		public FieldTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFieldTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFieldTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitFieldTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldTypesContext fieldTypes() throws RecognitionException {
		FieldTypesContext _localctx = new FieldTypesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fieldTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			fieldType();
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(480);
				match(T__7);
				setState(481);
				fieldType();
				}
				}
				setState(486);
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

	public static class FieldTypeContext extends ParserRuleContext {
		public TokAtomContext tokAtom() {
			return getRuleContext(TokAtomContext.class,0);
		}
		public TopTypeContext topType() {
			return getRuleContext(TopTypeContext.class,0);
		}
		public FieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFieldType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFieldType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitFieldType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldTypeContext fieldType() throws RecognitionException {
		FieldTypeContext _localctx = new FieldTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fieldType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			tokAtom();
			setState(488);
			match(T__6);
			setState(489);
			topType();
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

	public static class BinaryTypeContext extends ParserRuleContext {
		public BinBaseTypeContext binBaseType() {
			return getRuleContext(BinBaseTypeContext.class,0);
		}
		public BinUnitTypeContext binUnitType() {
			return getRuleContext(BinUnitTypeContext.class,0);
		}
		public BinaryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBinaryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBinaryType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBinaryType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryTypeContext binaryType() throws RecognitionException {
		BinaryTypeContext _localctx = new BinaryTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_binaryType);
		try {
			setState(507);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				match(T__20);
				setState(492);
				match(T__21);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				match(T__20);
				setState(494);
				binBaseType();
				setState(495);
				match(T__21);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				match(T__20);
				setState(498);
				binUnitType();
				setState(499);
				match(T__21);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(501);
				match(T__20);
				setState(502);
				binBaseType();
				setState(503);
				match(T__7);
				setState(504);
				binUnitType();
				setState(505);
				match(T__21);
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

	public static class BinBaseTypeContext extends ParserRuleContext {
		public TokVarContext tokVar() {
			return getRuleContext(TokVarContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BinBaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binBaseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBinBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBinBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBinBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinBaseTypeContext binBaseType() throws RecognitionException {
		BinBaseTypeContext _localctx = new BinBaseTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_binBaseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			tokVar();
			setState(510);
			match(T__4);
			setState(511);
			type();
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

	public static class BinUnitTypeContext extends ParserRuleContext {
		public List<TokVarContext> tokVar() {
			return getRuleContexts(TokVarContext.class);
		}
		public TokVarContext tokVar(int i) {
			return getRuleContext(TokVarContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BinUnitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binUnitType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBinUnitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBinUnitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBinUnitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinUnitTypeContext binUnitType() throws RecognitionException {
		BinUnitTypeContext _localctx = new BinUnitTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_binUnitType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			tokVar();
			setState(514);
			match(T__4);
			setState(515);
			tokVar();
			setState(516);
			match(T__22);
			setState(517);
			type();
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

	public static class AttrValContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public AttrValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterAttrVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitAttrVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitAttrVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrValContext attrVal() throws RecognitionException {
		AttrValContext _localctx = new AttrValContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_attrVal);
		try {
			setState(534);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				match(T__2);
				setState(521);
				expr();
				setState(522);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(524);
				expr();
				setState(525);
				match(T__7);
				setState(526);
				exprs();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(528);
				match(T__2);
				setState(529);
				expr();
				setState(530);
				match(T__7);
				setState(531);
				exprs();
				setState(532);
				match(T__3);
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

	public static class FunctionContext extends ParserRuleContext {
		public List<FunctionClauseContext> functionClause() {
			return getRuleContexts(FunctionClauseContext.class);
		}
		public FunctionClauseContext functionClause(int i) {
			return getRuleContext(FunctionClauseContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			functionClause();
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(537);
				match(T__10);
				setState(538);
				functionClause();
				}
				}
				setState(543);
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

	public static class FunctionClauseContext extends ParserRuleContext {
		public TokAtomContext tokAtom() {
			return getRuleContext(TokAtomContext.class,0);
		}
		public ClauseArgsContext clauseArgs() {
			return getRuleContext(ClauseArgsContext.class,0);
		}
		public ClauseGuardContext clauseGuard() {
			return getRuleContext(ClauseGuardContext.class,0);
		}
		public ClauseBodyContext clauseBody() {
			return getRuleContext(ClauseBodyContext.class,0);
		}
		public FunctionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFunctionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFunctionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitFunctionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionClauseContext functionClause() throws RecognitionException {
		FunctionClauseContext _localctx = new FunctionClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_functionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			tokAtom();
			setState(545);
			clauseArgs();
			setState(546);
			clauseGuard();
			setState(547);
			clauseBody();
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

	public static class ClauseArgsContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClauseArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauseArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterClauseArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitClauseArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitClauseArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseArgsContext clauseArgs() throws RecognitionException {
		ClauseArgsContext _localctx = new ClauseArgsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_clauseArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			argumentList();
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

	public static class ClauseGuardContext extends ParserRuleContext {
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public ClauseGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauseGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterClauseGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitClauseGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitClauseGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseGuardContext clauseGuard() throws RecognitionException {
		ClauseGuardContext _localctx = new ClauseGuardContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_clauseGuard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(551);
				match(T__11);
				setState(552);
				guard();
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

	public static class ClauseBodyContext extends ParserRuleContext {
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public ClauseBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clauseBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterClauseBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitClauseBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitClauseBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClauseBodyContext clauseBody() throws RecognitionException {
		ClauseBodyContext _localctx = new ClauseBodyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_clauseBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(T__19);
			setState(556);
			exprs();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr100Context expr100() {
			return getRuleContext(Expr100Context.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expr);
		try {
			setState(561);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				match(T__23);
				setState(559);
				expr();
				}
				break;
			case T__1:
			case T__2:
			case T__8:
			case T__14:
			case T__17:
			case T__18:
			case T__20:
			case T__28:
			case T__33:
			case T__34:
			case T__36:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case TokAtom:
			case TokVar:
			case TokFloat:
			case TokInteger:
			case TokChar:
			case TokString:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				expr100();
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

	public static class Expr100Context extends ParserRuleContext {
		public List<Expr150Context> expr150() {
			return getRuleContexts(Expr150Context.class);
		}
		public Expr150Context expr150(int i) {
			return getRuleContext(Expr150Context.class,i);
		}
		public Expr100Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr100; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr100(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr100(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr100(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr100Context expr100() throws RecognitionException {
		Expr100Context _localctx = new Expr100Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_expr100);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			expr150();
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24 || _la==T__25) {
				{
				{
				setState(564);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__25) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(565);
				expr150();
				}
				}
				setState(570);
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

	public static class Expr150Context extends ParserRuleContext {
		public List<Expr160Context> expr160() {
			return getRuleContexts(Expr160Context.class);
		}
		public Expr160Context expr160(int i) {
			return getRuleContext(Expr160Context.class,i);
		}
		public Expr150Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr150; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr150(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr150(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr150(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr150Context expr150() throws RecognitionException {
		Expr150Context _localctx = new Expr150Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_expr150);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			expr160();
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(572);
				match(T__26);
				setState(573);
				expr160();
				}
				}
				setState(578);
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

	public static class Expr160Context extends ParserRuleContext {
		public List<Expr200Context> expr200() {
			return getRuleContexts(Expr200Context.class);
		}
		public Expr200Context expr200(int i) {
			return getRuleContext(Expr200Context.class,i);
		}
		public Expr160Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr160; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr160(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr160(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr160(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr160Context expr160() throws RecognitionException {
		Expr160Context _localctx = new Expr160Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_expr160);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			expr200();
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(580);
				match(T__27);
				setState(581);
				expr200();
				}
				}
				setState(586);
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

	public static class Expr200Context extends ParserRuleContext {
		public List<Expr300Context> expr300() {
			return getRuleContexts(Expr300Context.class);
		}
		public Expr300Context expr300(int i) {
			return getRuleContext(Expr300Context.class,i);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public Expr200Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr200; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr200(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr200(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr200(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr200Context expr200() throws RecognitionException {
		Expr200Context _localctx = new Expr200Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_expr200);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			expr300();
			setState(591);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0)) {
				{
				setState(588);
				compOp();
				setState(589);
				expr300();
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

	public static class Expr300Context extends ParserRuleContext {
		public List<Expr400Context> expr400() {
			return getRuleContexts(Expr400Context.class);
		}
		public Expr400Context expr400(int i) {
			return getRuleContext(Expr400Context.class,i);
		}
		public List<ListOpContext> listOp() {
			return getRuleContexts(ListOpContext.class);
		}
		public ListOpContext listOp(int i) {
			return getRuleContext(ListOpContext.class,i);
		}
		public Expr300Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr300; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr300(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr300(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr300(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr300Context expr300() throws RecognitionException {
		Expr300Context _localctx = new Expr300Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_expr300);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			expr400();
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__52 || _la==T__53) {
				{
				{
				setState(594);
				listOp();
				setState(595);
				expr400();
				}
				}
				setState(601);
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

	public static class Expr400Context extends ParserRuleContext {
		public List<Expr500Context> expr500() {
			return getRuleContexts(Expr500Context.class);
		}
		public Expr500Context expr500(int i) {
			return getRuleContext(Expr500Context.class,i);
		}
		public List<AddOpContext> addOp() {
			return getRuleContexts(AddOpContext.class);
		}
		public AddOpContext addOp(int i) {
			return getRuleContext(AddOpContext.class,i);
		}
		public Expr400Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr400; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr400(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr400(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr400(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr400Context expr400() throws RecognitionException {
		Expr400Context _localctx = new Expr400Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_expr400);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			expr500();
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__39) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) {
				{
				{
				setState(603);
				addOp();
				setState(604);
				expr500();
				}
				}
				setState(610);
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

	public static class Expr500Context extends ParserRuleContext {
		public List<Expr600Context> expr600() {
			return getRuleContexts(Expr600Context.class);
		}
		public Expr600Context expr600(int i) {
			return getRuleContext(Expr600Context.class,i);
		}
		public List<MultOpContext> multOp() {
			return getRuleContexts(MultOpContext.class);
		}
		public MultOpContext multOp(int i) {
			return getRuleContext(MultOpContext.class,i);
		}
		public Expr500Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr500; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr500(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr500(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr500(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr500Context expr500() throws RecognitionException {
		Expr500Context _localctx = new Expr500Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_expr500);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			expr600();
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__22) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) {
				{
				{
				setState(612);
				multOp();
				setState(613);
				expr600();
				}
				}
				setState(619);
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

	public static class Expr600Context extends ParserRuleContext {
		public Expr700Context expr700() {
			return getRuleContext(Expr700Context.class,0);
		}
		public PrefixOpContext prefixOp() {
			return getRuleContext(PrefixOpContext.class,0);
		}
		public Expr600Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr600; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr600(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr600(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr600(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr600Context expr600() throws RecognitionException {
		Expr600Context _localctx = new Expr600Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_expr600);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) {
				{
				setState(620);
				prefixOp();
				}
			}

			setState(623);
			expr700();
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

	public static class Expr700Context extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public RecordExprContext recordExpr() {
			return getRuleContext(RecordExprContext.class,0);
		}
		public Expr800Context expr800() {
			return getRuleContext(Expr800Context.class,0);
		}
		public Expr700Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr700; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr700(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr700(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr700(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr700Context expr700() throws RecognitionException {
		Expr700Context _localctx = new Expr700Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_expr700);
		try {
			setState(628);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				recordExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(627);
				expr800();
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

	public static class Expr800Context extends ParserRuleContext {
		public List<ExprMaxContext> exprMax() {
			return getRuleContexts(ExprMaxContext.class);
		}
		public ExprMaxContext exprMax(int i) {
			return getRuleContext(ExprMaxContext.class,i);
		}
		public Expr800Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr800; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExpr800(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExpr800(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExpr800(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr800Context expr800() throws RecognitionException {
		Expr800Context _localctx = new Expr800Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_expr800);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			exprMax();
			setState(633);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(631);
				match(T__4);
				setState(632);
				exprMax();
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

	public static class ExprMaxContext extends ParserRuleContext {
		public TokVarContext tokVar() {
			return getRuleContext(TokVarContext.class,0);
		}
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public ListComprehensionContext listComprehension() {
			return getRuleContext(ListComprehensionContext.class,0);
		}
		public BinaryComprehensionContext binaryComprehension() {
			return getRuleContext(BinaryComprehensionContext.class,0);
		}
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public CaseExprContext caseExpr() {
			return getRuleContext(CaseExprContext.class,0);
		}
		public ReceiveExprContext receiveExpr() {
			return getRuleContext(ReceiveExprContext.class,0);
		}
		public FunExprContext funExpr() {
			return getRuleContext(FunExprContext.class,0);
		}
		public TryExprContext tryExpr() {
			return getRuleContext(TryExprContext.class,0);
		}
		public ExprMaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprMax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExprMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExprMax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExprMax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprMaxContext exprMax() throws RecognitionException {
		ExprMaxContext _localctx = new ExprMaxContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_exprMax);
		try {
			setState(655);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(635);
				tokVar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(636);
				atomic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
				list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(638);
				binary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(639);
				listComprehension();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(640);
				binaryComprehension();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(641);
				tuple();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(642);
				match(T__2);
				setState(643);
				expr();
				setState(644);
				match(T__3);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(646);
				match(T__28);
				setState(647);
				exprs();
				setState(648);
				match(T__29);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(650);
				ifExpr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(651);
				caseExpr();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(652);
				receiveExpr();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(653);
				funExpr();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(654);
				tryExpr();
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

	public static class ListContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_list);
		try {
			setState(663);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				match(T__14);
				setState(658);
				match(T__15);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				match(T__14);
				setState(660);
				expr();
				setState(661);
				tail();
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

	public static class TailContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public TailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TailContext tail() throws RecognitionException {
		TailContext _localctx = new TailContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_tail);
		try {
			setState(674);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				match(T__15);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(666);
				match(T__12);
				setState(667);
				expr();
				setState(668);
				match(T__15);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(670);
				match(T__7);
				setState(671);
				expr();
				setState(672);
				tail();
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

	public static class BinaryContext extends ParserRuleContext {
		public BinElementsContext binElements() {
			return getRuleContext(BinElementsContext.class,0);
		}
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_binary);
		try {
			setState(682);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				match(T__20);
				setState(677);
				match(T__21);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				match(T__20);
				setState(679);
				binElements();
				setState(680);
				match(T__21);
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

	public static class BinElementsContext extends ParserRuleContext {
		public List<BinElementContext> binElement() {
			return getRuleContexts(BinElementContext.class);
		}
		public BinElementContext binElement(int i) {
			return getRuleContext(BinElementContext.class,i);
		}
		public BinElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBinElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBinElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBinElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinElementsContext binElements() throws RecognitionException {
		BinElementsContext _localctx = new BinElementsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_binElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			binElement();
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(685);
				match(T__7);
				setState(686);
				binElement();
				}
				}
				setState(691);
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

	public static class BinElementContext extends ParserRuleContext {
		public BitExprContext bitExpr() {
			return getRuleContext(BitExprContext.class,0);
		}
		public OptBitSizeExprContext optBitSizeExpr() {
			return getRuleContext(OptBitSizeExprContext.class,0);
		}
		public OptBitTypeListContext optBitTypeList() {
			return getRuleContext(OptBitTypeListContext.class,0);
		}
		public BinElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBinElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBinElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBinElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinElementContext binElement() throws RecognitionException {
		BinElementContext _localctx = new BinElementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_binElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			bitExpr();
			setState(693);
			optBitSizeExpr();
			setState(694);
			optBitTypeList();
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

	public static class BitExprContext extends ParserRuleContext {
		public ExprMaxContext exprMax() {
			return getRuleContext(ExprMaxContext.class,0);
		}
		public PrefixOpContext prefixOp() {
			return getRuleContext(PrefixOpContext.class,0);
		}
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitExprContext bitExpr() throws RecognitionException {
		BitExprContext _localctx = new BitExprContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_bitExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) {
				{
				setState(696);
				prefixOp();
				}
			}

			setState(699);
			exprMax();
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

	public static class OptBitSizeExprContext extends ParserRuleContext {
		public BitSizeExprContext bitSizeExpr() {
			return getRuleContext(BitSizeExprContext.class,0);
		}
		public OptBitSizeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optBitSizeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterOptBitSizeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitOptBitSizeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitOptBitSizeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptBitSizeExprContext optBitSizeExpr() throws RecognitionException {
		OptBitSizeExprContext _localctx = new OptBitSizeExprContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_optBitSizeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(701);
				match(T__4);
				setState(702);
				bitSizeExpr();
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

	public static class OptBitTypeListContext extends ParserRuleContext {
		public BitTypeListContext bitTypeList() {
			return getRuleContext(BitTypeListContext.class,0);
		}
		public OptBitTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optBitTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterOptBitTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitOptBitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitOptBitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptBitTypeListContext optBitTypeList() throws RecognitionException {
		OptBitTypeListContext _localctx = new OptBitTypeListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_optBitTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(705);
				match(T__5);
				setState(706);
				bitTypeList();
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

	public static class BitTypeListContext extends ParserRuleContext {
		public List<BitTypeContext> bitType() {
			return getRuleContexts(BitTypeContext.class);
		}
		public BitTypeContext bitType(int i) {
			return getRuleContext(BitTypeContext.class,i);
		}
		public BitTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBitTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitTypeListContext bitTypeList() throws RecognitionException {
		BitTypeListContext _localctx = new BitTypeListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_bitTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			bitType();
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(710);
				match(T__1);
				setState(711);
				bitType();
				}
				}
				setState(716);
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

	public static class BitTypeContext extends ParserRuleContext {
		public TokAtomContext tokAtom() {
			return getRuleContext(TokAtomContext.class,0);
		}
		public TokIntegerContext tokInteger() {
			return getRuleContext(TokIntegerContext.class,0);
		}
		public BitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitTypeContext bitType() throws RecognitionException {
		BitTypeContext _localctx = new BitTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_bitType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			tokAtom();
			setState(720);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(718);
				match(T__4);
				setState(719);
				tokInteger();
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

	public static class BitSizeExprContext extends ParserRuleContext {
		public ExprMaxContext exprMax() {
			return getRuleContext(ExprMaxContext.class,0);
		}
		public BitSizeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitSizeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBitSizeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBitSizeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBitSizeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitSizeExprContext bitSizeExpr() throws RecognitionException {
		BitSizeExprContext _localctx = new BitSizeExprContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_bitSizeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			exprMax();
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

	public static class ListComprehensionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LcExprsContext lcExprs() {
			return getRuleContext(LcExprsContext.class,0);
		}
		public ListComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listComprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterListComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitListComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitListComprehension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListComprehensionContext listComprehension() throws RecognitionException {
		ListComprehensionContext _localctx = new ListComprehensionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_listComprehension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(T__14);
			setState(725);
			expr();
			setState(726);
			match(T__30);
			setState(727);
			lcExprs();
			setState(728);
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

	public static class BinaryComprehensionContext extends ParserRuleContext {
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public LcExprsContext lcExprs() {
			return getRuleContext(LcExprsContext.class,0);
		}
		public BinaryComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryComprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterBinaryComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitBinaryComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitBinaryComprehension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryComprehensionContext binaryComprehension() throws RecognitionException {
		BinaryComprehensionContext _localctx = new BinaryComprehensionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_binaryComprehension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(T__20);
			setState(731);
			binary();
			setState(732);
			match(T__30);
			setState(733);
			lcExprs();
			setState(734);
			match(T__21);
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

	public static class LcExprsContext extends ParserRuleContext {
		public List<LcExprContext> lcExpr() {
			return getRuleContexts(LcExprContext.class);
		}
		public LcExprContext lcExpr(int i) {
			return getRuleContext(LcExprContext.class,i);
		}
		public LcExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterLcExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitLcExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitLcExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LcExprsContext lcExprs() throws RecognitionException {
		LcExprsContext _localctx = new LcExprsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_lcExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			lcExpr();
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(737);
				match(T__7);
				setState(738);
				lcExpr();
				}
				}
				setState(743);
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

	public static class LcExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public LcExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterLcExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitLcExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitLcExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LcExprContext lcExpr() throws RecognitionException {
		LcExprContext _localctx = new LcExprContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_lcExpr);
		try {
			setState(753);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
				expr();
				setState(746);
				match(T__31);
				setState(747);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(749);
				binary();
				setState(750);
				match(T__32);
				setState(751);
				expr();
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

	public static class TupleContext extends ParserRuleContext {
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(T__8);
			setState(757);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__8) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__23) | (1L << T__28) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TokAtom - 64)) | (1L << (TokVar - 64)) | (1L << (TokFloat - 64)) | (1L << (TokInteger - 64)) | (1L << (TokChar - 64)) | (1L << (TokString - 64)))) != 0)) {
				{
				setState(756);
				exprs();
				}
			}

			setState(759);
			match(T__9);
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

	public static class RecordExprContext extends ParserRuleContext {
		public List<TokAtomContext> tokAtom() {
			return getRuleContexts(TokAtomContext.class);
		}
		public TokAtomContext tokAtom(int i) {
			return getRuleContext(TokAtomContext.class,i);
		}
		public RecordTupleContext recordTuple() {
			return getRuleContext(RecordTupleContext.class,0);
		}
		public ExprMaxContext exprMax() {
			return getRuleContext(ExprMaxContext.class,0);
		}
		public RecordExprContext recordExpr() {
			return getRuleContext(RecordExprContext.class,0);
		}
		public RecordExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterRecordExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitRecordExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitRecordExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordExprContext recordExpr() throws RecognitionException {
		return recordExpr(0);
	}

	private RecordExprContext recordExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RecordExprContext _localctx = new RecordExprContext(_ctx, _parentState);
		RecordExprContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_recordExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(763);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__14) | (1L << T__18) | (1L << T__20) | (1L << T__28) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TokAtom - 64)) | (1L << (TokVar - 64)) | (1L << (TokFloat - 64)) | (1L << (TokInteger - 64)) | (1L << (TokChar - 64)) | (1L << (TokString - 64)))) != 0)) {
				{
				setState(762);
				exprMax();
				}
			}

			setState(765);
			match(T__17);
			setState(766);
			tokAtom();
			setState(770);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(767);
				match(T__0);
				setState(768);
				tokAtom();
				}
				break;
			case T__8:
				{
				setState(769);
				recordTuple();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(782);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RecordExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_recordExpr);
					setState(772);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(773);
					match(T__17);
					setState(774);
					tokAtom();
					setState(778);
					switch (_input.LA(1)) {
					case T__0:
						{
						setState(775);
						match(T__0);
						setState(776);
						tokAtom();
						}
						break;
					case T__8:
						{
						setState(777);
						recordTuple();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(784);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	public static class RecordTupleContext extends ParserRuleContext {
		public RecordFieldsContext recordFields() {
			return getRuleContext(RecordFieldsContext.class,0);
		}
		public RecordTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterRecordTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitRecordTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitRecordTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordTupleContext recordTuple() throws RecognitionException {
		RecordTupleContext _localctx = new RecordTupleContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_recordTuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(T__8);
			setState(787);
			_la = _input.LA(1);
			if (_la==TokAtom || _la==TokVar) {
				{
				setState(786);
				recordFields();
				}
			}

			setState(789);
			match(T__9);
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

	public static class RecordFieldsContext extends ParserRuleContext {
		public List<RecordFieldContext> recordField() {
			return getRuleContexts(RecordFieldContext.class);
		}
		public RecordFieldContext recordField(int i) {
			return getRuleContext(RecordFieldContext.class,i);
		}
		public RecordFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordFields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterRecordFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitRecordFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitRecordFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordFieldsContext recordFields() throws RecognitionException {
		RecordFieldsContext _localctx = new RecordFieldsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_recordFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			recordField();
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(792);
				match(T__7);
				setState(793);
				recordField();
				}
				}
				setState(798);
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

	public static class RecordFieldContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TokVarContext tokVar() {
			return getRuleContext(TokVarContext.class,0);
		}
		public TokAtomContext tokAtom() {
			return getRuleContext(TokAtomContext.class,0);
		}
		public RecordFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterRecordField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitRecordField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitRecordField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordFieldContext recordField() throws RecognitionException {
		RecordFieldContext _localctx = new RecordFieldContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_recordField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			switch (_input.LA(1)) {
			case TokVar:
				{
				setState(799);
				tokVar();
				}
				break;
			case TokAtom:
				{
				setState(800);
				tokAtom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(803);
			match(T__24);
			setState(804);
			expr();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public Expr800Context expr800() {
			return getRuleContext(Expr800Context.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			expr800();
			setState(807);
			argumentList();
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

	public static class IfExprContext extends ParserRuleContext {
		public IfClausesContext ifClauses() {
			return getRuleContext(IfClausesContext.class,0);
		}
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitIfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			match(T__33);
			setState(810);
			ifClauses();
			setState(811);
			match(T__29);
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

	public static class IfClausesContext extends ParserRuleContext {
		public List<IfClauseContext> ifClause() {
			return getRuleContexts(IfClauseContext.class);
		}
		public IfClauseContext ifClause(int i) {
			return getRuleContext(IfClauseContext.class,i);
		}
		public IfClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterIfClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitIfClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitIfClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfClausesContext ifClauses() throws RecognitionException {
		IfClausesContext _localctx = new IfClausesContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_ifClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			ifClause();
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(814);
				match(T__10);
				setState(815);
				ifClause();
				}
				}
				setState(820);
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

	public static class IfClauseContext extends ParserRuleContext {
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public ClauseBodyContext clauseBody() {
			return getRuleContext(ClauseBodyContext.class,0);
		}
		public IfClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterIfClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitIfClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitIfClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfClauseContext ifClause() throws RecognitionException {
		IfClauseContext _localctx = new IfClauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_ifClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			guard();
			setState(822);
			clauseBody();
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

	public static class CaseExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CrClausesContext crClauses() {
			return getRuleContext(CrClausesContext.class,0);
		}
		public CaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterCaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitCaseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitCaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExprContext caseExpr() throws RecognitionException {
		CaseExprContext _localctx = new CaseExprContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_caseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(T__34);
			setState(825);
			expr();
			setState(826);
			match(T__35);
			setState(827);
			crClauses();
			setState(828);
			match(T__29);
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

	public static class CrClausesContext extends ParserRuleContext {
		public List<CrClauseContext> crClause() {
			return getRuleContexts(CrClauseContext.class);
		}
		public CrClauseContext crClause(int i) {
			return getRuleContext(CrClauseContext.class,i);
		}
		public CrClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterCrClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitCrClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitCrClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrClausesContext crClauses() throws RecognitionException {
		CrClausesContext _localctx = new CrClausesContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_crClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			crClause();
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(831);
				match(T__10);
				setState(832);
				crClause();
				}
				}
				setState(837);
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

	public static class CrClauseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ClauseGuardContext clauseGuard() {
			return getRuleContext(ClauseGuardContext.class,0);
		}
		public ClauseBodyContext clauseBody() {
			return getRuleContext(ClauseBodyContext.class,0);
		}
		public CrClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterCrClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitCrClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitCrClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrClauseContext crClause() throws RecognitionException {
		CrClauseContext _localctx = new CrClauseContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_crClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			expr();
			setState(839);
			clauseGuard();
			setState(840);
			clauseBody();
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

	public static class ReceiveExprContext extends ParserRuleContext {
		public CrClausesContext crClauses() {
			return getRuleContext(CrClausesContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ClauseBodyContext clauseBody() {
			return getRuleContext(ClauseBodyContext.class,0);
		}
		public ReceiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiveExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterReceiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitReceiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitReceiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiveExprContext receiveExpr() throws RecognitionException {
		ReceiveExprContext _localctx = new ReceiveExprContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_receiveExpr);
		try {
			setState(859);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				match(T__36);
				setState(843);
				crClauses();
				setState(844);
				match(T__29);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(846);
				match(T__36);
				setState(847);
				match(T__37);
				setState(848);
				expr();
				setState(849);
				clauseBody();
				setState(850);
				match(T__29);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(852);
				match(T__36);
				setState(853);
				crClauses();
				setState(854);
				match(T__37);
				setState(855);
				expr();
				setState(856);
				clauseBody();
				setState(857);
				match(T__29);
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

	public static class FunExprContext extends ParserRuleContext {
		public TokAtomContext tokAtom() {
			return getRuleContext(TokAtomContext.class,0);
		}
		public TokIntegerContext tokInteger() {
			return getRuleContext(TokIntegerContext.class,0);
		}
		public List<AtomOrVarContext> atomOrVar() {
			return getRuleContexts(AtomOrVarContext.class);
		}
		public AtomOrVarContext atomOrVar(int i) {
			return getRuleContext(AtomOrVarContext.class,i);
		}
		public IntegerOrVarContext integerOrVar() {
			return getRuleContext(IntegerOrVarContext.class,0);
		}
		public FunClausesContext funClauses() {
			return getRuleContext(FunClausesContext.class,0);
		}
		public FunExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFunExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFunExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitFunExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunExprContext funExpr() throws RecognitionException {
		FunExprContext _localctx = new FunExprContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_funExpr);
		try {
			setState(877);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(861);
				match(T__18);
				setState(862);
				tokAtom();
				setState(863);
				match(T__5);
				setState(864);
				tokInteger();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(866);
				match(T__18);
				setState(867);
				atomOrVar();
				setState(868);
				match(T__4);
				setState(869);
				atomOrVar();
				setState(870);
				match(T__5);
				setState(871);
				integerOrVar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(873);
				match(T__18);
				setState(874);
				funClauses();
				setState(875);
				match(T__29);
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

	public static class AtomOrVarContext extends ParserRuleContext {
		public TokAtomContext tokAtom() {
			return getRuleContext(TokAtomContext.class,0);
		}
		public TokVarContext tokVar() {
			return getRuleContext(TokVarContext.class,0);
		}
		public AtomOrVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomOrVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterAtomOrVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitAtomOrVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitAtomOrVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomOrVarContext atomOrVar() throws RecognitionException {
		AtomOrVarContext _localctx = new AtomOrVarContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_atomOrVar);
		try {
			setState(881);
			switch (_input.LA(1)) {
			case TokAtom:
				enterOuterAlt(_localctx, 1);
				{
				setState(879);
				tokAtom();
				}
				break;
			case TokVar:
				enterOuterAlt(_localctx, 2);
				{
				setState(880);
				tokVar();
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

	public static class IntegerOrVarContext extends ParserRuleContext {
		public TokIntegerContext tokInteger() {
			return getRuleContext(TokIntegerContext.class,0);
		}
		public TokVarContext tokVar() {
			return getRuleContext(TokVarContext.class,0);
		}
		public IntegerOrVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerOrVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterIntegerOrVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitIntegerOrVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitIntegerOrVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerOrVarContext integerOrVar() throws RecognitionException {
		IntegerOrVarContext _localctx = new IntegerOrVarContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_integerOrVar);
		try {
			setState(885);
			switch (_input.LA(1)) {
			case TokInteger:
				enterOuterAlt(_localctx, 1);
				{
				setState(883);
				tokInteger();
				}
				break;
			case TokVar:
				enterOuterAlt(_localctx, 2);
				{
				setState(884);
				tokVar();
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

	public static class FunClausesContext extends ParserRuleContext {
		public List<FunClauseContext> funClause() {
			return getRuleContexts(FunClauseContext.class);
		}
		public FunClauseContext funClause(int i) {
			return getRuleContext(FunClauseContext.class,i);
		}
		public FunClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFunClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFunClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitFunClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunClausesContext funClauses() throws RecognitionException {
		FunClausesContext _localctx = new FunClausesContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_funClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			funClause();
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(888);
				match(T__10);
				setState(889);
				funClause();
				}
				}
				setState(894);
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

	public static class FunClauseContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClauseGuardContext clauseGuard() {
			return getRuleContext(ClauseGuardContext.class,0);
		}
		public ClauseBodyContext clauseBody() {
			return getRuleContext(ClauseBodyContext.class,0);
		}
		public FunClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterFunClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitFunClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitFunClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunClauseContext funClause() throws RecognitionException {
		FunClauseContext _localctx = new FunClauseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_funClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			argumentList();
			setState(896);
			clauseGuard();
			setState(897);
			clauseBody();
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

	public static class TryExprContext extends ParserRuleContext {
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TryCatchContext tryCatch() {
			return getRuleContext(TryCatchContext.class,0);
		}
		public CrClausesContext crClauses() {
			return getRuleContext(CrClausesContext.class,0);
		}
		public TryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryExprContext tryExpr() throws RecognitionException {
		TryExprContext _localctx = new TryExprContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_tryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			match(T__38);
			setState(900);
			exprs();
			setState(903);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(901);
				match(T__35);
				setState(902);
				crClauses();
				}
			}

			setState(905);
			tryCatch();
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

	public static class TryCatchContext extends ParserRuleContext {
		public TryClausesContext tryClauses() {
			return getRuleContext(TryClausesContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TryCatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTryCatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTryCatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTryCatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchContext tryCatch() throws RecognitionException {
		TryCatchContext _localctx = new TryCatchContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_tryCatch);
		try {
			setState(921);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				match(T__23);
				setState(908);
				tryClauses();
				setState(909);
				match(T__29);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(911);
				match(T__23);
				setState(912);
				tryClauses();
				setState(913);
				match(T__37);
				setState(914);
				exprs();
				setState(915);
				match(T__29);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(917);
				match(T__37);
				setState(918);
				exprs();
				setState(919);
				match(T__29);
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

	public static class TryClausesContext extends ParserRuleContext {
		public List<TryClauseContext> tryClause() {
			return getRuleContexts(TryClauseContext.class);
		}
		public TryClauseContext tryClause(int i) {
			return getRuleContext(TryClauseContext.class,i);
		}
		public TryClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTryClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTryClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTryClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryClausesContext tryClauses() throws RecognitionException {
		TryClausesContext _localctx = new TryClausesContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_tryClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			tryClause();
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(924);
				match(T__10);
				setState(925);
				tryClause();
				}
				}
				setState(930);
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

	public static class TryClauseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ClauseGuardContext clauseGuard() {
			return getRuleContext(ClauseGuardContext.class,0);
		}
		public ClauseBodyContext clauseBody() {
			return getRuleContext(ClauseBodyContext.class,0);
		}
		public AtomOrVarContext atomOrVar() {
			return getRuleContext(AtomOrVarContext.class,0);
		}
		public TryClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterTryClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitTryClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitTryClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryClauseContext tryClause() throws RecognitionException {
		TryClauseContext _localctx = new TryClauseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_tryClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(931);
				atomOrVar();
				setState(932);
				match(T__4);
				}
				break;
			}
			setState(936);
			expr();
			setState(937);
			clauseGuard();
			setState(938);
			clauseBody();
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

	public static class ArgumentListContext extends ParserRuleContext {
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(T__2);
			setState(942);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__8) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__23) | (1L << T__28) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (TokAtom - 64)) | (1L << (TokVar - 64)) | (1L << (TokFloat - 64)) | (1L << (TokInteger - 64)) | (1L << (TokChar - 64)) | (1L << (TokString - 64)))) != 0)) {
				{
				setState(941);
				exprs();
				}
			}

			setState(944);
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

	public static class ExprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			expr();
			setState(951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(947);
				match(T__7);
				setState(948);
				expr();
				}
				}
				setState(953);
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

	public static class GuardContext extends ParserRuleContext {
		public List<ExprsContext> exprs() {
			return getRuleContexts(ExprsContext.class);
		}
		public ExprsContext exprs(int i) {
			return getRuleContext(ExprsContext.class,i);
		}
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_guard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			exprs();
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(955);
				match(T__10);
				setState(956);
				exprs();
				}
				}
				setState(961);
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

	public static class AtomicContext extends ParserRuleContext {
		public TokCharContext tokChar() {
			return getRuleContext(TokCharContext.class,0);
		}
		public TokIntegerContext tokInteger() {
			return getRuleContext(TokIntegerContext.class,0);
		}
		public TokFloatContext tokFloat() {
			return getRuleContext(TokFloatContext.class,0);
		}
		public TokAtomContext tokAtom() {
			return getRuleContext(TokAtomContext.class,0);
		}
		public List<TokStringContext> tokString() {
			return getRuleContexts(TokStringContext.class);
		}
		public TokStringContext tokString(int i) {
			return getRuleContext(TokStringContext.class,i);
		}
		public AtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterAtomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitAtomic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitAtomic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicContext atomic() throws RecognitionException {
		AtomicContext _localctx = new AtomicContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_atomic);
		int _la;
		try {
			setState(971);
			switch (_input.LA(1)) {
			case TokChar:
				enterOuterAlt(_localctx, 1);
				{
				setState(962);
				tokChar();
				}
				break;
			case TokInteger:
				enterOuterAlt(_localctx, 2);
				{
				setState(963);
				tokInteger();
				}
				break;
			case TokFloat:
				enterOuterAlt(_localctx, 3);
				{
				setState(964);
				tokFloat();
				}
				break;
			case TokAtom:
				enterOuterAlt(_localctx, 4);
				{
				setState(965);
				tokAtom();
				}
				break;
			case TokString:
				enterOuterAlt(_localctx, 5);
				{
				setState(967); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(966);
					tokString();
					}
					}
					setState(969); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TokString );
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

	public static class PrefixOpContext extends ParserRuleContext {
		public PrefixOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterPrefixOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitPrefixOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitPrefixOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixOpContext prefixOp() throws RecognitionException {
		PrefixOpContext _localctx = new PrefixOpContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_prefixOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class MultOpContext extends ParserRuleContext {
		public MultOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterMultOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitMultOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitMultOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultOpContext multOp() throws RecognitionException {
		MultOpContext _localctx = new MultOpContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__22) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class AddOpContext extends ParserRuleContext {
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitAddOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__39) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ListOpContext extends ParserRuleContext {
		public ListOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterListOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitListOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitListOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListOpContext listOp() throws RecognitionException {
		ListOpContext _localctx = new ListOpContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_listOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			_la = _input.LA(1);
			if ( !(_la==T__52 || _la==T__53) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class CompOpContext extends ParserRuleContext {
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitCompOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitCompOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class RuleClausesContext extends ParserRuleContext {
		public List<RuleClauseContext> ruleClause() {
			return getRuleContexts(RuleClauseContext.class);
		}
		public RuleClauseContext ruleClause(int i) {
			return getRuleContext(RuleClauseContext.class,i);
		}
		public RuleClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterRuleClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitRuleClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitRuleClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleClausesContext ruleClauses() throws RecognitionException {
		RuleClausesContext _localctx = new RuleClausesContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_ruleClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			ruleClause();
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(984);
				match(T__10);
				setState(985);
				ruleClause();
				}
				}
				setState(990);
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

	public static class RuleClauseContext extends ParserRuleContext {
		public TokAtomContext tokAtom() {
			return getRuleContext(TokAtomContext.class,0);
		}
		public ClauseArgsContext clauseArgs() {
			return getRuleContext(ClauseArgsContext.class,0);
		}
		public ClauseGuardContext clauseGuard() {
			return getRuleContext(ClauseGuardContext.class,0);
		}
		public RuleBodyContext ruleBody() {
			return getRuleContext(RuleBodyContext.class,0);
		}
		public RuleClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterRuleClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitRuleClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitRuleClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleClauseContext ruleClause() throws RecognitionException {
		RuleClauseContext _localctx = new RuleClauseContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_ruleClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			tokAtom();
			setState(992);
			clauseArgs();
			setState(993);
			clauseGuard();
			setState(994);
			ruleBody();
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

	public static class RuleBodyContext extends ParserRuleContext {
		public LcExprsContext lcExprs() {
			return getRuleContext(LcExprsContext.class,0);
		}
		public RuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).enterRuleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErlangListener ) ((ErlangListener)listener).exitRuleBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErlangVisitor ) return ((ErlangVisitor<? extends T>)visitor).visitRuleBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleBodyContext ruleBody() throws RecognitionException {
		RuleBodyContext _localctx = new RuleBodyContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_ruleBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			match(T__62);
			setState(997);
			lcExprs();
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
		case 23:
			return type300_sempred((Type300Context)_localctx, predIndex);
		case 24:
			return type400_sempred((Type400Context)_localctx, predIndex);
		case 68:
			return recordExpr_sempred((RecordExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type300_sempred(Type300Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean type400_sempred(Type400Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean recordExpr_sempred(RecordExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3J\u03ea\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\3\2\6\2\u00ce\n\2\r\2\16\2\u00cf"+
		"\3\2\3\2\3\3\3\3\3\3\5\3\u00d7\n\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00f7\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u0101\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u0114\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u011e\n"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u0131\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\7\21\u013a\n\21\f\21\16\21\u013d\13\21\3\22\3\22\3\22\5\22\u0142\n\22"+
		"\3\23\3\23\3\23\7\23\u0147\n\23\f\23\16\23\u014a\13\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0155\n\24\3\25\3\25\3\25\7\25\u015a"+
		"\n\25\f\25\16\25\u015d\13\25\3\26\3\26\3\26\5\26\u0162\n\26\3\26\3\26"+
		"\3\27\3\27\3\27\5\27\u0169\n\27\3\30\3\30\3\30\5\30\u016e\n\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\7\31\u0177\n\31\f\31\16\31\u017a\13\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0183\n\32\f\32\16\32\u0186\13"+
		"\32\3\33\5\33\u0189\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u01d0\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u01d8\n\35\3\36\3\36\5\36\u01dc\n\36\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\7\37\u01e5\n\37\f\37\16\37\u01e8\13\37\3 \3 \3 \3 \3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01fe\n!\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0219\n$\3"+
		"%\3%\3%\7%\u021e\n%\f%\16%\u0221\13%\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\5(\u022c"+
		"\n(\3)\3)\3)\3*\3*\3*\5*\u0234\n*\3+\3+\3+\7+\u0239\n+\f+\16+\u023c\13"+
		"+\3,\3,\3,\7,\u0241\n,\f,\16,\u0244\13,\3-\3-\3-\7-\u0249\n-\f-\16-\u024c"+
		"\13-\3.\3.\3.\3.\5.\u0252\n.\3/\3/\3/\3/\7/\u0258\n/\f/\16/\u025b\13/"+
		"\3\60\3\60\3\60\3\60\7\60\u0261\n\60\f\60\16\60\u0264\13\60\3\61\3\61"+
		"\3\61\3\61\7\61\u026a\n\61\f\61\16\61\u026d\13\61\3\62\5\62\u0270\n\62"+
		"\3\62\3\62\3\63\3\63\3\63\5\63\u0277\n\63\3\64\3\64\3\64\5\64\u027c\n"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0292\n\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\5\66\u029a\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\5\67\u02a5\n\67\38\38\38\38\38\38\58\u02ad\n8\39\39\39\79\u02b2\n9\f"+
		"9\169\u02b5\139\3:\3:\3:\3:\3;\5;\u02bc\n;\3;\3;\3<\3<\5<\u02c2\n<\3="+
		"\3=\5=\u02c6\n=\3>\3>\3>\7>\u02cb\n>\f>\16>\u02ce\13>\3?\3?\3?\5?\u02d3"+
		"\n?\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3C\3C\3C\7C\u02e6\nC\fC"+
		"\16C\u02e9\13C\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u02f4\nD\3E\3E\5E\u02f8\n"+
		"E\3E\3E\3F\3F\5F\u02fe\nF\3F\3F\3F\3F\3F\5F\u0305\nF\3F\3F\3F\3F\3F\3"+
		"F\5F\u030d\nF\7F\u030f\nF\fF\16F\u0312\13F\3G\3G\5G\u0316\nG\3G\3G\3H"+
		"\3H\3H\7H\u031d\nH\fH\16H\u0320\13H\3I\3I\5I\u0324\nI\3I\3I\3I\3J\3J\3"+
		"J\3K\3K\3K\3K\3L\3L\3L\7L\u0333\nL\fL\16L\u0336\13L\3M\3M\3M\3N\3N\3N"+
		"\3N\3N\3N\3O\3O\3O\7O\u0344\nO\fO\16O\u0347\13O\3P\3P\3P\3P\3Q\3Q\3Q\3"+
		"Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u035e\nQ\3R\3R\3R\3R\3R\3"+
		"R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0370\nR\3S\3S\5S\u0374\nS\3T\3T\5"+
		"T\u0378\nT\3U\3U\3U\7U\u037d\nU\fU\16U\u0380\13U\3V\3V\3V\3V\3W\3W\3W"+
		"\3W\5W\u038a\nW\3W\3W\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u039c"+
		"\nX\3Y\3Y\3Y\7Y\u03a1\nY\fY\16Y\u03a4\13Y\3Z\3Z\3Z\5Z\u03a9\nZ\3Z\3Z\3"+
		"Z\3Z\3[\3[\5[\u03b1\n[\3[\3[\3\\\3\\\3\\\7\\\u03b8\n\\\f\\\16\\\u03bb"+
		"\13\\\3]\3]\3]\7]\u03c0\n]\f]\16]\u03c3\13]\3^\3^\3^\3^\3^\6^\u03ca\n"+
		"^\r^\16^\u03cb\5^\u03ce\n^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3d\7d\u03dd"+
		"\nd\fd\16d\u03e0\13d\3e\3e\3e\3e\3e\3f\3f\3f\3f\2\5\60\62\u008ag\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\2\b\3\2\33\34\4\2\4\4*,\5\2\b\b\31"+
		"\31-\60\5\2\4\4**\61\66\3\2\678\3\29@\u03fe\2\u00cd\3\2\2\2\4\u00d6\3"+
		"\2\2\2\6\u00da\3\2\2\2\b\u00dc\3\2\2\2\n\u00de\3\2\2\2\f\u00e0\3\2\2\2"+
		"\16\u00e2\3\2\2\2\20\u00e4\3\2\2\2\22\u00f6\3\2\2\2\24\u0100\3\2\2\2\26"+
		"\u0113\3\2\2\2\30\u011d\3\2\2\2\32\u011f\3\2\2\2\34\u0130\3\2\2\2\36\u0132"+
		"\3\2\2\2 \u0136\3\2\2\2\"\u013e\3\2\2\2$\u0143\3\2\2\2&\u0154\3\2\2\2"+
		"(\u0156\3\2\2\2*\u0161\3\2\2\2,\u0165\3\2\2\2.\u016a\3\2\2\2\60\u016f"+
		"\3\2\2\2\62\u017b\3\2\2\2\64\u0188\3\2\2\2\66\u01cf\3\2\2\28\u01d7\3\2"+
		"\2\2:\u01d9\3\2\2\2<\u01e1\3\2\2\2>\u01e9\3\2\2\2@\u01fd\3\2\2\2B\u01ff"+
		"\3\2\2\2D\u0203\3\2\2\2F\u0218\3\2\2\2H\u021a\3\2\2\2J\u0222\3\2\2\2L"+
		"\u0227\3\2\2\2N\u022b\3\2\2\2P\u022d\3\2\2\2R\u0233\3\2\2\2T\u0235\3\2"+
		"\2\2V\u023d\3\2\2\2X\u0245\3\2\2\2Z\u024d\3\2\2\2\\\u0253\3\2\2\2^\u025c"+
		"\3\2\2\2`\u0265\3\2\2\2b\u026f\3\2\2\2d\u0276\3\2\2\2f\u0278\3\2\2\2h"+
		"\u0291\3\2\2\2j\u0299\3\2\2\2l\u02a4\3\2\2\2n\u02ac\3\2\2\2p\u02ae\3\2"+
		"\2\2r\u02b6\3\2\2\2t\u02bb\3\2\2\2v\u02c1\3\2\2\2x\u02c5\3\2\2\2z\u02c7"+
		"\3\2\2\2|\u02cf\3\2\2\2~\u02d4\3\2\2\2\u0080\u02d6\3\2\2\2\u0082\u02dc"+
		"\3\2\2\2\u0084\u02e2\3\2\2\2\u0086\u02f3\3\2\2\2\u0088\u02f5\3\2\2\2\u008a"+
		"\u02fb\3\2\2\2\u008c\u0313\3\2\2\2\u008e\u0319\3\2\2\2\u0090\u0323\3\2"+
		"\2\2\u0092\u0328\3\2\2\2\u0094\u032b\3\2\2\2\u0096\u032f\3\2\2\2\u0098"+
		"\u0337\3\2\2\2\u009a\u033a\3\2\2\2\u009c\u0340\3\2\2\2\u009e\u0348\3\2"+
		"\2\2\u00a0\u035d\3\2\2\2\u00a2\u036f\3\2\2\2\u00a4\u0373\3\2\2\2\u00a6"+
		"\u0377\3\2\2\2\u00a8\u0379\3\2\2\2\u00aa\u0381\3\2\2\2\u00ac\u0385\3\2"+
		"\2\2\u00ae\u039b\3\2\2\2\u00b0\u039d\3\2\2\2\u00b2\u03a8\3\2\2\2\u00b4"+
		"\u03ae\3\2\2\2\u00b6\u03b4\3\2\2\2\u00b8\u03bc\3\2\2\2\u00ba\u03cd\3\2"+
		"\2\2\u00bc\u03cf\3\2\2\2\u00be\u03d1\3\2\2\2\u00c0\u03d3\3\2\2\2\u00c2"+
		"\u03d5\3\2\2\2\u00c4\u03d7\3\2\2\2\u00c6\u03d9\3\2\2\2\u00c8\u03e1\3\2"+
		"\2\2\u00ca\u03e6\3\2\2\2\u00cc\u00ce\5\4\3\2\u00cd\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d2\7\2\2\3\u00d2\3\3\2\2\2\u00d3\u00d7\5\22\n\2\u00d4\u00d7"+
		"\5H%\2\u00d5\u00d7\5\u00c6d\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2"+
		"\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7\3\2\2\u00d9\5\3"+
		"\2\2\2\u00da\u00db\7B\2\2\u00db\7\3\2\2\2\u00dc\u00dd\7C\2\2\u00dd\t\3"+
		"\2\2\2\u00de\u00df\7D\2\2\u00df\13\3\2\2\2\u00e0\u00e1\7E\2\2\u00e1\r"+
		"\3\2\2\2\u00e2\u00e3\7F\2\2\u00e3\17\3\2\2\2\u00e4\u00e5\7G\2\2\u00e5"+
		"\21\3\2\2\2\u00e6\u00e7\7\4\2\2\u00e7\u00e8\5\6\4\2\u00e8\u00e9\5F$\2"+
		"\u00e9\u00f7\3\2\2\2\u00ea\u00eb\7\4\2\2\u00eb\u00ec\5\6\4\2\u00ec\u00ed"+
		"\5\30\r\2\u00ed\u00f7\3\2\2\2\u00ee\u00ef\7\4\2\2\u00ef\u00f0\5\6\4\2"+
		"\u00f0\u00f1\7\5\2\2\u00f1\u00f2\5\30\r\2\u00f2\u00f3\7\6\2\2\u00f3\u00f7"+
		"\3\2\2\2\u00f4\u00f5\7H\2\2\u00f5\u00f7\5\24\13\2\u00f6\u00e6\3\2\2\2"+
		"\u00f6\u00ea\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\23"+
		"\3\2\2\2\u00f8\u00f9\5\26\f\2\u00f9\u00fa\5 \21\2\u00fa\u0101\3\2\2\2"+
		"\u00fb\u00fc\7\5\2\2\u00fc\u00fd\5\26\f\2\u00fd\u00fe\5 \21\2\u00fe\u00ff"+
		"\7\6\2\2\u00ff\u0101\3\2\2\2\u0100\u00f8\3\2\2\2\u0100\u00fb\3\2\2\2\u0101"+
		"\25\3\2\2\2\u0102\u0114\5\6\4\2\u0103\u0104\5\6\4\2\u0104\u0105\7\7\2"+
		"\2\u0105\u0106\5\6\4\2\u0106\u0114\3\2\2\2\u0107\u0108\5\6\4\2\u0108\u0109"+
		"\7\b\2\2\u0109\u010a\5\f\7\2\u010a\u010b\7\t\2\2\u010b\u0114\3\2\2\2\u010c"+
		"\u010d\5\6\4\2\u010d\u010e\7\7\2\2\u010e\u010f\5\6\4\2\u010f\u0110\7\b"+
		"\2\2\u0110\u0111\5\f\7\2\u0111\u0112\7\t\2\2\u0112\u0114\3\2\2\2\u0113"+
		"\u0102\3\2\2\2\u0113\u0103\3\2\2\2\u0113\u0107\3\2\2\2\u0113\u010c\3\2"+
		"\2\2\u0114\27\3\2\2\2\u0115\u0116\5R*\2\u0116\u0117\7\n\2\2\u0117\u0118"+
		"\5\32\16\2\u0118\u011e\3\2\2\2\u0119\u011a\5R*\2\u011a\u011b\7\t\2\2\u011b"+
		"\u011c\5*\26\2\u011c\u011e\3\2\2\2\u011d\u0115\3\2\2\2\u011d\u0119\3\2"+
		"\2\2\u011e\31\3\2\2\2\u011f\u0120\7\13\2\2\u0120\u0121\5\34\17\2\u0121"+
		"\u0122\7\f\2\2\u0122\33\3\2\2\2\u0123\u0131\5\36\20\2\u0124\u0125\5\36"+
		"\20\2\u0125\u0126\7\n\2\2\u0126\u0127\5\34\17\2\u0127\u0131\3\2\2\2\u0128"+
		"\u0129\5R*\2\u0129\u012a\7\n\2\2\u012a\u012b\5\34\17\2\u012b\u0131\3\2"+
		"\2\2\u012c\u012d\5\36\20\2\u012d\u012e\7\n\2\2\u012e\u012f\5\u00b6\\\2"+
		"\u012f\u0131\3\2\2\2\u0130\u0123\3\2\2\2\u0130\u0124\3\2\2\2\u0130\u0128"+
		"\3\2\2\2\u0130\u012c\3\2\2\2\u0131\35\3\2\2\2\u0132\u0133\5R*\2\u0133"+
		"\u0134\7\t\2\2\u0134\u0135\5*\26\2\u0135\37\3\2\2\2\u0136\u013b\5\"\22"+
		"\2\u0137\u0138\7\r\2\2\u0138\u013a\5\"\22\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c!\3\2\2\2"+
		"\u013d\u013b\3\2\2\2\u013e\u0141\5:\36\2\u013f\u0140\7\16\2\2\u0140\u0142"+
		"\5$\23\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142#\3\2\2\2\u0143"+
		"\u0148\5&\24\2\u0144\u0145\7\n\2\2\u0145\u0147\5&\24\2\u0146\u0144\3\2"+
		"\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"%\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\5\6\4\2\u014c\u014d\7\5\2\2"+
		"\u014d\u014e\5(\25\2\u014e\u014f\7\6\2\2\u014f\u0155\3\2\2\2\u0150\u0151"+
		"\5\b\5\2\u0151\u0152\7\t\2\2\u0152\u0153\5*\26\2\u0153\u0155\3\2\2\2\u0154"+
		"\u014b\3\2\2\2\u0154\u0150\3\2\2\2\u0155\'\3\2\2\2\u0156\u015b\5*\26\2"+
		"\u0157\u0158\7\n\2\2\u0158\u015a\5*\26\2\u0159\u0157\3\2\2\2\u015a\u015d"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c)\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e\u015f\5\b\5\2\u015f\u0160\7\t\2\2\u0160\u0162\3\2"+
		"\2\2\u0161\u015e\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0164\5,\27\2\u0164+\3\2\2\2\u0165\u0168\5.\30\2\u0166\u0167\7\17\2\2"+
		"\u0167\u0169\5,\27\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169-\3"+
		"\2\2\2\u016a\u016d\5\60\31\2\u016b\u016c\7\20\2\2\u016c\u016e\5\60\31"+
		"\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e/\3\2\2\2\u016f\u0170"+
		"\b\31\1\2\u0170\u0171\5\62\32\2\u0171\u0178\3\2\2\2\u0172\u0173\f\4\2"+
		"\2\u0173\u0174\5\u00c0a\2\u0174\u0175\5\62\32\2\u0175\u0177\3\2\2\2\u0176"+
		"\u0172\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179\61\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\b\32\1\2\u017c\u017d"+
		"\5\64\33\2\u017d\u0184\3\2\2\2\u017e\u017f\f\4\2\2\u017f\u0180\5\u00be"+
		"`\2\u0180\u0181\5\64\33\2\u0181\u0183\3\2\2\2\u0182\u017e\3\2\2\2\u0183"+
		"\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\63\3\2\2"+
		"\2\u0186\u0184\3\2\2\2\u0187\u0189\5\u00bc_\2\u0188\u0187\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\5\66\34\2\u018b\65\3\2"+
		"\2\2\u018c\u018d\7\5\2\2\u018d\u018e\5*\26\2\u018e\u018f\7\6\2\2\u018f"+
		"\u01d0\3\2\2\2\u0190\u01d0\5\b\5\2\u0191\u01d0\5\6\4\2\u0192\u0193\5\6"+
		"\4\2\u0193\u0194\7\5\2\2\u0194\u0195\7\6\2\2\u0195\u01d0\3\2\2\2\u0196"+
		"\u0197\5\6\4\2\u0197\u0198\7\5\2\2\u0198\u0199\5(\25\2\u0199\u019a\7\6"+
		"\2\2\u019a\u01d0\3\2\2\2\u019b\u019c\5\6\4\2\u019c\u019d\7\7\2\2\u019d"+
		"\u019e\5\6\4\2\u019e\u019f\7\5\2\2\u019f\u01a0\7\6\2\2\u01a0\u01d0\3\2"+
		"\2\2\u01a1\u01a2\5\6\4\2\u01a2\u01a3\7\7\2\2\u01a3\u01a4\5\6\4\2\u01a4"+
		"\u01a5\7\5\2\2\u01a5\u01a6\5(\25\2\u01a6\u01a7\7\6\2\2\u01a7\u01d0\3\2"+
		"\2\2\u01a8\u01a9\7\21\2\2\u01a9\u01d0\7\22\2\2\u01aa\u01ab\7\21\2\2\u01ab"+
		"\u01ac\5*\26\2\u01ac\u01ad\7\22\2\2\u01ad\u01d0\3\2\2\2\u01ae\u01af\7"+
		"\21\2\2\u01af\u01b0\5*\26\2\u01b0\u01b1\7\n\2\2\u01b1\u01b2\7\23\2\2\u01b2"+
		"\u01b3\7\22\2\2\u01b3\u01d0\3\2\2\2\u01b4\u01b5\7\13\2\2\u01b5\u01d0\7"+
		"\f\2\2\u01b6\u01b7\7\13\2\2\u01b7\u01b8\5(\25\2\u01b8\u01b9\7\f\2\2\u01b9"+
		"\u01d0\3\2\2\2\u01ba\u01bb\7\24\2\2\u01bb\u01bc\5\6\4\2\u01bc\u01bd\7"+
		"\13\2\2\u01bd\u01be\7\f\2\2\u01be\u01d0\3\2\2\2\u01bf\u01c0\7\24\2\2\u01c0"+
		"\u01c1\5\6\4\2\u01c1\u01c2\7\13\2\2\u01c2\u01c3\5<\37\2\u01c3\u01c4\7"+
		"\f\2\2\u01c4\u01d0\3\2\2\2\u01c5\u01d0\5@!\2\u01c6\u01d0\5\f\7\2\u01c7"+
		"\u01c8\7\25\2\2\u01c8\u01c9\7\5\2\2\u01c9\u01d0\7\6\2\2\u01ca\u01cb\7"+
		"\25\2\2\u01cb\u01cc\7\5\2\2\u01cc\u01cd\58\35\2\u01cd\u01ce\7\6\2\2\u01ce"+
		"\u01d0\3\2\2\2\u01cf\u018c\3\2\2\2\u01cf\u0190\3\2\2\2\u01cf\u0191\3\2"+
		"\2\2\u01cf\u0192\3\2\2\2\u01cf\u0196\3\2\2\2\u01cf\u019b\3\2\2\2\u01cf"+
		"\u01a1\3\2\2\2\u01cf\u01a8\3\2\2\2\u01cf\u01aa\3\2\2\2\u01cf\u01ae\3\2"+
		"\2\2\u01cf\u01b4\3\2\2\2\u01cf\u01b6\3\2\2\2\u01cf\u01ba\3\2\2\2\u01cf"+
		"\u01bf\3\2\2\2\u01cf\u01c5\3\2\2\2\u01cf\u01c6\3\2\2\2\u01cf\u01c7\3\2"+
		"\2\2\u01cf\u01ca\3\2\2\2\u01d0\67\3\2\2\2\u01d1\u01d2\7\5\2\2\u01d2\u01d3"+
		"\7\23\2\2\u01d3\u01d4\7\6\2\2\u01d4\u01d5\7\26\2\2\u01d5\u01d8\5*\26\2"+
		"\u01d6\u01d8\5:\36\2\u01d7\u01d1\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d89\3"+
		"\2\2\2\u01d9\u01db\7\5\2\2\u01da\u01dc\5(\25\2\u01db\u01da\3\2\2\2\u01db"+
		"\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\7\6\2\2\u01de\u01df\7\26"+
		"\2\2\u01df\u01e0\5*\26\2\u01e0;\3\2\2\2\u01e1\u01e6\5> \2\u01e2\u01e3"+
		"\7\n\2\2\u01e3\u01e5\5> \2\u01e4\u01e2\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7=\3\2\2\2\u01e8\u01e6\3\2\2\2"+
		"\u01e9\u01ea\5\6\4\2\u01ea\u01eb\7\t\2\2\u01eb\u01ec\5*\26\2\u01ec?\3"+
		"\2\2\2\u01ed\u01ee\7\27\2\2\u01ee\u01fe\7\30\2\2\u01ef\u01f0\7\27\2\2"+
		"\u01f0\u01f1\5B\"\2\u01f1\u01f2\7\30\2\2\u01f2\u01fe\3\2\2\2\u01f3\u01f4"+
		"\7\27\2\2\u01f4\u01f5\5D#\2\u01f5\u01f6\7\30\2\2\u01f6\u01fe\3\2\2\2\u01f7"+
		"\u01f8\7\27\2\2\u01f8\u01f9\5B\"\2\u01f9\u01fa\7\n\2\2\u01fa\u01fb\5D"+
		"#\2\u01fb\u01fc\7\30\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01ed\3\2\2\2\u01fd"+
		"\u01ef\3\2\2\2\u01fd\u01f3\3\2\2\2\u01fd\u01f7\3\2\2\2\u01feA\3\2\2\2"+
		"\u01ff\u0200\5\b\5\2\u0200\u0201\7\7\2\2\u0201\u0202\5\66\34\2\u0202C"+
		"\3\2\2\2\u0203\u0204\5\b\5\2\u0204\u0205\7\7\2\2\u0205\u0206\5\b\5\2\u0206"+
		"\u0207\7\31\2\2\u0207\u0208\5\66\34\2\u0208E\3\2\2\2\u0209\u0219\5R*\2"+
		"\u020a\u020b\7\5\2\2\u020b\u020c\5R*\2\u020c\u020d\7\6\2\2\u020d\u0219"+
		"\3\2\2\2\u020e\u020f\5R*\2\u020f\u0210\7\n\2\2\u0210\u0211\5\u00b6\\\2"+
		"\u0211\u0219\3\2\2\2\u0212\u0213\7\5\2\2\u0213\u0214\5R*\2\u0214\u0215"+
		"\7\n\2\2\u0215\u0216\5\u00b6\\\2\u0216\u0217\7\6\2\2\u0217\u0219\3\2\2"+
		"\2\u0218\u0209\3\2\2\2\u0218\u020a\3\2\2\2\u0218\u020e\3\2\2\2\u0218\u0212"+
		"\3\2\2\2\u0219G\3\2\2\2\u021a\u021f\5J&\2\u021b\u021c\7\r\2\2\u021c\u021e"+
		"\5J&\2\u021d\u021b\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220I\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0223\5\6\4\2"+
		"\u0223\u0224\5L\'\2\u0224\u0225\5N(\2\u0225\u0226\5P)\2\u0226K\3\2\2\2"+
		"\u0227\u0228\5\u00b4[\2\u0228M\3\2\2\2\u0229\u022a\7\16\2\2\u022a\u022c"+
		"\5\u00b8]\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022cO\3\2\2\2\u022d"+
		"\u022e\7\26\2\2\u022e\u022f\5\u00b6\\\2\u022fQ\3\2\2\2\u0230\u0231\7\32"+
		"\2\2\u0231\u0234\5R*\2\u0232\u0234\5T+\2\u0233\u0230\3\2\2\2\u0233\u0232"+
		"\3\2\2\2\u0234S\3\2\2\2\u0235\u023a\5V,\2\u0236\u0237\t\2\2\2\u0237\u0239"+
		"\5V,\2\u0238\u0236\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023bU\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u0242\5X-\2\u023e"+
		"\u023f\7\35\2\2\u023f\u0241\5X-\2\u0240\u023e\3\2\2\2\u0241\u0244\3\2"+
		"\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243W\3\2\2\2\u0244\u0242"+
		"\3\2\2\2\u0245\u024a\5Z.\2\u0246\u0247\7\36\2\2\u0247\u0249\5Z.\2\u0248"+
		"\u0246\3\2\2\2\u0249\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2"+
		"\2\2\u024bY\3\2\2\2\u024c\u024a\3\2\2\2\u024d\u0251\5\\/\2\u024e\u024f"+
		"\5\u00c4c\2\u024f\u0250\5\\/\2\u0250\u0252\3\2\2\2\u0251\u024e\3\2\2\2"+
		"\u0251\u0252\3\2\2\2\u0252[\3\2\2\2\u0253\u0259\5^\60\2\u0254\u0255\5"+
		"\u00c2b\2\u0255\u0256\5^\60\2\u0256\u0258\3\2\2\2\u0257\u0254\3\2\2\2"+
		"\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a]\3"+
		"\2\2\2\u025b\u0259\3\2\2\2\u025c\u0262\5`\61\2\u025d\u025e\5\u00c0a\2"+
		"\u025e\u025f\5`\61\2\u025f\u0261\3\2\2\2\u0260\u025d\3\2\2\2\u0261\u0264"+
		"\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263_\3\2\2\2\u0264"+
		"\u0262\3\2\2\2\u0265\u026b\5b\62\2\u0266\u0267\5\u00be`\2\u0267\u0268"+
		"\5b\62\2\u0268\u026a\3\2\2\2\u0269\u0266\3\2\2\2\u026a\u026d\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026ca\3\2\2\2\u026d\u026b\3\2\2\2"+
		"\u026e\u0270\5\u00bc_\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270"+
		"\u0271\3\2\2\2\u0271\u0272\5d\63\2\u0272c\3\2\2\2\u0273\u0277\5\u0092"+
		"J\2\u0274\u0277\5\u008aF\2\u0275\u0277\5f\64\2\u0276\u0273\3\2\2\2\u0276"+
		"\u0274\3\2\2\2\u0276\u0275\3\2\2\2\u0277e\3\2\2\2\u0278\u027b\5h\65\2"+
		"\u0279\u027a\7\7\2\2\u027a\u027c\5h\65\2\u027b\u0279\3\2\2\2\u027b\u027c"+
		"\3\2\2\2\u027cg\3\2\2\2\u027d\u0292\5\b\5\2\u027e\u0292\5\u00ba^\2\u027f"+
		"\u0292\5j\66\2\u0280\u0292\5n8\2\u0281\u0292\5\u0080A\2\u0282\u0292\5"+
		"\u0082B\2\u0283\u0292\5\u0088E\2\u0284\u0285\7\5\2\2\u0285\u0286\5R*\2"+
		"\u0286\u0287\7\6\2\2\u0287\u0292\3\2\2\2\u0288\u0289\7\37\2\2\u0289\u028a"+
		"\5\u00b6\\\2\u028a\u028b\7 \2\2\u028b\u0292\3\2\2\2\u028c\u0292\5\u0094"+
		"K\2\u028d\u0292\5\u009aN\2\u028e\u0292\5\u00a0Q\2\u028f\u0292\5\u00a2"+
		"R\2\u0290\u0292\5\u00acW\2\u0291\u027d\3\2\2\2\u0291\u027e\3\2\2\2\u0291"+
		"\u027f\3\2\2\2\u0291\u0280\3\2\2\2\u0291\u0281\3\2\2\2\u0291\u0282\3\2"+
		"\2\2\u0291\u0283\3\2\2\2\u0291\u0284\3\2\2\2\u0291\u0288\3\2\2\2\u0291"+
		"\u028c\3\2\2\2\u0291\u028d\3\2\2\2\u0291\u028e\3\2\2\2\u0291\u028f\3\2"+
		"\2\2\u0291\u0290\3\2\2\2\u0292i\3\2\2\2\u0293\u0294\7\21\2\2\u0294\u029a"+
		"\7\22\2\2\u0295\u0296\7\21\2\2\u0296\u0297\5R*\2\u0297\u0298\5l\67\2\u0298"+
		"\u029a\3\2\2\2\u0299\u0293\3\2\2\2\u0299\u0295\3\2\2\2\u029ak\3\2\2\2"+
		"\u029b\u02a5\7\22\2\2\u029c\u029d\7\17\2\2\u029d\u029e\5R*\2\u029e\u029f"+
		"\7\22\2\2\u029f\u02a5\3\2\2\2\u02a0\u02a1\7\n\2\2\u02a1\u02a2\5R*\2\u02a2"+
		"\u02a3\5l\67\2\u02a3\u02a5\3\2\2\2\u02a4\u029b\3\2\2\2\u02a4\u029c\3\2"+
		"\2\2\u02a4\u02a0\3\2\2\2\u02a5m\3\2\2\2\u02a6\u02a7\7\27\2\2\u02a7\u02ad"+
		"\7\30\2\2\u02a8\u02a9\7\27\2\2\u02a9\u02aa\5p9\2\u02aa\u02ab\7\30\2\2"+
		"\u02ab\u02ad\3\2\2\2\u02ac\u02a6\3\2\2\2\u02ac\u02a8\3\2\2\2\u02ado\3"+
		"\2\2\2\u02ae\u02b3\5r:\2\u02af\u02b0\7\n\2\2\u02b0\u02b2\5r:\2\u02b1\u02af"+
		"\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4"+
		"q\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b7\5t;\2\u02b7\u02b8\5v<\2\u02b8"+
		"\u02b9\5x=\2\u02b9s\3\2\2\2\u02ba\u02bc\5\u00bc_\2\u02bb\u02ba\3\2\2\2"+
		"\u02bb\u02bc\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\5h\65\2\u02beu\3"+
		"\2\2\2\u02bf\u02c0\7\7\2\2\u02c0\u02c2\5~@\2\u02c1\u02bf\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2w\3\2\2\2\u02c3\u02c4\7\b\2\2\u02c4\u02c6\5z>\2\u02c5"+
		"\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6y\3\2\2\2\u02c7\u02cc\5|?\2\u02c8"+
		"\u02c9\7\4\2\2\u02c9\u02cb\5|?\2\u02ca\u02c8\3\2\2\2\u02cb\u02ce\3\2\2"+
		"\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd{\3\2\2\2\u02ce\u02cc"+
		"\3\2\2\2\u02cf\u02d2\5\6\4\2\u02d0\u02d1\7\7\2\2\u02d1\u02d3\5\f\7\2\u02d2"+
		"\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3}\3\2\2\2\u02d4\u02d5\5h\65\2"+
		"\u02d5\177\3\2\2\2\u02d6\u02d7\7\21\2\2\u02d7\u02d8\5R*\2\u02d8\u02d9"+
		"\7!\2\2\u02d9\u02da\5\u0084C\2\u02da\u02db\7\22\2\2\u02db\u0081\3\2\2"+
		"\2\u02dc\u02dd\7\27\2\2\u02dd\u02de\5n8\2\u02de\u02df\7!\2\2\u02df\u02e0"+
		"\5\u0084C\2\u02e0\u02e1\7\30\2\2\u02e1\u0083\3\2\2\2\u02e2\u02e7\5\u0086"+
		"D\2\u02e3\u02e4\7\n\2\2\u02e4\u02e6\5\u0086D\2\u02e5\u02e3\3\2\2\2\u02e6"+
		"\u02e9\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u0085\3\2"+
		"\2\2\u02e9\u02e7\3\2\2\2\u02ea\u02f4\5R*\2\u02eb\u02ec\5R*\2\u02ec\u02ed"+
		"\7\"\2\2\u02ed\u02ee\5R*\2\u02ee\u02f4\3\2\2\2\u02ef\u02f0\5n8\2\u02f0"+
		"\u02f1\7#\2\2\u02f1\u02f2\5R*\2\u02f2\u02f4\3\2\2\2\u02f3\u02ea\3\2\2"+
		"\2\u02f3\u02eb\3\2\2\2\u02f3\u02ef\3\2\2\2\u02f4\u0087\3\2\2\2\u02f5\u02f7"+
		"\7\13\2\2\u02f6\u02f8\5\u00b6\\\2\u02f7\u02f6\3\2\2\2\u02f7\u02f8\3\2"+
		"\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\7\f\2\2\u02fa\u0089\3\2\2\2\u02fb"+
		"\u02fd\bF\1\2\u02fc\u02fe\5h\65\2\u02fd\u02fc\3\2\2\2\u02fd\u02fe\3\2"+
		"\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\7\24\2\2\u0300\u0304\5\6\4\2\u0301"+
		"\u0302\7\3\2\2\u0302\u0305\5\6\4\2\u0303\u0305\5\u008cG\2\u0304\u0301"+
		"\3\2\2\2\u0304\u0303\3\2\2\2\u0305\u0310\3\2\2\2\u0306\u0307\f\3\2\2\u0307"+
		"\u0308\7\24\2\2\u0308\u030c\5\6\4\2\u0309\u030a\7\3\2\2\u030a\u030d\5"+
		"\6\4\2\u030b\u030d\5\u008cG\2\u030c\u0309\3\2\2\2\u030c\u030b\3\2\2\2"+
		"\u030d\u030f\3\2\2\2\u030e\u0306\3\2\2\2\u030f\u0312\3\2\2\2\u0310\u030e"+
		"\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u008b\3\2\2\2\u0312\u0310\3\2\2\2\u0313"+
		"\u0315\7\13\2\2\u0314\u0316\5\u008eH\2\u0315\u0314\3\2\2\2\u0315\u0316"+
		"\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\7\f\2\2\u0318\u008d\3\2\2\2\u0319"+
		"\u031e\5\u0090I\2\u031a\u031b\7\n\2\2\u031b\u031d\5\u0090I\2\u031c\u031a"+
		"\3\2\2\2\u031d\u0320\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		"\u008f\3\2\2\2\u0320\u031e\3\2\2\2\u0321\u0324\5\b\5\2\u0322\u0324\5\6"+
		"\4\2\u0323\u0321\3\2\2\2\u0323\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325"+
		"\u0326\7\33\2\2\u0326\u0327\5R*\2\u0327\u0091\3\2\2\2\u0328\u0329\5f\64"+
		"\2\u0329\u032a\5\u00b4[\2\u032a\u0093\3\2\2\2\u032b\u032c\7$\2\2\u032c"+
		"\u032d\5\u0096L\2\u032d\u032e\7 \2\2\u032e\u0095\3\2\2\2\u032f\u0334\5"+
		"\u0098M\2\u0330\u0331\7\r\2\2\u0331\u0333\5\u0098M\2\u0332\u0330\3\2\2"+
		"\2\u0333\u0336\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0097"+
		"\3\2\2\2\u0336\u0334\3\2\2\2\u0337\u0338\5\u00b8]\2\u0338\u0339\5P)\2"+
		"\u0339\u0099\3\2\2\2\u033a\u033b\7%\2\2\u033b\u033c\5R*\2\u033c\u033d"+
		"\7&\2\2\u033d\u033e\5\u009cO\2\u033e\u033f\7 \2\2\u033f\u009b\3\2\2\2"+
		"\u0340\u0345\5\u009eP\2\u0341\u0342\7\r\2\2\u0342\u0344\5\u009eP\2\u0343"+
		"\u0341\3\2\2\2\u0344\u0347\3\2\2\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2"+
		"\2\2\u0346\u009d\3\2\2\2\u0347\u0345\3\2\2\2\u0348\u0349\5R*\2\u0349\u034a"+
		"\5N(\2\u034a\u034b\5P)\2\u034b\u009f\3\2\2\2\u034c\u034d\7\'\2\2\u034d"+
		"\u034e\5\u009cO\2\u034e\u034f\7 \2\2\u034f\u035e\3\2\2\2\u0350\u0351\7"+
		"\'\2\2\u0351\u0352\7(\2\2\u0352\u0353\5R*\2\u0353\u0354\5P)\2\u0354\u0355"+
		"\7 \2\2\u0355\u035e\3\2\2\2\u0356\u0357\7\'\2\2\u0357\u0358\5\u009cO\2"+
		"\u0358\u0359\7(\2\2\u0359\u035a\5R*\2\u035a\u035b\5P)\2\u035b\u035c\7"+
		" \2\2\u035c\u035e\3\2\2\2\u035d\u034c\3\2\2\2\u035d\u0350\3\2\2\2\u035d"+
		"\u0356\3\2\2\2\u035e\u00a1\3\2\2\2\u035f\u0360\7\25\2\2\u0360\u0361\5"+
		"\6\4\2\u0361\u0362\7\b\2\2\u0362\u0363\5\f\7\2\u0363\u0370\3\2\2\2\u0364"+
		"\u0365\7\25\2\2\u0365\u0366\5\u00a4S\2\u0366\u0367\7\7\2\2\u0367\u0368"+
		"\5\u00a4S\2\u0368\u0369\7\b\2\2\u0369\u036a\5\u00a6T\2\u036a\u0370\3\2"+
		"\2\2\u036b\u036c\7\25\2\2\u036c\u036d\5\u00a8U\2\u036d\u036e\7 \2\2\u036e"+
		"\u0370\3\2\2\2\u036f\u035f\3\2\2\2\u036f\u0364\3\2\2\2\u036f\u036b\3\2"+
		"\2\2\u0370\u00a3\3\2\2\2\u0371\u0374\5\6\4\2\u0372\u0374\5\b\5\2\u0373"+
		"\u0371\3\2\2\2\u0373\u0372\3\2\2\2\u0374\u00a5\3\2\2\2\u0375\u0378\5\f"+
		"\7\2\u0376\u0378\5\b\5\2\u0377\u0375\3\2\2\2\u0377\u0376\3\2\2\2\u0378"+
		"\u00a7\3\2\2\2\u0379\u037e\5\u00aaV\2\u037a\u037b\7\r\2\2\u037b\u037d"+
		"\5\u00aaV\2\u037c\u037a\3\2\2\2\u037d\u0380\3\2\2\2\u037e\u037c\3\2\2"+
		"\2\u037e\u037f\3\2\2\2\u037f\u00a9\3\2\2\2\u0380\u037e\3\2\2\2\u0381\u0382"+
		"\5\u00b4[\2\u0382\u0383\5N(\2\u0383\u0384\5P)\2\u0384\u00ab\3\2\2\2\u0385"+
		"\u0386\7)\2\2\u0386\u0389\5\u00b6\\\2\u0387\u0388\7&\2\2\u0388\u038a\5"+
		"\u009cO\2\u0389\u0387\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038b\3\2\2\2"+
		"\u038b\u038c\5\u00aeX\2\u038c\u00ad\3\2\2\2\u038d\u038e\7\32\2\2\u038e"+
		"\u038f\5\u00b0Y\2\u038f\u0390\7 \2\2\u0390\u039c\3\2\2\2\u0391\u0392\7"+
		"\32\2\2\u0392\u0393\5\u00b0Y\2\u0393\u0394\7(\2\2\u0394\u0395\5\u00b6"+
		"\\\2\u0395\u0396\7 \2\2\u0396\u039c\3\2\2\2\u0397\u0398\7(\2\2\u0398\u0399"+
		"\5\u00b6\\\2\u0399\u039a\7 \2\2\u039a\u039c\3\2\2\2\u039b\u038d\3\2\2"+
		"\2\u039b\u0391\3\2\2\2\u039b\u0397\3\2\2\2\u039c\u00af\3\2\2\2\u039d\u03a2"+
		"\5\u00b2Z\2\u039e\u039f\7\r\2\2\u039f\u03a1\5\u00b2Z\2\u03a0\u039e\3\2"+
		"\2\2\u03a1\u03a4\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3"+
		"\u00b1\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a5\u03a6\5\u00a4S\2\u03a6\u03a7"+
		"\7\7\2\2\u03a7\u03a9\3\2\2\2\u03a8\u03a5\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9"+
		"\u03aa\3\2\2\2\u03aa\u03ab\5R*\2\u03ab\u03ac\5N(\2\u03ac\u03ad\5P)\2\u03ad"+
		"\u00b3\3\2\2\2\u03ae\u03b0\7\5\2\2\u03af\u03b1\5\u00b6\\\2\u03b0\u03af"+
		"\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b3\7\6\2\2\u03b3"+
		"\u00b5\3\2\2\2\u03b4\u03b9\5R*\2\u03b5\u03b6\7\n\2\2\u03b6\u03b8\5R*\2"+
		"\u03b7\u03b5\3\2\2\2\u03b8\u03bb\3\2\2\2\u03b9\u03b7\3\2\2\2\u03b9\u03ba"+
		"\3\2\2\2\u03ba\u00b7\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bc\u03c1\5\u00b6\\"+
		"\2\u03bd\u03be\7\r\2\2\u03be\u03c0\5\u00b6\\\2\u03bf\u03bd\3\2\2\2\u03c0"+
		"\u03c3\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u00b9\3\2"+
		"\2\2\u03c3\u03c1\3\2\2\2\u03c4\u03ce\5\16\b\2\u03c5\u03ce\5\f\7\2\u03c6"+
		"\u03ce\5\n\6\2\u03c7\u03ce\5\6\4\2\u03c8\u03ca\5\20\t\2\u03c9\u03c8\3"+
		"\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc"+
		"\u03ce\3\2\2\2\u03cd\u03c4\3\2\2\2\u03cd\u03c5\3\2\2\2\u03cd\u03c6\3\2"+
		"\2\2\u03cd\u03c7\3\2\2\2\u03cd\u03c9\3\2\2\2\u03ce\u00bb\3\2\2\2\u03cf"+
		"\u03d0\t\3\2\2\u03d0\u00bd\3\2\2\2\u03d1\u03d2\t\4\2\2\u03d2\u00bf\3\2"+
		"\2\2\u03d3\u03d4\t\5\2\2\u03d4\u00c1\3\2\2\2\u03d5\u03d6\t\6\2\2\u03d6"+
		"\u00c3\3\2\2\2\u03d7\u03d8\t\7\2\2\u03d8\u00c5\3\2\2\2\u03d9\u03de\5\u00c8"+
		"e\2\u03da\u03db\7\r\2\2\u03db\u03dd\5\u00c8e\2\u03dc\u03da\3\2\2\2\u03dd"+
		"\u03e0\3\2\2\2\u03de\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u00c7\3\2"+
		"\2\2\u03e0\u03de\3\2\2\2\u03e1\u03e2\5\6\4\2\u03e2\u03e3\5L\'\2\u03e3"+
		"\u03e4\5N(\2\u03e4\u03e5\5\u00caf\2\u03e5\u00c9\3\2\2\2\u03e6\u03e7\7"+
		"A\2\2\u03e7\u03e8\5\u0084C\2\u03e8\u00cb\3\2\2\2L\u00cf\u00d6\u00f6\u0100"+
		"\u0113\u011d\u0130\u013b\u0141\u0148\u0154\u015b\u0161\u0168\u016d\u0178"+
		"\u0184\u0188\u01cf\u01d7\u01db\u01e6\u01fd\u0218\u021f\u022b\u0233\u023a"+
		"\u0242\u024a\u0251\u0259\u0262\u026b\u026f\u0276\u027b\u0291\u0299\u02a4"+
		"\u02ac\u02b3\u02bb\u02c1\u02c5\u02cc\u02d2\u02e7\u02f3\u02f7\u02fd\u0304"+
		"\u030c\u0310\u0315\u031e\u0323\u0334\u0345\u035d\u036f\u0373\u0377\u037e"+
		"\u0389\u039b\u03a2\u03a8\u03b0\u03b9\u03c1\u03cb\u03cd\u03de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}