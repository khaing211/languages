// Generated from Jpa.g4 by ANTLR 4.5.3
package com.kn.language.parser.antlr.jpa;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JpaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

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
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, IDENTIFICATION_VARIABLE=78, CHARACTER=79, 
		STRINGLITERAL=80, ESCAPE_CHARACTER=81, WS=82, TRIM_CHARACTER=83, INT_NUMERAL=84;
	public static final int
		RULE_ql_statement = 0, RULE_select_statement = 1, RULE_update_statement = 2, 
		RULE_delete_statement = 3, RULE_from_clause = 4, RULE_identification_variable_declaration = 5, 
		RULE_range_variable_declaration = 6, RULE_join = 7, RULE_fetch_join = 8, 
		RULE_join_spec = 9, RULE_join_association_path_expression = 10, RULE_join_collection_valued_path_expression = 11, 
		RULE_join_single_valued_association_path_expression = 12, RULE_collection_member_declaration = 13, 
		RULE_single_valued_path_expression = 14, RULE_state_field_path_expression = 15, 
		RULE_single_valued_association_path_expression = 16, RULE_collection_valued_path_expression = 17, 
		RULE_state_field = 18, RULE_update_clause = 19, RULE_update_item = 20, 
		RULE_new_value = 21, RULE_delete_clause = 22, RULE_select_clause = 23, 
		RULE_select_expression = 24, RULE_constructor_expression = 25, RULE_constructor_item = 26, 
		RULE_aggregate_expression = 27, RULE_where_clause = 28, RULE_groupby_clause = 29, 
		RULE_groupby_item = 30, RULE_having_clause = 31, RULE_orderby_clause = 32, 
		RULE_orderby_item = 33, RULE_subquery = 34, RULE_subquery_from_clause = 35, 
		RULE_subselect_identification_variable_declaration = 36, RULE_association_path_expression = 37, 
		RULE_simple_select_clause = 38, RULE_simple_select_expression = 39, RULE_conditional_expression = 40, 
		RULE_conditional_term = 41, RULE_conditional_factor = 42, RULE_conditional_primary = 43, 
		RULE_simple_cond_expression = 44, RULE_between_expression = 45, RULE_in_expression = 46, 
		RULE_in_item = 47, RULE_like_expression = 48, RULE_null_comparison_expression = 49, 
		RULE_empty_collection_comparison_expression = 50, RULE_collection_member_expression = 51, 
		RULE_exists_expression = 52, RULE_all_or_any_expression = 53, RULE_comparison_expression = 54, 
		RULE_comparison_operator = 55, RULE_arithmetic_expression = 56, RULE_simple_arithmetic_expression = 57, 
		RULE_arithmetic_term = 58, RULE_arithmetic_factor = 59, RULE_arithmetic_primary = 60, 
		RULE_string_expression = 61, RULE_string_primary = 62, RULE_datetime_expression = 63, 
		RULE_datetime_primary = 64, RULE_boolean_expression = 65, RULE_boolean_primary = 66, 
		RULE_enum_expression = 67, RULE_enum_primary = 68, RULE_entity_expression = 69, 
		RULE_simple_entity_expression = 70, RULE_functions_returning_numerics = 71, 
		RULE_functions_returning_datetime = 72, RULE_functions_returning_strings = 73, 
		RULE_trim_specification = 74, RULE_numeric_literal = 75, RULE_pattern_value = 76, 
		RULE_input_parameter = 77, RULE_literal = 78, RULE_constructor_name = 79, 
		RULE_enum_literal = 80, RULE_boolean_literal = 81, RULE_simple_state_field = 82, 
		RULE_embedded_class_state_field = 83, RULE_single_valued_association_field = 84, 
		RULE_collection_valued_association_field = 85, RULE_abstract_schema_name = 86;
	public static final String[] ruleNames = {
		"ql_statement", "select_statement", "update_statement", "delete_statement", 
		"from_clause", "identification_variable_declaration", "range_variable_declaration", 
		"join", "fetch_join", "join_spec", "join_association_path_expression", 
		"join_collection_valued_path_expression", "join_single_valued_association_path_expression", 
		"collection_member_declaration", "single_valued_path_expression", "state_field_path_expression", 
		"single_valued_association_path_expression", "collection_valued_path_expression", 
		"state_field", "update_clause", "update_item", "new_value", "delete_clause", 
		"select_clause", "select_expression", "constructor_expression", "constructor_item", 
		"aggregate_expression", "where_clause", "groupby_clause", "groupby_item", 
		"having_clause", "orderby_clause", "orderby_item", "subquery", "subquery_from_clause", 
		"subselect_identification_variable_declaration", "association_path_expression", 
		"simple_select_clause", "simple_select_expression", "conditional_expression", 
		"conditional_term", "conditional_factor", "conditional_primary", "simple_cond_expression", 
		"between_expression", "in_expression", "in_item", "like_expression", "null_comparison_expression", 
		"empty_collection_comparison_expression", "collection_member_expression", 
		"exists_expression", "all_or_any_expression", "comparison_expression", 
		"comparison_operator", "arithmetic_expression", "simple_arithmetic_expression", 
		"arithmetic_term", "arithmetic_factor", "arithmetic_primary", "string_expression", 
		"string_primary", "datetime_expression", "datetime_primary", "boolean_expression", 
		"boolean_primary", "enum_expression", "enum_primary", "entity_expression", 
		"simple_entity_expression", "functions_returning_numerics", "functions_returning_datetime", 
		"functions_returning_strings", "trim_specification", "numeric_literal", 
		"pattern_value", "input_parameter", "literal", "constructor_name", "enum_literal", 
		"boolean_literal", "simple_state_field", "embedded_class_state_field", 
		"single_valued_association_field", "collection_valued_association_field", 
		"abstract_schema_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'FROM'", "','", "'AS'", "'FETCH'", "'LEFT'", "'OUTER'", "'INNER'", 
		"'JOIN'", "'.'", "'IN'", "'('", "')'", "'UPDATE'", "'SET'", "'='", "'NULL'", 
		"'DELETE'", "'SELECT'", "'DISTINCT'", "'OBJECT'", "'NEW'", "'AVG'", "'MAX'", 
		"'MIN'", "'SUM'", "'COUNT'", "'WHERE'", "'GROUP'", "'BY'", "'HAVING'", 
		"'ORDER'", "'ASC'", "'DESC'", "'OR'", "'AND'", "'NOT'", "'BETWEEN'", "'LIKE'", 
		"'ESCAPE'", "'IS'", "'EMPTY'", "'MEMBER'", "'OF'", "'EXISTS'", "'ALL'", 
		"'ANY'", "'SOME'", "'<>'", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", 
		"'*'", "'/'", "'LENGTH'", "'LOCATE'", "'ABS'", "'SQRT'", "'MOD'", "'SIZE'", 
		"'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'CONCAT'", 
		"'SUBSTRING'", "'TRIM'", "'LOWER'", "'UPPER'", "'LEADING'", "'TRAILING'", 
		"'BOTH'", "'?'", "':'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "IDENTIFICATION_VARIABLE", "CHARACTER", 
		"STRINGLITERAL", "ESCAPE_CHARACTER", "WS", "TRIM_CHARACTER", "INT_NUMERAL"
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
	public String getGrammarFileName() { return "Jpa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JpaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Ql_statementContext extends ParserRuleContext {
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Update_statementContext update_statement() {
			return getRuleContext(Update_statementContext.class,0);
		}
		public Delete_statementContext delete_statement() {
			return getRuleContext(Delete_statementContext.class,0);
		}
		public Ql_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ql_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterQl_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitQl_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitQl_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ql_statementContext ql_statement() throws RecognitionException {
		Ql_statementContext _localctx = new Ql_statementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ql_statement);
		try {
			setState(177);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				select_statement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				update_statement();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				delete_statement();
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

	public static class Select_statementContext extends ParserRuleContext {
		public Select_clauseContext select_clause() {
			return getRuleContext(Select_clauseContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Groupby_clauseContext groupby_clause() {
			return getRuleContext(Groupby_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Orderby_clauseContext orderby_clause() {
			return getRuleContext(Orderby_clauseContext.class,0);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitSelect_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitSelect_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			select_clause();
			setState(180);
			from_clause();
			setState(182);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(181);
				where_clause();
				}
			}

			setState(185);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(184);
				groupby_clause();
				}
			}

			setState(188);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(187);
				having_clause();
				}
			}

			setState(191);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(190);
				orderby_clause();
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

	public static class Update_statementContext extends ParserRuleContext {
		public Update_clauseContext update_clause() {
			return getRuleContext(Update_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterUpdate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitUpdate_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitUpdate_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_statementContext update_statement() throws RecognitionException {
		Update_statementContext _localctx = new Update_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			update_clause();
			setState(195);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(194);
				where_clause();
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

	public static class Delete_statementContext extends ParserRuleContext {
		public Delete_clauseContext delete_clause() {
			return getRuleContext(Delete_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Delete_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterDelete_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitDelete_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitDelete_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_statementContext delete_statement() throws RecognitionException {
		Delete_statementContext _localctx = new Delete_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_delete_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			delete_clause();
			setState(199);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(198);
				where_clause();
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

	public static class From_clauseContext extends ParserRuleContext {
		public List<Identification_variable_declarationContext> identification_variable_declaration() {
			return getRuleContexts(Identification_variable_declarationContext.class);
		}
		public Identification_variable_declarationContext identification_variable_declaration(int i) {
			return getRuleContext(Identification_variable_declarationContext.class,i);
		}
		public List<Collection_member_declarationContext> collection_member_declaration() {
			return getRuleContexts(Collection_member_declarationContext.class);
		}
		public Collection_member_declarationContext collection_member_declaration(int i) {
			return getRuleContext(Collection_member_declarationContext.class,i);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__0);
			setState(202);
			identification_variable_declaration();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(203);
				match(T__1);
				setState(206);
				switch (_input.LA(1)) {
				case T__2:
				case IDENTIFICATION_VARIABLE:
					{
					setState(204);
					identification_variable_declaration();
					}
					break;
				case T__9:
					{
					setState(205);
					collection_member_declaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(212);
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

	public static class Identification_variable_declarationContext extends ParserRuleContext {
		public Range_variable_declarationContext range_variable_declaration() {
			return getRuleContext(Range_variable_declarationContext.class,0);
		}
		public List<JoinContext> join() {
			return getRuleContexts(JoinContext.class);
		}
		public JoinContext join(int i) {
			return getRuleContext(JoinContext.class,i);
		}
		public List<Fetch_joinContext> fetch_join() {
			return getRuleContexts(Fetch_joinContext.class);
		}
		public Fetch_joinContext fetch_join(int i) {
			return getRuleContext(Fetch_joinContext.class,i);
		}
		public Identification_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identification_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterIdentification_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitIdentification_variable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitIdentification_variable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identification_variable_declarationContext identification_variable_declaration() throws RecognitionException {
		Identification_variable_declarationContext _localctx = new Identification_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identification_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			range_variable_declaration();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				setState(216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(214);
					join();
					}
					break;
				case 2:
					{
					setState(215);
					fetch_join();
					}
					break;
				}
				}
				setState(220);
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

	public static class Range_variable_declarationContext extends ParserRuleContext {
		public Abstract_schema_nameContext abstract_schema_name() {
			return getRuleContext(Abstract_schema_nameContext.class,0);
		}
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(JpaParser.IDENTIFICATION_VARIABLE, 0); }
		public Range_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterRange_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitRange_variable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitRange_variable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_variable_declarationContext range_variable_declaration() throws RecognitionException {
		Range_variable_declarationContext _localctx = new Range_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_range_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			abstract_schema_name();
			setState(223);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(222);
				match(T__2);
				}
			}

			setState(225);
			match(IDENTIFICATION_VARIABLE);
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

	public static class JoinContext extends ParserRuleContext {
		public Join_specContext join_spec() {
			return getRuleContext(Join_specContext.class,0);
		}
		public Join_association_path_expressionContext join_association_path_expression() {
			return getRuleContext(Join_association_path_expressionContext.class,0);
		}
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(JpaParser.IDENTIFICATION_VARIABLE, 0); }
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		JoinContext _localctx = new JoinContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_join);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			join_spec();
			setState(228);
			join_association_path_expression();
			setState(230);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(229);
				match(T__2);
				}
			}

			setState(232);
			match(IDENTIFICATION_VARIABLE);
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

	public static class Fetch_joinContext extends ParserRuleContext {
		public Join_specContext join_spec() {
			return getRuleContext(Join_specContext.class,0);
		}
		public Join_association_path_expressionContext join_association_path_expression() {
			return getRuleContext(Join_association_path_expressionContext.class,0);
		}
		public Fetch_joinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_join; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterFetch_join(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitFetch_join(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitFetch_join(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fetch_joinContext fetch_join() throws RecognitionException {
		Fetch_joinContext _localctx = new Fetch_joinContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fetch_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			join_spec();
			setState(235);
			match(T__3);
			setState(236);
			join_association_path_expression();
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

	public static class Join_specContext extends ParserRuleContext {
		public Join_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterJoin_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitJoin_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitJoin_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_specContext join_spec() throws RecognitionException {
		Join_specContext _localctx = new Join_specContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_join_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			switch (_input.LA(1)) {
			case T__4:
				{
				{
				setState(238);
				match(T__4);
				}
				setState(240);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(239);
					match(T__5);
					}
				}

				}
				break;
			case T__6:
				{
				setState(242);
				match(T__6);
				}
				break;
			case T__7:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(245);
			match(T__7);
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

	public static class Join_association_path_expressionContext extends ParserRuleContext {
		public Join_collection_valued_path_expressionContext join_collection_valued_path_expression() {
			return getRuleContext(Join_collection_valued_path_expressionContext.class,0);
		}
		public Join_single_valued_association_path_expressionContext join_single_valued_association_path_expression() {
			return getRuleContext(Join_single_valued_association_path_expressionContext.class,0);
		}
		public Join_association_path_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_association_path_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterJoin_association_path_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitJoin_association_path_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitJoin_association_path_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_association_path_expressionContext join_association_path_expression() throws RecognitionException {
		Join_association_path_expressionContext _localctx = new Join_association_path_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_join_association_path_expression);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				join_collection_valued_path_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				join_single_valued_association_path_expression();
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

	public static class Join_collection_valued_path_expressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(JpaParser.IDENTIFICATION_VARIABLE, 0); }
		public Collection_valued_association_fieldContext collection_valued_association_field() {
			return getRuleContext(Collection_valued_association_fieldContext.class,0);
		}
		public Join_collection_valued_path_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_collection_valued_path_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterJoin_collection_valued_path_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitJoin_collection_valued_path_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitJoin_collection_valued_path_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_collection_valued_path_expressionContext join_collection_valued_path_expression() throws RecognitionException {
		Join_collection_valued_path_expressionContext _localctx = new Join_collection_valued_path_expressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_join_collection_valued_path_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(IDENTIFICATION_VARIABLE);
			setState(252);
			match(T__8);
			setState(253);
			collection_valued_association_field();
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

	public static class Join_single_valued_association_path_expressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(JpaParser.IDENTIFICATION_VARIABLE, 0); }
		public Single_valued_association_fieldContext single_valued_association_field() {
			return getRuleContext(Single_valued_association_fieldContext.class,0);
		}
		public Join_single_valued_association_path_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_single_valued_association_path_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterJoin_single_valued_association_path_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitJoin_single_valued_association_path_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitJoin_single_valued_association_path_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_single_valued_association_path_expressionContext join_single_valued_association_path_expression() throws RecognitionException {
		Join_single_valued_association_path_expressionContext _localctx = new Join_single_valued_association_path_expressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_join_single_valued_association_path_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(IDENTIFICATION_VARIABLE);
			setState(256);
			match(T__8);
			setState(257);
			single_valued_association_field();
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

	public static class Collection_member_declarationContext extends ParserRuleContext {
		public Collection_valued_path_expressionContext collection_valued_path_expression() {
			return getRuleContext(Collection_valued_path_expressionContext.class,0);
		}
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(JpaParser.IDENTIFICATION_VARIABLE, 0); }
		public Collection_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterCollection_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitCollection_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitCollection_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collection_member_declarationContext collection_member_declaration() throws RecognitionException {
		Collection_member_declarationContext _localctx = new Collection_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_collection_member_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__9);
			setState(260);
			match(T__10);
			setState(261);
			collection_valued_path_expression();
			setState(262);
			match(T__11);
			setState(264);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(263);
				match(T__2);
				}
			}

			setState(266);
			match(IDENTIFICATION_VARIABLE);
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

	public static class Single_valued_path_expressionContext extends ParserRuleContext {
		public State_field_path_expressionContext state_field_path_expression() {
			return getRuleContext(State_field_path_expressionContext.class,0);
		}
		public Single_valued_association_path_expressionContext single_valued_association_path_expression() {
			return getRuleContext(Single_valued_association_path_expressionContext.class,0);
		}
		public Single_valued_path_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_valued_path_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterSingle_valued_path_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitSingle_valued_path_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitSingle_valued_path_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_valued_path_expressionContext single_valued_path_expression() throws RecognitionException {
		Single_valued_path_expressionContext _localctx = new Single_valued_path_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_single_valued_path_expression);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				state_field_path_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				single_valued_association_path_expression();
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

	public static class State_field_path_expressionContext extends ParserRuleContext {
		public State_fieldContext state_field() {
			return getRuleContext(State_fieldContext.class,0);
		}
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(JpaParser.IDENTIFICATION_VARIABLE, 0); }
		public Single_valued_association_path_expressionContext single_valued_association_path_expression() {
			return getRuleContext(Single_valued_association_path_expressionContext.class,0);
		}
		public State_field_path_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_field_path_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterState_field_path_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitState_field_path_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitState_field_path_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_field_path_expressionContext state_field_path_expression() throws RecognitionException {
		State_field_path_expressionContext _localctx = new State_field_path_expressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_state_field_path_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(272);
				match(IDENTIFICATION_VARIABLE);
				}
				break;
			case 2:
				{
				setState(273);
				single_valued_association_path_expression();
				}
				break;
			}
			setState(276);
			match(T__8);
			setState(277);
			state_field();
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

	public static class Single_valued_association_path_expressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(JpaParser.IDENTIFICATION_VARIABLE, 0); }
		public List<Single_valued_association_fieldContext> single_valued_association_field() {
			return getRuleContexts(Single_valued_association_fieldContext.class);
		}
		public Single_valued_association_fieldContext single_valued_association_field(int i) {
			return getRuleContext(Single_valued_association_fieldContext.class,i);
		}
		public Single_valued_association_path_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_valued_association_path_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterSingle_valued_association_path_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitSingle_valued_association_path_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitSingle_valued_association_path_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_valued_association_path_expressionContext single_valued_association_path_expression() throws RecognitionException {
		Single_valued_association_path_expressionContext _localctx = new Single_valued_association_path_expressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_single_valued_association_path_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(IDENTIFICATION_VARIABLE);
			setState(280);
			match(T__8);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(281);
					single_valued_association_field();
					setState(282);
					match(T__8);
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(289);
			single_valued_association_field();
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

	public static class Collection_valued_path_expressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(JpaParser.IDENTIFICATION_VARIABLE, 0); }
		public Collection_valued_association_fieldContext collection_valued_association_field() {
			return getRuleContext(Collection_valued_association_fieldContext.class,0);
		}
		public List<Single_valued_association_fieldContext> single_valued_association_field() {
			return getRuleContexts(Single_valued_association_fieldContext.class);
		}
		public Single_valued_association_fieldContext single_valued_association_field(int i) {
			return getRuleContext(Single_valued_association_fieldContext.class,i);
		}
		public Collection_valued_path_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_valued_path_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterCollection_valued_path_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitCollection_valued_path_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitCollection_valued_path_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collection_valued_path_expressionContext collection_valued_path_expression() throws RecognitionException {
		Collection_valued_path_expressionContext _localctx = new Collection_valued_path_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_collection_valued_path_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(IDENTIFICATION_VARIABLE);
			setState(292);
			match(T__8);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(293);
				single_valued_association_field();
				setState(294);
				match(T__8);
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			collection_valued_association_field();
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

	public static class State_fieldContext extends ParserRuleContext {
		public Simple_state_fieldContext simple_state_field() {
			return getRuleContext(Simple_state_fieldContext.class,0);
		}
		public List<Embedded_class_state_fieldContext> embedded_class_state_field() {
			return getRuleContexts(Embedded_class_state_fieldContext.class);
		}
		public Embedded_class_state_fieldContext embedded_class_state_field(int i) {
			return getRuleContext(Embedded_class_state_fieldContext.class,i);
		}
		public State_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterState_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitState_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitState_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_fieldContext state_field() throws RecognitionException {
		State_fieldContext _localctx = new State_fieldContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_state_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(303);
				embedded_class_state_field();
				setState(304);
				match(T__8);
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			simple_state_field();
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

	public static class Update_clauseContext extends ParserRuleContext {
		public Abstract_schema_nameContext abstract_schema_name() {
			return getRuleContext(Abstract_schema_nameContext.class,0);
		}
		public List<Update_itemContext> update_item() {
			return getRuleContexts(Update_itemContext.class);
		}
		public Update_itemContext update_item(int i) {
			return getRuleContext(Update_itemContext.class,i);
		}
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(JpaParser.IDENTIFICATION_VARIABLE, 0); }
		public Update_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterUpdate_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitUpdate_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitUpdate_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_clauseContext update_clause() throws RecognitionException {
		Update_clauseContext _localctx = new Update_clauseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_update_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__12);
			setState(314);
			abstract_schema_name();
			setState(319);
			_la = _input.LA(1);
			if (_la==T__2 || _la==IDENTIFICATION_VARIABLE) {
				{
				setState(316);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(315);
					match(T__2);
					}
				}

				setState(318);
				match(IDENTIFICATION_VARIABLE);
				}
			}

			setState(321);
			match(T__13);
			setState(322);
			update_item();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(323);
				match(T__1);
				setState(324);
				update_item();
				}
				}
				setState(329);
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

	public static class Update_itemContext extends ParserRuleContext {
		public New_valueContext new_value() {
			return getRuleContext(New_valueContext.class,0);
		}
		public State_fieldContext state_field() {
			return getRuleContext(State_fieldContext.class,0);
		}
		public Single_valued_association_fieldContext single_valued_association_field() {
			return getRuleContext(Single_valued_association_fieldContext.class,0);
		}
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(JpaParser.IDENTIFICATION_VARIABLE, 0); }
		public Update_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterUpdate_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitUpdate_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitUpdate_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_itemContext update_item() throws RecognitionException {
		Update_itemContext _localctx = new Update_itemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_update_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_la = _input.LA(1);
			if (_la==IDENTIFICATION_VARIABLE) {
				{
				setState(330);
				match(IDENTIFICATION_VARIABLE);
				setState(331);
				match(T__8);
				}
			}

			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(334);
				state_field();
				}
				break;
			case 2:
				{
				setState(335);
				single_valued_association_field();
				}
				break;
			}
			setState(338);
			match(T__14);
			setState(339);
			new_value();
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

	public static class New_valueContext extends ParserRuleContext {
		public Simple_arithmetic_expressionContext simple_arithmetic_expression() {
			return getRuleContext(Simple_arithmetic_expressionContext.class,0);
		}
		public String_primaryContext string_primary() {
			return getRuleContext(String_primaryContext.class,0);
		}
		public Datetime_primaryContext datetime_primary() {
			return getRuleContext(Datetime_primaryContext.class,0);
		}
		public Boolean_primaryContext boolean_primary() {
			return getRuleContext(Boolean_primaryContext.class,0);
		}
		public Enum_primaryContext enum_primary() {
			return getRuleContext(Enum_primaryContext.class,0);
		}
		public Simple_entity_expressionContext simple_entity_expression() {
			return getRuleContext(Simple_entity_expressionContext.class,0);
		}
		public New_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterNew_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitNew_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitNew_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_valueContext new_value() throws RecognitionException {
		New_valueContext _localctx = new New_valueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_new_value);
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				simple_arithmetic_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				string_primary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				datetime_primary();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				boolean_primary();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(345);
				enum_primary();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(346);
				simple_entity_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(347);
				match(T__15);
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

	public static class Delete_clauseContext extends ParserRuleContext {
		public Abstract_schema_nameContext abstract_schema_name() {
			return getRuleContext(Abstract_schema_nameContext.class,0);
		}
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(JpaParser.IDENTIFICATION_VARIABLE, 0); }
		public Delete_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterDelete_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitDelete_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitDelete_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_clauseContext delete_clause() throws RecognitionException {
		Delete_clauseContext _localctx = new Delete_clauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_delete_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(T__16);
			setState(351);
			match(T__0);
			setState(352);
			abstract_schema_name();
			setState(357);
			_la = _input.LA(1);
			if (_la==T__2 || _la==IDENTIFICATION_VARIABLE) {
				{
				setState(354);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(353);
					match(T__2);
					}
				}

				setState(356);
				match(IDENTIFICATION_VARIABLE);
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

	public static class Select_clauseContext extends ParserRuleContext {
		public List<Select_expressionContext> select_expression() {
			return getRuleContexts(Select_expressionContext.class);
		}
		public Select_expressionContext select_expression(int i) {
			return getRuleContext(Select_expressionContext.class,i);
		}
		public Select_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterSelect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitSelect_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitSelect_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_clauseContext select_clause() throws RecognitionException {
		Select_clauseContext _localctx = new Select_clauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_select_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__17);
			setState(361);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(360);
				match(T__18);
				}
			}

			setState(363);
			select_expression();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(364);
				match(T__1);
				setState(365);
				select_expression();
				}
				}
				setState(370);
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

	public static class Select_expressionContext extends ParserRuleContext {
		public Single_valued_path_expressionContext single_valued_path_expression() {
			return getRuleContext(Single_valued_path_expressionContext.class,0);
		}
		public Aggregate_expressionContext aggregate_expression() {
			return getRuleContext(Aggregate_expressionContext.class,0);
		}
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(JpaParser.IDENTIFICATION_VARIABLE, 0); }
		public Constructor_expressionContext constructor_expression() {
			return getRuleContext(Constructor_expressionContext.class,0);
		}
		public Select_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterSelect_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitSelect_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitSelect_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_expressionContext select_expression() throws RecognitionException {
		Select_expressionContext _localctx = new Select_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_select_expression);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				single_valued_path_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				aggregate_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				match(IDENTIFICATION_VARIABLE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(374);
				match(T__19);
				setState(375);
				match(T__10);
				setState(376);
				match(IDENTIFICATION_VARIABLE);
				setState(377);
				match(T__11);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(378);
				constructor_expression();
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

	public static class Constructor_expressionContext extends ParserRuleContext {
		public Constructor_nameContext constructor_name() {
			return getRuleContext(Constructor_nameContext.class,0);
		}
		public List<Constructor_itemContext> constructor_item() {
			return getRuleContexts(Constructor_itemContext.class);
		}
		public Constructor_itemContext constructor_item(int i) {
			return getRuleContext(Constructor_itemContext.class,i);
		}
		public Constructor_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterConstructor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitConstructor_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitConstructor_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor_expressionContext constructor_expression() throws RecognitionException {
		Constructor_expressionContext _localctx = new Constructor_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constructor_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(T__20);
			setState(382);
			constructor_name();
			setState(383);
			match(T__10);
			setState(384);
			constructor_item();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(385);
				match(T__1);
				setState(386);
				constructor_item();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
			match(T__11);
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

	public static class Constructor_itemContext extends ParserRuleContext {
		public Single_valued_path_expressionContext single_valued_path_expression() {
			return getRuleContext(Single_valued_path_expressionContext.class,0);
		}
		public Aggregate_expressionContext aggregate_expression() {
			return getRuleContext(Aggregate_expressionContext.class,0);
		}
		public Constructor_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterConstructor_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitConstructor_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitConstructor_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor_itemContext constructor_item() throws RecognitionException {
		Constructor_itemContext _localctx = new Constructor_itemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constructor_item);
		try {
			setState(396);
			switch (_input.LA(1)) {
			case IDENTIFICATION_VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				single_valued_path_expression();
				}
				break;
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				aggregate_expression();
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

	public static class Aggregate_expressionContext extends ParserRuleContext {
		public State_field_path_expressionContext state_field_path_expression() {
			return getRuleContext(State_field_path_expressionContext.class,0);
		}
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(JpaParser.IDENTIFICATION_VARIABLE, 0); }
		public Single_valued_association_path_expressionContext single_valued_association_path_expression() {
			return getRuleContext(Single_valued_association_path_expressionContext.class,0);
		}
		public Aggregate_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterAggregate_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitAggregate_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitAggregate_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregate_expressionContext aggregate_expression() throws RecognitionException {
		Aggregate_expressionContext _localctx = new Aggregate_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_aggregate_expression);
		int _la;
		try {
			setState(417);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(399);
				match(T__10);
				setState(401);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(400);
					match(T__18);
					}
				}

				setState(403);
				state_field_path_expression();
				setState(404);
				match(T__11);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				match(T__25);
				setState(407);
				match(T__10);
				setState(409);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(408);
					match(T__18);
					}
				}

				setState(414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(411);
					match(IDENTIFICATION_VARIABLE);
					}
					break;
				case 2:
					{
					setState(412);
					state_field_path_expression();
					}
					break;
				case 3:
					{
					setState(413);
					single_valued_association_path_expression();
					}
					break;
				}
				setState(416);
				match(T__11);
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

	public static class Where_clauseContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(T__26);
			setState(420);
			conditional_expression();
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

	public static class Groupby_clauseContext extends ParserRuleContext {
		public List<Groupby_itemContext> groupby_item() {
			return getRuleContexts(Groupby_itemContext.class);
		}
		public Groupby_itemContext groupby_item(int i) {
			return getRuleContext(Groupby_itemContext.class,i);
		}
		public Groupby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterGroupby_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitGroupby_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitGroupby_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Groupby_clauseContext groupby_clause() throws RecognitionException {
		Groupby_clauseContext _localctx = new Groupby_clauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_groupby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(T__27);
			setState(423);
			match(T__28);
			setState(424);
			groupby_item();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(425);
				match(T__1);
				setState(426);
				groupby_item();
				}
				}
				setState(431);
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

	public static class Groupby_itemContext extends ParserRuleContext {
		public Single_valued_path_expressionContext single_valued_path_expression() {
			return getRuleContext(Single_valued_path_expressionContext.class,0);
		}
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(JpaParser.IDENTIFICATION_VARIABLE, 0); }
		public Groupby_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupby_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterGroupby_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitGroupby_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitGroupby_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Groupby_itemContext groupby_item() throws RecognitionException {
		Groupby_itemContext _localctx = new Groupby_itemContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_groupby_item);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				single_valued_path_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(IDENTIFICATION_VARIABLE);
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

	public static class Having_clauseContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitHaving_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitHaving_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(T__29);
			setState(437);
			conditional_expression();
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

	public static class Orderby_clauseContext extends ParserRuleContext {
		public List<Orderby_itemContext> orderby_item() {
			return getRuleContexts(Orderby_itemContext.class);
		}
		public Orderby_itemContext orderby_item(int i) {
			return getRuleContext(Orderby_itemContext.class,i);
		}
		public Orderby_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterOrderby_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitOrderby_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitOrderby_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Orderby_clauseContext orderby_clause() throws RecognitionException {
		Orderby_clauseContext _localctx = new Orderby_clauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_orderby_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(T__30);
			setState(440);
			match(T__28);
			setState(441);
			orderby_item();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(442);
				match(T__1);
				setState(443);
				orderby_item();
				}
				}
				setState(448);
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

	public static class Orderby_itemContext extends ParserRuleContext {
		public State_field_path_expressionContext state_field_path_expression() {
			return getRuleContext(State_field_path_expressionContext.class,0);
		}
		public Orderby_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterOrderby_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitOrderby_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitOrderby_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Orderby_itemContext orderby_item() throws RecognitionException {
		Orderby_itemContext _localctx = new Orderby_itemContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_orderby_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			state_field_path_expression();
			setState(451);
			_la = _input.LA(1);
			if (_la==T__31 || _la==T__32) {
				{
				setState(450);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__32) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
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

	public static class SubqueryContext extends ParserRuleContext {
		public Simple_select_clauseContext simple_select_clause() {
			return getRuleContext(Simple_select_clauseContext.class,0);
		}
		public Subquery_from_clauseContext subquery_from_clause() {
			return getRuleContext(Subquery_from_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Groupby_clauseContext groupby_clause() {
			return getRuleContext(Groupby_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_subquery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			simple_select_clause();
			setState(454);
			subquery_from_clause();
			setState(456);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(455);
				where_clause();
				}
			}

			setState(459);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(458);
				groupby_clause();
				}
			}

			setState(462);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(461);
				having_clause();
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

	public static class Subquery_from_clauseContext extends ParserRuleContext {
		public List<Subselect_identification_variable_declarationContext> subselect_identification_variable_declaration() {
			return getRuleContexts(Subselect_identification_variable_declarationContext.class);
		}
		public Subselect_identification_variable_declarationContext subselect_identification_variable_declaration(int i) {
			return getRuleContext(Subselect_identification_variable_declarationContext.class,i);
		}
		public Subquery_from_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterSubquery_from_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitSubquery_from_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitSubquery_from_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subquery_from_clauseContext subquery_from_clause() throws RecognitionException {
		Subquery_from_clauseContext _localctx = new Subquery_from_clauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_subquery_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(T__0);
			setState(465);
			subselect_identification_variable_declaration();
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(466);
				match(T__1);
				setState(467);
				subselect_identification_variable_declaration();
				}
				}
				setState(472);
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

	public static class Subselect_identification_variable_declarationContext extends ParserRuleContext {
		public Identification_variable_declarationContext identification_variable_declaration() {
			return getRuleContext(Identification_variable_declarationContext.class,0);
		}
		public Association_path_expressionContext association_path_expression() {
			return getRuleContext(Association_path_expressionContext.class,0);
		}
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(JpaParser.IDENTIFICATION_VARIABLE, 0); }
		public Collection_member_declarationContext collection_member_declaration() {
			return getRuleContext(Collection_member_declarationContext.class,0);
		}
		public Subselect_identification_variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subselect_identification_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterSubselect_identification_variable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitSubselect_identification_variable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitSubselect_identification_variable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subselect_identification_variable_declarationContext subselect_identification_variable_declaration() throws RecognitionException {
		Subselect_identification_variable_declarationContext _localctx = new Subselect_identification_variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_subselect_identification_variable_declaration);
		int _la;
		try {
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				identification_variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				association_path_expression();
				setState(476);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(475);
					match(T__2);
					}
				}

				setState(478);
				match(IDENTIFICATION_VARIABLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				collection_member_declaration();
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

	public static class Association_path_expressionContext extends ParserRuleContext {
		public Collection_valued_path_expressionContext collection_valued_path_expression() {
			return getRuleContext(Collection_valued_path_expressionContext.class,0);
		}
		public Single_valued_association_path_expressionContext single_valued_association_path_expression() {
			return getRuleContext(Single_valued_association_path_expressionContext.class,0);
		}
		public Association_path_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_association_path_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterAssociation_path_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitAssociation_path_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitAssociation_path_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Association_path_expressionContext association_path_expression() throws RecognitionException {
		Association_path_expressionContext _localctx = new Association_path_expressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_association_path_expression);
		try {
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				collection_valued_path_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				single_valued_association_path_expression();
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

	public static class Simple_select_clauseContext extends ParserRuleContext {
		public Simple_select_expressionContext simple_select_expression() {
			return getRuleContext(Simple_select_expressionContext.class,0);
		}
		public Simple_select_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterSimple_select_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitSimple_select_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitSimple_select_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_select_clauseContext simple_select_clause() throws RecognitionException {
		Simple_select_clauseContext _localctx = new Simple_select_clauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_simple_select_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(T__17);
			setState(489);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(488);
				match(T__18);
				}
			}

			setState(491);
			simple_select_expression();
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

	public static class Simple_select_expressionContext extends ParserRuleContext {
		public Single_valued_path_expressionContext single_valued_path_expression() {
			return getRuleContext(Single_valued_path_expressionContext.class,0);
		}
		public Aggregate_expressionContext aggregate_expression() {
			return getRuleContext(Aggregate_expressionContext.class,0);
		}
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(JpaParser.IDENTIFICATION_VARIABLE, 0); }
		public Simple_select_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterSimple_select_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitSimple_select_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitSimple_select_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_select_expressionContext simple_select_expression() throws RecognitionException {
		Simple_select_expressionContext _localctx = new Simple_select_expressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_simple_select_expression);
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				single_valued_path_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				aggregate_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				match(IDENTIFICATION_VARIABLE);
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

	public static class Conditional_expressionContext extends ParserRuleContext {
		public List<Conditional_termContext> conditional_term() {
			return getRuleContexts(Conditional_termContext.class);
		}
		public Conditional_termContext conditional_term(int i) {
			return getRuleContext(Conditional_termContext.class,i);
		}
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitConditional_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitConditional_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_conditional_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(498);
			conditional_term();
			}
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33) {
				{
				{
				setState(499);
				match(T__33);
				setState(500);
				conditional_term();
				}
				}
				setState(505);
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

	public static class Conditional_termContext extends ParserRuleContext {
		public List<Conditional_factorContext> conditional_factor() {
			return getRuleContexts(Conditional_factorContext.class);
		}
		public Conditional_factorContext conditional_factor(int i) {
			return getRuleContext(Conditional_factorContext.class,i);
		}
		public Conditional_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterConditional_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitConditional_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitConditional_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_termContext conditional_term() throws RecognitionException {
		Conditional_termContext _localctx = new Conditional_termContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_conditional_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(506);
			conditional_factor();
			}
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__34) {
				{
				{
				setState(507);
				match(T__34);
				setState(508);
				conditional_factor();
				}
				}
				setState(513);
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

	public static class Conditional_factorContext extends ParserRuleContext {
		public Conditional_primaryContext conditional_primary() {
			return getRuleContext(Conditional_primaryContext.class,0);
		}
		public Conditional_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterConditional_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitConditional_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitConditional_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_factorContext conditional_factor() throws RecognitionException {
		Conditional_factorContext _localctx = new Conditional_factorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_conditional_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(514);
				match(T__35);
				}
				break;
			}
			setState(517);
			conditional_primary();
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

	public static class Conditional_primaryContext extends ParserRuleContext {
		public Simple_cond_expressionContext simple_cond_expression() {
			return getRuleContext(Simple_cond_expressionContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Conditional_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterConditional_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitConditional_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitConditional_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_primaryContext conditional_primary() throws RecognitionException {
		Conditional_primaryContext _localctx = new Conditional_primaryContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_conditional_primary);
		try {
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				simple_cond_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				match(T__10);
				setState(521);
				conditional_expression();
				setState(522);
				match(T__11);
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

	public static class Simple_cond_expressionContext extends ParserRuleContext {
		public Comparison_expressionContext comparison_expression() {
			return getRuleContext(Comparison_expressionContext.class,0);
		}
		public Between_expressionContext between_expression() {
			return getRuleContext(Between_expressionContext.class,0);
		}
		public Like_expressionContext like_expression() {
			return getRuleContext(Like_expressionContext.class,0);
		}
		public In_expressionContext in_expression() {
			return getRuleContext(In_expressionContext.class,0);
		}
		public Null_comparison_expressionContext null_comparison_expression() {
			return getRuleContext(Null_comparison_expressionContext.class,0);
		}
		public Empty_collection_comparison_expressionContext empty_collection_comparison_expression() {
			return getRuleContext(Empty_collection_comparison_expressionContext.class,0);
		}
		public Collection_member_expressionContext collection_member_expression() {
			return getRuleContext(Collection_member_expressionContext.class,0);
		}
		public Exists_expressionContext exists_expression() {
			return getRuleContext(Exists_expressionContext.class,0);
		}
		public Simple_cond_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_cond_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterSimple_cond_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitSimple_cond_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitSimple_cond_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_cond_expressionContext simple_cond_expression() throws RecognitionException {
		Simple_cond_expressionContext _localctx = new Simple_cond_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_simple_cond_expression);
		try {
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				comparison_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				between_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				like_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(529);
				in_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(530);
				null_comparison_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(531);
				empty_collection_comparison_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(532);
				collection_member_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(533);
				exists_expression();
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

	public static class Between_expressionContext extends ParserRuleContext {
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public List<Datetime_expressionContext> datetime_expression() {
			return getRuleContexts(Datetime_expressionContext.class);
		}
		public Datetime_expressionContext datetime_expression(int i) {
			return getRuleContext(Datetime_expressionContext.class,i);
		}
		public Between_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_between_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterBetween_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitBetween_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitBetween_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Between_expressionContext between_expression() throws RecognitionException {
		Between_expressionContext _localctx = new Between_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_between_expression);
		int _la;
		try {
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				arithmetic_expression();
				setState(538);
				_la = _input.LA(1);
				if (_la==T__35) {
					{
					setState(537);
					match(T__35);
					}
				}

				setState(540);
				match(T__36);
				setState(541);
				arithmetic_expression();
				setState(542);
				match(T__34);
				setState(543);
				arithmetic_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				string_expression();
				setState(547);
				_la = _input.LA(1);
				if (_la==T__35) {
					{
					setState(546);
					match(T__35);
					}
				}

				setState(549);
				match(T__36);
				setState(550);
				string_expression();
				setState(551);
				match(T__34);
				setState(552);
				string_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(554);
				datetime_expression();
				setState(556);
				_la = _input.LA(1);
				if (_la==T__35) {
					{
					setState(555);
					match(T__35);
					}
				}

				setState(558);
				match(T__36);
				setState(559);
				datetime_expression();
				setState(560);
				match(T__34);
				setState(561);
				datetime_expression();
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

	public static class In_expressionContext extends ParserRuleContext {
		public State_field_path_expressionContext state_field_path_expression() {
			return getRuleContext(State_field_path_expressionContext.class,0);
		}
		public List<In_itemContext> in_item() {
			return getRuleContexts(In_itemContext.class);
		}
		public In_itemContext in_item(int i) {
			return getRuleContext(In_itemContext.class,i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public In_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterIn_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitIn_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitIn_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_expressionContext in_expression() throws RecognitionException {
		In_expressionContext _localctx = new In_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_in_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			state_field_path_expression();
			setState(567);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(566);
				match(T__35);
				}
			}

			setState(569);
			match(T__9);
			setState(570);
			match(T__10);
			setState(580);
			switch (_input.LA(1)) {
			case T__1:
			case T__11:
			case T__73:
			case T__74:
				{
				setState(571);
				in_item();
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(572);
					match(T__1);
					setState(573);
					in_item();
					}
					}
					setState(578);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__17:
				{
				setState(579);
				subquery();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(582);
			match(T__11);
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

	public static class In_itemContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public In_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterIn_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitIn_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitIn_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_itemContext in_item() throws RecognitionException {
		In_itemContext _localctx = new In_itemContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_in_item);
		try {
			setState(586);
			switch (_input.LA(1)) {
			case T__1:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				literal();
				}
				break;
			case T__73:
			case T__74:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				input_parameter();
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

	public static class Like_expressionContext extends ParserRuleContext {
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public Pattern_valueContext pattern_value() {
			return getRuleContext(Pattern_valueContext.class,0);
		}
		public TerminalNode ESCAPE_CHARACTER() { return getToken(JpaParser.ESCAPE_CHARACTER, 0); }
		public Like_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_like_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterLike_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitLike_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitLike_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Like_expressionContext like_expression() throws RecognitionException {
		Like_expressionContext _localctx = new Like_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_like_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			string_expression();
			setState(590);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(589);
				match(T__35);
				}
			}

			setState(592);
			match(T__37);
			setState(593);
			pattern_value();
			setState(596);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(594);
				match(T__38);
				setState(595);
				match(ESCAPE_CHARACTER);
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

	public static class Null_comparison_expressionContext extends ParserRuleContext {
		public Single_valued_path_expressionContext single_valued_path_expression() {
			return getRuleContext(Single_valued_path_expressionContext.class,0);
		}
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Null_comparison_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_comparison_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterNull_comparison_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitNull_comparison_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitNull_comparison_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_comparison_expressionContext null_comparison_expression() throws RecognitionException {
		Null_comparison_expressionContext _localctx = new Null_comparison_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_null_comparison_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			switch (_input.LA(1)) {
			case IDENTIFICATION_VARIABLE:
				{
				setState(598);
				single_valued_path_expression();
				}
				break;
			case T__73:
			case T__74:
				{
				setState(599);
				input_parameter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(602);
			match(T__39);
			setState(604);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(603);
				match(T__35);
				}
			}

			setState(606);
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

	public static class Empty_collection_comparison_expressionContext extends ParserRuleContext {
		public Collection_valued_path_expressionContext collection_valued_path_expression() {
			return getRuleContext(Collection_valued_path_expressionContext.class,0);
		}
		public Empty_collection_comparison_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_collection_comparison_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterEmpty_collection_comparison_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitEmpty_collection_comparison_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitEmpty_collection_comparison_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_collection_comparison_expressionContext empty_collection_comparison_expression() throws RecognitionException {
		Empty_collection_comparison_expressionContext _localctx = new Empty_collection_comparison_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_empty_collection_comparison_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			collection_valued_path_expression();
			setState(609);
			match(T__39);
			setState(611);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(610);
				match(T__35);
				}
			}

			setState(613);
			match(T__40);
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

	public static class Collection_member_expressionContext extends ParserRuleContext {
		public Entity_expressionContext entity_expression() {
			return getRuleContext(Entity_expressionContext.class,0);
		}
		public Collection_valued_path_expressionContext collection_valued_path_expression() {
			return getRuleContext(Collection_valued_path_expressionContext.class,0);
		}
		public Collection_member_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_member_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterCollection_member_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitCollection_member_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitCollection_member_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collection_member_expressionContext collection_member_expression() throws RecognitionException {
		Collection_member_expressionContext _localctx = new Collection_member_expressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_collection_member_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			entity_expression();
			setState(617);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(616);
				match(T__35);
				}
			}

			setState(619);
			match(T__41);
			setState(621);
			_la = _input.LA(1);
			if (_la==T__42) {
				{
				setState(620);
				match(T__42);
				}
			}

			setState(623);
			collection_valued_path_expression();
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

	public static class Exists_expressionContext extends ParserRuleContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Exists_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exists_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterExists_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitExists_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitExists_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exists_expressionContext exists_expression() throws RecognitionException {
		Exists_expressionContext _localctx = new Exists_expressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_exists_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(625);
				match(T__35);
				}
			}

			setState(628);
			match(T__43);
			setState(629);
			match(T__10);
			setState(630);
			subquery();
			setState(631);
			match(T__11);
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

	public static class All_or_any_expressionContext extends ParserRuleContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public All_or_any_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_or_any_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterAll_or_any_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitAll_or_any_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitAll_or_any_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final All_or_any_expressionContext all_or_any_expression() throws RecognitionException {
		All_or_any_expressionContext _localctx = new All_or_any_expressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_all_or_any_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(634);
			match(T__10);
			setState(635);
			subquery();
			setState(636);
			match(T__11);
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

	public static class Comparison_expressionContext extends ParserRuleContext {
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public Comparison_operatorContext comparison_operator() {
			return getRuleContext(Comparison_operatorContext.class,0);
		}
		public All_or_any_expressionContext all_or_any_expression() {
			return getRuleContext(All_or_any_expressionContext.class,0);
		}
		public List<Boolean_expressionContext> boolean_expression() {
			return getRuleContexts(Boolean_expressionContext.class);
		}
		public Boolean_expressionContext boolean_expression(int i) {
			return getRuleContext(Boolean_expressionContext.class,i);
		}
		public List<Enum_expressionContext> enum_expression() {
			return getRuleContexts(Enum_expressionContext.class);
		}
		public Enum_expressionContext enum_expression(int i) {
			return getRuleContext(Enum_expressionContext.class,i);
		}
		public List<Datetime_expressionContext> datetime_expression() {
			return getRuleContexts(Datetime_expressionContext.class);
		}
		public Datetime_expressionContext datetime_expression(int i) {
			return getRuleContext(Datetime_expressionContext.class,i);
		}
		public List<Entity_expressionContext> entity_expression() {
			return getRuleContexts(Entity_expressionContext.class);
		}
		public Entity_expressionContext entity_expression(int i) {
			return getRuleContext(Entity_expressionContext.class,i);
		}
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public Comparison_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterComparison_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitComparison_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitComparison_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_expressionContext comparison_expression() throws RecognitionException {
		Comparison_expressionContext _localctx = new Comparison_expressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_comparison_expression);
		int _la;
		try {
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				string_expression();
				setState(639);
				comparison_operator();
				setState(642);
				switch (_input.LA(1)) {
				case T__10:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__65:
				case T__66:
				case T__67:
				case T__68:
				case T__69:
				case T__73:
				case T__74:
				case IDENTIFICATION_VARIABLE:
				case STRINGLITERAL:
					{
					setState(640);
					string_expression();
					}
					break;
				case T__44:
				case T__45:
				case T__46:
					{
					setState(641);
					all_or_any_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
				boolean_expression();
				setState(645);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__47) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(648);
				switch (_input.LA(1)) {
				case T__10:
				case T__73:
				case T__74:
				case T__75:
				case T__76:
				case IDENTIFICATION_VARIABLE:
					{
					setState(646);
					boolean_expression();
					}
					break;
				case T__44:
				case T__45:
				case T__46:
					{
					setState(647);
					all_or_any_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(650);
				enum_expression();
				setState(651);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__47) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(654);
				switch (_input.LA(1)) {
				case EOF:
				case T__10:
				case T__11:
				case T__27:
				case T__29:
				case T__30:
				case T__33:
				case T__34:
				case T__73:
				case T__74:
				case IDENTIFICATION_VARIABLE:
					{
					setState(652);
					enum_expression();
					}
					break;
				case T__44:
				case T__45:
				case T__46:
					{
					setState(653);
					all_or_any_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(656);
				datetime_expression();
				setState(657);
				comparison_operator();
				setState(660);
				switch (_input.LA(1)) {
				case T__10:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__62:
				case T__63:
				case T__64:
				case T__73:
				case T__74:
				case IDENTIFICATION_VARIABLE:
					{
					setState(658);
					datetime_expression();
					}
					break;
				case T__44:
				case T__45:
				case T__46:
					{
					setState(659);
					all_or_any_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(662);
				entity_expression();
				setState(663);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__47) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(666);
				switch (_input.LA(1)) {
				case T__73:
				case T__74:
				case IDENTIFICATION_VARIABLE:
					{
					setState(664);
					entity_expression();
					}
					break;
				case T__44:
				case T__45:
				case T__46:
					{
					setState(665);
					all_or_any_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(668);
				arithmetic_expression();
				setState(669);
				comparison_operator();
				setState(672);
				switch (_input.LA(1)) {
				case EOF:
				case T__10:
				case T__11:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__27:
				case T__29:
				case T__30:
				case T__33:
				case T__34:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case T__57:
				case T__58:
				case T__59:
				case T__60:
				case T__61:
				case T__73:
				case T__74:
				case IDENTIFICATION_VARIABLE:
					{
					setState(670);
					arithmetic_expression();
					}
					break;
				case T__44:
				case T__45:
				case T__46:
					{
					setState(671);
					all_or_any_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class Comparison_operatorContext extends ParserRuleContext {
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterComparison_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitComparison_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitComparison_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_comparison_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) ) {
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

	public static class Arithmetic_expressionContext extends ParserRuleContext {
		public Simple_arithmetic_expressionContext simple_arithmetic_expression() {
			return getRuleContext(Simple_arithmetic_expressionContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Arithmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterArithmetic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitArithmetic_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitArithmetic_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_expressionContext arithmetic_expression() throws RecognitionException {
		Arithmetic_expressionContext _localctx = new Arithmetic_expressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_arithmetic_expression);
		try {
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				simple_arithmetic_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(679);
				match(T__10);
				setState(680);
				subquery();
				setState(681);
				match(T__11);
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

	public static class Simple_arithmetic_expressionContext extends ParserRuleContext {
		public List<Arithmetic_termContext> arithmetic_term() {
			return getRuleContexts(Arithmetic_termContext.class);
		}
		public Arithmetic_termContext arithmetic_term(int i) {
			return getRuleContext(Arithmetic_termContext.class,i);
		}
		public Simple_arithmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_arithmetic_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterSimple_arithmetic_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitSimple_arithmetic_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitSimple_arithmetic_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_arithmetic_expressionContext simple_arithmetic_expression() throws RecognitionException {
		Simple_arithmetic_expressionContext _localctx = new Simple_arithmetic_expressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_simple_arithmetic_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(685);
			arithmetic_term();
			}
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__52 || _la==T__53) {
				{
				{
				setState(686);
				_la = _input.LA(1);
				if ( !(_la==T__52 || _la==T__53) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(687);
				arithmetic_term();
				}
				}
				setState(692);
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

	public static class Arithmetic_termContext extends ParserRuleContext {
		public List<Arithmetic_factorContext> arithmetic_factor() {
			return getRuleContexts(Arithmetic_factorContext.class);
		}
		public Arithmetic_factorContext arithmetic_factor(int i) {
			return getRuleContext(Arithmetic_factorContext.class,i);
		}
		public Arithmetic_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterArithmetic_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitArithmetic_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitArithmetic_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_termContext arithmetic_term() throws RecognitionException {
		Arithmetic_termContext _localctx = new Arithmetic_termContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_arithmetic_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(693);
			arithmetic_factor();
			}
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__54 || _la==T__55) {
				{
				{
				setState(694);
				_la = _input.LA(1);
				if ( !(_la==T__54 || _la==T__55) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(695);
				arithmetic_factor();
				}
				}
				setState(700);
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

	public static class Arithmetic_factorContext extends ParserRuleContext {
		public Arithmetic_primaryContext arithmetic_primary() {
			return getRuleContext(Arithmetic_primaryContext.class,0);
		}
		public Arithmetic_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterArithmetic_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitArithmetic_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitArithmetic_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_factorContext arithmetic_factor() throws RecognitionException {
		Arithmetic_factorContext _localctx = new Arithmetic_factorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_arithmetic_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(701);
				_la = _input.LA(1);
				if ( !(_la==T__52 || _la==T__53) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(704);
			arithmetic_primary();
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

	public static class Arithmetic_primaryContext extends ParserRuleContext {
		public State_field_path_expressionContext state_field_path_expression() {
			return getRuleContext(State_field_path_expressionContext.class,0);
		}
		public Numeric_literalContext numeric_literal() {
			return getRuleContext(Numeric_literalContext.class,0);
		}
		public Simple_arithmetic_expressionContext simple_arithmetic_expression() {
			return getRuleContext(Simple_arithmetic_expressionContext.class,0);
		}
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Functions_returning_numericsContext functions_returning_numerics() {
			return getRuleContext(Functions_returning_numericsContext.class,0);
		}
		public Aggregate_expressionContext aggregate_expression() {
			return getRuleContext(Aggregate_expressionContext.class,0);
		}
		public Arithmetic_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterArithmetic_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitArithmetic_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitArithmetic_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_primaryContext arithmetic_primary() throws RecognitionException {
		Arithmetic_primaryContext _localctx = new Arithmetic_primaryContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_arithmetic_primary);
		try {
			setState(715);
			switch (_input.LA(1)) {
			case IDENTIFICATION_VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				state_field_path_expression();
				}
				break;
			case EOF:
			case T__1:
			case T__11:
			case T__14:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				numeric_literal();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(708);
				match(T__10);
				setState(709);
				simple_arithmetic_expression();
				setState(710);
				match(T__11);
				}
				break;
			case T__73:
			case T__74:
				enterOuterAlt(_localctx, 4);
				{
				setState(712);
				input_parameter();
				}
				break;
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
				enterOuterAlt(_localctx, 5);
				{
				setState(713);
				functions_returning_numerics();
				}
				break;
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 6);
				{
				setState(714);
				aggregate_expression();
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

	public static class String_expressionContext extends ParserRuleContext {
		public String_primaryContext string_primary() {
			return getRuleContext(String_primaryContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public String_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterString_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitString_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitString_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_expressionContext string_expression() throws RecognitionException {
		String_expressionContext _localctx = new String_expressionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_string_expression);
		try {
			setState(722);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__73:
			case T__74:
			case IDENTIFICATION_VARIABLE:
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(717);
				string_primary();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(718);
				match(T__10);
				setState(719);
				subquery();
				setState(720);
				match(T__11);
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

	public static class String_primaryContext extends ParserRuleContext {
		public State_field_path_expressionContext state_field_path_expression() {
			return getRuleContext(State_field_path_expressionContext.class,0);
		}
		public TerminalNode STRINGLITERAL() { return getToken(JpaParser.STRINGLITERAL, 0); }
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Functions_returning_stringsContext functions_returning_strings() {
			return getRuleContext(Functions_returning_stringsContext.class,0);
		}
		public Aggregate_expressionContext aggregate_expression() {
			return getRuleContext(Aggregate_expressionContext.class,0);
		}
		public String_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterString_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitString_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitString_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_primaryContext string_primary() throws RecognitionException {
		String_primaryContext _localctx = new String_primaryContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_string_primary);
		try {
			setState(729);
			switch (_input.LA(1)) {
			case IDENTIFICATION_VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(724);
				state_field_path_expression();
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				match(STRINGLITERAL);
				}
				break;
			case T__73:
			case T__74:
				enterOuterAlt(_localctx, 3);
				{
				setState(726);
				input_parameter();
				}
				break;
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
				enterOuterAlt(_localctx, 4);
				{
				setState(727);
				functions_returning_strings();
				}
				break;
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(728);
				aggregate_expression();
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

	public static class Datetime_expressionContext extends ParserRuleContext {
		public Datetime_primaryContext datetime_primary() {
			return getRuleContext(Datetime_primaryContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Datetime_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetime_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterDatetime_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitDatetime_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitDatetime_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datetime_expressionContext datetime_expression() throws RecognitionException {
		Datetime_expressionContext _localctx = new Datetime_expressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_datetime_expression);
		try {
			setState(736);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__62:
			case T__63:
			case T__64:
			case T__73:
			case T__74:
			case IDENTIFICATION_VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				datetime_primary();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				match(T__10);
				setState(733);
				subquery();
				setState(734);
				match(T__11);
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

	public static class Datetime_primaryContext extends ParserRuleContext {
		public State_field_path_expressionContext state_field_path_expression() {
			return getRuleContext(State_field_path_expressionContext.class,0);
		}
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Functions_returning_datetimeContext functions_returning_datetime() {
			return getRuleContext(Functions_returning_datetimeContext.class,0);
		}
		public Aggregate_expressionContext aggregate_expression() {
			return getRuleContext(Aggregate_expressionContext.class,0);
		}
		public Datetime_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetime_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterDatetime_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitDatetime_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitDatetime_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datetime_primaryContext datetime_primary() throws RecognitionException {
		Datetime_primaryContext _localctx = new Datetime_primaryContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_datetime_primary);
		try {
			setState(742);
			switch (_input.LA(1)) {
			case IDENTIFICATION_VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				state_field_path_expression();
				}
				break;
			case T__73:
			case T__74:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				input_parameter();
				}
				break;
			case T__62:
			case T__63:
			case T__64:
				enterOuterAlt(_localctx, 3);
				{
				setState(740);
				functions_returning_datetime();
				}
				break;
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(741);
				aggregate_expression();
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

	public static class Boolean_expressionContext extends ParserRuleContext {
		public Boolean_primaryContext boolean_primary() {
			return getRuleContext(Boolean_primaryContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterBoolean_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitBoolean_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitBoolean_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_boolean_expression);
		try {
			setState(749);
			switch (_input.LA(1)) {
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case IDENTIFICATION_VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(744);
				boolean_primary();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(745);
				match(T__10);
				setState(746);
				subquery();
				setState(747);
				match(T__11);
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

	public static class Boolean_primaryContext extends ParserRuleContext {
		public State_field_path_expressionContext state_field_path_expression() {
			return getRuleContext(State_field_path_expressionContext.class,0);
		}
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Boolean_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterBoolean_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitBoolean_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitBoolean_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_primaryContext boolean_primary() throws RecognitionException {
		Boolean_primaryContext _localctx = new Boolean_primaryContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_boolean_primary);
		try {
			setState(754);
			switch (_input.LA(1)) {
			case IDENTIFICATION_VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				state_field_path_expression();
				}
				break;
			case T__75:
			case T__76:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				boolean_literal();
				}
				break;
			case T__73:
			case T__74:
				enterOuterAlt(_localctx, 3);
				{
				setState(753);
				input_parameter();
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

	public static class Enum_expressionContext extends ParserRuleContext {
		public Enum_primaryContext enum_primary() {
			return getRuleContext(Enum_primaryContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public Enum_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterEnum_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitEnum_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitEnum_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_expressionContext enum_expression() throws RecognitionException {
		Enum_expressionContext _localctx = new Enum_expressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_enum_expression);
		try {
			setState(761);
			switch (_input.LA(1)) {
			case EOF:
			case T__11:
			case T__14:
			case T__27:
			case T__29:
			case T__30:
			case T__33:
			case T__34:
			case T__47:
			case T__73:
			case T__74:
			case IDENTIFICATION_VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
				enum_primary();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				match(T__10);
				setState(758);
				subquery();
				setState(759);
				match(T__11);
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

	public static class Enum_primaryContext extends ParserRuleContext {
		public State_field_path_expressionContext state_field_path_expression() {
			return getRuleContext(State_field_path_expressionContext.class,0);
		}
		public Enum_literalContext enum_literal() {
			return getRuleContext(Enum_literalContext.class,0);
		}
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Enum_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterEnum_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitEnum_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitEnum_primary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_primaryContext enum_primary() throws RecognitionException {
		Enum_primaryContext _localctx = new Enum_primaryContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_enum_primary);
		try {
			setState(766);
			switch (_input.LA(1)) {
			case IDENTIFICATION_VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				state_field_path_expression();
				}
				break;
			case EOF:
			case T__1:
			case T__11:
			case T__14:
			case T__26:
			case T__27:
			case T__29:
			case T__30:
			case T__33:
			case T__34:
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				enum_literal();
				}
				break;
			case T__73:
			case T__74:
				enterOuterAlt(_localctx, 3);
				{
				setState(765);
				input_parameter();
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

	public static class Entity_expressionContext extends ParserRuleContext {
		public Single_valued_association_path_expressionContext single_valued_association_path_expression() {
			return getRuleContext(Single_valued_association_path_expressionContext.class,0);
		}
		public Simple_entity_expressionContext simple_entity_expression() {
			return getRuleContext(Simple_entity_expressionContext.class,0);
		}
		public Entity_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterEntity_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitEntity_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitEntity_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_expressionContext entity_expression() throws RecognitionException {
		Entity_expressionContext _localctx = new Entity_expressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_entity_expression);
		try {
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(768);
				single_valued_association_path_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(769);
				simple_entity_expression();
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

	public static class Simple_entity_expressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(JpaParser.IDENTIFICATION_VARIABLE, 0); }
		public Input_parameterContext input_parameter() {
			return getRuleContext(Input_parameterContext.class,0);
		}
		public Simple_entity_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_entity_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterSimple_entity_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitSimple_entity_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitSimple_entity_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_entity_expressionContext simple_entity_expression() throws RecognitionException {
		Simple_entity_expressionContext _localctx = new Simple_entity_expressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_simple_entity_expression);
		try {
			setState(774);
			switch (_input.LA(1)) {
			case IDENTIFICATION_VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				match(IDENTIFICATION_VARIABLE);
				}
				break;
			case T__73:
			case T__74:
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				input_parameter();
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

	public static class Functions_returning_numericsContext extends ParserRuleContext {
		public List<String_primaryContext> string_primary() {
			return getRuleContexts(String_primaryContext.class);
		}
		public String_primaryContext string_primary(int i) {
			return getRuleContext(String_primaryContext.class,i);
		}
		public List<Simple_arithmetic_expressionContext> simple_arithmetic_expression() {
			return getRuleContexts(Simple_arithmetic_expressionContext.class);
		}
		public Simple_arithmetic_expressionContext simple_arithmetic_expression(int i) {
			return getRuleContext(Simple_arithmetic_expressionContext.class,i);
		}
		public Collection_valued_path_expressionContext collection_valued_path_expression() {
			return getRuleContext(Collection_valued_path_expressionContext.class,0);
		}
		public Functions_returning_numericsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions_returning_numerics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterFunctions_returning_numerics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitFunctions_returning_numerics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitFunctions_returning_numerics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Functions_returning_numericsContext functions_returning_numerics() throws RecognitionException {
		Functions_returning_numericsContext _localctx = new Functions_returning_numericsContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_functions_returning_numerics);
		int _la;
		try {
			setState(814);
			switch (_input.LA(1)) {
			case T__56:
				enterOuterAlt(_localctx, 1);
				{
				setState(776);
				match(T__56);
				setState(777);
				match(T__10);
				setState(778);
				string_primary();
				setState(779);
				match(T__11);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				match(T__57);
				setState(782);
				match(T__10);
				setState(783);
				string_primary();
				setState(784);
				match(T__1);
				setState(785);
				string_primary();
				setState(788);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(786);
					match(T__1);
					setState(787);
					simple_arithmetic_expression();
					}
				}

				setState(790);
				match(T__11);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 3);
				{
				setState(792);
				match(T__58);
				setState(793);
				match(T__10);
				setState(794);
				simple_arithmetic_expression();
				setState(795);
				match(T__11);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 4);
				{
				setState(797);
				match(T__59);
				setState(798);
				match(T__10);
				setState(799);
				simple_arithmetic_expression();
				setState(800);
				match(T__11);
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 5);
				{
				setState(802);
				match(T__60);
				setState(803);
				match(T__10);
				setState(804);
				simple_arithmetic_expression();
				setState(805);
				match(T__1);
				setState(806);
				simple_arithmetic_expression();
				setState(807);
				match(T__11);
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 6);
				{
				setState(809);
				match(T__61);
				setState(810);
				match(T__10);
				setState(811);
				collection_valued_path_expression();
				setState(812);
				match(T__11);
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

	public static class Functions_returning_datetimeContext extends ParserRuleContext {
		public Functions_returning_datetimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions_returning_datetime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterFunctions_returning_datetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitFunctions_returning_datetime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitFunctions_returning_datetime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Functions_returning_datetimeContext functions_returning_datetime() throws RecognitionException {
		Functions_returning_datetimeContext _localctx = new Functions_returning_datetimeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_functions_returning_datetime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__63 - 63)) | (1L << (T__64 - 63)))) != 0)) ) {
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

	public static class Functions_returning_stringsContext extends ParserRuleContext {
		public List<String_primaryContext> string_primary() {
			return getRuleContexts(String_primaryContext.class);
		}
		public String_primaryContext string_primary(int i) {
			return getRuleContext(String_primaryContext.class,i);
		}
		public List<Simple_arithmetic_expressionContext> simple_arithmetic_expression() {
			return getRuleContexts(Simple_arithmetic_expressionContext.class);
		}
		public Simple_arithmetic_expressionContext simple_arithmetic_expression(int i) {
			return getRuleContext(Simple_arithmetic_expressionContext.class,i);
		}
		public Trim_specificationContext trim_specification() {
			return getRuleContext(Trim_specificationContext.class,0);
		}
		public TerminalNode TRIM_CHARACTER() { return getToken(JpaParser.TRIM_CHARACTER, 0); }
		public Functions_returning_stringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions_returning_strings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterFunctions_returning_strings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitFunctions_returning_strings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitFunctions_returning_strings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Functions_returning_stringsContext functions_returning_strings() throws RecognitionException {
		Functions_returning_stringsContext _localctx = new Functions_returning_stringsContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_functions_returning_strings);
		int _la;
		try {
			setState(858);
			switch (_input.LA(1)) {
			case T__65:
				enterOuterAlt(_localctx, 1);
				{
				setState(818);
				match(T__65);
				setState(819);
				match(T__10);
				setState(820);
				string_primary();
				setState(821);
				match(T__1);
				setState(822);
				string_primary();
				setState(823);
				match(T__11);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 2);
				{
				setState(825);
				match(T__66);
				setState(826);
				match(T__10);
				setState(827);
				string_primary();
				setState(828);
				match(T__1);
				setState(829);
				simple_arithmetic_expression();
				setState(830);
				match(T__1);
				setState(831);
				simple_arithmetic_expression();
				setState(832);
				match(T__11);
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 3);
				{
				setState(834);
				match(T__67);
				setState(835);
				match(T__10);
				setState(843);
				_la = _input.LA(1);
				if (_la==T__0 || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__72 - 71)) | (1L << (TRIM_CHARACTER - 71)))) != 0)) {
					{
					setState(837);
					_la = _input.LA(1);
					if (((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__72 - 71)))) != 0)) {
						{
						setState(836);
						trim_specification();
						}
					}

					setState(840);
					_la = _input.LA(1);
					if (_la==TRIM_CHARACTER) {
						{
						setState(839);
						match(TRIM_CHARACTER);
						}
					}

					setState(842);
					match(T__0);
					}
				}

				setState(845);
				string_primary();
				setState(846);
				match(T__11);
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 4);
				{
				setState(848);
				match(T__68);
				setState(849);
				match(T__10);
				setState(850);
				string_primary();
				setState(851);
				match(T__11);
				}
				break;
			case T__69:
				enterOuterAlt(_localctx, 5);
				{
				setState(853);
				match(T__69);
				setState(854);
				match(T__10);
				setState(855);
				string_primary();
				setState(856);
				match(T__11);
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

	public static class Trim_specificationContext extends ParserRuleContext {
		public Trim_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trim_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterTrim_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitTrim_specification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitTrim_specification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trim_specificationContext trim_specification() throws RecognitionException {
		Trim_specificationContext _localctx = new Trim_specificationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_trim_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__72 - 71)))) != 0)) ) {
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

	public static class Numeric_literalContext extends ParserRuleContext {
		public Numeric_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterNumeric_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitNumeric_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitNumeric_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_literalContext numeric_literal() throws RecognitionException {
		Numeric_literalContext _localctx = new Numeric_literalContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_numeric_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Pattern_valueContext extends ParserRuleContext {
		public Pattern_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterPattern_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitPattern_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitPattern_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_valueContext pattern_value() throws RecognitionException {
		Pattern_valueContext _localctx = new Pattern_valueContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_pattern_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Input_parameterContext extends ParserRuleContext {
		public TerminalNode INT_NUMERAL() { return getToken(JpaParser.INT_NUMERAL, 0); }
		public TerminalNode IDENTIFICATION_VARIABLE() { return getToken(JpaParser.IDENTIFICATION_VARIABLE, 0); }
		public Input_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterInput_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitInput_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitInput_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_parameterContext input_parameter() throws RecognitionException {
		Input_parameterContext _localctx = new Input_parameterContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_input_parameter);
		try {
			setState(870);
			switch (_input.LA(1)) {
			case T__73:
				enterOuterAlt(_localctx, 1);
				{
				setState(866);
				match(T__73);
				setState(867);
				match(INT_NUMERAL);
				}
				break;
			case T__74:
				enterOuterAlt(_localctx, 2);
				{
				setState(868);
				match(T__74);
				setState(869);
				match(IDENTIFICATION_VARIABLE);
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Constructor_nameContext extends ParserRuleContext {
		public Constructor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterConstructor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitConstructor_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitConstructor_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor_nameContext constructor_name() throws RecognitionException {
		Constructor_nameContext _localctx = new Constructor_nameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_constructor_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Enum_literalContext extends ParserRuleContext {
		public Enum_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterEnum_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitEnum_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitEnum_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_literalContext enum_literal() throws RecognitionException {
		Enum_literalContext _localctx = new Enum_literalContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_enum_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Boolean_literalContext extends ParserRuleContext {
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterBoolean_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitBoolean_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitBoolean_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			_la = _input.LA(1);
			if ( !(_la==T__75 || _la==T__76) ) {
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

	public static class Simple_state_fieldContext extends ParserRuleContext {
		public Simple_state_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_state_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterSimple_state_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitSimple_state_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitSimple_state_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_state_fieldContext simple_state_field() throws RecognitionException {
		Simple_state_fieldContext _localctx = new Simple_state_fieldContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_simple_state_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Embedded_class_state_fieldContext extends ParserRuleContext {
		public Embedded_class_state_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_embedded_class_state_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterEmbedded_class_state_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitEmbedded_class_state_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitEmbedded_class_state_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Embedded_class_state_fieldContext embedded_class_state_field() throws RecognitionException {
		Embedded_class_state_fieldContext _localctx = new Embedded_class_state_fieldContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_embedded_class_state_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Single_valued_association_fieldContext extends ParserRuleContext {
		public Single_valued_association_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_valued_association_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterSingle_valued_association_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitSingle_valued_association_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitSingle_valued_association_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_valued_association_fieldContext single_valued_association_field() throws RecognitionException {
		Single_valued_association_fieldContext _localctx = new Single_valued_association_fieldContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_single_valued_association_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Collection_valued_association_fieldContext extends ParserRuleContext {
		public Collection_valued_association_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_valued_association_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterCollection_valued_association_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitCollection_valued_association_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitCollection_valued_association_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collection_valued_association_fieldContext collection_valued_association_field() throws RecognitionException {
		Collection_valued_association_fieldContext _localctx = new Collection_valued_association_fieldContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_collection_valued_association_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Abstract_schema_nameContext extends ParserRuleContext {
		public Abstract_schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstract_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).enterAbstract_schema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JpaListener ) ((JpaListener)listener).exitAbstract_schema_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JpaVisitor ) return ((JpaVisitor<? extends T>)visitor).visitAbstract_schema_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Abstract_schema_nameContext abstract_schema_name() throws RecognitionException {
		Abstract_schema_nameContext _localctx = new Abstract_schema_nameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_abstract_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3V\u037d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\3\2\5\2\u00b4\n\2\3\3\3\3\3\3\5\3\u00b9"+
		"\n\3\3\3\5\3\u00bc\n\3\3\3\5\3\u00bf\n\3\3\3\5\3\u00c2\n\3\3\4\3\4\5\4"+
		"\u00c6\n\4\3\5\3\5\5\5\u00ca\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u00d1\n\6\7\6"+
		"\u00d3\n\6\f\6\16\6\u00d6\13\6\3\7\3\7\3\7\7\7\u00db\n\7\f\7\16\7\u00de"+
		"\13\7\3\b\3\b\5\b\u00e2\n\b\3\b\3\b\3\t\3\t\3\t\5\t\u00e9\n\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u00f3\n\13\3\13\5\13\u00f6\n\13\3\13\3"+
		"\13\3\f\3\f\5\f\u00fc\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u010b\n\17\3\17\3\17\3\20\3\20\5\20\u0111\n\20\3"+
		"\21\3\21\5\21\u0115\n\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u011f\n\22\f\22\16\22\u0122\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u012b\n\23\f\23\16\23\u012e\13\23\3\23\3\23\3\24\3\24\3\24\7\24"+
		"\u0135\n\24\f\24\16\24\u0138\13\24\3\24\3\24\3\25\3\25\3\25\5\25\u013f"+
		"\n\25\3\25\5\25\u0142\n\25\3\25\3\25\3\25\3\25\7\25\u0148\n\25\f\25\16"+
		"\25\u014b\13\25\3\26\3\26\5\26\u014f\n\26\3\26\3\26\5\26\u0153\n\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u015f\n\27\3\30"+
		"\3\30\3\30\3\30\5\30\u0165\n\30\3\30\5\30\u0168\n\30\3\31\3\31\5\31\u016c"+
		"\n\31\3\31\3\31\3\31\7\31\u0171\n\31\f\31\16\31\u0174\13\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u017e\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\7\33\u0186\n\33\f\33\16\33\u0189\13\33\3\33\3\33\3\34\3\34\5\34"+
		"\u018f\n\34\3\35\3\35\3\35\5\35\u0194\n\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\5\35\u019c\n\35\3\35\3\35\3\35\5\35\u01a1\n\35\3\35\5\35\u01a4\n\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\7\37\u01ae\n\37\f\37\16\37\u01b1"+
		"\13\37\3 \3 \5 \u01b5\n \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\7\"\u01bf\n\"\f"+
		"\"\16\"\u01c2\13\"\3#\3#\5#\u01c6\n#\3$\3$\3$\5$\u01cb\n$\3$\5$\u01ce"+
		"\n$\3$\5$\u01d1\n$\3%\3%\3%\3%\7%\u01d7\n%\f%\16%\u01da\13%\3&\3&\3&\5"+
		"&\u01df\n&\3&\3&\3&\5&\u01e4\n&\3\'\3\'\5\'\u01e8\n\'\3(\3(\5(\u01ec\n"+
		"(\3(\3(\3)\3)\3)\5)\u01f3\n)\3*\3*\3*\7*\u01f8\n*\f*\16*\u01fb\13*\3+"+
		"\3+\3+\7+\u0200\n+\f+\16+\u0203\13+\3,\5,\u0206\n,\3,\3,\3-\3-\3-\3-\3"+
		"-\5-\u020f\n-\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0219\n.\3/\3/\5/\u021d\n/\3"+
		"/\3/\3/\3/\3/\3/\3/\5/\u0226\n/\3/\3/\3/\3/\3/\3/\3/\5/\u022f\n/\3/\3"+
		"/\3/\3/\3/\5/\u0236\n/\3\60\3\60\5\60\u023a\n\60\3\60\3\60\3\60\3\60\3"+
		"\60\7\60\u0241\n\60\f\60\16\60\u0244\13\60\3\60\5\60\u0247\n\60\3\60\3"+
		"\60\3\61\3\61\5\61\u024d\n\61\3\62\3\62\5\62\u0251\n\62\3\62\3\62\3\62"+
		"\3\62\5\62\u0257\n\62\3\63\3\63\5\63\u025b\n\63\3\63\3\63\5\63\u025f\n"+
		"\63\3\63\3\63\3\64\3\64\3\64\5\64\u0266\n\64\3\64\3\64\3\65\3\65\5\65"+
		"\u026c\n\65\3\65\3\65\5\65\u0270\n\65\3\65\3\65\3\66\5\66\u0275\n\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\58\u0285"+
		"\n8\38\38\38\38\58\u028b\n8\38\38\38\38\58\u0291\n8\38\38\38\38\58\u0297"+
		"\n8\38\38\38\38\58\u029d\n8\38\38\38\38\58\u02a3\n8\58\u02a5\n8\39\39"+
		"\3:\3:\3:\3:\3:\5:\u02ae\n:\3;\3;\3;\7;\u02b3\n;\f;\16;\u02b6\13;\3<\3"+
		"<\3<\7<\u02bb\n<\f<\16<\u02be\13<\3=\5=\u02c1\n=\3=\3=\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3>\5>\u02ce\n>\3?\3?\3?\3?\3?\5?\u02d5\n?\3@\3@\3@\3@\3@\5@"+
		"\u02dc\n@\3A\3A\3A\3A\3A\5A\u02e3\nA\3B\3B\3B\3B\5B\u02e9\nB\3C\3C\3C"+
		"\3C\3C\5C\u02f0\nC\3D\3D\3D\5D\u02f5\nD\3E\3E\3E\3E\3E\5E\u02fc\nE\3F"+
		"\3F\3F\5F\u0301\nF\3G\3G\5G\u0305\nG\3H\3H\5H\u0309\nH\3I\3I\3I\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\5I\u0317\nI\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\5I\u0331\nI\3J\3J\3K\3K\3K\3K\3K"+
		"\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u0348\nK\3K\5K\u034b\nK"+
		"\3K\5K\u034e\nK\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u035d\nK\3L"+
		"\3L\3M\3M\3N\3N\3O\3O\3O\3O\5O\u0369\nO\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T"+
		"\3U\3U\3V\3V\3W\3W\3X\3X\3X\2\2Y\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\2\f\3\2\30"+
		"\33\3\2\"#\3\2/\61\4\2\21\21\62\62\4\2\21\21\62\66\3\2\678\3\29:\3\2A"+
		"C\3\2IK\3\2NO\u03b5\2\u00b3\3\2\2\2\4\u00b5\3\2\2\2\6\u00c3\3\2\2\2\b"+
		"\u00c7\3\2\2\2\n\u00cb\3\2\2\2\f\u00d7\3\2\2\2\16\u00df\3\2\2\2\20\u00e5"+
		"\3\2\2\2\22\u00ec\3\2\2\2\24\u00f5\3\2\2\2\26\u00fb\3\2\2\2\30\u00fd\3"+
		"\2\2\2\32\u0101\3\2\2\2\34\u0105\3\2\2\2\36\u0110\3\2\2\2 \u0114\3\2\2"+
		"\2\"\u0119\3\2\2\2$\u0125\3\2\2\2&\u0136\3\2\2\2(\u013b\3\2\2\2*\u014e"+
		"\3\2\2\2,\u015e\3\2\2\2.\u0160\3\2\2\2\60\u0169\3\2\2\2\62\u017d\3\2\2"+
		"\2\64\u017f\3\2\2\2\66\u018e\3\2\2\28\u01a3\3\2\2\2:\u01a5\3\2\2\2<\u01a8"+
		"\3\2\2\2>\u01b4\3\2\2\2@\u01b6\3\2\2\2B\u01b9\3\2\2\2D\u01c3\3\2\2\2F"+
		"\u01c7\3\2\2\2H\u01d2\3\2\2\2J\u01e3\3\2\2\2L\u01e7\3\2\2\2N\u01e9\3\2"+
		"\2\2P\u01f2\3\2\2\2R\u01f4\3\2\2\2T\u01fc\3\2\2\2V\u0205\3\2\2\2X\u020e"+
		"\3\2\2\2Z\u0218\3\2\2\2\\\u0235\3\2\2\2^\u0237\3\2\2\2`\u024c\3\2\2\2"+
		"b\u024e\3\2\2\2d\u025a\3\2\2\2f\u0262\3\2\2\2h\u0269\3\2\2\2j\u0274\3"+
		"\2\2\2l\u027b\3\2\2\2n\u02a4\3\2\2\2p\u02a6\3\2\2\2r\u02ad\3\2\2\2t\u02af"+
		"\3\2\2\2v\u02b7\3\2\2\2x\u02c0\3\2\2\2z\u02cd\3\2\2\2|\u02d4\3\2\2\2~"+
		"\u02db\3\2\2\2\u0080\u02e2\3\2\2\2\u0082\u02e8\3\2\2\2\u0084\u02ef\3\2"+
		"\2\2\u0086\u02f4\3\2\2\2\u0088\u02fb\3\2\2\2\u008a\u0300\3\2\2\2\u008c"+
		"\u0304\3\2\2\2\u008e\u0308\3\2\2\2\u0090\u0330\3\2\2\2\u0092\u0332\3\2"+
		"\2\2\u0094\u035c\3\2\2\2\u0096\u035e\3\2\2\2\u0098\u0360\3\2\2\2\u009a"+
		"\u0362\3\2\2\2\u009c\u0368\3\2\2\2\u009e\u036a\3\2\2\2\u00a0\u036c\3\2"+
		"\2\2\u00a2\u036e\3\2\2\2\u00a4\u0370\3\2\2\2\u00a6\u0372\3\2\2\2\u00a8"+
		"\u0374\3\2\2\2\u00aa\u0376\3\2\2\2\u00ac\u0378\3\2\2\2\u00ae\u037a\3\2"+
		"\2\2\u00b0\u00b4\5\4\3\2\u00b1\u00b4\5\6\4\2\u00b2\u00b4\5\b\5\2\u00b3"+
		"\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\3\3\2\2\2"+
		"\u00b5\u00b6\5\60\31\2\u00b6\u00b8\5\n\6\2\u00b7\u00b9\5:\36\2\u00b8\u00b7"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00bc\5<\37\2\u00bb"+
		"\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bf\5@"+
		"!\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00c2\5B\"\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\5\3\2\2\2"+
		"\u00c3\u00c5\5(\25\2\u00c4\u00c6\5:\36\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\7\3\2\2\2\u00c7\u00c9\5.\30\2\u00c8\u00ca\5:\36\2\u00c9"+
		"\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\t\3\2\2\2\u00cb\u00cc\7\3\2\2"+
		"\u00cc\u00d4\5\f\7\2\u00cd\u00d0\7\4\2\2\u00ce\u00d1\5\f\7\2\u00cf\u00d1"+
		"\5\34\17\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d3\3\2\2\2"+
		"\u00d2\u00cd\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\13\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00dc\5\16\b\2\u00d8"+
		"\u00db\5\20\t\2\u00d9\u00db\5\22\n\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3"+
		"\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\r\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\5\u00aeX\2\u00e0\u00e2\7\5"+
		"\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e4\7P\2\2\u00e4\17\3\2\2\2\u00e5\u00e6\5\24\13\2\u00e6\u00e8\5\26"+
		"\f\2\u00e7\u00e9\7\5\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00eb\7P\2\2\u00eb\21\3\2\2\2\u00ec\u00ed\5\24\13"+
		"\2\u00ed\u00ee\7\6\2\2\u00ee\u00ef\5\26\f\2\u00ef\23\3\2\2\2\u00f0\u00f2"+
		"\7\7\2\2\u00f1\u00f3\7\b\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f6\7\t\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f4\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7\n\2\2\u00f8"+
		"\25\3\2\2\2\u00f9\u00fc\5\30\r\2\u00fa\u00fc\5\32\16\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fa\3\2\2\2\u00fc\27\3\2\2\2\u00fd\u00fe\7P\2\2\u00fe\u00ff"+
		"\7\13\2\2\u00ff\u0100\5\u00acW\2\u0100\31\3\2\2\2\u0101\u0102\7P\2\2\u0102"+
		"\u0103\7\13\2\2\u0103\u0104\5\u00aaV\2\u0104\33\3\2\2\2\u0105\u0106\7"+
		"\f\2\2\u0106\u0107\7\r\2\2\u0107\u0108\5$\23\2\u0108\u010a\7\16\2\2\u0109"+
		"\u010b\7\5\2\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010d\7P\2\2\u010d\35\3\2\2\2\u010e\u0111\5 \21\2\u010f\u0111"+
		"\5\"\22\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\37\3\2\2\2\u0112"+
		"\u0115\7P\2\2\u0113\u0115\5\"\22\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7\13\2\2\u0117\u0118\5&\24\2\u0118"+
		"!\3\2\2\2\u0119\u011a\7P\2\2\u011a\u0120\7\13\2\2\u011b\u011c\5\u00aa"+
		"V\2\u011c\u011d\7\13\2\2\u011d\u011f\3\2\2\2\u011e\u011b\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0123\u0124\5\u00aaV\2\u0124#\3\2\2\2\u0125\u0126"+
		"\7P\2\2\u0126\u012c\7\13\2\2\u0127\u0128\5\u00aaV\2\u0128\u0129\7\13\2"+
		"\2\u0129\u012b\3\2\2\2\u012a\u0127\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f"+
		"\u0130\5\u00acW\2\u0130%\3\2\2\2\u0131\u0132\5\u00a8U\2\u0132\u0133\7"+
		"\13\2\2\u0133\u0135\3\2\2\2\u0134\u0131\3\2\2\2\u0135\u0138\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2"+
		"\2\2\u0139\u013a\5\u00a6T\2\u013a\'\3\2\2\2\u013b\u013c\7\17\2\2\u013c"+
		"\u0141\5\u00aeX\2\u013d\u013f\7\5\2\2\u013e\u013d\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\7P\2\2\u0141\u013e\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7\20\2\2\u0144\u0149\5"+
		"*\26\2\u0145\u0146\7\4\2\2\u0146\u0148\5*\26\2\u0147\u0145\3\2\2\2\u0148"+
		"\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a)\3\2\2\2"+
		"\u014b\u0149\3\2\2\2\u014c\u014d\7P\2\2\u014d\u014f\7\13\2\2\u014e\u014c"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u0153\5&\24\2\u0151"+
		"\u0153\5\u00aaV\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154\u0155\7\21\2\2\u0155\u0156\5,\27\2\u0156+\3\2\2\2\u0157"+
		"\u015f\5t;\2\u0158\u015f\5~@\2\u0159\u015f\5\u0082B\2\u015a\u015f\5\u0086"+
		"D\2\u015b\u015f\5\u008aF\2\u015c\u015f\5\u008eH\2\u015d\u015f\7\22\2\2"+
		"\u015e\u0157\3\2\2\2\u015e\u0158\3\2\2\2\u015e\u0159\3\2\2\2\u015e\u015a"+
		"\3\2\2\2\u015e\u015b\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f"+
		"-\3\2\2\2\u0160\u0161\7\23\2\2\u0161\u0162\7\3\2\2\u0162\u0167\5\u00ae"+
		"X\2\u0163\u0165\7\5\2\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0168\7P\2\2\u0167\u0164\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168/\3\2\2\2\u0169\u016b\7\24\2\2\u016a\u016c\7\25\2\2\u016b\u016a"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0172\5\62\32\2"+
		"\u016e\u016f\7\4\2\2\u016f\u0171\5\62\32\2\u0170\u016e\3\2\2\2\u0171\u0174"+
		"\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\61\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0175\u017e\5\36\20\2\u0176\u017e\58\35\2\u0177\u017e\7"+
		"P\2\2\u0178\u0179\7\26\2\2\u0179\u017a\7\r\2\2\u017a\u017b\7P\2\2\u017b"+
		"\u017e\7\16\2\2\u017c\u017e\5\64\33\2\u017d\u0175\3\2\2\2\u017d\u0176"+
		"\3\2\2\2\u017d\u0177\3\2\2\2\u017d\u0178\3\2\2\2\u017d\u017c\3\2\2\2\u017e"+
		"\63\3\2\2\2\u017f\u0180\7\27\2\2\u0180\u0181\5\u00a0Q\2\u0181\u0182\7"+
		"\r\2\2\u0182\u0187\5\66\34\2\u0183\u0184\7\4\2\2\u0184\u0186\5\66\34\2"+
		"\u0185\u0183\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188"+
		"\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018b\7\16\2\2"+
		"\u018b\65\3\2\2\2\u018c\u018f\5\36\20\2\u018d\u018f\58\35\2\u018e\u018c"+
		"\3\2\2\2\u018e\u018d\3\2\2\2\u018f\67\3\2\2\2\u0190\u0191\t\2\2\2\u0191"+
		"\u0193\7\r\2\2\u0192\u0194\7\25\2\2\u0193\u0192\3\2\2\2\u0193\u0194\3"+
		"\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\5 \21\2\u0196\u0197\7\16\2\2\u0197"+
		"\u01a4\3\2\2\2\u0198\u0199\7\34\2\2\u0199\u019b\7\r\2\2\u019a\u019c\7"+
		"\25\2\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u01a0\3\2\2\2\u019d"+
		"\u01a1\7P\2\2\u019e\u01a1\5 \21\2\u019f\u01a1\5\"\22\2\u01a0\u019d\3\2"+
		"\2\2\u01a0\u019e\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a4\7\16\2\2\u01a3\u0190\3\2\2\2\u01a3\u0198\3\2\2\2\u01a49\3\2\2\2"+
		"\u01a5\u01a6\7\35\2\2\u01a6\u01a7\5R*\2\u01a7;\3\2\2\2\u01a8\u01a9\7\36"+
		"\2\2\u01a9\u01aa\7\37\2\2\u01aa\u01af\5> \2\u01ab\u01ac\7\4\2\2\u01ac"+
		"\u01ae\5> \2\u01ad\u01ab\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2"+
		"\2\u01af\u01b0\3\2\2\2\u01b0=\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b5"+
		"\5\36\20\2\u01b3\u01b5\7P\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2"+
		"\u01b5?\3\2\2\2\u01b6\u01b7\7 \2\2\u01b7\u01b8\5R*\2\u01b8A\3\2\2\2\u01b9"+
		"\u01ba\7!\2\2\u01ba\u01bb\7\37\2\2\u01bb\u01c0\5D#\2\u01bc\u01bd\7\4\2"+
		"\2\u01bd\u01bf\5D#\2\u01be\u01bc\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be"+
		"\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1C\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3"+
		"\u01c5\5 \21\2\u01c4\u01c6\t\3\2\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2"+
		"\2\2\u01c6E\3\2\2\2\u01c7\u01c8\5N(\2\u01c8\u01ca\5H%\2\u01c9\u01cb\5"+
		":\36\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc"+
		"\u01ce\5<\37\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2"+
		"\2\2\u01cf\u01d1\5@!\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1G"+
		"\3\2\2\2\u01d2\u01d3\7\3\2\2\u01d3\u01d8\5J&\2\u01d4\u01d5\7\4\2\2\u01d5"+
		"\u01d7\5J&\2\u01d6\u01d4\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2"+
		"\2\u01d8\u01d9\3\2\2\2\u01d9I\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01e4"+
		"\5\f\7\2\u01dc\u01de\5L\'\2\u01dd\u01df\7\5\2\2\u01de\u01dd\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\7P\2\2\u01e1\u01e4\3\2"+
		"\2\2\u01e2\u01e4\5\34\17\2\u01e3\u01db\3\2\2\2\u01e3\u01dc\3\2\2\2\u01e3"+
		"\u01e2\3\2\2\2\u01e4K\3\2\2\2\u01e5\u01e8\5$\23\2\u01e6\u01e8\5\"\22\2"+
		"\u01e7\u01e5\3\2\2\2\u01e7\u01e6\3\2\2\2\u01e8M\3\2\2\2\u01e9\u01eb\7"+
		"\24\2\2\u01ea\u01ec\7\25\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u01ee\5P)\2\u01eeO\3\2\2\2\u01ef\u01f3\5\36\20\2"+
		"\u01f0\u01f3\58\35\2\u01f1\u01f3\7P\2\2\u01f2\u01ef\3\2\2\2\u01f2\u01f0"+
		"\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3Q\3\2\2\2\u01f4\u01f9\5T+\2\u01f5\u01f6"+
		"\7$\2\2\u01f6\u01f8\5T+\2\u01f7\u01f5\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01faS\3\2\2\2\u01fb\u01f9\3\2\2\2"+
		"\u01fc\u0201\5V,\2\u01fd\u01fe\7%\2\2\u01fe\u0200\5V,\2\u01ff\u01fd\3"+
		"\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"U\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0206\7&\2\2\u0205\u0204\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\5X-\2\u0208W\3\2\2\2\u0209"+
		"\u020f\5Z.\2\u020a\u020b\7\r\2\2\u020b\u020c\5R*\2\u020c\u020d\7\16\2"+
		"\2\u020d\u020f\3\2\2\2\u020e\u0209\3\2\2\2\u020e\u020a\3\2\2\2\u020fY"+
		"\3\2\2\2\u0210\u0219\5n8\2\u0211\u0219\5\\/\2\u0212\u0219\5b\62\2\u0213"+
		"\u0219\5^\60\2\u0214\u0219\5d\63\2\u0215\u0219\5f\64\2\u0216\u0219\5h"+
		"\65\2\u0217\u0219\5j\66\2\u0218\u0210\3\2\2\2\u0218\u0211\3\2\2\2\u0218"+
		"\u0212\3\2\2\2\u0218\u0213\3\2\2\2\u0218\u0214\3\2\2\2\u0218\u0215\3\2"+
		"\2\2\u0218\u0216\3\2\2\2\u0218\u0217\3\2\2\2\u0219[\3\2\2\2\u021a\u021c"+
		"\5r:\2\u021b\u021d\7&\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u021f\7\'\2\2\u021f\u0220\5r:\2\u0220\u0221\7%\2"+
		"\2\u0221\u0222\5r:\2\u0222\u0236\3\2\2\2\u0223\u0225\5|?\2\u0224\u0226"+
		"\7&\2\2\u0225\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u0228\7\'\2\2\u0228\u0229\5|?\2\u0229\u022a\7%\2\2\u022a\u022b\5|?\2"+
		"\u022b\u0236\3\2\2\2\u022c\u022e\5\u0080A\2\u022d\u022f\7&\2\2\u022e\u022d"+
		"\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\7\'\2\2\u0231"+
		"\u0232\5\u0080A\2\u0232\u0233\7%\2\2\u0233\u0234\5\u0080A\2\u0234\u0236"+
		"\3\2\2\2\u0235\u021a\3\2\2\2\u0235\u0223\3\2\2\2\u0235\u022c\3\2\2\2\u0236"+
		"]\3\2\2\2\u0237\u0239\5 \21\2\u0238\u023a\7&\2\2\u0239\u0238\3\2\2\2\u0239"+
		"\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\7\f\2\2\u023c\u0246\7\r"+
		"\2\2\u023d\u0242\5`\61\2\u023e\u023f\7\4\2\2\u023f\u0241\5`\61\2\u0240"+
		"\u023e\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2"+
		"\2\2\u0243\u0247\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0247\5F$\2\u0246\u023d"+
		"\3\2\2\2\u0246\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\7\16\2\2"+
		"\u0249_\3\2\2\2\u024a\u024d\5\u009eP\2\u024b\u024d\5\u009cO\2\u024c\u024a"+
		"\3\2\2\2\u024c\u024b\3\2\2\2\u024da\3\2\2\2\u024e\u0250\5|?\2\u024f\u0251"+
		"\7&\2\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0253\7(\2\2\u0253\u0256\5\u009aN\2\u0254\u0255\7)\2\2\u0255\u0257\7"+
		"S\2\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257c\3\2\2\2\u0258\u025b"+
		"\5\36\20\2\u0259\u025b\5\u009cO\2\u025a\u0258\3\2\2\2\u025a\u0259\3\2"+
		"\2\2\u025b\u025c\3\2\2\2\u025c\u025e\7*\2\2\u025d\u025f\7&\2\2\u025e\u025d"+
		"\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\7\22\2\2"+
		"\u0261e\3\2\2\2\u0262\u0263\5$\23\2\u0263\u0265\7*\2\2\u0264\u0266\7&"+
		"\2\2\u0265\u0264\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\3\2\2\2\u0267"+
		"\u0268\7+\2\2\u0268g\3\2\2\2\u0269\u026b\5\u008cG\2\u026a\u026c\7&\2\2"+
		"\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026f"+
		"\7,\2\2\u026e\u0270\7-\2\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270"+
		"\u0271\3\2\2\2\u0271\u0272\5$\23\2\u0272i\3\2\2\2\u0273\u0275\7&\2\2\u0274"+
		"\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\7."+
		"\2\2\u0277\u0278\7\r\2\2\u0278\u0279\5F$\2\u0279\u027a\7\16\2\2\u027a"+
		"k\3\2\2\2\u027b\u027c\t\4\2\2\u027c\u027d\7\r\2\2\u027d\u027e\5F$\2\u027e"+
		"\u027f\7\16\2\2\u027fm\3\2\2\2\u0280\u0281\5|?\2\u0281\u0284\5p9\2\u0282"+
		"\u0285\5|?\2\u0283\u0285\5l\67\2\u0284\u0282\3\2\2\2\u0284\u0283\3\2\2"+
		"\2\u0285\u02a5\3\2\2\2\u0286\u0287\5\u0084C\2\u0287\u028a\t\5\2\2\u0288"+
		"\u028b\5\u0084C\2\u0289\u028b\5l\67\2\u028a\u0288\3\2\2\2\u028a\u0289"+
		"\3\2\2\2\u028b\u02a5\3\2\2\2\u028c\u028d\5\u0088E\2\u028d\u0290\t\5\2"+
		"\2\u028e\u0291\5\u0088E\2\u028f\u0291\5l\67\2\u0290\u028e\3\2\2\2\u0290"+
		"\u028f\3\2\2\2\u0291\u02a5\3\2\2\2\u0292\u0293\5\u0080A\2\u0293\u0296"+
		"\5p9\2\u0294\u0297\5\u0080A\2\u0295\u0297\5l\67\2\u0296\u0294\3\2\2\2"+
		"\u0296\u0295\3\2\2\2\u0297\u02a5\3\2\2\2\u0298\u0299\5\u008cG\2\u0299"+
		"\u029c\t\5\2\2\u029a\u029d\5\u008cG\2\u029b\u029d\5l\67\2\u029c\u029a"+
		"\3\2\2\2\u029c\u029b\3\2\2\2\u029d\u02a5\3\2\2\2\u029e\u029f\5r:\2\u029f"+
		"\u02a2\5p9\2\u02a0\u02a3\5r:\2\u02a1\u02a3\5l\67\2\u02a2\u02a0\3\2\2\2"+
		"\u02a2\u02a1\3\2\2\2\u02a3\u02a5\3\2\2\2\u02a4\u0280\3\2\2\2\u02a4\u0286"+
		"\3\2\2\2\u02a4\u028c\3\2\2\2\u02a4\u0292\3\2\2\2\u02a4\u0298\3\2\2\2\u02a4"+
		"\u029e\3\2\2\2\u02a5o\3\2\2\2\u02a6\u02a7\t\6\2\2\u02a7q\3\2\2\2\u02a8"+
		"\u02ae\5t;\2\u02a9\u02aa\7\r\2\2\u02aa\u02ab\5F$\2\u02ab\u02ac\7\16\2"+
		"\2\u02ac\u02ae\3\2\2\2\u02ad\u02a8\3\2\2\2\u02ad\u02a9\3\2\2\2\u02aes"+
		"\3\2\2\2\u02af\u02b4\5v<\2\u02b0\u02b1\t\7\2\2\u02b1\u02b3\5v<\2\u02b2"+
		"\u02b0\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2"+
		"\2\2\u02b5u\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02bc\5x=\2\u02b8\u02b9"+
		"\t\b\2\2\u02b9\u02bb\5x=\2\u02ba\u02b8\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc"+
		"\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bdw\3\2\2\2\u02be\u02bc\3\2\2\2"+
		"\u02bf\u02c1\t\7\2\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2"+
		"\3\2\2\2\u02c2\u02c3\5z>\2\u02c3y\3\2\2\2\u02c4\u02ce\5 \21\2\u02c5\u02ce"+
		"\5\u0098M\2\u02c6\u02c7\7\r\2\2\u02c7\u02c8\5t;\2\u02c8\u02c9\7\16\2\2"+
		"\u02c9\u02ce\3\2\2\2\u02ca\u02ce\5\u009cO\2\u02cb\u02ce\5\u0090I\2\u02cc"+
		"\u02ce\58\35\2\u02cd\u02c4\3\2\2\2\u02cd\u02c5\3\2\2\2\u02cd\u02c6\3\2"+
		"\2\2\u02cd\u02ca\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02cc\3\2\2\2\u02ce"+
		"{\3\2\2\2\u02cf\u02d5\5~@\2\u02d0\u02d1\7\r\2\2\u02d1\u02d2\5F$\2\u02d2"+
		"\u02d3\7\16\2\2\u02d3\u02d5\3\2\2\2\u02d4\u02cf\3\2\2\2\u02d4\u02d0\3"+
		"\2\2\2\u02d5}\3\2\2\2\u02d6\u02dc\5 \21\2\u02d7\u02dc\7R\2\2\u02d8\u02dc"+
		"\5\u009cO\2\u02d9\u02dc\5\u0094K\2\u02da\u02dc\58\35\2\u02db\u02d6\3\2"+
		"\2\2\u02db\u02d7\3\2\2\2\u02db\u02d8\3\2\2\2\u02db\u02d9\3\2\2\2\u02db"+
		"\u02da\3\2\2\2\u02dc\177\3\2\2\2\u02dd\u02e3\5\u0082B\2\u02de\u02df\7"+
		"\r\2\2\u02df\u02e0\5F$\2\u02e0\u02e1\7\16\2\2\u02e1\u02e3\3\2\2\2\u02e2"+
		"\u02dd\3\2\2\2\u02e2\u02de\3\2\2\2\u02e3\u0081\3\2\2\2\u02e4\u02e9\5 "+
		"\21\2\u02e5\u02e9\5\u009cO\2\u02e6\u02e9\5\u0092J\2\u02e7\u02e9\58\35"+
		"\2\u02e8\u02e4\3\2\2\2\u02e8\u02e5\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e7"+
		"\3\2\2\2\u02e9\u0083\3\2\2\2\u02ea\u02f0\5\u0086D\2\u02eb\u02ec\7\r\2"+
		"\2\u02ec\u02ed\5F$\2\u02ed\u02ee\7\16\2\2\u02ee\u02f0\3\2\2\2\u02ef\u02ea"+
		"\3\2\2\2\u02ef\u02eb\3\2\2\2\u02f0\u0085\3\2\2\2\u02f1\u02f5\5 \21\2\u02f2"+
		"\u02f5\5\u00a4S\2\u02f3\u02f5\5\u009cO\2\u02f4\u02f1\3\2\2\2\u02f4\u02f2"+
		"\3\2\2\2\u02f4\u02f3\3\2\2\2\u02f5\u0087\3\2\2\2\u02f6\u02fc\5\u008aF"+
		"\2\u02f7\u02f8\7\r\2\2\u02f8\u02f9\5F$\2\u02f9\u02fa\7\16\2\2\u02fa\u02fc"+
		"\3\2\2\2\u02fb\u02f6\3\2\2\2\u02fb\u02f7\3\2\2\2\u02fc\u0089\3\2\2\2\u02fd"+
		"\u0301\5 \21\2\u02fe\u0301\5\u00a2R\2\u02ff\u0301\5\u009cO\2\u0300\u02fd"+
		"\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u02ff\3\2\2\2\u0301\u008b\3\2\2\2\u0302"+
		"\u0305\5\"\22\2\u0303\u0305\5\u008eH\2\u0304\u0302\3\2\2\2\u0304\u0303"+
		"\3\2\2\2\u0305\u008d\3\2\2\2\u0306\u0309\7P\2\2\u0307\u0309\5\u009cO\2"+
		"\u0308\u0306\3\2\2\2\u0308\u0307\3\2\2\2\u0309\u008f\3\2\2\2\u030a\u030b"+
		"\7;\2\2\u030b\u030c\7\r\2\2\u030c\u030d\5~@\2\u030d\u030e\7\16\2\2\u030e"+
		"\u0331\3\2\2\2\u030f\u0310\7<\2\2\u0310\u0311\7\r\2\2\u0311\u0312\5~@"+
		"\2\u0312\u0313\7\4\2\2\u0313\u0316\5~@\2\u0314\u0315\7\4\2\2\u0315\u0317"+
		"\5t;\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\3\2\2\2\u0318"+
		"\u0319\7\16\2\2\u0319\u0331\3\2\2\2\u031a\u031b\7=\2\2\u031b\u031c\7\r"+
		"\2\2\u031c\u031d\5t;\2\u031d\u031e\7\16\2\2\u031e\u0331\3\2\2\2\u031f"+
		"\u0320\7>\2\2\u0320\u0321\7\r\2\2\u0321\u0322\5t;\2\u0322\u0323\7\16\2"+
		"\2\u0323\u0331\3\2\2\2\u0324\u0325\7?\2\2\u0325\u0326\7\r\2\2\u0326\u0327"+
		"\5t;\2\u0327\u0328\7\4\2\2\u0328\u0329\5t;\2\u0329\u032a\7\16\2\2\u032a"+
		"\u0331\3\2\2\2\u032b\u032c\7@\2\2\u032c\u032d\7\r\2\2\u032d\u032e\5$\23"+
		"\2\u032e\u032f\7\16\2\2\u032f\u0331\3\2\2\2\u0330\u030a\3\2\2\2\u0330"+
		"\u030f\3\2\2\2\u0330\u031a\3\2\2\2\u0330\u031f\3\2\2\2\u0330\u0324\3\2"+
		"\2\2\u0330\u032b\3\2\2\2\u0331\u0091\3\2\2\2\u0332\u0333\t\t\2\2\u0333"+
		"\u0093\3\2\2\2\u0334\u0335\7D\2\2\u0335\u0336\7\r\2\2\u0336\u0337\5~@"+
		"\2\u0337\u0338\7\4\2\2\u0338\u0339\5~@\2\u0339\u033a\7\16\2\2\u033a\u035d"+
		"\3\2\2\2\u033b\u033c\7E\2\2\u033c\u033d\7\r\2\2\u033d\u033e\5~@\2\u033e"+
		"\u033f\7\4\2\2\u033f\u0340\5t;\2\u0340\u0341\7\4\2\2\u0341\u0342\5t;\2"+
		"\u0342\u0343\7\16\2\2\u0343\u035d\3\2\2\2\u0344\u0345\7F\2\2\u0345\u034d"+
		"\7\r\2\2\u0346\u0348\5\u0096L\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2"+
		"\2\u0348\u034a\3\2\2\2\u0349\u034b\7U\2\2\u034a\u0349\3\2\2\2\u034a\u034b"+
		"\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034e\7\3\2\2\u034d\u0347\3\2\2\2\u034d"+
		"\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0350\5~@\2\u0350\u0351\7\16"+
		"\2\2\u0351\u035d\3\2\2\2\u0352\u0353\7G\2\2\u0353\u0354\7\r\2\2\u0354"+
		"\u0355\5~@\2\u0355\u0356\7\16\2\2\u0356\u035d\3\2\2\2\u0357\u0358\7H\2"+
		"\2\u0358\u0359\7\r\2\2\u0359\u035a\5~@\2\u035a\u035b\7\16\2\2\u035b\u035d"+
		"\3\2\2\2\u035c\u0334\3\2\2\2\u035c\u033b\3\2\2\2\u035c\u0344\3\2\2\2\u035c"+
		"\u0352\3\2\2\2\u035c\u0357\3\2\2\2\u035d\u0095\3\2\2\2\u035e\u035f\t\n"+
		"\2\2\u035f\u0097\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0099\3\2\2\2\u0362"+
		"\u0363\3\2\2\2\u0363\u009b\3\2\2\2\u0364\u0365\7L\2\2\u0365\u0369\7V\2"+
		"\2\u0366\u0367\7M\2\2\u0367\u0369\7P\2\2\u0368\u0364\3\2\2\2\u0368\u0366"+
		"\3\2\2\2\u0369\u009d\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u009f\3\2\2\2\u036c"+
		"\u036d\3\2\2\2\u036d\u00a1\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u00a3\3\2"+
		"\2\2\u0370\u0371\t\13\2\2\u0371\u00a5\3\2\2\2\u0372\u0373\3\2\2\2\u0373"+
		"\u00a7\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u00a9\3\2\2\2\u0376\u0377\3\2"+
		"\2\2\u0377\u00ab\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u00ad\3\2\2\2\u037a"+
		"\u037b\3\2\2\2\u037b\u00af\3\2\2\2h\u00b3\u00b8\u00bb\u00be\u00c1\u00c5"+
		"\u00c9\u00d0\u00d4\u00da\u00dc\u00e1\u00e8\u00f2\u00f5\u00fb\u010a\u0110"+
		"\u0114\u0120\u012c\u0136\u013e\u0141\u0149\u014e\u0152\u015e\u0164\u0167"+
		"\u016b\u0172\u017d\u0187\u018e\u0193\u019b\u01a0\u01a3\u01af\u01b4\u01c0"+
		"\u01c5\u01ca\u01cd\u01d0\u01d8\u01de\u01e3\u01e7\u01eb\u01f2\u01f9\u0201"+
		"\u0205\u020e\u0218\u021c\u0225\u022e\u0235\u0239\u0242\u0246\u024c\u0250"+
		"\u0256\u025a\u025e\u0265\u026b\u026f\u0274\u0284\u028a\u0290\u0296\u029c"+
		"\u02a2\u02a4\u02ad\u02b4\u02bc\u02c0\u02cd\u02d4\u02db\u02e2\u02e8\u02ef"+
		"\u02f4\u02fb\u0300\u0304\u0308\u0316\u0330\u0347\u034a\u034d\u035c\u0368";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}