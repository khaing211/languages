// Generated from /home/developer/workspace/languages-parser/r-language/src/main/antlr/R.g4 by ANTLR 4.5
package com.github.kn.language.parser.impl.model.backend.r;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RParser extends Parser {
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
		T__52=53, T__53=54, HEX=55, INT=56, FLOAT=57, COMPLEX=58, STRING=59, ID=60, 
		USER_OP=61, NL=62, WS=63;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_exprlist = 2, RULE_formlist = 3, RULE_form = 4, 
		RULE_sublist = 5, RULE_sub = 6;
	public static final String[] ruleNames = {
		"prog", "expr", "exprlist", "formlist", "form", "sublist", "sub"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'[['", "']'", "'['", "'::'", "':::'", "'$'", "'@'", "'^'", 
		"'-'", "'+'", "':'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'=='", 
		"'!='", "'!'", "'&'", "'&&'", "'|'", "'||'", "'~'", "'<-'", "'<<-'", "'='", 
		"'->'", "'->>'", "':='", "'function'", "'('", "')'", "'{'", "'}'", "'if'", 
		"'else'", "'for'", "'in'", "'while'", "'repeat'", "'?'", "'next'", "'break'", 
		"'NULL'", "'NA'", "'Inf'", "'NaN'", "'TRUE'", "'FALSE'", "','", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "HEX", "INT", "FLOAT", "COMPLEX", 
		"STRING", "ID", "USER_OP", "NL", "WS"
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
	public String getGrammarFileName() { return "R.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RParser.EOF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(RParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(RParser.NL, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RVisitor ) return ((RVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__20) | (1L << T__25) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << HEX) | (1L << INT) | (1L << FLOAT) | (1L << COMPLEX) | (1L << STRING) | (1L << ID) | (1L << NL))) != 0)) {
				{
				setState(18);
				switch (_input.LA(1)) {
				case T__9:
				case T__10:
				case T__20:
				case T__25:
				case T__32:
				case T__33:
				case T__35:
				case T__37:
				case T__39:
				case T__41:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case HEX:
				case INT:
				case FLOAT:
				case COMPLEX:
				case STRING:
				case ID:
					{
					setState(14);
					expr(0);
					setState(15);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==NL) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case NL:
					{
					setState(17);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
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

	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FormlistContext formlist() {
			return getRuleContext(FormlistContext.class,0);
		}
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode ID() { return getToken(RParser.ID, 0); }
		public TerminalNode STRING() { return getToken(RParser.STRING, 0); }
		public TerminalNode HEX() { return getToken(RParser.HEX, 0); }
		public TerminalNode INT() { return getToken(RParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(RParser.FLOAT, 0); }
		public TerminalNode COMPLEX() { return getToken(RParser.COMPLEX, 0); }
		public TerminalNode USER_OP() { return getToken(RParser.USER_OP, 0); }
		public SublistContext sublist() {
			return getRuleContext(SublistContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RVisitor ) return ((RVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(26);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(27);
				expr(36);
				}
				break;
			case 2:
				{
				setState(28);
				match(T__20);
				setState(29);
				expr(30);
				}
				break;
			case 3:
				{
				setState(30);
				match(T__25);
				setState(31);
				expr(27);
				}
				break;
			case 4:
				{
				setState(32);
				match(T__32);
				setState(33);
				match(T__33);
				setState(35);
				_la = _input.LA(1);
				if (_la==T__53 || _la==ID) {
					{
					setState(34);
					formlist();
					}
				}

				setState(37);
				match(T__34);
				setState(38);
				expr(24);
				}
				break;
			case 5:
				{
				setState(39);
				match(T__42);
				setState(40);
				expr(17);
				}
				break;
			case 6:
				{
				setState(41);
				match(T__43);
				setState(42);
				expr(16);
				}
				break;
			case 7:
				{
				setState(43);
				match(T__35);
				setState(44);
				exprlist();
				setState(45);
				match(T__36);
				}
				break;
			case 8:
				{
				setState(47);
				match(T__37);
				setState(48);
				match(T__33);
				setState(49);
				expr(0);
				setState(50);
				match(T__34);
				setState(51);
				expr(0);
				}
				break;
			case 9:
				{
				setState(53);
				match(T__37);
				setState(54);
				match(T__33);
				setState(55);
				expr(0);
				setState(56);
				match(T__34);
				setState(57);
				expr(0);
				setState(58);
				match(T__38);
				setState(59);
				expr(0);
				}
				break;
			case 10:
				{
				setState(61);
				match(T__39);
				setState(62);
				match(T__33);
				setState(63);
				match(ID);
				setState(64);
				match(T__40);
				setState(65);
				expr(0);
				setState(66);
				match(T__34);
				setState(67);
				expr(0);
				}
				break;
			case 11:
				{
				setState(69);
				match(T__41);
				setState(70);
				match(T__33);
				setState(71);
				expr(0);
				setState(72);
				match(T__34);
				setState(73);
				expr(0);
				}
				break;
			case 12:
				{
				setState(75);
				match(T__44);
				}
				break;
			case 13:
				{
				setState(76);
				match(T__45);
				}
				break;
			case 14:
				{
				setState(77);
				match(T__33);
				setState(78);
				expr(0);
				setState(79);
				match(T__34);
				}
				break;
			case 15:
				{
				setState(81);
				match(ID);
				}
				break;
			case 16:
				{
				setState(82);
				match(STRING);
				}
				break;
			case 17:
				{
				setState(83);
				match(HEX);
				}
				break;
			case 18:
				{
				setState(84);
				match(INT);
				}
				break;
			case 19:
				{
				setState(85);
				match(FLOAT);
				}
				break;
			case 20:
				{
				setState(86);
				match(COMPLEX);
				}
				break;
			case 21:
				{
				setState(87);
				match(T__46);
				}
				break;
			case 22:
				{
				setState(88);
				match(T__47);
				}
				break;
			case 23:
				{
				setState(89);
				match(T__48);
				}
				break;
			case 24:
				{
				setState(90);
				match(T__49);
				}
				break;
			case 25:
				{
				setState(91);
				match(T__50);
				}
				break;
			case 26:
				{
				setState(92);
				match(T__51);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(95);
						if (!(precpred(_ctx, 39))) throw new FailedPredicateException(this, "precpred(_ctx, 39)");
						setState(96);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(97);
						expr(40);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(98);
						if (!(precpred(_ctx, 38))) throw new FailedPredicateException(this, "precpred(_ctx, 38)");
						setState(99);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(100);
						expr(39);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(101);
						if (!(precpred(_ctx, 37))) throw new FailedPredicateException(this, "precpred(_ctx, 37)");
						setState(102);
						match(T__8);
						setState(103);
						expr(37);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(104);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(105);
						match(T__11);
						setState(106);
						expr(36);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(107);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(108);
						match(USER_OP);
						setState(109);
						expr(35);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(110);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(111);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__13) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(112);
						expr(34);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(114);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(115);
						expr(33);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(116);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(117);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(118);
						expr(32);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(119);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(120);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(121);
						expr(30);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(122);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(123);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(124);
						expr(29);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(125);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(126);
						match(T__25);
						setState(127);
						expr(27);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(129);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(130);
						expr(26);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(precpred(_ctx, 41))) throw new FailedPredicateException(this, "precpred(_ctx, 41)");
						setState(132);
						match(T__1);
						setState(133);
						sublist();
						setState(134);
						match(T__2);
						setState(135);
						match(T__2);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 40))) throw new FailedPredicateException(this, "precpred(_ctx, 40)");
						setState(138);
						match(T__3);
						setState(139);
						sublist();
						setState(140);
						match(T__2);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(142);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(143);
						match(T__33);
						setState(144);
						sublist();
						setState(145);
						match(T__34);
						}
						break;
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class ExprlistContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(RParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(RParser.NL, i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitExprlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RVisitor ) return ((RVisitor<? extends T>)visitor).visitExprlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exprlist);
		int _la;
		try {
			setState(163);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__20:
			case T__25:
			case T__32:
			case T__33:
			case T__35:
			case T__37:
			case T__39:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case HEX:
			case INT:
			case FLOAT:
			case COMPLEX:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				expr(0);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==NL) {
					{
					{
					setState(153);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==NL) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(155);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__20) | (1L << T__25) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << HEX) | (1L << INT) | (1L << FLOAT) | (1L << COMPLEX) | (1L << STRING) | (1L << ID))) != 0)) {
						{
						setState(154);
						expr(0);
						}
					}

					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FormlistContext extends ParserRuleContext {
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public FormlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterFormlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitFormlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RVisitor ) return ((RVisitor<? extends T>)visitor).visitFormlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormlistContext formlist() throws RecognitionException {
		FormlistContext _localctx = new FormlistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			form();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__52) {
				{
				{
				setState(166);
				match(T__52);
				setState(167);
				form();
				}
				}
				setState(172);
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

	public static class FormContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RVisitor ) return ((RVisitor<? extends T>)visitor).visitForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_form);
		try {
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(ID);
				setState(175);
				match(T__28);
				setState(176);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(T__53);
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

	public static class SublistContext extends ParserRuleContext {
		public List<SubContext> sub() {
			return getRuleContexts(SubContext.class);
		}
		public SubContext sub(int i) {
			return getRuleContext(SubContext.class,i);
		}
		public SublistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sublist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterSublist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitSublist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RVisitor ) return ((RVisitor<? extends T>)visitor).visitSublist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SublistContext sublist() throws RecognitionException {
		SublistContext _localctx = new SublistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sublist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			sub();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__52) {
				{
				{
				setState(181);
				match(T__52);
				setState(182);
				sub();
				}
				}
				setState(187);
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

	public static class SubContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(RParser.ID, 0); }
		public TerminalNode STRING() { return getToken(RParser.STRING, 0); }
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RListener ) ((RListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RVisitor ) return ((RVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sub);
		try {
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(ID);
				setState(190);
				match(T__28);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(ID);
				setState(192);
				match(T__28);
				setState(193);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				match(STRING);
				setState(195);
				match(T__28);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(STRING);
				setState(197);
				match(T__28);
				setState(198);
				expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(199);
				match(T__46);
				setState(200);
				match(T__28);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(201);
				match(T__46);
				setState(202);
				match(T__28);
				setState(203);
				expr(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(204);
				match(T__53);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 39);
		case 1:
			return precpred(_ctx, 38);
		case 2:
			return precpred(_ctx, 37);
		case 3:
			return precpred(_ctx, 35);
		case 4:
			return precpred(_ctx, 34);
		case 5:
			return precpred(_ctx, 33);
		case 6:
			return precpred(_ctx, 32);
		case 7:
			return precpred(_ctx, 31);
		case 8:
			return precpred(_ctx, 29);
		case 9:
			return precpred(_ctx, 28);
		case 10:
			return precpred(_ctx, 26);
		case 11:
			return precpred(_ctx, 25);
		case 12:
			return precpred(_ctx, 41);
		case 13:
			return precpred(_ctx, 40);
		case 14:
			return precpred(_ctx, 23);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u00d3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\7\2\25"+
		"\n\2\f\2\16\2\30\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3&\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0096\n\3\f\3\16\3\u0099\13\3\3\4"+
		"\3\4\3\4\5\4\u009e\n\4\7\4\u00a0\n\4\f\4\16\4\u00a3\13\4\3\4\5\4\u00a6"+
		"\n\4\3\5\3\5\3\5\7\5\u00ab\n\5\f\5\16\5\u00ae\13\5\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u00b5\n\6\3\7\3\7\3\7\7\7\u00ba\n\7\f\7\16\7\u00bd\13\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d1"+
		"\n\b\3\b\2\3\4\t\2\4\6\b\n\f\16\2\13\4\2\3\3@@\3\2\f\r\3\2\7\b\3\2\t\n"+
		"\3\2\17\20\3\2\21\26\3\2\30\31\3\2\32\33\3\2\35\"\u0105\2\26\3\2\2\2\4"+
		"_\3\2\2\2\6\u00a5\3\2\2\2\b\u00a7\3\2\2\2\n\u00b4\3\2\2\2\f\u00b6\3\2"+
		"\2\2\16\u00d0\3\2\2\2\20\21\5\4\3\2\21\22\t\2\2\2\22\25\3\2\2\2\23\25"+
		"\7@\2\2\24\20\3\2\2\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27"+
		"\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32\7\2\2\3\32\3\3\2\2\2\33\34"+
		"\b\3\1\2\34\35\t\3\2\2\35`\5\4\3&\36\37\7\27\2\2\37`\5\4\3  !\7\34\2\2"+
		"!`\5\4\3\35\"#\7#\2\2#%\7$\2\2$&\5\b\5\2%$\3\2\2\2%&\3\2\2\2&\'\3\2\2"+
		"\2\'(\7%\2\2(`\5\4\3\32)*\7-\2\2*`\5\4\3\23+,\7.\2\2,`\5\4\3\22-.\7&\2"+
		"\2./\5\6\4\2/\60\7\'\2\2\60`\3\2\2\2\61\62\7(\2\2\62\63\7$\2\2\63\64\5"+
		"\4\3\2\64\65\7%\2\2\65\66\5\4\3\2\66`\3\2\2\2\678\7(\2\289\7$\2\29:\5"+
		"\4\3\2:;\7%\2\2;<\5\4\3\2<=\7)\2\2=>\5\4\3\2>`\3\2\2\2?@\7*\2\2@A\7$\2"+
		"\2AB\7>\2\2BC\7+\2\2CD\5\4\3\2DE\7%\2\2EF\5\4\3\2F`\3\2\2\2GH\7,\2\2H"+
		"I\7$\2\2IJ\5\4\3\2JK\7%\2\2KL\5\4\3\2L`\3\2\2\2M`\7/\2\2N`\7\60\2\2OP"+
		"\7$\2\2PQ\5\4\3\2QR\7%\2\2R`\3\2\2\2S`\7>\2\2T`\7=\2\2U`\79\2\2V`\7:\2"+
		"\2W`\7;\2\2X`\7<\2\2Y`\7\61\2\2Z`\7\62\2\2[`\7\63\2\2\\`\7\64\2\2]`\7"+
		"\65\2\2^`\7\66\2\2_\33\3\2\2\2_\36\3\2\2\2_ \3\2\2\2_\"\3\2\2\2_)\3\2"+
		"\2\2_+\3\2\2\2_-\3\2\2\2_\61\3\2\2\2_\67\3\2\2\2_?\3\2\2\2_G\3\2\2\2_"+
		"M\3\2\2\2_N\3\2\2\2_O\3\2\2\2_S\3\2\2\2_T\3\2\2\2_U\3\2\2\2_V\3\2\2\2"+
		"_W\3\2\2\2_X\3\2\2\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2"+
		"\2_^\3\2\2\2`\u0097\3\2\2\2ab\f)\2\2bc\t\4\2\2c\u0096\5\4\3*de\f(\2\2"+
		"ef\t\5\2\2f\u0096\5\4\3)gh\f\'\2\2hi\7\13\2\2i\u0096\5\4\3\'jk\f%\2\2"+
		"kl\7\16\2\2l\u0096\5\4\3&mn\f$\2\2no\7?\2\2o\u0096\5\4\3%pq\f#\2\2qr\t"+
		"\6\2\2r\u0096\5\4\3$st\f\"\2\2tu\t\3\2\2u\u0096\5\4\3#vw\f!\2\2wx\t\7"+
		"\2\2x\u0096\5\4\3\"yz\f\37\2\2z{\t\b\2\2{\u0096\5\4\3 |}\f\36\2\2}~\t"+
		"\t\2\2~\u0096\5\4\3\37\177\u0080\f\34\2\2\u0080\u0081\7\34\2\2\u0081\u0096"+
		"\5\4\3\35\u0082\u0083\f\33\2\2\u0083\u0084\t\n\2\2\u0084\u0096\5\4\3\34"+
		"\u0085\u0086\f+\2\2\u0086\u0087\7\4\2\2\u0087\u0088\5\f\7\2\u0088\u0089"+
		"\7\5\2\2\u0089\u008a\7\5\2\2\u008a\u0096\3\2\2\2\u008b\u008c\f*\2\2\u008c"+
		"\u008d\7\6\2\2\u008d\u008e\5\f\7\2\u008e\u008f\7\5\2\2\u008f\u0096\3\2"+
		"\2\2\u0090\u0091\f\31\2\2\u0091\u0092\7$\2\2\u0092\u0093\5\f\7\2\u0093"+
		"\u0094\7%\2\2\u0094\u0096\3\2\2\2\u0095a\3\2\2\2\u0095d\3\2\2\2\u0095"+
		"g\3\2\2\2\u0095j\3\2\2\2\u0095m\3\2\2\2\u0095p\3\2\2\2\u0095s\3\2\2\2"+
		"\u0095v\3\2\2\2\u0095y\3\2\2\2\u0095|\3\2\2\2\u0095\177\3\2\2\2\u0095"+
		"\u0082\3\2\2\2\u0095\u0085\3\2\2\2\u0095\u008b\3\2\2\2\u0095\u0090\3\2"+
		"\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\5\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u00a1\5\4\3\2\u009b\u009d\t\2\2\2"+
		"\u009c\u009e\5\4\3\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0"+
		"\3\2\2\2\u009f\u009b\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\3\2"+
		"\2\2\u00a5\u009a\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\7\3\2\2\2\u00a7\u00ac"+
		"\5\n\6\2\u00a8\u00a9\7\67\2\2\u00a9\u00ab\5\n\6\2\u00aa\u00a8\3\2\2\2"+
		"\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\t\3"+
		"\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b5\7>\2\2\u00b0\u00b1\7>\2\2\u00b1"+
		"\u00b2\7\37\2\2\u00b2\u00b5\5\4\3\2\u00b3\u00b5\78\2\2\u00b4\u00af\3\2"+
		"\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\13\3\2\2\2\u00b6\u00bb"+
		"\5\16\b\2\u00b7\u00b8\7\67\2\2\u00b8\u00ba\5\16\b\2\u00b9\u00b7\3\2\2"+
		"\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\r"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00d1\5\4\3\2\u00bf\u00c0\7>\2\2\u00c0"+
		"\u00d1\7\37\2\2\u00c1\u00c2\7>\2\2\u00c2\u00c3\7\37\2\2\u00c3\u00d1\5"+
		"\4\3\2\u00c4\u00c5\7=\2\2\u00c5\u00d1\7\37\2\2\u00c6\u00c7\7=\2\2\u00c7"+
		"\u00c8\7\37\2\2\u00c8\u00d1\5\4\3\2\u00c9\u00ca\7\61\2\2\u00ca\u00d1\7"+
		"\37\2\2\u00cb\u00cc\7\61\2\2\u00cc\u00cd\7\37\2\2\u00cd\u00d1\5\4\3\2"+
		"\u00ce\u00d1\78\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00be\3\2\2\2\u00d0\u00bf"+
		"\3\2\2\2\u00d0\u00c1\3\2\2\2\u00d0\u00c4\3\2\2\2\u00d0\u00c6\3\2\2\2\u00d0"+
		"\u00c9\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2"+
		"\2\2\u00d1\17\3\2\2\2\17\24\26%_\u0095\u0097\u009d\u00a1\u00a5\u00ac\u00b4"+
		"\u00bb\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}