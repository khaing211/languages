// Generated from Swift.g4 by ANTLR 4.5.3
package com.github.kn.language.parser.impl.model.backend.swift;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftParser extends Parser {
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
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, Identifier=94, 
		Implicit_parameter_name=95, Binary_literal=96, Octal_literal=97, Decimal_literal=98, 
		Hexadecimal_literal=99, Floating_point_literal=100, String_literal=101, 
		Escaped_character=102, WS=103, Block_comment=104, Line_comment=105;
	public static final int
		RULE_top_level = 0, RULE_statement = 1, RULE_statements = 2, RULE_loop_statement = 3, 
		RULE_for_statement = 4, RULE_for_init = 5, RULE_for_in_statement = 6, 
		RULE_while_statement = 7, RULE_while_condition = 8, RULE_do_while_statement = 9, 
		RULE_branch_statement = 10, RULE_if_statement = 11, RULE_if_condition = 12, 
		RULE_else_clause = 13, RULE_switch_statement = 14, RULE_switch_cases = 15, 
		RULE_switch_case = 16, RULE_case_label = 17, RULE_case_item_list = 18, 
		RULE_default_label = 19, RULE_guard_clause = 20, RULE_guard_expression = 21, 
		RULE_labeled_statement = 22, RULE_statement_label = 23, RULE_label_name = 24, 
		RULE_control_transfer_statement = 25, RULE_break_statement = 26, RULE_continue_statement = 27, 
		RULE_fallthrough_statement = 28, RULE_return_statement = 29, RULE_generic_parameter_clause = 30, 
		RULE_generic_parameter_list = 31, RULE_generic_parameter = 32, RULE_requirement_clause = 33, 
		RULE_requirement_list = 34, RULE_requirement = 35, RULE_conformance_requirement = 36, 
		RULE_same_type_requirement = 37, RULE_generic_argument_clause = 38, RULE_generic_argument_list = 39, 
		RULE_generic_argument = 40, RULE_declaration = 41, RULE_declarations = 42, 
		RULE_declaration_specifiers = 43, RULE_declaration_specifier = 44, RULE_code_block = 45, 
		RULE_import_declaration = 46, RULE_import_kind = 47, RULE_import_path = 48, 
		RULE_import_path_identifier = 49, RULE_constant_declaration = 50, RULE_pattern_initializer_list = 51, 
		RULE_pattern_initializer = 52, RULE_initializer = 53, RULE_variable_declaration = 54, 
		RULE_variable_declaration_head = 55, RULE_variable_name = 56, RULE_getter_setter_block = 57, 
		RULE_getter_clause = 58, RULE_setter_clause = 59, RULE_setter_name = 60, 
		RULE_getter_setter_keyword_block = 61, RULE_getter_keyword_clause = 62, 
		RULE_setter_keyword_clause = 63, RULE_willSet_didSet_block = 64, RULE_willSet_clause = 65, 
		RULE_didSet_clause = 66, RULE_typealias_declaration = 67, RULE_typealias_head = 68, 
		RULE_typealias_name = 69, RULE_typealias_assignment = 70, RULE_function_declaration = 71, 
		RULE_function_head = 72, RULE_function_name = 73, RULE_function_signature = 74, 
		RULE_function_result = 75, RULE_function_body = 76, RULE_parameter_clauses = 77, 
		RULE_parameter_clause = 78, RULE_parameter_list = 79, RULE_parameter = 80, 
		RULE_parameter_name = 81, RULE_local_parameter_name = 82, RULE_default_argument_clause = 83, 
		RULE_enum_declaration = 84, RULE_union_style_enum = 85, RULE_union_style_enum_members = 86, 
		RULE_union_style_enum_member = 87, RULE_union_style_enum_case_clause = 88, 
		RULE_union_style_enum_case_list = 89, RULE_union_style_enum_case = 90, 
		RULE_enum_name = 91, RULE_enum_case_name = 92, RULE_raw_value_style_enum = 93, 
		RULE_raw_value_style_enum_members = 94, RULE_raw_value_style_enum_member = 95, 
		RULE_raw_value_style_enum_case_clause = 96, RULE_raw_value_style_enum_case_list = 97, 
		RULE_raw_value_style_enum_case = 98, RULE_raw_value_assignment = 99, RULE_struct_declaration = 100, 
		RULE_struct_name = 101, RULE_struct_body = 102, RULE_class_declaration = 103, 
		RULE_class_name = 104, RULE_class_body = 105, RULE_protocol_declaration = 106, 
		RULE_protocol_name = 107, RULE_protocol_body = 108, RULE_protocol_member_declaration = 109, 
		RULE_protocol_member_declarations = 110, RULE_protocol_property_declaration = 111, 
		RULE_protocol_method_declaration = 112, RULE_protocol_initializer_declaration = 113, 
		RULE_protocol_subscript_declaration = 114, RULE_protocol_associated_type_declaration = 115, 
		RULE_initializer_declaration = 116, RULE_initializer_head = 117, RULE_initializer_body = 118, 
		RULE_deinitializer_declaration = 119, RULE_extension_declaration = 120, 
		RULE_extension_body = 121, RULE_subscript_declaration = 122, RULE_subscript_head = 123, 
		RULE_subscript_result = 124, RULE_operator_declaration = 125, RULE_prefix_operator_declaration = 126, 
		RULE_postfix_operator_declaration = 127, RULE_infix_operator_declaration = 128, 
		RULE_infix_operator_attributes = 129, RULE_precedence_clause = 130, RULE_precedence_level = 131, 
		RULE_associativity_clause = 132, RULE_associativity = 133, RULE_pattern = 134, 
		RULE_wildcard_pattern = 135, RULE_identifier_pattern = 136, RULE_value_binding_pattern = 137, 
		RULE_tuple_pattern = 138, RULE_tuple_pattern_element_list = 139, RULE_tuple_pattern_element = 140, 
		RULE_enum_case_pattern = 141, RULE_type_casting_pattern = 142, RULE_is_pattern = 143, 
		RULE_as_pattern = 144, RULE_expression_pattern = 145, RULE_attribute = 146, 
		RULE_attribute_name = 147, RULE_attribute_argument_clause = 148, RULE_attributes = 149, 
		RULE_balanced_tokens = 150, RULE_balanced_token = 151, RULE_expression_list = 152, 
		RULE_expression = 153, RULE_in_out_expression = 154, RULE_assignment_operator = 155, 
		RULE_conditional_operator = 156, RULE_type_casting_operator = 157, RULE_trailing_closure = 158, 
		RULE_primary_expression = 159, RULE_literal_expression = 160, RULE_array_literal = 161, 
		RULE_array_literal_items = 162, RULE_array_literal_item = 163, RULE_dictionary_literal = 164, 
		RULE_dictionary_literal_items = 165, RULE_dictionary_literal_item = 166, 
		RULE_self_expression = 167, RULE_superclass_expression = 168, RULE_superclass_method_expression = 169, 
		RULE_superclass_subscript_expression = 170, RULE_superclass_initializer_expression = 171, 
		RULE_closure_expression = 172, RULE_closure_signature = 173, RULE_capture_list = 174, 
		RULE_capture_specifier = 175, RULE_implicit_member_expression = 176, RULE_parenthesized_expression = 177, 
		RULE_expression_element_list = 178, RULE_expression_element = 179, RULE_wildcard_expression = 180, 
		RULE_operator = 181, RULE_binary_operator = 182, RULE_prefix_operator = 183, 
		RULE_postfix_operator = 184, RULE_type = 185, RULE_type_annotation = 186, 
		RULE_type_identifier = 187, RULE_type_name = 188, RULE_tuple_type = 189, 
		RULE_tuple_type_body = 190, RULE_tuple_type_element_list = 191, RULE_tuple_type_element = 192, 
		RULE_element_name = 193, RULE_protocol_composition_type = 194, RULE_protocol_identifier_list = 195, 
		RULE_protocol_identifier = 196, RULE_metatype_type = 197, RULE_type_inheritance_clause = 198, 
		RULE_type_inheritance_list = 199, RULE_identifier = 200, RULE_keyword = 201, 
		RULE_context_sensitive_keyword = 202, RULE_identifier_list = 203, RULE_literal = 204, 
		RULE_integer_literal = 205;
	public static final String[] ruleNames = {
		"top_level", "statement", "statements", "loop_statement", "for_statement", 
		"for_init", "for_in_statement", "while_statement", "while_condition", 
		"do_while_statement", "branch_statement", "if_statement", "if_condition", 
		"else_clause", "switch_statement", "switch_cases", "switch_case", "case_label", 
		"case_item_list", "default_label", "guard_clause", "guard_expression", 
		"labeled_statement", "statement_label", "label_name", "control_transfer_statement", 
		"break_statement", "continue_statement", "fallthrough_statement", "return_statement", 
		"generic_parameter_clause", "generic_parameter_list", "generic_parameter", 
		"requirement_clause", "requirement_list", "requirement", "conformance_requirement", 
		"same_type_requirement", "generic_argument_clause", "generic_argument_list", 
		"generic_argument", "declaration", "declarations", "declaration_specifiers", 
		"declaration_specifier", "code_block", "import_declaration", "import_kind", 
		"import_path", "import_path_identifier", "constant_declaration", "pattern_initializer_list", 
		"pattern_initializer", "initializer", "variable_declaration", "variable_declaration_head", 
		"variable_name", "getter_setter_block", "getter_clause", "setter_clause", 
		"setter_name", "getter_setter_keyword_block", "getter_keyword_clause", 
		"setter_keyword_clause", "willSet_didSet_block", "willSet_clause", "didSet_clause", 
		"typealias_declaration", "typealias_head", "typealias_name", "typealias_assignment", 
		"function_declaration", "function_head", "function_name", "function_signature", 
		"function_result", "function_body", "parameter_clauses", "parameter_clause", 
		"parameter_list", "parameter", "parameter_name", "local_parameter_name", 
		"default_argument_clause", "enum_declaration", "union_style_enum", "union_style_enum_members", 
		"union_style_enum_member", "union_style_enum_case_clause", "union_style_enum_case_list", 
		"union_style_enum_case", "enum_name", "enum_case_name", "raw_value_style_enum", 
		"raw_value_style_enum_members", "raw_value_style_enum_member", "raw_value_style_enum_case_clause", 
		"raw_value_style_enum_case_list", "raw_value_style_enum_case", "raw_value_assignment", 
		"struct_declaration", "struct_name", "struct_body", "class_declaration", 
		"class_name", "class_body", "protocol_declaration", "protocol_name", "protocol_body", 
		"protocol_member_declaration", "protocol_member_declarations", "protocol_property_declaration", 
		"protocol_method_declaration", "protocol_initializer_declaration", "protocol_subscript_declaration", 
		"protocol_associated_type_declaration", "initializer_declaration", "initializer_head", 
		"initializer_body", "deinitializer_declaration", "extension_declaration", 
		"extension_body", "subscript_declaration", "subscript_head", "subscript_result", 
		"operator_declaration", "prefix_operator_declaration", "postfix_operator_declaration", 
		"infix_operator_declaration", "infix_operator_attributes", "precedence_clause", 
		"precedence_level", "associativity_clause", "associativity", "pattern", 
		"wildcard_pattern", "identifier_pattern", "value_binding_pattern", "tuple_pattern", 
		"tuple_pattern_element_list", "tuple_pattern_element", "enum_case_pattern", 
		"type_casting_pattern", "is_pattern", "as_pattern", "expression_pattern", 
		"attribute", "attribute_name", "attribute_argument_clause", "attributes", 
		"balanced_tokens", "balanced_token", "expression_list", "expression", 
		"in_out_expression", "assignment_operator", "conditional_operator", "type_casting_operator", 
		"trailing_closure", "primary_expression", "literal_expression", "array_literal", 
		"array_literal_items", "array_literal_item", "dictionary_literal", "dictionary_literal_items", 
		"dictionary_literal_item", "self_expression", "superclass_expression", 
		"superclass_method_expression", "superclass_subscript_expression", "superclass_initializer_expression", 
		"closure_expression", "closure_signature", "capture_list", "capture_specifier", 
		"implicit_member_expression", "parenthesized_expression", "expression_element_list", 
		"expression_element", "wildcard_expression", "operator", "binary_operator", 
		"prefix_operator", "postfix_operator", "type", "type_annotation", "type_identifier", 
		"type_name", "tuple_type", "tuple_type_body", "tuple_type_element_list", 
		"tuple_type_element", "element_name", "protocol_composition_type", "protocol_identifier_list", 
		"protocol_identifier", "metatype_type", "type_inheritance_clause", "type_inheritance_list", 
		"identifier", "keyword", "context_sensitive_keyword", "identifier_list", 
		"literal", "integer_literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'for'", "'in'", "'while'", "'do'", "'if'", "'else'", "'switch'", 
		"'{'", "'}'", "'case'", "':'", "','", "'default'", "'where'", "'break'", 
		"'continue'", "'fallthrough'", "'return'", "'<'", "'>'", "'=='", "'class'", 
		"'mutating'", "'nonmutating'", "'override'", "'static'", "'unowned'", 
		"'unowned(safe)'", "'unowned(unsafe)'", "'weak'", "'import'", "'typealias'", 
		"'struct'", "'enum'", "'protocol'", "'var'", "'func'", "'.'", "'let'", 
		"'='", "'get'", "'set'", "'willSet'", "'didSet'", "'->'", "'('", "')'", 
		"'...'", "'inout'", "'#'", "'_'", "'convenience'", "'init'", "'deinit'", 
		"'extension'", "'subscript'", "'operator'", "'prefix'", "'postfix'", "'infix'", 
		"'precedence'", "'associativity'", "'left'", "'right'", "'none'", "'is'", 
		"'as'", "'@'", "'['", "']'", "'self'", "'dynamicType'", "'!'", "'?'", 
		"'&'", "'__FILE__'", "'__LINE__'", "'__COLUMN__'", "'__FUNCTION__'", "'super'", 
		"'/'", "'\\'", "'-'", "'+'", "'*'", "'%'", "'|'", "'^'", "'Type'", "'Protocol'", 
		"'new'", "'Self'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "Identifier", 
		"Implicit_parameter_name", "Binary_literal", "Octal_literal", "Decimal_literal", 
		"Hexadecimal_literal", "Floating_point_literal", "String_literal", "Escaped_character", 
		"WS", "Block_comment", "Line_comment"
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
	public String getGrammarFileName() { return "Swift.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SwiftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Top_levelContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SwiftParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Top_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTop_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTop_level(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTop_level(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_levelContext top_level() throws RecognitionException {
		Top_levelContext _localctx = new Top_levelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_top_level);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__71 - 64)) | (1L << (T__73 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0)) {
				{
				setState(414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(412);
					statement();
					}
					break;
				case 2:
					{
					setState(413);
					expression(0);
					}
					break;
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(419);
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Branch_statementContext branch_statement() {
			return getRuleContext(Branch_statementContext.class,0);
		}
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
		}
		public Control_transfer_statementContext control_transfer_statement() {
			return getRuleContext(Control_transfer_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				expression(0);
				setState(423);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(422);
					match(T__0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				declaration();
				setState(427);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(426);
					match(T__0);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				loop_statement();
				setState(431);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(430);
					match(T__0);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(433);
				branch_statement();
				setState(435);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(434);
					match(T__0);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(437);
				labeled_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(438);
				control_transfer_statement();
				setState(440);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(439);
					match(T__0);
					}
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(444);
				statement();
				}
				}
				setState(447); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__71 - 64)) | (1L << (T__73 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0) );
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

	public static class Loop_statementContext extends ParserRuleContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public For_in_statementContext for_in_statement() {
			return getRuleContext(For_in_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLoop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loop_statement);
		try {
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				for_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				for_in_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				while_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(452);
				do_while_statement();
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

	public static class For_statementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public For_initContext for_init() {
			return getRuleContext(For_initContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_for_statement);
		int _la;
		try {
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				match(T__1);
				setState(457);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__71 - 64)) | (1L << (T__73 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0)) {
					{
					setState(456);
					for_init();
					}
				}

				setState(459);
				match(T__0);
				setState(461);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__69 - 64)) | (1L << (T__71 - 64)) | (1L << (T__73 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0)) {
					{
					setState(460);
					expression(0);
					}
				}

				setState(463);
				match(T__0);
				setState(465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(464);
					expression(0);
					}
					break;
				}
				setState(467);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				match(T__1);
				{
				setState(470);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__71 - 64)) | (1L << (T__73 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0)) {
					{
					setState(469);
					for_init();
					}
				}

				setState(472);
				match(T__0);
				setState(474);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__69 - 64)) | (1L << (T__71 - 64)) | (1L << (T__73 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0)) {
					{
					setState(473);
					expression(0);
					}
				}

				setState(476);
				match(T__0);
				setState(478);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(477);
					expression(0);
					}
					break;
				}
				}
				setState(480);
				code_block();
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

	public static class For_initContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public For_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFor_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFor_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFor_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_initContext for_init() throws RecognitionException {
		For_initContext _localctx = new For_initContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_init);
		try {
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				variable_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				expression_list();
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

	public static class For_in_statementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public For_in_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFor_in_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFor_in_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFor_in_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_in_statementContext for_in_statement() throws RecognitionException {
		For_in_statementContext _localctx = new For_in_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_in_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(T__1);
			setState(488);
			pattern(0);
			setState(489);
			match(T__2);
			setState(490);
			expression(0);
			setState(491);
			code_block();
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

	public static class While_statementContext extends ParserRuleContext {
		public While_conditionContext while_condition() {
			return getRuleContext(While_conditionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(T__3);
			setState(494);
			while_condition();
			setState(495);
			code_block();
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

	public static class While_conditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public While_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWhile_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWhile_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWhile_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_conditionContext while_condition() throws RecognitionException {
		While_conditionContext _localctx = new While_conditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_condition);
		try {
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				declaration();
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

	public static class Do_while_statementContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public While_conditionContext while_condition() {
			return getRuleContext(While_conditionContext.class,0);
		}
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDo_while_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDo_while_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(T__4);
			setState(502);
			code_block();
			setState(503);
			match(T__3);
			setState(504);
			while_condition();
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

	public static class Branch_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Branch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBranch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBranch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBranch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Branch_statementContext branch_statement() throws RecognitionException {
		Branch_statementContext _localctx = new Branch_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_branch_statement);
		try {
			setState(508);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				if_statement();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				switch_statement();
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

	public static class If_statementContext extends ParserRuleContext {
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(T__5);
			setState(511);
			if_condition();
			setState(512);
			code_block();
			setState(514);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(513);
				else_clause();
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

	public static class If_conditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public If_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIf_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIf_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitIf_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_conditionContext if_condition() throws RecognitionException {
		If_conditionContext _localctx = new If_conditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_condition);
		try {
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				declaration();
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

	public static class Else_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterElse_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitElse_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitElse_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_clauseContext else_clause() throws RecognitionException {
		Else_clauseContext _localctx = new Else_clauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_else_clause);
		try {
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				match(T__6);
				setState(521);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				match(T__6);
				setState(523);
				if_statement();
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

	public static class Switch_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Switch_casesContext switch_cases() {
			return getRuleContext(Switch_casesContext.class,0);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSwitch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSwitch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(T__7);
			setState(527);
			expression(0);
			setState(528);
			match(T__8);
			setState(530);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__13) {
				{
				setState(529);
				switch_cases();
				}
			}

			setState(532);
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

	public static class Switch_casesContext extends ParserRuleContext {
		public Switch_caseContext switch_case() {
			return getRuleContext(Switch_caseContext.class,0);
		}
		public Switch_casesContext switch_cases() {
			return getRuleContext(Switch_casesContext.class,0);
		}
		public Switch_casesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_cases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSwitch_cases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSwitch_cases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSwitch_cases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_casesContext switch_cases() throws RecognitionException {
		Switch_casesContext _localctx = new Switch_casesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_switch_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			switch_case();
			setState(536);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__13) {
				{
				setState(535);
				switch_cases();
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

	public static class Switch_caseContext extends ParserRuleContext {
		public Case_labelContext case_label() {
			return getRuleContext(Case_labelContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Default_labelContext default_label() {
			return getRuleContext(Default_labelContext.class,0);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSwitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSwitch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSwitch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_switch_case);
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				case_label();
				setState(539);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				default_label();
				setState(542);
				statements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				case_label();
				setState(545);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(547);
				default_label();
				setState(548);
				match(T__0);
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

	public static class Case_labelContext extends ParserRuleContext {
		public Case_item_listContext case_item_list() {
			return getRuleContext(Case_item_listContext.class,0);
		}
		public Case_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCase_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCase_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCase_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_labelContext case_label() throws RecognitionException {
		Case_labelContext _localctx = new Case_labelContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_case_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(T__10);
			setState(553);
			case_item_list();
			setState(554);
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

	public static class Case_item_listContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public Case_item_listContext case_item_list() {
			return getRuleContext(Case_item_listContext.class,0);
		}
		public List<Guard_clauseContext> guard_clause() {
			return getRuleContexts(Guard_clauseContext.class);
		}
		public Guard_clauseContext guard_clause(int i) {
			return getRuleContext(Guard_clauseContext.class,i);
		}
		public Case_item_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_item_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCase_item_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCase_item_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCase_item_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_item_listContext case_item_list() throws RecognitionException {
		Case_item_listContext _localctx = new Case_item_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_case_item_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			pattern(0);
			setState(558);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(557);
				guard_clause();
				}
			}

			setState(560);
			pattern(0);
			setState(562);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(561);
				guard_clause();
				}
			}

			setState(564);
			match(T__12);
			setState(565);
			case_item_list();
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

	public static class Default_labelContext extends ParserRuleContext {
		public Default_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDefault_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDefault_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDefault_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_labelContext default_label() throws RecognitionException {
		Default_labelContext _localctx = new Default_labelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_default_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(T__13);
			setState(568);
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

	public static class Guard_clauseContext extends ParserRuleContext {
		public Guard_expressionContext guard_expression() {
			return getRuleContext(Guard_expressionContext.class,0);
		}
		public Guard_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGuard_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGuard_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGuard_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guard_clauseContext guard_clause() throws RecognitionException {
		Guard_clauseContext _localctx = new Guard_clauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_guard_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(T__14);
			setState(571);
			guard_expression();
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

	public static class Guard_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Guard_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGuard_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGuard_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGuard_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Guard_expressionContext guard_expression() throws RecognitionException {
		Guard_expressionContext _localctx = new Guard_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_guard_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			expression(0);
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

	public static class Labeled_statementContext extends ParserRuleContext {
		public Statement_labelContext statement_label() {
			return getRuleContext(Statement_labelContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLabeled_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLabeled_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLabeled_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_labeled_statement);
		try {
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				statement_label();
				setState(576);
				loop_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				statement_label();
				setState(579);
				switch_statement();
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

	public static class Statement_labelContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Statement_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStatement_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStatement_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitStatement_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_labelContext statement_label() throws RecognitionException {
		Statement_labelContext _localctx = new Statement_labelContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statement_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			label_name();
			setState(584);
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

	public static class Label_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Label_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLabel_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLabel_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLabel_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Label_nameContext label_name() throws RecognitionException {
		Label_nameContext _localctx = new Label_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_label_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			identifier();
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

	public static class Control_transfer_statementContext extends ParserRuleContext {
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public Fallthrough_statementContext fallthrough_statement() {
			return getRuleContext(Fallthrough_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Control_transfer_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_transfer_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterControl_transfer_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitControl_transfer_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitControl_transfer_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_transfer_statementContext control_transfer_statement() throws RecognitionException {
		Control_transfer_statementContext _localctx = new Control_transfer_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_control_transfer_statement);
		try {
			setState(592);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				break_statement();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				continue_statement();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(590);
				fallthrough_statement();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(591);
				return_statement();
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

	public static class Break_statementContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBreak_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBreak_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBreak_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_break_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(T__15);
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(595);
				label_name();
				}
				break;
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

	public static class Continue_statementContext extends ParserRuleContext {
		public Label_nameContext label_name() {
			return getRuleContext(Label_nameContext.class,0);
		}
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterContinue_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitContinue_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitContinue_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_continue_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(T__16);
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(599);
				label_name();
				}
				break;
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

	public static class Fallthrough_statementContext extends ParserRuleContext {
		public Fallthrough_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallthrough_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFallthrough_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFallthrough_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFallthrough_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fallthrough_statementContext fallthrough_statement() throws RecognitionException {
		Fallthrough_statementContext _localctx = new Fallthrough_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fallthrough_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(T__17);
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

	public static class Return_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(T__18);
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(605);
				expression(0);
				}
				break;
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

	public static class Generic_parameter_clauseContext extends ParserRuleContext {
		public Generic_parameter_listContext generic_parameter_list() {
			return getRuleContext(Generic_parameter_listContext.class,0);
		}
		public Requirement_clauseContext requirement_clause() {
			return getRuleContext(Requirement_clauseContext.class,0);
		}
		public Generic_parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGeneric_parameter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGeneric_parameter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGeneric_parameter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_parameter_clauseContext generic_parameter_clause() throws RecognitionException {
		Generic_parameter_clauseContext _localctx = new Generic_parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_generic_parameter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(T__19);
			setState(609);
			generic_parameter_list();
			setState(611);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(610);
				requirement_clause();
				}
			}

			setState(613);
			match(T__20);
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

	public static class Generic_parameter_listContext extends ParserRuleContext {
		public Generic_parameterContext generic_parameter() {
			return getRuleContext(Generic_parameterContext.class,0);
		}
		public Generic_parameter_listContext generic_parameter_list() {
			return getRuleContext(Generic_parameter_listContext.class,0);
		}
		public Generic_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGeneric_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGeneric_parameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGeneric_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_parameter_listContext generic_parameter_list() throws RecognitionException {
		Generic_parameter_listContext _localctx = new Generic_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_generic_parameter_list);
		try {
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				generic_parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				generic_parameter();
				setState(617);
				match(T__12);
				setState(618);
				generic_parameter_list();
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

	public static class Generic_parameterContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public Generic_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGeneric_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGeneric_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGeneric_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_parameterContext generic_parameter() throws RecognitionException {
		Generic_parameterContext _localctx = new Generic_parameterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_generic_parameter);
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				type_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				type_name();
				setState(624);
				match(T__11);
				setState(625);
				type_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(627);
				type_name();
				setState(628);
				match(T__11);
				setState(629);
				protocol_composition_type();
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

	public static class Requirement_clauseContext extends ParserRuleContext {
		public Requirement_listContext requirement_list() {
			return getRuleContext(Requirement_listContext.class,0);
		}
		public Requirement_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRequirement_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRequirement_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRequirement_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Requirement_clauseContext requirement_clause() throws RecognitionException {
		Requirement_clauseContext _localctx = new Requirement_clauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_requirement_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(T__14);
			setState(634);
			requirement_list();
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

	public static class Requirement_listContext extends ParserRuleContext {
		public RequirementContext requirement() {
			return getRuleContext(RequirementContext.class,0);
		}
		public Requirement_listContext requirement_list() {
			return getRuleContext(Requirement_listContext.class,0);
		}
		public Requirement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRequirement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRequirement_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRequirement_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Requirement_listContext requirement_list() throws RecognitionException {
		Requirement_listContext _localctx = new Requirement_listContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_requirement_list);
		try {
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				requirement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				requirement();
				setState(638);
				match(T__12);
				setState(639);
				requirement_list();
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

	public static class RequirementContext extends ParserRuleContext {
		public Conformance_requirementContext conformance_requirement() {
			return getRuleContext(Conformance_requirementContext.class,0);
		}
		public Same_type_requirementContext same_type_requirement() {
			return getRuleContext(Same_type_requirementContext.class,0);
		}
		public RequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRequirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRequirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementContext requirement() throws RecognitionException {
		RequirementContext _localctx = new RequirementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_requirement);
		try {
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				conformance_requirement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
				same_type_requirement();
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

	public static class Conformance_requirementContext extends ParserRuleContext {
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public Conformance_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conformance_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterConformance_requirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitConformance_requirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitConformance_requirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conformance_requirementContext conformance_requirement() throws RecognitionException {
		Conformance_requirementContext _localctx = new Conformance_requirementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_conformance_requirement);
		try {
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				type_identifier();
				setState(648);
				match(T__11);
				setState(649);
				type_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				type_identifier();
				setState(652);
				match(T__11);
				setState(653);
				protocol_composition_type();
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

	public static class Same_type_requirementContext extends ParserRuleContext {
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public Same_type_requirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_same_type_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSame_type_requirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSame_type_requirement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSame_type_requirement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Same_type_requirementContext same_type_requirement() throws RecognitionException {
		Same_type_requirementContext _localctx = new Same_type_requirementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_same_type_requirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			type_identifier();
			setState(658);
			match(T__21);
			setState(659);
			type_identifier();
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

	public static class Generic_argument_clauseContext extends ParserRuleContext {
		public Generic_argument_listContext generic_argument_list() {
			return getRuleContext(Generic_argument_listContext.class,0);
		}
		public Generic_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGeneric_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGeneric_argument_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGeneric_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_argument_clauseContext generic_argument_clause() throws RecognitionException {
		Generic_argument_clauseContext _localctx = new Generic_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_generic_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(T__19);
			setState(662);
			generic_argument_list();
			setState(663);
			match(T__20);
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

	public static class Generic_argument_listContext extends ParserRuleContext {
		public List<Generic_argumentContext> generic_argument() {
			return getRuleContexts(Generic_argumentContext.class);
		}
		public Generic_argumentContext generic_argument(int i) {
			return getRuleContext(Generic_argumentContext.class,i);
		}
		public Generic_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGeneric_argument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGeneric_argument_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGeneric_argument_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_argument_listContext generic_argument_list() throws RecognitionException {
		Generic_argument_listContext _localctx = new Generic_argument_listContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_generic_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			generic_argument();
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(666);
				match(T__12);
				setState(667);
				generic_argument();
				}
				}
				setState(672);
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

	public static class Generic_argumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Generic_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGeneric_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGeneric_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGeneric_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_argumentContext generic_argument() throws RecognitionException {
		Generic_argumentContext _localctx = new Generic_argumentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_generic_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			type(0);
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

	public static class DeclarationContext extends ParserRuleContext {
		public Import_declarationContext import_declaration() {
			return getRuleContext(Import_declarationContext.class,0);
		}
		public Constant_declarationContext constant_declaration() {
			return getRuleContext(Constant_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Typealias_declarationContext typealias_declaration() {
			return getRuleContext(Typealias_declarationContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Enum_declarationContext enum_declaration() {
			return getRuleContext(Enum_declarationContext.class,0);
		}
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Protocol_declarationContext protocol_declaration() {
			return getRuleContext(Protocol_declarationContext.class,0);
		}
		public Initializer_declarationContext initializer_declaration() {
			return getRuleContext(Initializer_declarationContext.class,0);
		}
		public Deinitializer_declarationContext deinitializer_declaration() {
			return getRuleContext(Deinitializer_declarationContext.class,0);
		}
		public Extension_declarationContext extension_declaration() {
			return getRuleContext(Extension_declarationContext.class,0);
		}
		public Subscript_declarationContext subscript_declaration() {
			return getRuleContext(Subscript_declarationContext.class,0);
		}
		public Operator_declarationContext operator_declaration() {
			return getRuleContext(Operator_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_declaration);
		try {
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				import_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				constant_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(677);
				variable_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(678);
				typealias_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(679);
				function_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(680);
				enum_declaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(681);
				struct_declaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(682);
				class_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(683);
				protocol_declaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(684);
				initializer_declaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(685);
				deinitializer_declaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(686);
				extension_declaration();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(687);
				subscript_declaration();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(688);
				operator_declaration();
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

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			declaration();
			setState(693);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__49) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__68 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(692);
				declarations();
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

	public static class Declaration_specifiersContext extends ParserRuleContext {
		public Declaration_specifierContext declaration_specifier() {
			return getRuleContext(Declaration_specifierContext.class,0);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Declaration_specifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_specifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclaration_specifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclaration_specifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDeclaration_specifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_specifiersContext declaration_specifiers() throws RecognitionException {
		Declaration_specifiersContext _localctx = new Declaration_specifiersContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_declaration_specifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			declaration_specifier();
			setState(697);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) {
				{
				setState(696);
				declaration_specifiers();
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

	public static class Declaration_specifierContext extends ParserRuleContext {
		public Declaration_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclaration_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclaration_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDeclaration_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_specifierContext declaration_specifier() throws RecognitionException {
		Declaration_specifierContext _localctx = new Declaration_specifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_declaration_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
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

	public static class Code_blockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCode_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(T__8);
			setState(703);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__71 - 64)) | (1L << (T__73 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0)) {
				{
				setState(702);
				statements();
				}
			}

			setState(705);
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

	public static class Import_declarationContext extends ParserRuleContext {
		public Import_pathContext import_path() {
			return getRuleContext(Import_pathContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Import_kindContext import_kind() {
			return getRuleContext(Import_kindContext.class,0);
		}
		public Import_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImport_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImport_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitImport_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_declarationContext import_declaration() throws RecognitionException {
		Import_declarationContext _localctx = new Import_declarationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_import_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(707);
				attributes();
				}
			}

			setState(710);
			match(T__31);
			setState(712);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) {
				{
				setState(711);
				import_kind();
				}
			}

			setState(714);
			import_path();
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

	public static class Import_kindContext extends ParserRuleContext {
		public Import_kindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_kind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImport_kind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImport_kind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitImport_kind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_kindContext import_kind() throws RecognitionException {
		Import_kindContext _localctx = new Import_kindContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_import_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
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

	public static class Import_pathContext extends ParserRuleContext {
		public Import_path_identifierContext import_path_identifier() {
			return getRuleContext(Import_path_identifierContext.class,0);
		}
		public Import_pathContext import_path() {
			return getRuleContext(Import_pathContext.class,0);
		}
		public Import_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImport_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImport_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitImport_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_pathContext import_path() throws RecognitionException {
		Import_pathContext _localctx = new Import_pathContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_import_path);
		try {
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				import_path_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				import_path_identifier();
				setState(720);
				match(T__38);
				setState(721);
				import_path();
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

	public static class Import_path_identifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Import_path_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_path_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImport_path_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImport_path_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitImport_path_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_path_identifierContext import_path_identifier() throws RecognitionException {
		Import_path_identifierContext _localctx = new Import_path_identifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_import_path_identifier);
		try {
			setState(727);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__49:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				identifier();
				}
				break;
			case T__19:
			case T__20:
			case T__38:
			case T__40:
			case T__73:
			case T__75:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				operator();
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

	public static class Constant_declarationContext extends ParserRuleContext {
		public Pattern_initializer_listContext pattern_initializer_list() {
			return getRuleContext(Pattern_initializer_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Constant_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterConstant_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitConstant_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitConstant_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_declarationContext constant_declaration() throws RecognitionException {
		Constant_declarationContext _localctx = new Constant_declarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_constant_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(729);
				attributes();
				}
			}

			setState(733);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) {
				{
				setState(732);
				declaration_specifiers();
				}
			}

			setState(735);
			match(T__39);
			setState(736);
			pattern_initializer_list();
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

	public static class Pattern_initializer_listContext extends ParserRuleContext {
		public List<Pattern_initializerContext> pattern_initializer() {
			return getRuleContexts(Pattern_initializerContext.class);
		}
		public Pattern_initializerContext pattern_initializer(int i) {
			return getRuleContext(Pattern_initializerContext.class,i);
		}
		public Pattern_initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_initializer_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPattern_initializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPattern_initializer_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPattern_initializer_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_initializer_listContext pattern_initializer_list() throws RecognitionException {
		Pattern_initializer_listContext _localctx = new Pattern_initializer_listContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_pattern_initializer_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			pattern_initializer();
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(739);
				match(T__12);
				setState(740);
				pattern_initializer();
				}
				}
				setState(745);
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

	public static class Pattern_initializerContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Pattern_initializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPattern_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPattern_initializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPattern_initializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_initializerContext pattern_initializer() throws RecognitionException {
		Pattern_initializerContext _localctx = new Pattern_initializerContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_pattern_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			pattern(0);
			setState(748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(747);
				initializer();
				}
				break;
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

	public static class InitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			match(T__40);
			setState(751);
			expression(0);
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public Variable_declaration_headContext variable_declaration_head() {
			return getRuleContext(Variable_declaration_headContext.class,0);
		}
		public Pattern_initializer_listContext pattern_initializer_list() {
			return getRuleContext(Pattern_initializer_listContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Getter_setter_blockContext getter_setter_block() {
			return getRuleContext(Getter_setter_blockContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public WillSet_didSet_blockContext willSet_didSet_block() {
			return getRuleContext(WillSet_didSet_blockContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variable_declaration);
		int _la;
		try {
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
				variable_declaration_head();
				setState(754);
				pattern_initializer_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				variable_declaration_head();
				setState(757);
				variable_name();
				setState(758);
				type_annotation();
				setState(759);
				code_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(761);
				variable_declaration_head();
				setState(762);
				variable_name();
				setState(763);
				type_annotation();
				setState(764);
				getter_setter_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(766);
				variable_declaration_head();
				setState(767);
				variable_name();
				setState(768);
				type_annotation();
				setState(769);
				getter_setter_keyword_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(771);
				variable_declaration_head();
				setState(772);
				variable_name();
				setState(773);
				type_annotation();
				setState(775);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(774);
					initializer();
					}
				}

				setState(777);
				willSet_didSet_block();
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

	public static class Variable_declaration_headContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Variable_declaration_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterVariable_declaration_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitVariable_declaration_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitVariable_declaration_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaration_headContext variable_declaration_head() throws RecognitionException {
		Variable_declaration_headContext _localctx = new Variable_declaration_headContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variable_declaration_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(781);
				attributes();
				}
			}

			setState(785);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) {
				{
				setState(784);
				declaration_specifiers();
				}
			}

			setState(787);
			match(T__36);
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

	public static class Variable_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterVariable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitVariable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitVariable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variable_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			identifier();
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

	public static class Getter_setter_blockContext extends ParserRuleContext {
		public Getter_clauseContext getter_clause() {
			return getRuleContext(Getter_clauseContext.class,0);
		}
		public Setter_clauseContext setter_clause() {
			return getRuleContext(Setter_clauseContext.class,0);
		}
		public Getter_setter_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGetter_setter_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGetter_setter_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGetter_setter_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_setter_blockContext getter_setter_block() throws RecognitionException {
		Getter_setter_blockContext _localctx = new Getter_setter_blockContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_getter_setter_block);
		int _la;
		try {
			setState(803);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(791);
				match(T__8);
				setState(792);
				getter_clause();
				setState(794);
				_la = _input.LA(1);
				if (_la==T__42 || _la==T__68) {
					{
					setState(793);
					setter_clause();
					}
				}

				setState(796);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(798);
				match(T__8);
				setState(799);
				setter_clause();
				setState(800);
				getter_clause();
				setState(801);
				match(T__9);
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

	public static class Getter_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Getter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGetter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGetter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGetter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_clauseContext getter_clause() throws RecognitionException {
		Getter_clauseContext _localctx = new Getter_clauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_getter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(805);
				attributes();
				}
			}

			setState(808);
			match(T__41);
			setState(809);
			code_block();
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

	public static class Setter_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public Setter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSetter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSetter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSetter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setter_clauseContext setter_clause() throws RecognitionException {
		Setter_clauseContext _localctx = new Setter_clauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_setter_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(811);
				attributes();
				}
			}

			setState(814);
			match(T__42);
			setState(816);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__49) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(815);
				setter_name();
				}
			}

			setState(818);
			code_block();
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

	public static class Setter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Setter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSetter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSetter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSetter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setter_nameContext setter_name() throws RecognitionException {
		Setter_nameContext _localctx = new Setter_nameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_setter_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(820);
			identifier();
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

	public static class Getter_setter_keyword_blockContext extends ParserRuleContext {
		public Getter_keyword_clauseContext getter_keyword_clause() {
			return getRuleContext(Getter_keyword_clauseContext.class,0);
		}
		public Setter_keyword_clauseContext setter_keyword_clause() {
			return getRuleContext(Setter_keyword_clauseContext.class,0);
		}
		public Getter_setter_keyword_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_setter_keyword_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGetter_setter_keyword_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGetter_setter_keyword_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGetter_setter_keyword_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_setter_keyword_blockContext getter_setter_keyword_block() throws RecognitionException {
		Getter_setter_keyword_blockContext _localctx = new Getter_setter_keyword_blockContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_getter_setter_keyword_block);
		int _la;
		try {
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				match(T__8);
				setState(823);
				getter_keyword_clause();
				setState(825);
				_la = _input.LA(1);
				if (_la==T__42 || _la==T__68) {
					{
					setState(824);
					setter_keyword_clause();
					}
				}

				setState(827);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(829);
				match(T__8);
				setState(830);
				setter_keyword_clause();
				setState(831);
				getter_keyword_clause();
				setState(832);
				match(T__9);
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

	public static class Getter_keyword_clauseContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Getter_keyword_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter_keyword_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGetter_keyword_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGetter_keyword_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitGetter_keyword_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Getter_keyword_clauseContext getter_keyword_clause() throws RecognitionException {
		Getter_keyword_clauseContext _localctx = new Getter_keyword_clauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_getter_keyword_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(836);
				attributes();
				}
			}

			setState(839);
			match(T__41);
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

	public static class Setter_keyword_clauseContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_keyword_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter_keyword_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSetter_keyword_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSetter_keyword_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSetter_keyword_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Setter_keyword_clauseContext setter_keyword_clause() throws RecognitionException {
		Setter_keyword_clauseContext _localctx = new Setter_keyword_clauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_setter_keyword_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(841);
				attributes();
				}
			}

			setState(844);
			match(T__42);
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

	public static class WillSet_didSet_blockContext extends ParserRuleContext {
		public WillSet_clauseContext willSet_clause() {
			return getRuleContext(WillSet_clauseContext.class,0);
		}
		public DidSet_clauseContext didSet_clause() {
			return getRuleContext(DidSet_clauseContext.class,0);
		}
		public WillSet_didSet_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSet_didSet_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWillSet_didSet_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWillSet_didSet_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWillSet_didSet_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WillSet_didSet_blockContext willSet_didSet_block() throws RecognitionException {
		WillSet_didSet_blockContext _localctx = new WillSet_didSet_blockContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_willSet_didSet_block);
		int _la;
		try {
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				match(T__8);
				setState(847);
				willSet_clause();
				setState(849);
				_la = _input.LA(1);
				if (_la==T__44 || _la==T__68) {
					{
					setState(848);
					didSet_clause();
					}
				}

				setState(851);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				match(T__8);
				setState(854);
				didSet_clause();
				setState(855);
				willSet_clause();
				setState(856);
				match(T__9);
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

	public static class WillSet_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public WillSet_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSet_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWillSet_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWillSet_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWillSet_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WillSet_clauseContext willSet_clause() throws RecognitionException {
		WillSet_clauseContext _localctx = new WillSet_clauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_willSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(860);
				attributes();
				}
			}

			setState(863);
			match(T__43);
			setState(865);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__49) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(864);
				setter_name();
				}
			}

			setState(867);
			code_block();
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

	public static class DidSet_clauseContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Setter_nameContext setter_name() {
			return getRuleContext(Setter_nameContext.class,0);
		}
		public DidSet_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_didSet_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDidSet_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDidSet_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDidSet_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DidSet_clauseContext didSet_clause() throws RecognitionException {
		DidSet_clauseContext _localctx = new DidSet_clauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_didSet_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(869);
				attributes();
				}
			}

			setState(872);
			match(T__44);
			setState(874);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__49) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(873);
				setter_name();
				}
			}

			setState(876);
			code_block();
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

	public static class Typealias_declarationContext extends ParserRuleContext {
		public Typealias_headContext typealias_head() {
			return getRuleContext(Typealias_headContext.class,0);
		}
		public Typealias_assignmentContext typealias_assignment() {
			return getRuleContext(Typealias_assignmentContext.class,0);
		}
		public Typealias_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypealias_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypealias_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTypealias_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_declarationContext typealias_declaration() throws RecognitionException {
		Typealias_declarationContext _localctx = new Typealias_declarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_typealias_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			typealias_head();
			setState(879);
			typealias_assignment();
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

	public static class Typealias_headContext extends ParserRuleContext {
		public Typealias_nameContext typealias_name() {
			return getRuleContext(Typealias_nameContext.class,0);
		}
		public Typealias_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypealias_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypealias_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTypealias_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_headContext typealias_head() throws RecognitionException {
		Typealias_headContext _localctx = new Typealias_headContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_typealias_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(T__32);
			setState(882);
			typealias_name();
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

	public static class Typealias_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Typealias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypealias_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypealias_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTypealias_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_nameContext typealias_name() throws RecognitionException {
		Typealias_nameContext _localctx = new Typealias_nameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_typealias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			identifier();
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

	public static class Typealias_assignmentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Typealias_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealias_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypealias_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypealias_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTypealias_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typealias_assignmentContext typealias_assignment() throws RecognitionException {
		Typealias_assignmentContext _localctx = new Typealias_assignmentContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_typealias_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			match(T__40);
			setState(887);
			type(0);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Function_headContext function_head() {
			return getRuleContext(Function_headContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_signatureContext function_signature() {
			return getRuleContext(Function_signatureContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			function_head();
			setState(890);
			function_name();
			setState(892);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(891);
				generic_parameter_clause();
				}
			}

			setState(894);
			function_signature();
			setState(895);
			function_body();
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

	public static class Function_headContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Declaration_specifiersContext declaration_specifiers() {
			return getRuleContext(Declaration_specifiersContext.class,0);
		}
		public Function_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_headContext function_head() throws RecognitionException {
		Function_headContext _localctx = new Function_headContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_function_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(897);
				attributes();
				}
			}

			setState(901);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) {
				{
				setState(900);
				declaration_specifiers();
				}
			}

			setState(903);
			match(T__37);
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

	public static class Function_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_function_name);
		try {
			setState(907);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__49:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(905);
				identifier();
				}
				break;
			case T__19:
			case T__20:
			case T__38:
			case T__40:
			case T__73:
			case T__75:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
				enterOuterAlt(_localctx, 2);
				{
				setState(906);
				operator();
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

	public static class Function_signatureContext extends ParserRuleContext {
		public Parameter_clausesContext parameter_clauses() {
			return getRuleContext(Parameter_clausesContext.class,0);
		}
		public Function_resultContext function_result() {
			return getRuleContext(Function_resultContext.class,0);
		}
		public Function_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_signatureContext function_signature() throws RecognitionException {
		Function_signatureContext _localctx = new Function_signatureContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_function_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			parameter_clauses();
			setState(911);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(910);
				function_result();
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

	public static class Function_resultContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Function_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_resultContext function_result() throws RecognitionException {
		Function_resultContext _localctx = new Function_resultContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_function_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(T__45);
			setState(915);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(914);
				attributes();
				}
			}

			setState(917);
			type(0);
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

	public static class Function_bodyContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			code_block();
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

	public static class Parameter_clausesContext extends ParserRuleContext {
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Parameter_clausesContext parameter_clauses() {
			return getRuleContext(Parameter_clausesContext.class,0);
		}
		public Parameter_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameter_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameter_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitParameter_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_clausesContext parameter_clauses() throws RecognitionException {
		Parameter_clausesContext _localctx = new Parameter_clausesContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_parameter_clauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			parameter_clause();
			setState(923);
			_la = _input.LA(1);
			if (_la==T__46) {
				{
				setState(922);
				parameter_clauses();
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

	public static class Parameter_clauseContext extends ParserRuleContext {
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Parameter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameter_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameter_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitParameter_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_clauseContext parameter_clause() throws RecognitionException {
		Parameter_clauseContext _localctx = new Parameter_clauseContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_parameter_clause);
		int _la;
		try {
			setState(934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				match(T__46);
				setState(926);
				match(T__47);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(927);
				match(T__46);
				setState(928);
				parameter_list();
				setState(930);
				_la = _input.LA(1);
				if (_la==T__48) {
					{
					setState(929);
					match(T__48);
					}
				}

				setState(932);
				match(T__47);
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

	public static class Parameter_listContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_parameter_list);
		try {
			setState(941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(936);
				parameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(937);
				parameter();
				setState(938);
				match(T__12);
				setState(939);
				parameter_list();
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

	public static class ParameterContext extends ParserRuleContext {
		public Parameter_nameContext parameter_name() {
			return getRuleContext(Parameter_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Local_parameter_nameContext local_parameter_name() {
			return getRuleContext(Local_parameter_nameContext.class,0);
		}
		public Default_argument_clauseContext default_argument_clause() {
			return getRuleContext(Default_argument_clauseContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_parameter);
		int _la;
		try {
			setState(979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(944);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(943);
					match(T__49);
					}
					break;
				}
				setState(947);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(946);
					match(T__39);
					}
				}

				setState(950);
				_la = _input.LA(1);
				if (_la==T__50) {
					{
					setState(949);
					match(T__50);
					}
				}

				setState(952);
				parameter_name();
				setState(954);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__49) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(953);
					local_parameter_name();
					}
				}

				setState(956);
				type_annotation();
				setState(958);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(957);
					default_argument_clause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(961);
				_la = _input.LA(1);
				if (_la==T__49) {
					{
					setState(960);
					match(T__49);
					}
				}

				setState(963);
				match(T__36);
				setState(965);
				_la = _input.LA(1);
				if (_la==T__50) {
					{
					setState(964);
					match(T__50);
					}
				}

				setState(967);
				parameter_name();
				setState(969);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__49) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(968);
					local_parameter_name();
					}
				}

				setState(971);
				type_annotation();
				setState(973);
				_la = _input.LA(1);
				if (_la==T__40) {
					{
					setState(972);
					default_argument_clause();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(976);
				_la = _input.LA(1);
				if (_la==T__68) {
					{
					setState(975);
					attributes();
					}
				}

				setState(978);
				type(0);
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

	public static class Parameter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitParameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_nameContext parameter_name() throws RecognitionException {
		Parameter_nameContext _localctx = new Parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_parameter_name);
		try {
			setState(983);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__49:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(981);
				identifier();
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 2);
				{
				setState(982);
				match(T__51);
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

	public static class Local_parameter_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Local_parameter_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_parameter_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLocal_parameter_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLocal_parameter_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLocal_parameter_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_parameter_nameContext local_parameter_name() throws RecognitionException {
		Local_parameter_nameContext _localctx = new Local_parameter_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_local_parameter_name);
		try {
			setState(987);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__49:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(985);
				identifier();
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 2);
				{
				setState(986);
				match(T__51);
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

	public static class Default_argument_clauseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Default_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDefault_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDefault_argument_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDefault_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_argument_clauseContext default_argument_clause() throws RecognitionException {
		Default_argument_clauseContext _localctx = new Default_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_default_argument_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(T__40);
			setState(990);
			expression(0);
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

	public static class Enum_declarationContext extends ParserRuleContext {
		public Union_style_enumContext union_style_enum() {
			return getRuleContext(Union_style_enumContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Raw_value_style_enumContext raw_value_style_enum() {
			return getRuleContext(Raw_value_style_enumContext.class,0);
		}
		public Enum_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnum_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnum_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitEnum_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_declarationContext enum_declaration() throws RecognitionException {
		Enum_declarationContext _localctx = new Enum_declarationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_enum_declaration);
		int _la;
		try {
			setState(1000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(993);
				_la = _input.LA(1);
				if (_la==T__68) {
					{
					setState(992);
					attributes();
					}
				}

				setState(995);
				union_style_enum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(997);
				_la = _input.LA(1);
				if (_la==T__68) {
					{
					setState(996);
					attributes();
					}
				}

				setState(999);
				raw_value_style_enum();
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

	public static class Union_style_enumContext extends ParserRuleContext {
		public Enum_nameContext enum_name() {
			return getRuleContext(Enum_nameContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Union_style_enum_membersContext union_style_enum_members() {
			return getRuleContext(Union_style_enum_membersContext.class,0);
		}
		public Union_style_enumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnion_style_enum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnion_style_enum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitUnion_style_enum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enumContext union_style_enum() throws RecognitionException {
		Union_style_enumContext _localctx = new Union_style_enumContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_union_style_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			enum_name();
			setState(1004);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(1003);
				generic_parameter_clause();
				}
			}

			setState(1006);
			match(T__8);
			setState(1008);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__49) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__68 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1007);
				union_style_enum_members();
				}
			}

			setState(1010);
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

	public static class Union_style_enum_membersContext extends ParserRuleContext {
		public Union_style_enum_memberContext union_style_enum_member() {
			return getRuleContext(Union_style_enum_memberContext.class,0);
		}
		public Union_style_enum_membersContext union_style_enum_members() {
			return getRuleContext(Union_style_enum_membersContext.class,0);
		}
		public Union_style_enum_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnion_style_enum_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnion_style_enum_members(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitUnion_style_enum_members(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_membersContext union_style_enum_members() throws RecognitionException {
		Union_style_enum_membersContext _localctx = new Union_style_enum_membersContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_union_style_enum_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			union_style_enum_member();
			setState(1014);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__49) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__68 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1013);
				union_style_enum_members();
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

	public static class Union_style_enum_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Union_style_enum_case_clauseContext union_style_enum_case_clause() {
			return getRuleContext(Union_style_enum_case_clauseContext.class,0);
		}
		public Union_style_enum_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnion_style_enum_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnion_style_enum_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitUnion_style_enum_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_memberContext union_style_enum_member() throws RecognitionException {
		Union_style_enum_memberContext _localctx = new Union_style_enum_memberContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_union_style_enum_member);
		try {
			setState(1018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1016);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1017);
				union_style_enum_case_clause();
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

	public static class Union_style_enum_case_clauseContext extends ParserRuleContext {
		public Union_style_enum_case_listContext union_style_enum_case_list() {
			return getRuleContext(Union_style_enum_case_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Union_style_enum_case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnion_style_enum_case_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnion_style_enum_case_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitUnion_style_enum_case_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_case_clauseContext union_style_enum_case_clause() throws RecognitionException {
		Union_style_enum_case_clauseContext _localctx = new Union_style_enum_case_clauseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_union_style_enum_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(1020);
				attributes();
				}
			}

			setState(1023);
			match(T__10);
			setState(1024);
			union_style_enum_case_list();
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

	public static class Union_style_enum_case_listContext extends ParserRuleContext {
		public Union_style_enum_caseContext union_style_enum_case() {
			return getRuleContext(Union_style_enum_caseContext.class,0);
		}
		public Union_style_enum_case_listContext union_style_enum_case_list() {
			return getRuleContext(Union_style_enum_case_listContext.class,0);
		}
		public Union_style_enum_case_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnion_style_enum_case_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnion_style_enum_case_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitUnion_style_enum_case_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_case_listContext union_style_enum_case_list() throws RecognitionException {
		Union_style_enum_case_listContext _localctx = new Union_style_enum_case_listContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_union_style_enum_case_list);
		try {
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1026);
				union_style_enum_case();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1027);
				union_style_enum_case();
				setState(1028);
				match(T__12);
				setState(1029);
				union_style_enum_case_list();
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

	public static class Union_style_enum_caseContext extends ParserRuleContext {
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public Union_style_enum_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_style_enum_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnion_style_enum_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnion_style_enum_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitUnion_style_enum_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_style_enum_caseContext union_style_enum_case() throws RecognitionException {
		Union_style_enum_caseContext _localctx = new Union_style_enum_caseContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_union_style_enum_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			enum_case_name();
			setState(1035);
			_la = _input.LA(1);
			if (_la==T__46) {
				{
				setState(1034);
				tuple_type();
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

	public static class Enum_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnum_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnum_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitEnum_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_nameContext enum_name() throws RecognitionException {
		Enum_nameContext _localctx = new Enum_nameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_enum_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			identifier();
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

	public static class Enum_case_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Enum_case_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_case_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnum_case_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnum_case_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitEnum_case_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_case_nameContext enum_case_name() throws RecognitionException {
		Enum_case_nameContext _localctx = new Enum_case_nameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_enum_case_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			identifier();
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

	public static class Raw_value_style_enumContext extends ParserRuleContext {
		public Enum_nameContext enum_name() {
			return getRuleContext(Enum_nameContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Raw_value_style_enum_membersContext raw_value_style_enum_members() {
			return getRuleContext(Raw_value_style_enum_membersContext.class,0);
		}
		public Raw_value_style_enumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_style_enum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_style_enum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_style_enum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enumContext raw_value_style_enum() throws RecognitionException {
		Raw_value_style_enumContext _localctx = new Raw_value_style_enumContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_raw_value_style_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			enum_name();
			setState(1043);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(1042);
				generic_parameter_clause();
				}
			}

			setState(1045);
			match(T__11);
			setState(1046);
			type_identifier();
			setState(1047);
			match(T__8);
			setState(1049);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__49) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__68 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1048);
				raw_value_style_enum_members();
				}
			}

			setState(1051);
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

	public static class Raw_value_style_enum_membersContext extends ParserRuleContext {
		public Raw_value_style_enum_memberContext raw_value_style_enum_member() {
			return getRuleContext(Raw_value_style_enum_memberContext.class,0);
		}
		public Raw_value_style_enum_membersContext raw_value_style_enum_members() {
			return getRuleContext(Raw_value_style_enum_membersContext.class,0);
		}
		public Raw_value_style_enum_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_style_enum_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_style_enum_members(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_style_enum_members(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_membersContext raw_value_style_enum_members() throws RecognitionException {
		Raw_value_style_enum_membersContext _localctx = new Raw_value_style_enum_membersContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_raw_value_style_enum_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			raw_value_style_enum_member();
			setState(1055);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__49) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__68 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1054);
				raw_value_style_enum_members();
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

	public static class Raw_value_style_enum_memberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Raw_value_style_enum_case_clauseContext raw_value_style_enum_case_clause() {
			return getRuleContext(Raw_value_style_enum_case_clauseContext.class,0);
		}
		public Raw_value_style_enum_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_style_enum_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_style_enum_member(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_style_enum_member(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_memberContext raw_value_style_enum_member() throws RecognitionException {
		Raw_value_style_enum_memberContext _localctx = new Raw_value_style_enum_memberContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_raw_value_style_enum_member);
		try {
			setState(1059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1057);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1058);
				raw_value_style_enum_case_clause();
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

	public static class Raw_value_style_enum_case_clauseContext extends ParserRuleContext {
		public Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() {
			return getRuleContext(Raw_value_style_enum_case_listContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Raw_value_style_enum_case_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_style_enum_case_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_style_enum_case_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_style_enum_case_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_case_clauseContext raw_value_style_enum_case_clause() throws RecognitionException {
		Raw_value_style_enum_case_clauseContext _localctx = new Raw_value_style_enum_case_clauseContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_raw_value_style_enum_case_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(1061);
				attributes();
				}
			}

			setState(1064);
			match(T__10);
			setState(1065);
			raw_value_style_enum_case_list();
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

	public static class Raw_value_style_enum_case_listContext extends ParserRuleContext {
		public Raw_value_style_enum_caseContext raw_value_style_enum_case() {
			return getRuleContext(Raw_value_style_enum_caseContext.class,0);
		}
		public Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() {
			return getRuleContext(Raw_value_style_enum_case_listContext.class,0);
		}
		public Raw_value_style_enum_case_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_style_enum_case_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_style_enum_case_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_style_enum_case_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_case_listContext raw_value_style_enum_case_list() throws RecognitionException {
		Raw_value_style_enum_case_listContext _localctx = new Raw_value_style_enum_case_listContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_raw_value_style_enum_case_list);
		try {
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1067);
				raw_value_style_enum_case();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1068);
				raw_value_style_enum_case();
				setState(1069);
				match(T__12);
				setState(1070);
				raw_value_style_enum_case_list();
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

	public static class Raw_value_style_enum_caseContext extends ParserRuleContext {
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Raw_value_assignmentContext raw_value_assignment() {
			return getRuleContext(Raw_value_assignmentContext.class,0);
		}
		public Raw_value_style_enum_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_style_enum_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_style_enum_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_style_enum_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_style_enum_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_style_enum_caseContext raw_value_style_enum_case() throws RecognitionException {
		Raw_value_style_enum_caseContext _localctx = new Raw_value_style_enum_caseContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_raw_value_style_enum_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			enum_case_name();
			setState(1076);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(1075);
				raw_value_assignment();
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

	public static class Raw_value_assignmentContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Raw_value_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raw_value_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRaw_value_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRaw_value_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitRaw_value_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raw_value_assignmentContext raw_value_assignment() throws RecognitionException {
		Raw_value_assignmentContext _localctx = new Raw_value_assignmentContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_raw_value_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			match(T__40);
			setState(1079);
			literal();
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

	public static class Struct_declarationContext extends ParserRuleContext {
		public Struct_nameContext struct_name() {
			return getRuleContext(Struct_nameContext.class,0);
		}
		public Struct_bodyContext struct_body() {
			return getRuleContext(Struct_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStruct_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitStruct_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(1081);
				attributes();
				}
			}

			setState(1084);
			match(T__33);
			setState(1085);
			struct_name();
			setState(1087);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(1086);
				generic_parameter_clause();
				}
			}

			setState(1090);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(1089);
				type_inheritance_clause();
				}
			}

			setState(1092);
			struct_body();
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

	public static class Struct_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Struct_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStruct_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStruct_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitStruct_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_nameContext struct_name() throws RecognitionException {
		Struct_nameContext _localctx = new Struct_nameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_struct_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			identifier();
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

	public static class Struct_bodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Struct_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStruct_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStruct_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitStruct_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_bodyContext struct_body() throws RecognitionException {
		Struct_bodyContext _localctx = new Struct_bodyContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_struct_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			match(T__8);
			setState(1098);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__49) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__68 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1097);
				declarations();
				}
			}

			setState(1100);
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

	public static class Class_declarationContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClass_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitClass_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(1102);
				attributes();
				}
			}

			setState(1105);
			match(T__22);
			setState(1106);
			class_name();
			setState(1108);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(1107);
				generic_parameter_clause();
				}
			}

			setState(1111);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(1110);
				type_inheritance_clause();
				}
			}

			setState(1113);
			class_body();
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

	public static class Class_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			identifier();
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

	public static class Class_bodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			match(T__8);
			setState(1119);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__49) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__68 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1118);
				declarations();
				}
			}

			setState(1121);
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

	public static class Protocol_declarationContext extends ParserRuleContext {
		public Protocol_nameContext protocol_name() {
			return getRuleContext(Protocol_nameContext.class,0);
		}
		public Protocol_bodyContext protocol_body() {
			return getRuleContext(Protocol_bodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Protocol_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_declarationContext protocol_declaration() throws RecognitionException {
		Protocol_declarationContext _localctx = new Protocol_declarationContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_protocol_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(1123);
				attributes();
				}
			}

			setState(1126);
			match(T__35);
			setState(1127);
			protocol_name();
			setState(1129);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(1128);
				type_inheritance_clause();
				}
			}

			setState(1131);
			protocol_body();
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

	public static class Protocol_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Protocol_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_nameContext protocol_name() throws RecognitionException {
		Protocol_nameContext _localctx = new Protocol_nameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_protocol_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			identifier();
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

	public static class Protocol_bodyContext extends ParserRuleContext {
		public Protocol_member_declarationsContext protocol_member_declarations() {
			return getRuleContext(Protocol_member_declarationsContext.class,0);
		}
		public Protocol_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_bodyContext protocol_body() throws RecognitionException {
		Protocol_bodyContext _localctx = new Protocol_bodyContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_protocol_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			match(T__8);
			setState(1137);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (T__22 - 23)) | (1L << (T__23 - 23)) | (1L << (T__24 - 23)) | (1L << (T__25 - 23)) | (1L << (T__26 - 23)) | (1L << (T__27 - 23)) | (1L << (T__28 - 23)) | (1L << (T__29 - 23)) | (1L << (T__30 - 23)) | (1L << (T__32 - 23)) | (1L << (T__36 - 23)) | (1L << (T__37 - 23)) | (1L << (T__52 - 23)) | (1L << (T__53 - 23)) | (1L << (T__56 - 23)) | (1L << (T__68 - 23)))) != 0)) {
				{
				setState(1136);
				protocol_member_declarations();
				}
			}

			setState(1139);
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

	public static class Protocol_member_declarationContext extends ParserRuleContext {
		public Protocol_property_declarationContext protocol_property_declaration() {
			return getRuleContext(Protocol_property_declarationContext.class,0);
		}
		public Protocol_method_declarationContext protocol_method_declaration() {
			return getRuleContext(Protocol_method_declarationContext.class,0);
		}
		public Protocol_initializer_declarationContext protocol_initializer_declaration() {
			return getRuleContext(Protocol_initializer_declarationContext.class,0);
		}
		public Protocol_subscript_declarationContext protocol_subscript_declaration() {
			return getRuleContext(Protocol_subscript_declarationContext.class,0);
		}
		public Protocol_associated_type_declarationContext protocol_associated_type_declaration() {
			return getRuleContext(Protocol_associated_type_declarationContext.class,0);
		}
		public Protocol_member_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_member_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_member_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_member_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_member_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_member_declarationContext protocol_member_declaration() throws RecognitionException {
		Protocol_member_declarationContext _localctx = new Protocol_member_declarationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_protocol_member_declaration);
		try {
			setState(1146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1141);
				protocol_property_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1142);
				protocol_method_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1143);
				protocol_initializer_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1144);
				protocol_subscript_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1145);
				protocol_associated_type_declaration();
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

	public static class Protocol_member_declarationsContext extends ParserRuleContext {
		public Protocol_member_declarationContext protocol_member_declaration() {
			return getRuleContext(Protocol_member_declarationContext.class,0);
		}
		public Protocol_member_declarationsContext protocol_member_declarations() {
			return getRuleContext(Protocol_member_declarationsContext.class,0);
		}
		public Protocol_member_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_member_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_member_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_member_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_member_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_member_declarationsContext protocol_member_declarations() throws RecognitionException {
		Protocol_member_declarationsContext _localctx = new Protocol_member_declarationsContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_protocol_member_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			protocol_member_declaration();
			setState(1150);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (T__22 - 23)) | (1L << (T__23 - 23)) | (1L << (T__24 - 23)) | (1L << (T__25 - 23)) | (1L << (T__26 - 23)) | (1L << (T__27 - 23)) | (1L << (T__28 - 23)) | (1L << (T__29 - 23)) | (1L << (T__30 - 23)) | (1L << (T__32 - 23)) | (1L << (T__36 - 23)) | (1L << (T__37 - 23)) | (1L << (T__52 - 23)) | (1L << (T__53 - 23)) | (1L << (T__56 - 23)) | (1L << (T__68 - 23)))) != 0)) {
				{
				setState(1149);
				protocol_member_declarations();
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

	public static class Protocol_property_declarationContext extends ParserRuleContext {
		public Variable_declaration_headContext variable_declaration_head() {
			return getRuleContext(Variable_declaration_headContext.class,0);
		}
		public Variable_nameContext variable_name() {
			return getRuleContext(Variable_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Protocol_property_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_property_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_property_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_property_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_property_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_property_declarationContext protocol_property_declaration() throws RecognitionException {
		Protocol_property_declarationContext _localctx = new Protocol_property_declarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_protocol_property_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			variable_declaration_head();
			setState(1153);
			variable_name();
			setState(1154);
			type_annotation();
			setState(1155);
			getter_setter_keyword_block();
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

	public static class Protocol_method_declarationContext extends ParserRuleContext {
		public Function_headContext function_head() {
			return getRuleContext(Function_headContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_signatureContext function_signature() {
			return getRuleContext(Function_signatureContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Protocol_method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_method_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_method_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_method_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_method_declarationContext protocol_method_declaration() throws RecognitionException {
		Protocol_method_declarationContext _localctx = new Protocol_method_declarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_protocol_method_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
			function_head();
			setState(1158);
			function_name();
			setState(1160);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(1159);
				generic_parameter_clause();
				}
			}

			setState(1162);
			function_signature();
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

	public static class Protocol_initializer_declarationContext extends ParserRuleContext {
		public Initializer_headContext initializer_head() {
			return getRuleContext(Initializer_headContext.class,0);
		}
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Protocol_initializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_initializer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_initializer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_initializer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_initializer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_initializer_declarationContext protocol_initializer_declaration() throws RecognitionException {
		Protocol_initializer_declarationContext _localctx = new Protocol_initializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_protocol_initializer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			initializer_head();
			setState(1166);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(1165);
				generic_parameter_clause();
				}
			}

			setState(1168);
			parameter_clause();
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

	public static class Protocol_subscript_declarationContext extends ParserRuleContext {
		public Subscript_headContext subscript_head() {
			return getRuleContext(Subscript_headContext.class,0);
		}
		public Subscript_resultContext subscript_result() {
			return getRuleContext(Subscript_resultContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Protocol_subscript_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_subscript_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_subscript_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_subscript_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_subscript_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_subscript_declarationContext protocol_subscript_declaration() throws RecognitionException {
		Protocol_subscript_declarationContext _localctx = new Protocol_subscript_declarationContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_protocol_subscript_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			subscript_head();
			setState(1171);
			subscript_result();
			setState(1172);
			getter_setter_keyword_block();
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

	public static class Protocol_associated_type_declarationContext extends ParserRuleContext {
		public Typealias_headContext typealias_head() {
			return getRuleContext(Typealias_headContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Typealias_assignmentContext typealias_assignment() {
			return getRuleContext(Typealias_assignmentContext.class,0);
		}
		public Protocol_associated_type_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_associated_type_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_associated_type_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_associated_type_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_associated_type_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_associated_type_declarationContext protocol_associated_type_declaration() throws RecognitionException {
		Protocol_associated_type_declarationContext _localctx = new Protocol_associated_type_declarationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_protocol_associated_type_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			typealias_head();
			setState(1176);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(1175);
				type_inheritance_clause();
				}
			}

			setState(1179);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(1178);
				typealias_assignment();
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

	public static class Initializer_declarationContext extends ParserRuleContext {
		public Initializer_headContext initializer_head() {
			return getRuleContext(Initializer_headContext.class,0);
		}
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Initializer_bodyContext initializer_body() {
			return getRuleContext(Initializer_bodyContext.class,0);
		}
		public Generic_parameter_clauseContext generic_parameter_clause() {
			return getRuleContext(Generic_parameter_clauseContext.class,0);
		}
		public Initializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInitializer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_declarationContext initializer_declaration() throws RecognitionException {
		Initializer_declarationContext _localctx = new Initializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_initializer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			initializer_head();
			setState(1183);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(1182);
				generic_parameter_clause();
				}
			}

			setState(1185);
			parameter_clause();
			setState(1186);
			initializer_body();
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

	public static class Initializer_headContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Initializer_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializer_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializer_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInitializer_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_headContext initializer_head() throws RecognitionException {
		Initializer_headContext _localctx = new Initializer_headContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_initializer_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(1188);
				attributes();
				}
			}

			setState(1192);
			_la = _input.LA(1);
			if (_la==T__52) {
				{
				setState(1191);
				match(T__52);
				}
			}

			setState(1194);
			match(T__53);
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

	public static class Initializer_bodyContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Initializer_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializer_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializer_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInitializer_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initializer_bodyContext initializer_body() throws RecognitionException {
		Initializer_bodyContext _localctx = new Initializer_bodyContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_initializer_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			code_block();
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

	public static class Deinitializer_declarationContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Deinitializer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deinitializer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeinitializer_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeinitializer_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDeinitializer_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deinitializer_declarationContext deinitializer_declaration() throws RecognitionException {
		Deinitializer_declarationContext _localctx = new Deinitializer_declarationContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_deinitializer_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(1198);
				attributes();
				}
			}

			setState(1201);
			match(T__54);
			setState(1202);
			code_block();
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

	public static class Extension_declarationContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Extension_bodyContext extension_body() {
			return getRuleContext(Extension_bodyContext.class,0);
		}
		public Type_inheritance_clauseContext type_inheritance_clause() {
			return getRuleContext(Type_inheritance_clauseContext.class,0);
		}
		public Extension_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExtension_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExtension_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExtension_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extension_declarationContext extension_declaration() throws RecognitionException {
		Extension_declarationContext _localctx = new Extension_declarationContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_extension_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			match(T__55);
			setState(1205);
			type_identifier();
			setState(1207);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(1206);
				type_inheritance_clause();
				}
			}

			setState(1209);
			extension_body();
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

	public static class Extension_bodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Extension_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExtension_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExtension_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExtension_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extension_bodyContext extension_body() throws RecognitionException {
		Extension_bodyContext _localctx = new Extension_bodyContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_extension_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			match(T__8);
			setState(1213);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__49) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__68 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1212);
				declarations();
				}
			}

			setState(1215);
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

	public static class Subscript_declarationContext extends ParserRuleContext {
		public Subscript_headContext subscript_head() {
			return getRuleContext(Subscript_headContext.class,0);
		}
		public Subscript_resultContext subscript_result() {
			return getRuleContext(Subscript_resultContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Getter_setter_blockContext getter_setter_block() {
			return getRuleContext(Getter_setter_blockContext.class,0);
		}
		public Getter_setter_keyword_blockContext getter_setter_keyword_block() {
			return getRuleContext(Getter_setter_keyword_blockContext.class,0);
		}
		public Subscript_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSubscript_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSubscript_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSubscript_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_declarationContext subscript_declaration() throws RecognitionException {
		Subscript_declarationContext _localctx = new Subscript_declarationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_subscript_declaration);
		try {
			setState(1229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1217);
				subscript_head();
				setState(1218);
				subscript_result();
				setState(1219);
				code_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1221);
				subscript_head();
				setState(1222);
				subscript_result();
				setState(1223);
				getter_setter_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1225);
				subscript_head();
				setState(1226);
				subscript_result();
				setState(1227);
				getter_setter_keyword_block();
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

	public static class Subscript_headContext extends ParserRuleContext {
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Subscript_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSubscript_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSubscript_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSubscript_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_headContext subscript_head() throws RecognitionException {
		Subscript_headContext _localctx = new Subscript_headContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_subscript_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(1231);
				attributes();
				}
			}

			setState(1234);
			match(T__56);
			setState(1235);
			parameter_clause();
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

	public static class Subscript_resultContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Subscript_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSubscript_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSubscript_result(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSubscript_result(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_resultContext subscript_result() throws RecognitionException {
		Subscript_resultContext _localctx = new Subscript_resultContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_subscript_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			match(T__45);
			setState(1239);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(1238);
				attributes();
				}
			}

			setState(1241);
			type(0);
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

	public static class Operator_declarationContext extends ParserRuleContext {
		public Prefix_operator_declarationContext prefix_operator_declaration() {
			return getRuleContext(Prefix_operator_declarationContext.class,0);
		}
		public Postfix_operator_declarationContext postfix_operator_declaration() {
			return getRuleContext(Postfix_operator_declarationContext.class,0);
		}
		public Infix_operator_declarationContext infix_operator_declaration() {
			return getRuleContext(Infix_operator_declarationContext.class,0);
		}
		public Operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOperator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOperator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOperator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_declarationContext operator_declaration() throws RecognitionException {
		Operator_declarationContext _localctx = new Operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_operator_declaration);
		try {
			setState(1246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1243);
				prefix_operator_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1244);
				postfix_operator_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1245);
				infix_operator_declaration();
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

	public static class Prefix_operator_declarationContext extends ParserRuleContext {
		public Prefix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrefix_operator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrefix_operator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPrefix_operator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_operator_declarationContext prefix_operator_declaration() throws RecognitionException {
		Prefix_operator_declarationContext _localctx = new Prefix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_prefix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			match(T__57);
			setState(1249);
			match(T__58);
			setState(1250);
			match(T__57);
			setState(1251);
			match(T__8);
			setState(1252);
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

	public static class Postfix_operator_declarationContext extends ParserRuleContext {
		public Postfix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPostfix_operator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPostfix_operator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPostfix_operator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_operator_declarationContext postfix_operator_declaration() throws RecognitionException {
		Postfix_operator_declarationContext _localctx = new Postfix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_postfix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			match(T__57);
			setState(1255);
			match(T__59);
			setState(1256);
			match(T__57);
			setState(1257);
			match(T__8);
			setState(1258);
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

	public static class Infix_operator_declarationContext extends ParserRuleContext {
		public Infix_operator_attributesContext infix_operator_attributes() {
			return getRuleContext(Infix_operator_attributesContext.class,0);
		}
		public Infix_operator_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_operator_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInfix_operator_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInfix_operator_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInfix_operator_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Infix_operator_declarationContext infix_operator_declaration() throws RecognitionException {
		Infix_operator_declarationContext _localctx = new Infix_operator_declarationContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_infix_operator_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			match(T__57);
			setState(1261);
			match(T__60);
			setState(1262);
			match(T__57);
			setState(1263);
			match(T__8);
			setState(1264);
			infix_operator_attributes();
			setState(1265);
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

	public static class Infix_operator_attributesContext extends ParserRuleContext {
		public Precedence_clauseContext precedence_clause() {
			return getRuleContext(Precedence_clauseContext.class,0);
		}
		public Associativity_clauseContext associativity_clause() {
			return getRuleContext(Associativity_clauseContext.class,0);
		}
		public Infix_operator_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infix_operator_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInfix_operator_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInfix_operator_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInfix_operator_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Infix_operator_attributesContext infix_operator_attributes() throws RecognitionException {
		Infix_operator_attributesContext _localctx = new Infix_operator_attributesContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_infix_operator_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			_la = _input.LA(1);
			if (_la==T__61) {
				{
				setState(1267);
				precedence_clause();
				}
			}

			setState(1271);
			_la = _input.LA(1);
			if (_la==T__62) {
				{
				setState(1270);
				associativity_clause();
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

	public static class Precedence_clauseContext extends ParserRuleContext {
		public Precedence_levelContext precedence_level() {
			return getRuleContext(Precedence_levelContext.class,0);
		}
		public Precedence_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrecedence_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrecedence_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPrecedence_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_clauseContext precedence_clause() throws RecognitionException {
		Precedence_clauseContext _localctx = new Precedence_clauseContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_precedence_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1273);
			match(T__61);
			setState(1274);
			precedence_level();
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

	public static class Precedence_levelContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public Precedence_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedence_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrecedence_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrecedence_level(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPrecedence_level(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Precedence_levelContext precedence_level() throws RecognitionException {
		Precedence_levelContext _localctx = new Precedence_levelContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_precedence_level);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			integer_literal();
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

	public static class Associativity_clauseContext extends ParserRuleContext {
		public AssociativityContext associativity() {
			return getRuleContext(AssociativityContext.class,0);
		}
		public Associativity_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativity_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAssociativity_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAssociativity_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAssociativity_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Associativity_clauseContext associativity_clause() throws RecognitionException {
		Associativity_clauseContext _localctx = new Associativity_clauseContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_associativity_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1278);
			match(T__62);
			setState(1279);
			associativity();
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

	public static class AssociativityContext extends ParserRuleContext {
		public AssociativityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAssociativity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAssociativity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAssociativity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssociativityContext associativity() throws RecognitionException {
		AssociativityContext _localctx = new AssociativityContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_associativity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)))) != 0)) ) {
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

	public static class PatternContext extends ParserRuleContext {
		public Wildcard_patternContext wildcard_pattern() {
			return getRuleContext(Wildcard_patternContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Identifier_patternContext identifier_pattern() {
			return getRuleContext(Identifier_patternContext.class,0);
		}
		public Value_binding_patternContext value_binding_pattern() {
			return getRuleContext(Value_binding_patternContext.class,0);
		}
		public Tuple_patternContext tuple_pattern() {
			return getRuleContext(Tuple_patternContext.class,0);
		}
		public Enum_case_patternContext enum_case_pattern() {
			return getRuleContext(Enum_case_patternContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Expression_patternContext expression_pattern() {
			return getRuleContext(Expression_patternContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		return pattern(0);
	}

	private PatternContext pattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatternContext _localctx = new PatternContext(_ctx, _parentState);
		PatternContext _prevctx = _localctx;
		int _startState = 268;
		enterRecursionRule(_localctx, 268, RULE_pattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1284);
				wildcard_pattern();
				setState(1286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1285);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1288);
				identifier_pattern();
				setState(1290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1289);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1292);
				value_binding_pattern();
				}
				break;
			case 4:
				{
				setState(1293);
				tuple_pattern();
				setState(1295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1294);
					type_annotation();
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(1297);
				enum_case_pattern();
				}
				break;
			case 6:
				{
				setState(1298);
				match(T__66);
				setState(1299);
				type(0);
				}
				break;
			case 7:
				{
				setState(1300);
				expression_pattern();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(1303);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1304);
					match(T__67);
					setState(1305);
					type(0);
					}
					} 
				}
				setState(1310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
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

	public static class Wildcard_patternContext extends ParserRuleContext {
		public Wildcard_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWildcard_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWildcard_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWildcard_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wildcard_patternContext wildcard_pattern() throws RecognitionException {
		Wildcard_patternContext _localctx = new Wildcard_patternContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_wildcard_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			match(T__51);
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

	public static class Identifier_patternContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Identifier_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIdentifier_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIdentifier_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitIdentifier_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_patternContext identifier_pattern() throws RecognitionException {
		Identifier_patternContext _localctx = new Identifier_patternContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_identifier_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1313);
			identifier();
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

	public static class Value_binding_patternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Value_binding_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_binding_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterValue_binding_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitValue_binding_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitValue_binding_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_binding_patternContext value_binding_pattern() throws RecognitionException {
		Value_binding_patternContext _localctx = new Value_binding_patternContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_value_binding_pattern);
		try {
			setState(1319);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(1315);
				match(T__36);
				setState(1316);
				pattern(0);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(1317);
				match(T__39);
				setState(1318);
				pattern(0);
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

	public static class Tuple_patternContext extends ParserRuleContext {
		public Tuple_pattern_element_listContext tuple_pattern_element_list() {
			return getRuleContext(Tuple_pattern_element_listContext.class,0);
		}
		public Tuple_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_patternContext tuple_pattern() throws RecognitionException {
		Tuple_patternContext _localctx = new Tuple_patternContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_tuple_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			match(T__46);
			setState(1323);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__69 - 64)) | (1L << (T__71 - 64)) | (1L << (T__73 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0)) {
				{
				setState(1322);
				tuple_pattern_element_list();
				}
			}

			setState(1325);
			match(T__47);
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

	public static class Tuple_pattern_element_listContext extends ParserRuleContext {
		public List<Tuple_pattern_elementContext> tuple_pattern_element() {
			return getRuleContexts(Tuple_pattern_elementContext.class);
		}
		public Tuple_pattern_elementContext tuple_pattern_element(int i) {
			return getRuleContext(Tuple_pattern_elementContext.class,i);
		}
		public Tuple_pattern_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_pattern_element_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_pattern_element_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_pattern_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_pattern_element_listContext tuple_pattern_element_list() throws RecognitionException {
		Tuple_pattern_element_listContext _localctx = new Tuple_pattern_element_listContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_tuple_pattern_element_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			tuple_pattern_element();
			setState(1332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(1328);
				match(T__12);
				setState(1329);
				tuple_pattern_element();
				}
				}
				setState(1334);
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

	public static class Tuple_pattern_elementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Tuple_pattern_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_pattern_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_pattern_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_pattern_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_pattern_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_pattern_elementContext tuple_pattern_element() throws RecognitionException {
		Tuple_pattern_elementContext _localctx = new Tuple_pattern_elementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_tuple_pattern_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			pattern(0);
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

	public static class Enum_case_patternContext extends ParserRuleContext {
		public Enum_case_nameContext enum_case_name() {
			return getRuleContext(Enum_case_nameContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Tuple_patternContext tuple_pattern() {
			return getRuleContext(Tuple_patternContext.class,0);
		}
		public Enum_case_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_case_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnum_case_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnum_case_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitEnum_case_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_case_patternContext enum_case_pattern() throws RecognitionException {
		Enum_case_patternContext _localctx = new Enum_case_patternContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_enum_case_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__49) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1337);
				type_identifier();
				}
			}

			setState(1340);
			match(T__38);
			setState(1341);
			enum_case_name();
			setState(1343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1342);
				tuple_pattern();
				}
				break;
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

	public static class Type_casting_patternContext extends ParserRuleContext {
		public Is_patternContext is_pattern() {
			return getRuleContext(Is_patternContext.class,0);
		}
		public As_patternContext as_pattern() {
			return getRuleContext(As_patternContext.class,0);
		}
		public Type_casting_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_casting_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType_casting_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType_casting_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType_casting_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_casting_patternContext type_casting_pattern() throws RecognitionException {
		Type_casting_patternContext _localctx = new Type_casting_patternContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_type_casting_pattern);
		try {
			setState(1347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1345);
				is_pattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1346);
				as_pattern();
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

	public static class Is_patternContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Is_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIs_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIs_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitIs_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Is_patternContext is_pattern() throws RecognitionException {
		Is_patternContext _localctx = new Is_patternContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_is_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			match(T__66);
			setState(1350);
			type(0);
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

	public static class As_patternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public As_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAs_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAs_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAs_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final As_patternContext as_pattern() throws RecognitionException {
		As_patternContext _localctx = new As_patternContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_as_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			pattern(0);
			setState(1353);
			match(T__67);
			setState(1354);
			type(0);
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

	public static class Expression_patternContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpression_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpression_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExpression_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_patternContext expression_pattern() throws RecognitionException {
		Expression_patternContext _localctx = new Expression_patternContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_expression_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			expression(0);
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
		public Attribute_nameContext attribute_name() {
			return getRuleContext(Attribute_nameContext.class,0);
		}
		public Attribute_argument_clauseContext attribute_argument_clause() {
			return getRuleContext(Attribute_argument_clauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			match(T__68);
			setState(1359);
			attribute_name();
			setState(1361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1360);
				attribute_argument_clause();
				}
				break;
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

	public static class Attribute_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Attribute_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAttribute_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAttribute_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAttribute_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_nameContext attribute_name() throws RecognitionException {
		Attribute_nameContext _localctx = new Attribute_nameContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_attribute_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			identifier();
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

	public static class Attribute_argument_clauseContext extends ParserRuleContext {
		public Balanced_tokensContext balanced_tokens() {
			return getRuleContext(Balanced_tokensContext.class,0);
		}
		public Attribute_argument_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_argument_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAttribute_argument_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAttribute_argument_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAttribute_argument_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_argument_clauseContext attribute_argument_clause() throws RecognitionException {
		Attribute_argument_clauseContext _localctx = new Attribute_argument_clauseContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_attribute_argument_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			match(T__46);
			setState(1367);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__69 - 64)) | (1L << (T__71 - 64)) | (1L << (T__73 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0)) {
				{
				setState(1366);
				balanced_tokens();
				}
			}

			setState(1369);
			match(T__47);
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

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1372); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1371);
				attribute();
				}
				}
				setState(1374); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__68 );
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

	public static class Balanced_tokensContext extends ParserRuleContext {
		public List<Balanced_tokenContext> balanced_token() {
			return getRuleContexts(Balanced_tokenContext.class);
		}
		public Balanced_tokenContext balanced_token(int i) {
			return getRuleContext(Balanced_tokenContext.class,i);
		}
		public Balanced_tokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanced_tokens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBalanced_tokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBalanced_tokens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBalanced_tokens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Balanced_tokensContext balanced_tokens() throws RecognitionException {
		Balanced_tokensContext _localctx = new Balanced_tokensContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_balanced_tokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1376);
				balanced_token();
				}
				}
				setState(1379); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__69 - 64)) | (1L << (T__71 - 64)) | (1L << (T__73 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0) );
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

	public static class Balanced_tokenContext extends ParserRuleContext {
		public Balanced_tokensContext balanced_tokens() {
			return getRuleContext(Balanced_tokensContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Context_sensitive_keywordContext context_sensitive_keyword() {
			return getRuleContext(Context_sensitive_keywordContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Balanced_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balanced_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBalanced_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBalanced_token(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBalanced_token(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Balanced_tokenContext balanced_token() throws RecognitionException {
		Balanced_tokenContext _localctx = new Balanced_tokenContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_balanced_token);
		int _la;
		try {
			setState(1401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1381);
				match(T__46);
				setState(1383);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__69 - 64)) | (1L << (T__71 - 64)) | (1L << (T__73 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0)) {
					{
					setState(1382);
					balanced_tokens();
					}
				}

				setState(1385);
				match(T__47);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1386);
				match(T__69);
				setState(1388);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__69 - 64)) | (1L << (T__71 - 64)) | (1L << (T__73 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0)) {
					{
					setState(1387);
					balanced_tokens();
					}
				}

				setState(1390);
				match(T__70);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1391);
				match(T__8);
				setState(1393);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__69 - 64)) | (1L << (T__71 - 64)) | (1L << (T__73 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0)) {
					{
					setState(1392);
					balanced_tokens();
					}
				}

				setState(1395);
				match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1396);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1397);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1398);
				context_sensitive_keyword();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1399);
				literal();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1400);
				operator();
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

	public static class Expression_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExpression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			expression(0);
			setState(1408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(1404);
				match(T__12);
				setState(1405);
				expression(0);
				}
				}
				setState(1410);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Prefix_operatorContext prefix_operator() {
			return getRuleContext(Prefix_operatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public In_out_expressionContext in_out_expression() {
			return getRuleContext(In_out_expressionContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Conditional_operatorContext conditional_operator() {
			return getRuleContext(Conditional_operatorContext.class,0);
		}
		public Type_casting_operatorContext type_casting_operator() {
			return getRuleContext(Type_casting_operatorContext.class,0);
		}
		public Postfix_operatorContext postfix_operator() {
			return getRuleContext(Postfix_operatorContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Trailing_closureContext trailing_closure() {
			return getRuleContext(Trailing_closureContext.class,0);
		}
		public TerminalNode Decimal_literal() { return getToken(SwiftParser.Decimal_literal, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 306;
		enterRecursionRule(_localctx, 306, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1412);
				prefix_operator();
				setState(1413);
				expression(17);
				}
				break;
			case 2:
				{
				setState(1415);
				in_out_expression();
				}
				break;
			case 3:
				{
				setState(1416);
				primary_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1467);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1419);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1420);
						binary_operator();
						setState(1421);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1423);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1424);
						assignment_operator();
						setState(1425);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1427);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1428);
						conditional_operator();
						setState(1429);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1431);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1432);
						type_casting_operator();
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1433);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1434);
						postfix_operator();
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1435);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1436);
						parenthesized_expression();
						setState(1438);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
						case 1:
							{
							setState(1437);
							trailing_closure();
							}
							break;
						}
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1440);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1441);
						match(T__38);
						setState(1442);
						match(T__53);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1443);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1444);
						match(T__38);
						setState(1445);
						match(Decimal_literal);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1446);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1447);
						match(T__38);
						setState(1448);
						identifier();
						setState(1450);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
						case 1:
							{
							setState(1449);
							generic_argument_clause();
							}
							break;
						}
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1452);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1453);
						match(T__38);
						setState(1454);
						match(T__71);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1455);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1456);
						match(T__38);
						setState(1457);
						match(T__72);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1458);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1459);
						match(T__69);
						setState(1460);
						expression_list();
						setState(1461);
						match(T__70);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1463);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1464);
						match(T__73);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1465);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1466);
						match(T__74);
						}
						break;
					}
					} 
				}
				setState(1471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
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

	public static class In_out_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public In_out_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_out_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIn_out_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIn_out_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitIn_out_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_out_expressionContext in_out_expression() throws RecognitionException {
		In_out_expressionContext _localctx = new In_out_expressionContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_in_out_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			match(T__75);
			setState(1473);
			identifier();
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

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_assignment_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475);
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

	public static class Conditional_operatorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Conditional_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterConditional_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitConditional_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitConditional_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_operatorContext conditional_operator() throws RecognitionException {
		Conditional_operatorContext _localctx = new Conditional_operatorContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_conditional_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			match(T__74);
			setState(1478);
			expression(0);
			setState(1479);
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

	public static class Type_casting_operatorContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_casting_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_casting_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType_casting_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType_casting_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType_casting_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_casting_operatorContext type_casting_operator() throws RecognitionException {
		Type_casting_operatorContext _localctx = new Type_casting_operatorContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_type_casting_operator);
		int _la;
		try {
			setState(1488);
			switch (_input.LA(1)) {
			case T__66:
				enterOuterAlt(_localctx, 1);
				{
				setState(1481);
				match(T__66);
				setState(1482);
				type(0);
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 2);
				{
				setState(1483);
				match(T__67);
				setState(1485);
				_la = _input.LA(1);
				if (_la==T__74) {
					{
					setState(1484);
					match(T__74);
					}
				}

				setState(1487);
				type(0);
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

	public static class Trailing_closureContext extends ParserRuleContext {
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public Trailing_closureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailing_closure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTrailing_closure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTrailing_closure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTrailing_closure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trailing_closureContext trailing_closure() throws RecognitionException {
		Trailing_closureContext _localctx = new Trailing_closureContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_trailing_closure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			closure_expression();
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Self_expressionContext self_expression() {
			return getRuleContext(Self_expressionContext.class,0);
		}
		public Superclass_expressionContext superclass_expression() {
			return getRuleContext(Superclass_expressionContext.class,0);
		}
		public Closure_expressionContext closure_expression() {
			return getRuleContext(Closure_expressionContext.class,0);
		}
		public Parenthesized_expressionContext parenthesized_expression() {
			return getRuleContext(Parenthesized_expressionContext.class,0);
		}
		public Implicit_member_expressionContext implicit_member_expression() {
			return getRuleContext(Implicit_member_expressionContext.class,0);
		}
		public Wildcard_expressionContext wildcard_expression() {
			return getRuleContext(Wildcard_expressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_primary_expression);
		try {
			setState(1503);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__49:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1492);
				identifier();
				setState(1494);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1493);
					generic_argument_clause();
					}
					break;
				}
				}
				break;
			case T__69:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case Binary_literal:
			case Octal_literal:
			case Decimal_literal:
			case Hexadecimal_literal:
			case Floating_point_literal:
			case String_literal:
				enterOuterAlt(_localctx, 2);
				{
				setState(1496);
				literal_expression();
				}
				break;
			case T__71:
				enterOuterAlt(_localctx, 3);
				{
				setState(1497);
				self_expression();
				}
				break;
			case T__80:
				enterOuterAlt(_localctx, 4);
				{
				setState(1498);
				superclass_expression();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(1499);
				closure_expression();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 6);
				{
				setState(1500);
				parenthesized_expression();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 7);
				{
				setState(1501);
				implicit_member_expression();
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 8);
				{
				setState(1502);
				wildcard_expression();
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

	public static class Literal_expressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public Dictionary_literalContext dictionary_literal() {
			return getRuleContext(Dictionary_literalContext.class,0);
		}
		public Literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLiteral_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLiteral_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLiteral_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_literal_expression);
		try {
			setState(1512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1505);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1506);
				array_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1507);
				dictionary_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1508);
				match(T__76);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1509);
				match(T__77);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1510);
				match(T__78);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1511);
				match(T__79);
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

	public static class Array_literalContext extends ParserRuleContext {
		public Array_literal_itemsContext array_literal_items() {
			return getRuleContext(Array_literal_itemsContext.class,0);
		}
		public Array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArray_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArray_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitArray_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literalContext array_literal() throws RecognitionException {
		Array_literalContext _localctx = new Array_literalContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_array_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			match(T__69);
			setState(1516);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__69 - 64)) | (1L << (T__71 - 64)) | (1L << (T__73 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0)) {
				{
				setState(1515);
				array_literal_items();
				}
			}

			setState(1518);
			match(T__70);
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

	public static class Array_literal_itemsContext extends ParserRuleContext {
		public Array_literal_itemContext array_literal_item() {
			return getRuleContext(Array_literal_itemContext.class,0);
		}
		public Array_literal_itemsContext array_literal_items() {
			return getRuleContext(Array_literal_itemsContext.class,0);
		}
		public Array_literal_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArray_literal_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArray_literal_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitArray_literal_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literal_itemsContext array_literal_items() throws RecognitionException {
		Array_literal_itemsContext _localctx = new Array_literal_itemsContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_array_literal_items);
		int _la;
		try {
			setState(1528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1520);
				array_literal_item();
				setState(1522);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(1521);
					match(T__12);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1524);
				array_literal_item();
				setState(1525);
				match(T__12);
				setState(1526);
				array_literal_items();
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

	public static class Array_literal_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_literal_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArray_literal_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArray_literal_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitArray_literal_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literal_itemContext array_literal_item() throws RecognitionException {
		Array_literal_itemContext _localctx = new Array_literal_itemContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_array_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			expression(0);
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

	public static class Dictionary_literalContext extends ParserRuleContext {
		public Dictionary_literal_itemsContext dictionary_literal_items() {
			return getRuleContext(Dictionary_literal_itemsContext.class,0);
		}
		public Dictionary_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDictionary_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDictionary_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDictionary_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_literalContext dictionary_literal() throws RecognitionException {
		Dictionary_literalContext _localctx = new Dictionary_literalContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_dictionary_literal);
		try {
			setState(1539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1532);
				match(T__69);
				setState(1533);
				dictionary_literal_items();
				setState(1534);
				match(T__70);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1536);
				match(T__69);
				setState(1537);
				match(T__11);
				setState(1538);
				match(T__70);
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

	public static class Dictionary_literal_itemsContext extends ParserRuleContext {
		public List<Dictionary_literal_itemContext> dictionary_literal_item() {
			return getRuleContexts(Dictionary_literal_itemContext.class);
		}
		public Dictionary_literal_itemContext dictionary_literal_item(int i) {
			return getRuleContext(Dictionary_literal_itemContext.class,i);
		}
		public Dictionary_literal_itemsContext dictionary_literal_items() {
			return getRuleContext(Dictionary_literal_itemsContext.class,0);
		}
		public Dictionary_literal_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDictionary_literal_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDictionary_literal_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDictionary_literal_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_literal_itemsContext dictionary_literal_items() throws RecognitionException {
		Dictionary_literal_itemsContext _localctx = new Dictionary_literal_itemsContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_dictionary_literal_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1541);
			dictionary_literal_item();
			setState(1543);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(1542);
				match(T__12);
				}
			}

			setState(1545);
			dictionary_literal_item();
			setState(1546);
			match(T__12);
			setState(1547);
			dictionary_literal_items();
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

	public static class Dictionary_literal_itemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Dictionary_literal_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionary_literal_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDictionary_literal_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDictionary_literal_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitDictionary_literal_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dictionary_literal_itemContext dictionary_literal_item() throws RecognitionException {
		Dictionary_literal_itemContext _localctx = new Dictionary_literal_itemContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_dictionary_literal_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			expression(0);
			setState(1550);
			match(T__11);
			setState(1551);
			expression(0);
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

	public static class Self_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Self_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSelf_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSelf_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSelf_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Self_expressionContext self_expression() throws RecognitionException {
		Self_expressionContext _localctx = new Self_expressionContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_self_expression);
		try {
			setState(1565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1553);
				match(T__71);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1554);
				match(T__71);
				setState(1555);
				match(T__38);
				setState(1556);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1557);
				match(T__71);
				setState(1558);
				match(T__69);
				setState(1559);
				expression(0);
				setState(1560);
				match(T__70);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1562);
				match(T__71);
				setState(1563);
				match(T__38);
				setState(1564);
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

	public static class Superclass_expressionContext extends ParserRuleContext {
		public Superclass_method_expressionContext superclass_method_expression() {
			return getRuleContext(Superclass_method_expressionContext.class,0);
		}
		public Superclass_subscript_expressionContext superclass_subscript_expression() {
			return getRuleContext(Superclass_subscript_expressionContext.class,0);
		}
		public Superclass_initializer_expressionContext superclass_initializer_expression() {
			return getRuleContext(Superclass_initializer_expressionContext.class,0);
		}
		public Superclass_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSuperclass_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSuperclass_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSuperclass_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_expressionContext superclass_expression() throws RecognitionException {
		Superclass_expressionContext _localctx = new Superclass_expressionContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_superclass_expression);
		try {
			setState(1571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1567);
				superclass_method_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1568);
				superclass_subscript_expression();
				setState(1569);
				superclass_initializer_expression();
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

	public static class Superclass_method_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Superclass_method_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_method_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSuperclass_method_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSuperclass_method_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSuperclass_method_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_method_expressionContext superclass_method_expression() throws RecognitionException {
		Superclass_method_expressionContext _localctx = new Superclass_method_expressionContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_superclass_method_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1573);
			match(T__80);
			setState(1574);
			match(T__38);
			setState(1575);
			identifier();
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

	public static class Superclass_subscript_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Superclass_subscript_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_subscript_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSuperclass_subscript_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSuperclass_subscript_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSuperclass_subscript_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_subscript_expressionContext superclass_subscript_expression() throws RecognitionException {
		Superclass_subscript_expressionContext _localctx = new Superclass_subscript_expressionContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_superclass_subscript_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			match(T__80);
			setState(1578);
			match(T__69);
			setState(1579);
			expression(0);
			setState(1580);
			match(T__70);
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

	public static class Superclass_initializer_expressionContext extends ParserRuleContext {
		public Superclass_initializer_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass_initializer_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSuperclass_initializer_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSuperclass_initializer_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitSuperclass_initializer_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Superclass_initializer_expressionContext superclass_initializer_expression() throws RecognitionException {
		Superclass_initializer_expressionContext _localctx = new Superclass_initializer_expressionContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_superclass_initializer_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			match(T__80);
			setState(1583);
			match(T__38);
			setState(1584);
			match(T__53);
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

	public static class Closure_expressionContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Closure_signatureContext closure_signature() {
			return getRuleContext(Closure_signatureContext.class,0);
		}
		public Closure_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClosure_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClosure_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitClosure_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closure_expressionContext closure_expression() throws RecognitionException {
		Closure_expressionContext _localctx = new Closure_expressionContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_closure_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			match(T__8);
			setState(1588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1587);
				closure_signature();
				}
				break;
			}
			setState(1590);
			statements();
			setState(1591);
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

	public static class Closure_signatureContext extends ParserRuleContext {
		public Parameter_clauseContext parameter_clause() {
			return getRuleContext(Parameter_clauseContext.class,0);
		}
		public Function_resultContext function_result() {
			return getRuleContext(Function_resultContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Capture_listContext capture_list() {
			return getRuleContext(Capture_listContext.class,0);
		}
		public Closure_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closure_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClosure_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClosure_signature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitClosure_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Closure_signatureContext closure_signature() throws RecognitionException {
		Closure_signatureContext _localctx = new Closure_signatureContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_closure_signature);
		int _la;
		try {
			setState(1622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1593);
				parameter_clause();
				setState(1595);
				_la = _input.LA(1);
				if (_la==T__45) {
					{
					setState(1594);
					function_result();
					}
				}

				setState(1597);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1599);
				identifier_list();
				setState(1601);
				_la = _input.LA(1);
				if (_la==T__45) {
					{
					setState(1600);
					function_result();
					}
				}

				setState(1603);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1605);
				capture_list();
				setState(1606);
				parameter_clause();
				setState(1608);
				_la = _input.LA(1);
				if (_la==T__45) {
					{
					setState(1607);
					function_result();
					}
				}

				setState(1610);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1612);
				capture_list();
				setState(1613);
				identifier_list();
				setState(1615);
				_la = _input.LA(1);
				if (_la==T__45) {
					{
					setState(1614);
					function_result();
					}
				}

				setState(1617);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1619);
				capture_list();
				setState(1620);
				match(T__2);
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

	public static class Capture_listContext extends ParserRuleContext {
		public Capture_specifierContext capture_specifier() {
			return getRuleContext(Capture_specifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Capture_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCapture_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCapture_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCapture_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_listContext capture_list() throws RecognitionException {
		Capture_listContext _localctx = new Capture_listContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_capture_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			match(T__69);
			setState(1625);
			capture_specifier();
			setState(1626);
			expression(0);
			setState(1627);
			match(T__70);
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

	public static class Capture_specifierContext extends ParserRuleContext {
		public Capture_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCapture_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCapture_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitCapture_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Capture_specifierContext capture_specifier() throws RecognitionException {
		Capture_specifierContext _localctx = new Capture_specifierContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_capture_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
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

	public static class Implicit_member_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Implicit_member_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicit_member_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImplicit_member_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImplicit_member_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitImplicit_member_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Implicit_member_expressionContext implicit_member_expression() throws RecognitionException {
		Implicit_member_expressionContext _localctx = new Implicit_member_expressionContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_implicit_member_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			match(T__38);
			setState(1632);
			identifier();
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

	public static class Parenthesized_expressionContext extends ParserRuleContext {
		public Expression_element_listContext expression_element_list() {
			return getRuleContext(Expression_element_listContext.class,0);
		}
		public Parenthesized_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesized_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParenthesized_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParenthesized_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitParenthesized_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parenthesized_expressionContext parenthesized_expression() throws RecognitionException {
		Parenthesized_expressionContext _localctx = new Parenthesized_expressionContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_parenthesized_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			match(T__46);
			setState(1636);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__69 - 64)) | (1L << (T__71 - 64)) | (1L << (T__73 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (Identifier - 64)) | (1L << (Binary_literal - 64)) | (1L << (Octal_literal - 64)) | (1L << (Decimal_literal - 64)) | (1L << (Hexadecimal_literal - 64)) | (1L << (Floating_point_literal - 64)) | (1L << (String_literal - 64)))) != 0)) {
				{
				setState(1635);
				expression_element_list();
				}
			}

			setState(1638);
			match(T__47);
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

	public static class Expression_element_listContext extends ParserRuleContext {
		public Expression_elementContext expression_element() {
			return getRuleContext(Expression_elementContext.class,0);
		}
		public Expression_element_listContext expression_element_list() {
			return getRuleContext(Expression_element_listContext.class,0);
		}
		public Expression_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpression_element_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpression_element_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExpression_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_element_listContext expression_element_list() throws RecognitionException {
		Expression_element_listContext _localctx = new Expression_element_listContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_expression_element_list);
		try {
			setState(1645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1640);
				expression_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1641);
				expression_element();
				setState(1642);
				match(T__12);
				setState(1643);
				expression_element_list();
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

	public static class Expression_elementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Expression_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpression_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpression_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitExpression_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_elementContext expression_element() throws RecognitionException {
		Expression_elementContext _localctx = new Expression_elementContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_expression_element);
		try {
			setState(1652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1647);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1648);
				identifier();
				setState(1649);
				match(T__11);
				setState(1650);
				expression(0);
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

	public static class Wildcard_expressionContext extends ParserRuleContext {
		public Wildcard_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWildcard_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWildcard_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitWildcard_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wildcard_expressionContext wildcard_expression() throws RecognitionException {
		Wildcard_expressionContext _localctx = new Wildcard_expressionContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_wildcard_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1654);
			match(T__51);
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

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__38) | (1L << T__40))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__75 - 74)) | (1L << (T__81 - 74)) | (1L << (T__82 - 74)) | (1L << (T__83 - 74)) | (1L << (T__84 - 74)) | (1L << (T__85 - 74)) | (1L << (T__86 - 74)) | (1L << (T__87 - 74)) | (1L << (T__88 - 74)))) != 0)) ) {
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

	public static class Binary_operatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBinary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBinary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitBinary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_binary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1658);
			operator();
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

	public static class Prefix_operatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Prefix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrefix_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrefix_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPrefix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_operatorContext prefix_operator() throws RecognitionException {
		Prefix_operatorContext _localctx = new Prefix_operatorContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_prefix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660);
			operator();
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

	public static class Postfix_operatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Postfix_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPostfix_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPostfix_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitPostfix_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_operatorContext postfix_operator() throws RecognitionException {
		Postfix_operatorContext _localctx = new Postfix_operatorContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_postfix_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			operator();
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
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public Protocol_composition_typeContext protocol_composition_type() {
			return getRuleContext(Protocol_composition_typeContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 370;
		enterRecursionRule(_localctx, 370, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1668);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__49:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case Identifier:
				{
				setState(1665);
				type_identifier();
				}
				break;
			case T__46:
				{
				setState(1666);
				tuple_type();
				}
				break;
			case T__35:
				{
				setState(1667);
				protocol_composition_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1686);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(1670);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1671);
						match(T__45);
						setState(1672);
						type(9);
						}
						break;
					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(1673);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1674);
						match(T__69);
						setState(1675);
						match(T__70);
						}
						break;
					case 3:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(1676);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1677);
						match(T__74);
						}
						break;
					case 4:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(1678);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1679);
						match(T__73);
						}
						break;
					case 5:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(1680);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1681);
						match(T__38);
						setState(1682);
						match(T__89);
						}
						break;
					case 6:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(1683);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1684);
						match(T__38);
						setState(1685);
						match(T__90);
						}
						break;
					}
					} 
				}
				setState(1690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
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

	public static class Type_annotationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Type_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType_annotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType_annotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_annotationContext type_annotation() throws RecognitionException {
		Type_annotationContext _localctx = new Type_annotationContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_type_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			match(T__11);
			setState(1693);
			_la = _input.LA(1);
			if (_la==T__68) {
				{
				setState(1692);
				attributes();
				}
			}

			setState(1695);
			type(0);
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

	public static class Type_identifierContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Generic_argument_clauseContext generic_argument_clause() {
			return getRuleContext(Generic_argument_clauseContext.class,0);
		}
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Type_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_identifierContext type_identifier() throws RecognitionException {
		Type_identifierContext _localctx = new Type_identifierContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_type_identifier);
		int _la;
		try {
			setState(1708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1697);
				type_name();
				setState(1699);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1698);
					generic_argument_clause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1701);
				type_name();
				setState(1703);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(1702);
					generic_argument_clause();
					}
				}

				setState(1705);
				match(T__38);
				setState(1706);
				type_identifier();
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

	public static class Type_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
			identifier();
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

	public static class Tuple_typeContext extends ParserRuleContext {
		public Tuple_type_bodyContext tuple_type_body() {
			return getRuleContext(Tuple_type_bodyContext.class,0);
		}
		public Tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_typeContext tuple_type() throws RecognitionException {
		Tuple_typeContext _localctx = new Tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_tuple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			match(T__46);
			setState(1714);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__35) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__46) | (1L << T__49) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__68 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1713);
				tuple_type_body();
				}
			}

			setState(1716);
			match(T__47);
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

	public static class Tuple_type_bodyContext extends ParserRuleContext {
		public Tuple_type_element_listContext tuple_type_element_list() {
			return getRuleContext(Tuple_type_element_listContext.class,0);
		}
		public Tuple_type_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_type_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_type_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_type_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_type_bodyContext tuple_type_body() throws RecognitionException {
		Tuple_type_bodyContext _localctx = new Tuple_type_bodyContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_tuple_type_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
			tuple_type_element_list();
			setState(1720);
			_la = _input.LA(1);
			if (_la==T__48) {
				{
				setState(1719);
				match(T__48);
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

	public static class Tuple_type_element_listContext extends ParserRuleContext {
		public Tuple_type_elementContext tuple_type_element() {
			return getRuleContext(Tuple_type_elementContext.class,0);
		}
		public Tuple_type_element_listContext tuple_type_element_list() {
			return getRuleContext(Tuple_type_element_listContext.class,0);
		}
		public Tuple_type_element_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_element_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_type_element_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_type_element_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_type_element_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_type_element_listContext tuple_type_element_list() throws RecognitionException {
		Tuple_type_element_listContext _localctx = new Tuple_type_element_listContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_tuple_type_element_list);
		try {
			setState(1727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1722);
				tuple_type_element();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1723);
				tuple_type_element();
				setState(1724);
				match(T__12);
				setState(1725);
				tuple_type_element_list();
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

	public static class Tuple_type_elementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public Element_nameContext element_name() {
			return getRuleContext(Element_nameContext.class,0);
		}
		public Type_annotationContext type_annotation() {
			return getRuleContext(Type_annotationContext.class,0);
		}
		public Tuple_type_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuple_type_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuple_type_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitTuple_type_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tuple_type_elementContext tuple_type_element() throws RecognitionException {
		Tuple_type_elementContext _localctx = new Tuple_type_elementContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_tuple_type_element);
		int _la;
		try {
			setState(1742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1730);
				_la = _input.LA(1);
				if (_la==T__68) {
					{
					setState(1729);
					attributes();
					}
				}

				setState(1733);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1732);
					match(T__49);
					}
					break;
				}
				setState(1735);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1737);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1736);
					match(T__49);
					}
					break;
				}
				setState(1739);
				element_name();
				setState(1740);
				type_annotation();
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

	public static class Element_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Element_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterElement_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitElement_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitElement_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Element_nameContext element_name() throws RecognitionException {
		Element_nameContext _localctx = new Element_nameContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_element_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			identifier();
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

	public static class Protocol_composition_typeContext extends ParserRuleContext {
		public Protocol_identifier_listContext protocol_identifier_list() {
			return getRuleContext(Protocol_identifier_listContext.class,0);
		}
		public Protocol_composition_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_composition_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_composition_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_composition_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_composition_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_composition_typeContext protocol_composition_type() throws RecognitionException {
		Protocol_composition_typeContext _localctx = new Protocol_composition_typeContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_protocol_composition_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			match(T__35);
			setState(1747);
			match(T__19);
			setState(1749);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__49) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(1748);
				protocol_identifier_list();
				}
			}

			setState(1751);
			match(T__20);
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

	public static class Protocol_identifier_listContext extends ParserRuleContext {
		public Protocol_identifierContext protocol_identifier() {
			return getRuleContext(Protocol_identifierContext.class,0);
		}
		public Protocol_identifier_listContext protocol_identifier_list() {
			return getRuleContext(Protocol_identifier_listContext.class,0);
		}
		public Protocol_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_identifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_identifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_identifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_identifier_listContext protocol_identifier_list() throws RecognitionException {
		Protocol_identifier_listContext _localctx = new Protocol_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_protocol_identifier_list);
		try {
			setState(1758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1753);
				protocol_identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1754);
				protocol_identifier();
				setState(1755);
				match(T__12);
				setState(1756);
				protocol_identifier_list();
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

	public static class Protocol_identifierContext extends ParserRuleContext {
		public Type_identifierContext type_identifier() {
			return getRuleContext(Type_identifierContext.class,0);
		}
		public Protocol_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocol_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocol_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitProtocol_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Protocol_identifierContext protocol_identifier() throws RecognitionException {
		Protocol_identifierContext _localctx = new Protocol_identifierContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_protocol_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1760);
			type_identifier();
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

	public static class Metatype_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Metatype_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metatype_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterMetatype_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitMetatype_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitMetatype_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Metatype_typeContext metatype_type() throws RecognitionException {
		Metatype_typeContext _localctx = new Metatype_typeContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_metatype_type);
		try {
			setState(1770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1762);
				type(0);
				setState(1763);
				match(T__38);
				setState(1764);
				match(T__89);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1766);
				type(0);
				setState(1767);
				match(T__38);
				setState(1768);
				match(T__90);
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

	public static class Type_inheritance_clauseContext extends ParserRuleContext {
		public Type_inheritance_listContext type_inheritance_list() {
			return getRuleContext(Type_inheritance_listContext.class,0);
		}
		public Type_inheritance_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_inheritance_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType_inheritance_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType_inheritance_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType_inheritance_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_inheritance_clauseContext type_inheritance_clause() throws RecognitionException {
		Type_inheritance_clauseContext _localctx = new Type_inheritance_clauseContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_type_inheritance_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1772);
			match(T__11);
			setState(1773);
			type_inheritance_list();
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

	public static class Type_inheritance_listContext extends ParserRuleContext {
		public List<Type_identifierContext> type_identifier() {
			return getRuleContexts(Type_identifierContext.class);
		}
		public Type_identifierContext type_identifier(int i) {
			return getRuleContext(Type_identifierContext.class,i);
		}
		public Type_inheritance_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_inheritance_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterType_inheritance_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitType_inheritance_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitType_inheritance_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_inheritance_listContext type_inheritance_list() throws RecognitionException {
		Type_inheritance_listContext _localctx = new Type_inheritance_listContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_type_inheritance_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1775);
			type_identifier();
			setState(1780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(1776);
				match(T__12);
				setState(1777);
				type_identifier();
				}
				}
				setState(1782);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SwiftParser.Identifier, 0); }
		public Context_sensitive_keywordContext context_sensitive_keyword() {
			return getRuleContext(Context_sensitive_keywordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_identifier);
		try {
			setState(1785);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1783);
				match(Identifier);
				}
				break;
			case T__23:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__49:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
				enterOuterAlt(_localctx, 2);
				{
				setState(1784);
				context_sensitive_keyword();
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

	public static class KeywordContext extends ParserRuleContext {
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__22) | (1L << T__26) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__39) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__67 - 67)) | (1L << (T__71 - 67)) | (1L << (T__72 - 67)) | (1L << (T__80 - 67)) | (1L << (T__89 - 67)) | (1L << (T__91 - 67)) | (1L << (T__92 - 67)))) != 0)) ) {
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

	public static class Context_sensitive_keywordContext extends ParserRuleContext {
		public Context_sensitive_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_context_sensitive_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterContext_sensitive_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitContext_sensitive_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitContext_sensitive_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Context_sensitive_keywordContext context_sensitive_keyword() throws RecognitionException {
		Context_sensitive_keywordContext _localctx = new Context_sensitive_keywordContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_context_sensitive_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1789);
			_la = _input.LA(1);
			if ( !(((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (T__23 - 24)) | (1L << (T__24 - 24)) | (1L << (T__25 - 24)) | (1L << (T__27 - 24)) | (1L << (T__28 - 24)) | (1L << (T__29 - 24)) | (1L << (T__30 - 24)) | (1L << (T__41 - 24)) | (1L << (T__42 - 24)) | (1L << (T__43 - 24)) | (1L << (T__44 - 24)) | (1L << (T__49 - 24)) | (1L << (T__57 - 24)) | (1L << (T__58 - 24)) | (1L << (T__59 - 24)) | (1L << (T__60 - 24)) | (1L << (T__61 - 24)) | (1L << (T__62 - 24)) | (1L << (T__63 - 24)) | (1L << (T__64 - 24)) | (1L << (T__65 - 24)))) != 0)) ) {
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

	public static class Identifier_listContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIdentifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitIdentifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_identifier_list);
		try {
			setState(1796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1791);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1792);
				identifier();
				setState(1793);
				match(T__12);
				setState(1794);
				identifier_list();
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

	public static class LiteralContext extends ParserRuleContext {
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public TerminalNode Floating_point_literal() { return getToken(SwiftParser.Floating_point_literal, 0); }
		public TerminalNode String_literal() { return getToken(SwiftParser.String_literal, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_literal);
		try {
			setState(1801);
			switch (_input.LA(1)) {
			case Binary_literal:
			case Octal_literal:
			case Decimal_literal:
			case Hexadecimal_literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(1798);
				integer_literal();
				}
				break;
			case Floating_point_literal:
				enterOuterAlt(_localctx, 2);
				{
				setState(1799);
				match(Floating_point_literal);
				}
				break;
			case String_literal:
				enterOuterAlt(_localctx, 3);
				{
				setState(1800);
				match(String_literal);
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

	public static class Integer_literalContext extends ParserRuleContext {
		public TerminalNode Binary_literal() { return getToken(SwiftParser.Binary_literal, 0); }
		public TerminalNode Octal_literal() { return getToken(SwiftParser.Octal_literal, 0); }
		public TerminalNode Decimal_literal() { return getToken(SwiftParser.Decimal_literal, 0); }
		public TerminalNode Hexadecimal_literal() { return getToken(SwiftParser.Hexadecimal_literal, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInteger_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SwiftVisitor ) return ((SwiftVisitor<? extends T>)visitor).visitInteger_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1803);
			_la = _input.LA(1);
			if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (Binary_literal - 96)) | (1L << (Octal_literal - 96)) | (1L << (Decimal_literal - 96)) | (1L << (Hexadecimal_literal - 96)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 134:
			return pattern_sempred((PatternContext)_localctx, predIndex);
		case 153:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 185:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean pattern_sempred(PatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 8);
		case 16:
			return precpred(_ctx, 9);
		case 17:
			return precpred(_ctx, 5);
		case 18:
			return precpred(_ctx, 4);
		case 19:
			return precpred(_ctx, 2);
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3k\u0710\4\2\t\2\4"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\3\2\3\2\7\2\u01a1\n\2\f\2\16"+
		"\2\u01a4\13\2\3\2\3\2\3\3\3\3\5\3\u01aa\n\3\3\3\3\3\5\3\u01ae\n\3\3\3"+
		"\3\3\5\3\u01b2\n\3\3\3\3\3\5\3\u01b6\n\3\3\3\3\3\3\3\5\3\u01bb\n\3\5\3"+
		"\u01bd\n\3\3\4\6\4\u01c0\n\4\r\4\16\4\u01c1\3\5\3\5\3\5\3\5\5\5\u01c8"+
		"\n\5\3\6\3\6\5\6\u01cc\n\6\3\6\3\6\5\6\u01d0\n\6\3\6\3\6\5\6\u01d4\n\6"+
		"\3\6\3\6\3\6\5\6\u01d9\n\6\3\6\3\6\5\6\u01dd\n\6\3\6\3\6\5\6\u01e1\n\6"+
		"\3\6\5\6\u01e4\n\6\3\7\3\7\5\7\u01e8\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\5\n\u01f6\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f"+
		"\u01ff\n\f\3\r\3\r\3\r\3\r\5\r\u0205\n\r\3\16\3\16\5\16\u0209\n\16\3\17"+
		"\3\17\3\17\3\17\5\17\u020f\n\17\3\20\3\20\3\20\3\20\5\20\u0215\n\20\3"+
		"\20\3\20\3\21\3\21\5\21\u021b\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0229\n\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\5\24\u0231\n\24\3\24\3\24\5\24\u0235\n\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0248"+
		"\n\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u0253\n\33\3\34"+
		"\3\34\5\34\u0257\n\34\3\35\3\35\5\35\u025b\n\35\3\36\3\36\3\37\3\37\5"+
		"\37\u0261\n\37\3 \3 \3 \5 \u0266\n \3 \3 \3!\3!\3!\3!\3!\5!\u026f\n!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u027a\n\"\3#\3#\3#\3$\3$\3$\3$"+
		"\3$\5$\u0284\n$\3%\3%\5%\u0288\n%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0292\n&"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\7)\u029f\n)\f)\16)\u02a2\13)\3*"+
		"\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u02b4\n+\3,\3,\5,\u02b8"+
		"\n,\3-\3-\5-\u02bc\n-\3.\3.\3/\3/\5/\u02c2\n/\3/\3/\3\60\5\60\u02c7\n"+
		"\60\3\60\3\60\5\60\u02cb\n\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\5\62\u02d6\n\62\3\63\3\63\5\63\u02da\n\63\3\64\5\64\u02dd\n\64\3"+
		"\64\5\64\u02e0\n\64\3\64\3\64\3\64\3\65\3\65\3\65\7\65\u02e8\n\65\f\65"+
		"\16\65\u02eb\13\65\3\66\3\66\5\66\u02ef\n\66\3\67\3\67\3\67\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u030a\n8\3"+
		"8\38\58\u030e\n8\39\59\u0311\n9\39\59\u0314\n9\39\39\3:\3:\3;\3;\3;\5"+
		";\u031d\n;\3;\3;\3;\3;\3;\3;\3;\5;\u0326\n;\3<\5<\u0329\n<\3<\3<\3<\3"+
		"=\5=\u032f\n=\3=\3=\5=\u0333\n=\3=\3=\3>\3>\3?\3?\3?\5?\u033c\n?\3?\3"+
		"?\3?\3?\3?\3?\3?\5?\u0345\n?\3@\5@\u0348\n@\3@\3@\3A\5A\u034d\nA\3A\3"+
		"A\3B\3B\3B\5B\u0354\nB\3B\3B\3B\3B\3B\3B\3B\5B\u035d\nB\3C\5C\u0360\n"+
		"C\3C\3C\5C\u0364\nC\3C\3C\3D\5D\u0369\nD\3D\3D\5D\u036d\nD\3D\3D\3E\3"+
		"E\3E\3F\3F\3F\3G\3G\3H\3H\3H\3I\3I\3I\5I\u037f\nI\3I\3I\3I\3J\5J\u0385"+
		"\nJ\3J\5J\u0388\nJ\3J\3J\3K\3K\5K\u038e\nK\3L\3L\5L\u0392\nL\3M\3M\5M"+
		"\u0396\nM\3M\3M\3N\3N\3O\3O\5O\u039e\nO\3P\3P\3P\3P\3P\5P\u03a5\nP\3P"+
		"\3P\5P\u03a9\nP\3Q\3Q\3Q\3Q\3Q\5Q\u03b0\nQ\3R\5R\u03b3\nR\3R\5R\u03b6"+
		"\nR\3R\5R\u03b9\nR\3R\3R\5R\u03bd\nR\3R\3R\5R\u03c1\nR\3R\5R\u03c4\nR"+
		"\3R\3R\5R\u03c8\nR\3R\3R\5R\u03cc\nR\3R\3R\5R\u03d0\nR\3R\5R\u03d3\nR"+
		"\3R\5R\u03d6\nR\3S\3S\5S\u03da\nS\3T\3T\5T\u03de\nT\3U\3U\3U\3V\5V\u03e4"+
		"\nV\3V\3V\5V\u03e8\nV\3V\5V\u03eb\nV\3W\3W\5W\u03ef\nW\3W\3W\5W\u03f3"+
		"\nW\3W\3W\3X\3X\5X\u03f9\nX\3Y\3Y\5Y\u03fd\nY\3Z\5Z\u0400\nZ\3Z\3Z\3Z"+
		"\3[\3[\3[\3[\3[\5[\u040a\n[\3\\\3\\\5\\\u040e\n\\\3]\3]\3^\3^\3_\3_\5"+
		"_\u0416\n_\3_\3_\3_\3_\5_\u041c\n_\3_\3_\3`\3`\5`\u0422\n`\3a\3a\5a\u0426"+
		"\na\3b\5b\u0429\nb\3b\3b\3b\3c\3c\3c\3c\3c\5c\u0433\nc\3d\3d\5d\u0437"+
		"\nd\3e\3e\3e\3f\5f\u043d\nf\3f\3f\3f\5f\u0442\nf\3f\5f\u0445\nf\3f\3f"+
		"\3g\3g\3h\3h\5h\u044d\nh\3h\3h\3i\5i\u0452\ni\3i\3i\3i\5i\u0457\ni\3i"+
		"\5i\u045a\ni\3i\3i\3j\3j\3k\3k\5k\u0462\nk\3k\3k\3l\5l\u0467\nl\3l\3l"+
		"\3l\5l\u046c\nl\3l\3l\3m\3m\3n\3n\5n\u0474\nn\3n\3n\3o\3o\3o\3o\3o\5o"+
		"\u047d\no\3p\3p\5p\u0481\np\3q\3q\3q\3q\3q\3r\3r\3r\5r\u048b\nr\3r\3r"+
		"\3s\3s\5s\u0491\ns\3s\3s\3t\3t\3t\3t\3u\3u\5u\u049b\nu\3u\5u\u049e\nu"+
		"\3v\3v\5v\u04a2\nv\3v\3v\3v\3w\5w\u04a8\nw\3w\5w\u04ab\nw\3w\3w\3x\3x"+
		"\3y\5y\u04b2\ny\3y\3y\3y\3z\3z\3z\5z\u04ba\nz\3z\3z\3{\3{\5{\u04c0\n{"+
		"\3{\3{\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\5|\u04d0\n|\3}\5}\u04d3\n}"+
		"\3}\3}\3}\3~\3~\5~\u04da\n~\3~\3~\3\177\3\177\3\177\5\177\u04e1\n\177"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0083\5\u0083\u04f7\n\u0083\3\u0083\5\u0083\u04fa\n\u0083\3"+
		"\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0087"+
		"\3\u0087\3\u0088\3\u0088\3\u0088\5\u0088\u0509\n\u0088\3\u0088\3\u0088"+
		"\5\u0088\u050d\n\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0512\n\u0088\3"+
		"\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u0518\n\u0088\3\u0088\3\u0088\3"+
		"\u0088\7\u0088\u051d\n\u0088\f\u0088\16\u0088\u0520\13\u0088\3\u0089\3"+
		"\u0089\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u052a\n"+
		"\u008b\3\u008c\3\u008c\5\u008c\u052e\n\u008c\3\u008c\3\u008c\3\u008d\3"+
		"\u008d\3\u008d\7\u008d\u0535\n\u008d\f\u008d\16\u008d\u0538\13\u008d\3"+
		"\u008e\3\u008e\3\u008f\5\u008f\u053d\n\u008f\3\u008f\3\u008f\3\u008f\5"+
		"\u008f\u0542\n\u008f\3\u0090\3\u0090\5\u0090\u0546\n\u0090\3\u0091\3\u0091"+
		"\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0094\3\u0094"+
		"\3\u0094\5\u0094\u0554\n\u0094\3\u0095\3\u0095\3\u0096\3\u0096\5\u0096"+
		"\u055a\n\u0096\3\u0096\3\u0096\3\u0097\6\u0097\u055f\n\u0097\r\u0097\16"+
		"\u0097\u0560\3\u0098\6\u0098\u0564\n\u0098\r\u0098\16\u0098\u0565\3\u0099"+
		"\3\u0099\5\u0099\u056a\n\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u056f\n"+
		"\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u0574\n\u0099\3\u0099\3\u0099\3"+
		"\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u057c\n\u0099\3\u009a\3\u009a\3"+
		"\u009a\7\u009a\u0581\n\u009a\f\u009a\16\u009a\u0584\13\u009a\3\u009b\3"+
		"\u009b\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u058c\n\u009b\3\u009b\3"+
		"\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\5\u009b\u05a1\n\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u05ad\n\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\7\u009b\u05be\n\u009b\f\u009b\16\u009b"+
		"\u05c1\13\u009b\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u05d0\n\u009f"+
		"\3\u009f\5\u009f\u05d3\n\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1\5\u00a1"+
		"\u05d9\n\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\5\u00a1\u05e2\n\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\5\u00a2\u05eb\n\u00a2\3\u00a3\3\u00a3\5\u00a3\u05ef\n\u00a3\3"+
		"\u00a3\3\u00a3\3\u00a4\3\u00a4\5\u00a4\u05f5\n\u00a4\3\u00a4\3\u00a4\3"+
		"\u00a4\3\u00a4\5\u00a4\u05fb\n\u00a4\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3"+
		"\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u0606\n\u00a6\3\u00a7\3"+
		"\u00a7\5\u00a7\u060a\n\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3"+
		"\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0620\n\u00a9"+
		"\3\u00aa\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u0626\n\u00aa\3\u00ab\3\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ae\3\u00ae\5\u00ae\u0637\n\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\3\u00af\3\u00af\5\u00af\u063e\n\u00af\3\u00af\3\u00af\3\u00af"+
		"\3\u00af\5\u00af\u0644\n\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af"+
		"\5\u00af\u064b\n\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af"+
		"\u0652\n\u00af\3\u00af\3\u00af\3\u00af\3\u00af\3\u00af\5\u00af\u0659\n"+
		"\u00af\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b2"+
		"\3\u00b2\3\u00b2\3\u00b3\3\u00b3\5\u00b3\u0667\n\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0670\n\u00b4\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0677\n\u00b5\3\u00b6\3\u00b6"+
		"\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0687\n\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\7\u00bb\u0699\n\u00bb\f\u00bb\16\u00bb"+
		"\u069c\13\u00bb\3\u00bc\3\u00bc\5\u00bc\u06a0\n\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bd\3\u00bd\5\u00bd\u06a6\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u06aa\n"+
		"\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd\u06af\n\u00bd\3\u00be\3\u00be\3"+
		"\u00bf\3\u00bf\5\u00bf\u06b5\n\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0\5"+
		"\u00c0\u06bb\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\5\u00c1\u06c2"+
		"\n\u00c1\3\u00c2\5\u00c2\u06c5\n\u00c2\3\u00c2\5\u00c2\u06c8\n\u00c2\3"+
		"\u00c2\3\u00c2\5\u00c2\u06cc\n\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u06d1"+
		"\n\u00c2\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4\5\u00c4\u06d8\n\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u06e1"+
		"\n\u00c5\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\3\u00c7\3\u00c7\5\u00c7\u06ed\n\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c9"+
		"\3\u00c9\3\u00c9\7\u00c9\u06f5\n\u00c9\f\u00c9\16\u00c9\u06f8\13\u00c9"+
		"\3\u00ca\3\u00ca\5\u00ca\u06fc\n\u00ca\3\u00cb\3\u00cb\3\u00cc\3\u00cc"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0707\n\u00cd\3\u00ce"+
		"\3\u00ce\3\u00ce\5\u00ce\u070c\n\u00ce\3\u00cf\3\u00cf\3\u00cf\2\5\u010e"+
		"\u0134\u0174\u00d0\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116"+
		"\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e"+
		"\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146"+
		"\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e"+
		"\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176"+
		"\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e"+
		"\u0190\u0192\u0194\u0196\u0198\u019a\u019c\2\n\3\2\31!\4\2\31\31#(\3\2"+
		"BD\3\2\36!\b\2\26\27))++LLNNT[\17\2\4\n\r\r\20\25\31\31\35\35\"(**\67"+
		";EFJKSS\\\\^_\7\2\32\34\36!,/\64\64<D\3\2be\u075e\2\u01a2\3\2\2\2\4\u01bc"+
		"\3\2\2\2\6\u01bf\3\2\2\2\b\u01c7\3\2\2\2\n\u01e3\3\2\2\2\f\u01e7\3\2\2"+
		"\2\16\u01e9\3\2\2\2\20\u01ef\3\2\2\2\22\u01f5\3\2\2\2\24\u01f7\3\2\2\2"+
		"\26\u01fe\3\2\2\2\30\u0200\3\2\2\2\32\u0208\3\2\2\2\34\u020e\3\2\2\2\36"+
		"\u0210\3\2\2\2 \u0218\3\2\2\2\"\u0228\3\2\2\2$\u022a\3\2\2\2&\u022e\3"+
		"\2\2\2(\u0239\3\2\2\2*\u023c\3\2\2\2,\u023f\3\2\2\2.\u0247\3\2\2\2\60"+
		"\u0249\3\2\2\2\62\u024c\3\2\2\2\64\u0252\3\2\2\2\66\u0254\3\2\2\28\u0258"+
		"\3\2\2\2:\u025c\3\2\2\2<\u025e\3\2\2\2>\u0262\3\2\2\2@\u026e\3\2\2\2B"+
		"\u0279\3\2\2\2D\u027b\3\2\2\2F\u0283\3\2\2\2H\u0287\3\2\2\2J\u0291\3\2"+
		"\2\2L\u0293\3\2\2\2N\u0297\3\2\2\2P\u029b\3\2\2\2R\u02a3\3\2\2\2T\u02b3"+
		"\3\2\2\2V\u02b5\3\2\2\2X\u02b9\3\2\2\2Z\u02bd\3\2\2\2\\\u02bf\3\2\2\2"+
		"^\u02c6\3\2\2\2`\u02ce\3\2\2\2b\u02d5\3\2\2\2d\u02d9\3\2\2\2f\u02dc\3"+
		"\2\2\2h\u02e4\3\2\2\2j\u02ec\3\2\2\2l\u02f0\3\2\2\2n\u030d\3\2\2\2p\u0310"+
		"\3\2\2\2r\u0317\3\2\2\2t\u0325\3\2\2\2v\u0328\3\2\2\2x\u032e\3\2\2\2z"+
		"\u0336\3\2\2\2|\u0344\3\2\2\2~\u0347\3\2\2\2\u0080\u034c\3\2\2\2\u0082"+
		"\u035c\3\2\2\2\u0084\u035f\3\2\2\2\u0086\u0368\3\2\2\2\u0088\u0370\3\2"+
		"\2\2\u008a\u0373\3\2\2\2\u008c\u0376\3\2\2\2\u008e\u0378\3\2\2\2\u0090"+
		"\u037b\3\2\2\2\u0092\u0384\3\2\2\2\u0094\u038d\3\2\2\2\u0096\u038f\3\2"+
		"\2\2\u0098\u0393\3\2\2\2\u009a\u0399\3\2\2\2\u009c\u039b\3\2\2\2\u009e"+
		"\u03a8\3\2\2\2\u00a0\u03af\3\2\2\2\u00a2\u03d5\3\2\2\2\u00a4\u03d9\3\2"+
		"\2\2\u00a6\u03dd\3\2\2\2\u00a8\u03df\3\2\2\2\u00aa\u03ea\3\2\2\2\u00ac"+
		"\u03ec\3\2\2\2\u00ae\u03f6\3\2\2\2\u00b0\u03fc\3\2\2\2\u00b2\u03ff\3\2"+
		"\2\2\u00b4\u0409\3\2\2\2\u00b6\u040b\3\2\2\2\u00b8\u040f\3\2\2\2\u00ba"+
		"\u0411\3\2\2\2\u00bc\u0413\3\2\2\2\u00be\u041f\3\2\2\2\u00c0\u0425\3\2"+
		"\2\2\u00c2\u0428\3\2\2\2\u00c4\u0432\3\2\2\2\u00c6\u0434\3\2\2\2\u00c8"+
		"\u0438\3\2\2\2\u00ca\u043c\3\2\2\2\u00cc\u0448\3\2\2\2\u00ce\u044a\3\2"+
		"\2\2\u00d0\u0451\3\2\2\2\u00d2\u045d\3\2\2\2\u00d4\u045f\3\2\2\2\u00d6"+
		"\u0466\3\2\2\2\u00d8\u046f\3\2\2\2\u00da\u0471\3\2\2\2\u00dc\u047c\3\2"+
		"\2\2\u00de\u047e\3\2\2\2\u00e0\u0482\3\2\2\2\u00e2\u0487\3\2\2\2\u00e4"+
		"\u048e\3\2\2\2\u00e6\u0494\3\2\2\2\u00e8\u0498\3\2\2\2\u00ea\u049f\3\2"+
		"\2\2\u00ec\u04a7\3\2\2\2\u00ee\u04ae\3\2\2\2\u00f0\u04b1\3\2\2\2\u00f2"+
		"\u04b6\3\2\2\2\u00f4\u04bd\3\2\2\2\u00f6\u04cf\3\2\2\2\u00f8\u04d2\3\2"+
		"\2\2\u00fa\u04d7\3\2\2\2\u00fc\u04e0\3\2\2\2\u00fe\u04e2\3\2\2\2\u0100"+
		"\u04e8\3\2\2\2\u0102\u04ee\3\2\2\2\u0104\u04f6\3\2\2\2\u0106\u04fb\3\2"+
		"\2\2\u0108\u04fe\3\2\2\2\u010a\u0500\3\2\2\2\u010c\u0503\3\2\2\2\u010e"+
		"\u0517\3\2\2\2\u0110\u0521\3\2\2\2\u0112\u0523\3\2\2\2\u0114\u0529\3\2"+
		"\2\2\u0116\u052b\3\2\2\2\u0118\u0531\3\2\2\2\u011a\u0539\3\2\2\2\u011c"+
		"\u053c\3\2\2\2\u011e\u0545\3\2\2\2\u0120\u0547\3\2\2\2\u0122\u054a\3\2"+
		"\2\2\u0124\u054e\3\2\2\2\u0126\u0550\3\2\2\2\u0128\u0555\3\2\2\2\u012a"+
		"\u0557\3\2\2\2\u012c\u055e\3\2\2\2\u012e\u0563\3\2\2\2\u0130\u057b\3\2"+
		"\2\2\u0132\u057d\3\2\2\2\u0134\u058b\3\2\2\2\u0136\u05c2\3\2\2\2\u0138"+
		"\u05c5\3\2\2\2\u013a\u05c7\3\2\2\2\u013c\u05d2\3\2\2\2\u013e\u05d4\3\2"+
		"\2\2\u0140\u05e1\3\2\2\2\u0142\u05ea\3\2\2\2\u0144\u05ec\3\2\2\2\u0146"+
		"\u05fa\3\2\2\2\u0148\u05fc\3\2\2\2\u014a\u0605\3\2\2\2\u014c\u0607\3\2"+
		"\2\2\u014e\u060f\3\2\2\2\u0150\u061f\3\2\2\2\u0152\u0625\3\2\2\2\u0154"+
		"\u0627\3\2\2\2\u0156\u062b\3\2\2\2\u0158\u0630\3\2\2\2\u015a\u0634\3\2"+
		"\2\2\u015c\u0658\3\2\2\2\u015e\u065a\3\2\2\2\u0160\u065f\3\2\2\2\u0162"+
		"\u0661\3\2\2\2\u0164\u0664\3\2\2\2\u0166\u066f\3\2\2\2\u0168\u0676\3\2"+
		"\2\2\u016a\u0678\3\2\2\2\u016c\u067a\3\2\2\2\u016e\u067c\3\2\2\2\u0170"+
		"\u067e\3\2\2\2\u0172\u0680\3\2\2\2\u0174\u0686\3\2\2\2\u0176\u069d\3\2"+
		"\2\2\u0178\u06ae\3\2\2\2\u017a\u06b0\3\2\2\2\u017c\u06b2\3\2\2\2\u017e"+
		"\u06b8\3\2\2\2\u0180\u06c1\3\2\2\2\u0182\u06d0\3\2\2\2\u0184\u06d2\3\2"+
		"\2\2\u0186\u06d4\3\2\2\2\u0188\u06e0\3\2\2\2\u018a\u06e2\3\2\2\2\u018c"+
		"\u06ec\3\2\2\2\u018e\u06ee\3\2\2\2\u0190\u06f1\3\2\2\2\u0192\u06fb\3\2"+
		"\2\2\u0194\u06fd\3\2\2\2\u0196\u06ff\3\2\2\2\u0198\u0706\3\2\2\2\u019a"+
		"\u070b\3\2\2\2\u019c\u070d\3\2\2\2\u019e\u01a1\5\4\3\2\u019f\u01a1\5\u0134"+
		"\u009b\2\u01a0\u019e\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2\3\2"+
		"\2\2\u01a5\u01a6\7\2\2\3\u01a6\3\3\2\2\2\u01a7\u01a9\5\u0134\u009b\2\u01a8"+
		"\u01aa\7\3\2\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01bd\3\2"+
		"\2\2\u01ab\u01ad\5T+\2\u01ac\u01ae\7\3\2\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae"+
		"\3\2\2\2\u01ae\u01bd\3\2\2\2\u01af\u01b1\5\b\5\2\u01b0\u01b2\7\3\2\2\u01b1"+
		"\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01bd\3\2\2\2\u01b3\u01b5\5\26"+
		"\f\2\u01b4\u01b6\7\3\2\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01bd\3\2\2\2\u01b7\u01bd\5.\30\2\u01b8\u01ba\5\64\33\2\u01b9\u01bb\7"+
		"\3\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc"+
		"\u01a7\3\2\2\2\u01bc\u01ab\3\2\2\2\u01bc\u01af\3\2\2\2\u01bc\u01b3\3\2"+
		"\2\2\u01bc\u01b7\3\2\2\2\u01bc\u01b8\3\2\2\2\u01bd\5\3\2\2\2\u01be\u01c0"+
		"\5\4\3\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\7\3\2\2\2\u01c3\u01c8\5\n\6\2\u01c4\u01c8\5\16\b"+
		"\2\u01c5\u01c8\5\20\t\2\u01c6\u01c8\5\24\13\2\u01c7\u01c3\3\2\2\2\u01c7"+
		"\u01c4\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8\t\3\2\2\2"+
		"\u01c9\u01cb\7\4\2\2\u01ca\u01cc\5\f\7\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\7\3\2\2\u01ce\u01d0\5\u0134\u009b"+
		"\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3"+
		"\7\3\2\2\u01d2\u01d4\5\u0134\u009b\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3"+
		"\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01e4\5\\/\2\u01d6\u01d8\7\4\2\2\u01d7"+
		"\u01d9\5\f\7\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2"+
		"\2\2\u01da\u01dc\7\3\2\2\u01db\u01dd\5\u0134\u009b\2\u01dc\u01db\3\2\2"+
		"\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\7\3\2\2\u01df\u01e1"+
		"\5\u0134\u009b\2\u01e0\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3"+
		"\2\2\2\u01e2\u01e4\5\\/\2\u01e3\u01c9\3\2\2\2\u01e3\u01d6\3\2\2\2\u01e4"+
		"\13\3\2\2\2\u01e5\u01e8\5n8\2\u01e6\u01e8\5\u0132\u009a\2\u01e7\u01e5"+
		"\3\2\2\2\u01e7\u01e6\3\2\2\2\u01e8\r\3\2\2\2\u01e9\u01ea\7\4\2\2\u01ea"+
		"\u01eb\5\u010e\u0088\2\u01eb\u01ec\7\5\2\2\u01ec\u01ed\5\u0134\u009b\2"+
		"\u01ed\u01ee\5\\/\2\u01ee\17\3\2\2\2\u01ef\u01f0\7\6\2\2\u01f0\u01f1\5"+
		"\22\n\2\u01f1\u01f2\5\\/\2\u01f2\21\3\2\2\2\u01f3\u01f6\5\u0134\u009b"+
		"\2\u01f4\u01f6\5T+\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6\23"+
		"\3\2\2\2\u01f7\u01f8\7\7\2\2\u01f8\u01f9\5\\/\2\u01f9\u01fa\7\6\2\2\u01fa"+
		"\u01fb\5\22\n\2\u01fb\25\3\2\2\2\u01fc\u01ff\5\30\r\2\u01fd\u01ff\5\36"+
		"\20\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff\27\3\2\2\2\u0200\u0201"+
		"\7\b\2\2\u0201\u0202\5\32\16\2\u0202\u0204\5\\/\2\u0203\u0205\5\34\17"+
		"\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205\31\3\2\2\2\u0206\u0209"+
		"\5\u0134\u009b\2\u0207\u0209\5T+\2\u0208\u0206\3\2\2\2\u0208\u0207\3\2"+
		"\2\2\u0209\33\3\2\2\2\u020a\u020b\7\t\2\2\u020b\u020f\5\\/\2\u020c\u020d"+
		"\7\t\2\2\u020d\u020f\5\30\r\2\u020e\u020a\3\2\2\2\u020e\u020c\3\2\2\2"+
		"\u020f\35\3\2\2\2\u0210\u0211\7\n\2\2\u0211\u0212\5\u0134\u009b\2\u0212"+
		"\u0214\7\13\2\2\u0213\u0215\5 \21\2\u0214\u0213\3\2\2\2\u0214\u0215\3"+
		"\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\7\f\2\2\u0217\37\3\2\2\2\u0218"+
		"\u021a\5\"\22\2\u0219\u021b\5 \21\2\u021a\u0219\3\2\2\2\u021a\u021b\3"+
		"\2\2\2\u021b!\3\2\2\2\u021c\u021d\5$\23\2\u021d\u021e\5\6\4\2\u021e\u0229"+
		"\3\2\2\2\u021f\u0220\5(\25\2\u0220\u0221\5\6\4\2\u0221\u0229\3\2\2\2\u0222"+
		"\u0223\5$\23\2\u0223\u0224\7\3\2\2\u0224\u0229\3\2\2\2\u0225\u0226\5("+
		"\25\2\u0226\u0227\7\3\2\2\u0227\u0229\3\2\2\2\u0228\u021c\3\2\2\2\u0228"+
		"\u021f\3\2\2\2\u0228\u0222\3\2\2\2\u0228\u0225\3\2\2\2\u0229#\3\2\2\2"+
		"\u022a\u022b\7\r\2\2\u022b\u022c\5&\24\2\u022c\u022d\7\16\2\2\u022d%\3"+
		"\2\2\2\u022e\u0230\5\u010e\u0088\2\u022f\u0231\5*\26\2\u0230\u022f\3\2"+
		"\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234\5\u010e\u0088"+
		"\2\u0233\u0235\5*\26\2\u0234\u0233\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236"+
		"\3\2\2\2\u0236\u0237\7\17\2\2\u0237\u0238\5&\24\2\u0238\'\3\2\2\2\u0239"+
		"\u023a\7\20\2\2\u023a\u023b\7\16\2\2\u023b)\3\2\2\2\u023c\u023d\7\21\2"+
		"\2\u023d\u023e\5,\27\2\u023e+\3\2\2\2\u023f\u0240\5\u0134\u009b\2\u0240"+
		"-\3\2\2\2\u0241\u0242\5\60\31\2\u0242\u0243\5\b\5\2\u0243\u0248\3\2\2"+
		"\2\u0244\u0245\5\60\31\2\u0245\u0246\5\36\20\2\u0246\u0248\3\2\2\2\u0247"+
		"\u0241\3\2\2\2\u0247\u0244\3\2\2\2\u0248/\3\2\2\2\u0249\u024a\5\62\32"+
		"\2\u024a\u024b\7\16\2\2\u024b\61\3\2\2\2\u024c\u024d\5\u0192\u00ca\2\u024d"+
		"\63\3\2\2\2\u024e\u0253\5\66\34\2\u024f\u0253\58\35\2\u0250\u0253\5:\36"+
		"\2\u0251\u0253\5<\37\2\u0252\u024e\3\2\2\2\u0252\u024f\3\2\2\2\u0252\u0250"+
		"\3\2\2\2\u0252\u0251\3\2\2\2\u0253\65\3\2\2\2\u0254\u0256\7\22\2\2\u0255"+
		"\u0257\5\62\32\2\u0256\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257\67\3\2"+
		"\2\2\u0258\u025a\7\23\2\2\u0259\u025b\5\62\32\2\u025a\u0259\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b9\3\2\2\2\u025c\u025d\7\24\2\2\u025d;\3\2\2\2\u025e"+
		"\u0260\7\25\2\2\u025f\u0261\5\u0134\u009b\2\u0260\u025f\3\2\2\2\u0260"+
		"\u0261\3\2\2\2\u0261=\3\2\2\2\u0262\u0263\7\26\2\2\u0263\u0265\5@!\2\u0264"+
		"\u0266\5D#\2\u0265\u0264\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\3\2\2"+
		"\2\u0267\u0268\7\27\2\2\u0268?\3\2\2\2\u0269\u026f\5B\"\2\u026a\u026b"+
		"\5B\"\2\u026b\u026c\7\17\2\2\u026c\u026d\5@!\2\u026d\u026f\3\2\2\2\u026e"+
		"\u0269\3\2\2\2\u026e\u026a\3\2\2\2\u026fA\3\2\2\2\u0270\u027a\5\u017a"+
		"\u00be\2\u0271\u0272\5\u017a\u00be\2\u0272\u0273\7\16\2\2\u0273\u0274"+
		"\5\u0178\u00bd\2\u0274\u027a\3\2\2\2\u0275\u0276\5\u017a\u00be\2\u0276"+
		"\u0277\7\16\2\2\u0277\u0278\5\u0186\u00c4\2\u0278\u027a\3\2\2\2\u0279"+
		"\u0270\3\2\2\2\u0279\u0271\3\2\2\2\u0279\u0275\3\2\2\2\u027aC\3\2\2\2"+
		"\u027b\u027c\7\21\2\2\u027c\u027d\5F$\2\u027dE\3\2\2\2\u027e\u0284\5H"+
		"%\2\u027f\u0280\5H%\2\u0280\u0281\7\17\2\2\u0281\u0282\5F$\2\u0282\u0284"+
		"\3\2\2\2\u0283\u027e\3\2\2\2\u0283\u027f\3\2\2\2\u0284G\3\2\2\2\u0285"+
		"\u0288\5J&\2\u0286\u0288\5L\'\2\u0287\u0285\3\2\2\2\u0287\u0286\3\2\2"+
		"\2\u0288I\3\2\2\2\u0289\u028a\5\u0178\u00bd\2\u028a\u028b\7\16\2\2\u028b"+
		"\u028c\5\u0178\u00bd\2\u028c\u0292\3\2\2\2\u028d\u028e\5\u0178\u00bd\2"+
		"\u028e\u028f\7\16\2\2\u028f\u0290\5\u0186\u00c4\2\u0290\u0292\3\2\2\2"+
		"\u0291\u0289\3\2\2\2\u0291\u028d\3\2\2\2\u0292K\3\2\2\2\u0293\u0294\5"+
		"\u0178\u00bd\2\u0294\u0295\7\30\2\2\u0295\u0296\5\u0178\u00bd\2\u0296"+
		"M\3\2\2\2\u0297\u0298\7\26\2\2\u0298\u0299\5P)\2\u0299\u029a\7\27\2\2"+
		"\u029aO\3\2\2\2\u029b\u02a0\5R*\2\u029c\u029d\7\17\2\2\u029d\u029f\5R"+
		"*\2\u029e\u029c\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0"+
		"\u02a1\3\2\2\2\u02a1Q\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a4\5\u0174"+
		"\u00bb\2\u02a4S\3\2\2\2\u02a5\u02b4\5^\60\2\u02a6\u02b4\5f\64\2\u02a7"+
		"\u02b4\5n8\2\u02a8\u02b4\5\u0088E\2\u02a9\u02b4\5\u0090I\2\u02aa\u02b4"+
		"\5\u00aaV\2\u02ab\u02b4\5\u00caf\2\u02ac\u02b4\5\u00d0i\2\u02ad\u02b4"+
		"\5\u00d6l\2\u02ae\u02b4\5\u00eav\2\u02af\u02b4\5\u00f0y\2\u02b0\u02b4"+
		"\5\u00f2z\2\u02b1\u02b4\5\u00f6|\2\u02b2\u02b4\5\u00fc\177\2\u02b3\u02a5"+
		"\3\2\2\2\u02b3\u02a6\3\2\2\2\u02b3\u02a7\3\2\2\2\u02b3\u02a8\3\2\2\2\u02b3"+
		"\u02a9\3\2\2\2\u02b3\u02aa\3\2\2\2\u02b3\u02ab\3\2\2\2\u02b3\u02ac\3\2"+
		"\2\2\u02b3\u02ad\3\2\2\2\u02b3\u02ae\3\2\2\2\u02b3\u02af\3\2\2\2\u02b3"+
		"\u02b0\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4U\3\2\2\2"+
		"\u02b5\u02b7\5T+\2\u02b6\u02b8\5V,\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3"+
		"\2\2\2\u02b8W\3\2\2\2\u02b9\u02bb\5Z.\2\u02ba\u02bc\5X-\2\u02bb\u02ba"+
		"\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bcY\3\2\2\2\u02bd\u02be\t\2\2\2\u02be"+
		"[\3\2\2\2\u02bf\u02c1\7\13\2\2\u02c0\u02c2\5\6\4\2\u02c1\u02c0\3\2\2\2"+
		"\u02c1\u02c2\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\7\f\2\2\u02c4]\3"+
		"\2\2\2\u02c5\u02c7\5\u012c\u0097\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2"+
		"\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02ca\7\"\2\2\u02c9\u02cb\5`\61\2\u02ca"+
		"\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\5b"+
		"\62\2\u02cd_\3\2\2\2\u02ce\u02cf\t\3\2\2\u02cfa\3\2\2\2\u02d0\u02d6\5"+
		"d\63\2\u02d1\u02d2\5d\63\2\u02d2\u02d3\7)\2\2\u02d3\u02d4\5b\62\2\u02d4"+
		"\u02d6\3\2\2\2\u02d5\u02d0\3\2\2\2\u02d5\u02d1\3\2\2\2\u02d6c\3\2\2\2"+
		"\u02d7\u02da\5\u0192\u00ca\2\u02d8\u02da\5\u016c\u00b7\2\u02d9\u02d7\3"+
		"\2\2\2\u02d9\u02d8\3\2\2\2\u02dae\3\2\2\2\u02db\u02dd\5\u012c\u0097\2"+
		"\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02df\3\2\2\2\u02de\u02e0"+
		"\5X-\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1"+
		"\u02e2\7*\2\2\u02e2\u02e3\5h\65\2\u02e3g\3\2\2\2\u02e4\u02e9\5j\66\2\u02e5"+
		"\u02e6\7\17\2\2\u02e6\u02e8\5j\66\2\u02e7\u02e5\3\2\2\2\u02e8\u02eb\3"+
		"\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02eai\3\2\2\2\u02eb\u02e9"+
		"\3\2\2\2\u02ec\u02ee\5\u010e\u0088\2\u02ed\u02ef\5l\67\2\u02ee\u02ed\3"+
		"\2\2\2\u02ee\u02ef\3\2\2\2\u02efk\3\2\2\2\u02f0\u02f1\7+\2\2\u02f1\u02f2"+
		"\5\u0134\u009b\2\u02f2m\3\2\2\2\u02f3\u02f4\5p9\2\u02f4\u02f5\5h\65\2"+
		"\u02f5\u030e\3\2\2\2\u02f6\u02f7\5p9\2\u02f7\u02f8\5r:\2\u02f8\u02f9\5"+
		"\u0176\u00bc\2\u02f9\u02fa\5\\/\2\u02fa\u030e\3\2\2\2\u02fb\u02fc\5p9"+
		"\2\u02fc\u02fd\5r:\2\u02fd\u02fe\5\u0176\u00bc\2\u02fe\u02ff\5t;\2\u02ff"+
		"\u030e\3\2\2\2\u0300\u0301\5p9\2\u0301\u0302\5r:\2\u0302\u0303\5\u0176"+
		"\u00bc\2\u0303\u0304\5|?\2\u0304\u030e\3\2\2\2\u0305\u0306\5p9\2\u0306"+
		"\u0307\5r:\2\u0307\u0309\5\u0176\u00bc\2\u0308\u030a\5l\67\2\u0309\u0308"+
		"\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\5\u0082B"+
		"\2\u030c\u030e\3\2\2\2\u030d\u02f3\3\2\2\2\u030d\u02f6\3\2\2\2\u030d\u02fb"+
		"\3\2\2\2\u030d\u0300\3\2\2\2\u030d\u0305\3\2\2\2\u030eo\3\2\2\2\u030f"+
		"\u0311\5\u012c\u0097\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0313"+
		"\3\2\2\2\u0312\u0314\5X-\2\u0313\u0312\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"\u0315\3\2\2\2\u0315\u0316\7\'\2\2\u0316q\3\2\2\2\u0317\u0318\5\u0192"+
		"\u00ca\2\u0318s\3\2\2\2\u0319\u031a\7\13\2\2\u031a\u031c\5v<\2\u031b\u031d"+
		"\5x=\2\u031c\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031e\3\2\2\2\u031e"+
		"\u031f\7\f\2\2\u031f\u0326\3\2\2\2\u0320\u0321\7\13\2\2\u0321\u0322\5"+
		"x=\2\u0322\u0323\5v<\2\u0323\u0324\7\f\2\2\u0324\u0326\3\2\2\2\u0325\u0319"+
		"\3\2\2\2\u0325\u0320\3\2\2\2\u0326u\3\2\2\2\u0327\u0329\5\u012c\u0097"+
		"\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032b"+
		"\7,\2\2\u032b\u032c\5\\/\2\u032cw\3\2\2\2\u032d\u032f\5\u012c\u0097\2"+
		"\u032e\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0332"+
		"\7-\2\2\u0331\u0333\5z>\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333"+
		"\u0334\3\2\2\2\u0334\u0335\5\\/\2\u0335y\3\2\2\2\u0336\u0337\5\u0192\u00ca"+
		"\2\u0337{\3\2\2\2\u0338\u0339\7\13\2\2\u0339\u033b\5~@\2\u033a\u033c\5"+
		"\u0080A\2\u033b\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\3\2\2\2"+
		"\u033d\u033e\7\f\2\2\u033e\u0345\3\2\2\2\u033f\u0340\7\13\2\2\u0340\u0341"+
		"\5\u0080A\2\u0341\u0342\5~@\2\u0342\u0343\7\f\2\2\u0343\u0345\3\2\2\2"+
		"\u0344\u0338\3\2\2\2\u0344\u033f\3\2\2\2\u0345}\3\2\2\2\u0346\u0348\5"+
		"\u012c\u0097\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\3\2"+
		"\2\2\u0349\u034a\7,\2\2\u034a\177\3\2\2\2\u034b\u034d\5\u012c\u0097\2"+
		"\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034f"+
		"\7-\2\2\u034f\u0081\3\2\2\2\u0350\u0351\7\13\2\2\u0351\u0353\5\u0084C"+
		"\2\u0352\u0354\5\u0086D\2\u0353\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354"+
		"\u0355\3\2\2\2\u0355\u0356\7\f\2\2\u0356\u035d\3\2\2\2\u0357\u0358\7\13"+
		"\2\2\u0358\u0359\5\u0086D\2\u0359\u035a\5\u0084C\2\u035a\u035b\7\f\2\2"+
		"\u035b\u035d\3\2\2\2\u035c\u0350\3\2\2\2\u035c\u0357\3\2\2\2\u035d\u0083"+
		"\3\2\2\2\u035e\u0360\5\u012c\u0097\2\u035f\u035e\3\2\2\2\u035f\u0360\3"+
		"\2\2\2\u0360\u0361\3\2\2\2\u0361\u0363\7.\2\2\u0362\u0364\5z>\2\u0363"+
		"\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0366\5\\"+
		"/\2\u0366\u0085\3\2\2\2\u0367\u0369\5\u012c\u0097\2\u0368\u0367\3\2\2"+
		"\2\u0368\u0369\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036c\7/\2\2\u036b\u036d"+
		"\5z>\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\3\2\2\2\u036e"+
		"\u036f\5\\/\2\u036f\u0087\3\2\2\2\u0370\u0371\5\u008aF\2\u0371\u0372\5"+
		"\u008eH\2\u0372\u0089\3\2\2\2\u0373\u0374\7#\2\2\u0374\u0375\5\u008cG"+
		"\2\u0375\u008b\3\2\2\2\u0376\u0377\5\u0192\u00ca\2\u0377\u008d\3\2\2\2"+
		"\u0378\u0379\7+\2\2\u0379\u037a\5\u0174\u00bb\2\u037a\u008f\3\2\2\2\u037b"+
		"\u037c\5\u0092J\2\u037c\u037e\5\u0094K\2\u037d\u037f\5> \2\u037e\u037d"+
		"\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\5\u0096L"+
		"\2\u0381\u0382\5\u009aN\2\u0382\u0091\3\2\2\2\u0383\u0385\5\u012c\u0097"+
		"\2\u0384\u0383\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0387\3\2\2\2\u0386\u0388"+
		"\5X-\2\u0387\u0386\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u0389\3\2\2\2\u0389"+
		"\u038a\7(\2\2\u038a\u0093\3\2\2\2\u038b\u038e\5\u0192\u00ca\2\u038c\u038e"+
		"\5\u016c\u00b7\2\u038d\u038b\3\2\2\2\u038d\u038c\3\2\2\2\u038e\u0095\3"+
		"\2\2\2\u038f\u0391\5\u009cO\2\u0390\u0392\5\u0098M\2\u0391\u0390\3\2\2"+
		"\2\u0391\u0392\3\2\2\2\u0392\u0097\3\2\2\2\u0393\u0395\7\60\2\2\u0394"+
		"\u0396\5\u012c\u0097\2\u0395\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397"+
		"\3\2\2\2\u0397\u0398\5\u0174\u00bb\2\u0398\u0099\3\2\2\2\u0399\u039a\5"+
		"\\/\2\u039a\u009b\3\2\2\2\u039b\u039d\5\u009eP\2\u039c\u039e\5\u009cO"+
		"\2\u039d\u039c\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u009d\3\2\2\2\u039f\u03a0"+
		"\7\61\2\2\u03a0\u03a9\7\62\2\2\u03a1\u03a2\7\61\2\2\u03a2\u03a4\5\u00a0"+
		"Q\2\u03a3\u03a5\7\63\2\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5"+
		"\u03a6\3\2\2\2\u03a6\u03a7\7\62\2\2\u03a7\u03a9\3\2\2\2\u03a8\u039f\3"+
		"\2\2\2\u03a8\u03a1\3\2\2\2\u03a9\u009f\3\2\2\2\u03aa\u03b0\5\u00a2R\2"+
		"\u03ab\u03ac\5\u00a2R\2\u03ac\u03ad\7\17\2\2\u03ad\u03ae\5\u00a0Q\2\u03ae"+
		"\u03b0\3\2\2\2\u03af\u03aa\3\2\2\2\u03af\u03ab\3\2\2\2\u03b0\u00a1\3\2"+
		"\2\2\u03b1\u03b3\7\64\2\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3"+
		"\u03b5\3\2\2\2\u03b4\u03b6\7*\2\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6\3\2"+
		"\2\2\u03b6\u03b8\3\2\2\2\u03b7\u03b9\7\65\2\2\u03b8\u03b7\3\2\2\2\u03b8"+
		"\u03b9\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bc\5\u00a4S\2\u03bb\u03bd"+
		"\5\u00a6T\2\u03bc\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2"+
		"\2\u03be\u03c0\5\u0176\u00bc\2\u03bf\u03c1\5\u00a8U\2\u03c0\u03bf\3\2"+
		"\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03d6\3\2\2\2\u03c2\u03c4\7\64\2\2\u03c3"+
		"\u03c2\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c7\7\'"+
		"\2\2\u03c6\u03c8\7\65\2\2\u03c7\u03c6\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8"+
		"\u03c9\3\2\2\2\u03c9\u03cb\5\u00a4S\2\u03ca\u03cc\5\u00a6T\2\u03cb\u03ca"+
		"\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03cf\5\u0176\u00bc"+
		"\2\u03ce\u03d0\5\u00a8U\2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0"+
		"\u03d6\3\2\2\2\u03d1\u03d3\5\u012c\u0097\2\u03d2\u03d1\3\2\2\2\u03d2\u03d3"+
		"\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d6\5\u0174\u00bb\2\u03d5\u03b2\3"+
		"\2\2\2\u03d5\u03c3\3\2\2\2\u03d5\u03d2\3\2\2\2\u03d6\u00a3\3\2\2\2\u03d7"+
		"\u03da\5\u0192\u00ca\2\u03d8\u03da\7\66\2\2\u03d9\u03d7\3\2\2\2\u03d9"+
		"\u03d8\3\2\2\2\u03da\u00a5\3\2\2\2\u03db\u03de\5\u0192\u00ca\2\u03dc\u03de"+
		"\7\66\2\2\u03dd\u03db\3\2\2\2\u03dd\u03dc\3\2\2\2\u03de\u00a7\3\2\2\2"+
		"\u03df\u03e0\7+\2\2\u03e0\u03e1\5\u0134\u009b\2\u03e1\u00a9\3\2\2\2\u03e2"+
		"\u03e4\5\u012c\u0097\2\u03e3\u03e2\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e5"+
		"\3\2\2\2\u03e5\u03eb\5\u00acW\2\u03e6\u03e8\5\u012c\u0097\2\u03e7\u03e6"+
		"\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03eb\5\u00bc_"+
		"\2\u03ea\u03e3\3\2\2\2\u03ea\u03e7\3\2\2\2\u03eb\u00ab\3\2\2\2\u03ec\u03ee"+
		"\5\u00b8]\2\u03ed\u03ef\5> \2\u03ee\u03ed\3\2\2\2\u03ee\u03ef\3\2\2\2"+
		"\u03ef\u03f0\3\2\2\2\u03f0\u03f2\7\13\2\2\u03f1\u03f3\5\u00aeX\2\u03f2"+
		"\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\7\f"+
		"\2\2\u03f5\u00ad\3\2\2\2\u03f6\u03f8\5\u00b0Y\2\u03f7\u03f9\5\u00aeX\2"+
		"\u03f8\u03f7\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u00af\3\2\2\2\u03fa\u03fd"+
		"\5T+\2\u03fb\u03fd\5\u00b2Z\2\u03fc\u03fa\3\2\2\2\u03fc\u03fb\3\2\2\2"+
		"\u03fd\u00b1\3\2\2\2\u03fe\u0400\5\u012c\u0097\2\u03ff\u03fe\3\2\2\2\u03ff"+
		"\u0400\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0402\7\r\2\2\u0402\u0403\5\u00b4"+
		"[\2\u0403\u00b3\3\2\2\2\u0404\u040a\5\u00b6\\\2\u0405\u0406\5\u00b6\\"+
		"\2\u0406\u0407\7\17\2\2\u0407\u0408\5\u00b4[\2\u0408\u040a\3\2\2\2\u0409"+
		"\u0404\3\2\2\2\u0409\u0405\3\2\2\2\u040a\u00b5\3\2\2\2\u040b\u040d\5\u00ba"+
		"^\2\u040c\u040e\5\u017c\u00bf\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2"+
		"\2\u040e\u00b7\3\2\2\2\u040f\u0410\5\u0192\u00ca\2\u0410\u00b9\3\2\2\2"+
		"\u0411\u0412\5\u0192\u00ca\2\u0412\u00bb\3\2\2\2\u0413\u0415\5\u00b8]"+
		"\2\u0414\u0416\5> \2\u0415\u0414\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0417"+
		"\3\2\2\2\u0417\u0418\7\16\2\2\u0418\u0419\5\u0178\u00bd\2\u0419\u041b"+
		"\7\13\2\2\u041a\u041c\5\u00be`\2\u041b\u041a\3\2\2\2\u041b\u041c\3\2\2"+
		"\2\u041c\u041d\3\2\2\2\u041d\u041e\7\f\2\2\u041e\u00bd\3\2\2\2\u041f\u0421"+
		"\5\u00c0a\2\u0420\u0422\5\u00be`\2\u0421\u0420\3\2\2\2\u0421\u0422\3\2"+
		"\2\2\u0422\u00bf\3\2\2\2\u0423\u0426\5T+\2\u0424\u0426\5\u00c2b\2\u0425"+
		"\u0423\3\2\2\2\u0425\u0424\3\2\2\2\u0426\u00c1\3\2\2\2\u0427\u0429\5\u012c"+
		"\u0097\2\u0428\u0427\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\3\2\2\2\u042a"+
		"\u042b\7\r\2\2\u042b\u042c\5\u00c4c\2\u042c\u00c3\3\2\2\2\u042d\u0433"+
		"\5\u00c6d\2\u042e\u042f\5\u00c6d\2\u042f\u0430\7\17\2\2\u0430\u0431\5"+
		"\u00c4c\2\u0431\u0433\3\2\2\2\u0432\u042d\3\2\2\2\u0432\u042e\3\2\2\2"+
		"\u0433\u00c5\3\2\2\2\u0434\u0436\5\u00ba^\2\u0435\u0437\5\u00c8e\2\u0436"+
		"\u0435\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u00c7\3\2\2\2\u0438\u0439\7+"+
		"\2\2\u0439\u043a\5\u019a\u00ce\2\u043a\u00c9\3\2\2\2\u043b\u043d\5\u012c"+
		"\u0097\2\u043c\u043b\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u043e\3\2\2\2\u043e"+
		"\u043f\7$\2\2\u043f\u0441\5\u00ccg\2\u0440\u0442\5> \2\u0441\u0440\3\2"+
		"\2\2\u0441\u0442\3\2\2\2\u0442\u0444\3\2\2\2\u0443\u0445\5\u018e\u00c8"+
		"\2\u0444\u0443\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0447"+
		"\5\u00ceh\2\u0447\u00cb\3\2\2\2\u0448\u0449\5\u0192\u00ca\2\u0449\u00cd"+
		"\3\2\2\2\u044a\u044c\7\13\2\2\u044b\u044d\5V,\2\u044c\u044b\3\2\2\2\u044c"+
		"\u044d\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u044f\7\f\2\2\u044f\u00cf\3\2"+
		"\2\2\u0450\u0452\5\u012c\u0097\2\u0451\u0450\3\2\2\2\u0451\u0452\3\2\2"+
		"\2\u0452\u0453\3\2\2\2\u0453\u0454\7\31\2\2\u0454\u0456\5\u00d2j\2\u0455"+
		"\u0457\5> \2\u0456\u0455\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0459\3\2\2"+
		"\2\u0458\u045a\5\u018e\u00c8\2\u0459\u0458\3\2\2\2\u0459\u045a\3\2\2\2"+
		"\u045a\u045b\3\2\2\2\u045b\u045c\5\u00d4k\2\u045c\u00d1\3\2\2\2\u045d"+
		"\u045e\5\u0192\u00ca\2\u045e\u00d3\3\2\2\2\u045f\u0461\7\13\2\2\u0460"+
		"\u0462\5V,\2\u0461\u0460\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0463\3\2\2"+
		"\2\u0463\u0464\7\f\2\2\u0464\u00d5\3\2\2\2\u0465\u0467\5\u012c\u0097\2"+
		"\u0466\u0465\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469"+
		"\7&\2\2\u0469\u046b\5\u00d8m\2\u046a\u046c\5\u018e\u00c8\2\u046b\u046a"+
		"\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046e\5\u00dan"+
		"\2\u046e\u00d7\3\2\2\2\u046f\u0470\5\u0192\u00ca\2\u0470\u00d9\3\2\2\2"+
		"\u0471\u0473\7\13\2\2\u0472\u0474\5\u00dep\2\u0473\u0472\3\2\2\2\u0473"+
		"\u0474\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0476\7\f\2\2\u0476\u00db\3\2"+
		"\2\2\u0477\u047d\5\u00e0q\2\u0478\u047d\5\u00e2r\2\u0479\u047d\5\u00e4"+
		"s\2\u047a\u047d\5\u00e6t\2\u047b\u047d\5\u00e8u\2\u047c\u0477\3\2\2\2"+
		"\u047c\u0478\3\2\2\2\u047c\u0479\3\2\2\2\u047c\u047a\3\2\2\2\u047c\u047b"+
		"\3\2\2\2\u047d\u00dd\3\2\2\2\u047e\u0480\5\u00dco\2\u047f\u0481\5\u00de"+
		"p\2\u0480\u047f\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u00df\3\2\2\2\u0482"+
		"\u0483\5p9\2\u0483\u0484\5r:\2\u0484\u0485\5\u0176\u00bc\2\u0485\u0486"+
		"\5|?\2\u0486\u00e1\3\2\2\2\u0487\u0488\5\u0092J\2\u0488\u048a\5\u0094"+
		"K\2\u0489\u048b\5> \2\u048a\u0489\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048c"+
		"\3\2\2\2\u048c\u048d\5\u0096L\2\u048d\u00e3\3\2\2\2\u048e\u0490\5\u00ec"+
		"w\2\u048f\u0491\5> \2\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492"+
		"\3\2\2\2\u0492\u0493\5\u009eP\2\u0493\u00e5\3\2\2\2\u0494\u0495\5\u00f8"+
		"}\2\u0495\u0496\5\u00fa~\2\u0496\u0497\5|?\2\u0497\u00e7\3\2\2\2\u0498"+
		"\u049a\5\u008aF\2\u0499\u049b\5\u018e\u00c8\2\u049a\u0499\3\2\2\2\u049a"+
		"\u049b\3\2\2\2\u049b\u049d\3\2\2\2\u049c\u049e\5\u008eH\2\u049d\u049c"+
		"\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u00e9\3\2\2\2\u049f\u04a1\5\u00ecw"+
		"\2\u04a0\u04a2\5> \2\u04a1\u04a0\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a3"+
		"\3\2\2\2\u04a3\u04a4\5\u009eP\2\u04a4\u04a5\5\u00eex\2\u04a5\u00eb\3\2"+
		"\2\2\u04a6\u04a8\5\u012c\u0097\2\u04a7\u04a6\3\2\2\2\u04a7\u04a8\3\2\2"+
		"\2\u04a8\u04aa\3\2\2\2\u04a9\u04ab\7\67\2\2\u04aa\u04a9\3\2\2\2\u04aa"+
		"\u04ab\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04ad\78\2\2\u04ad\u00ed\3\2"+
		"\2\2\u04ae\u04af\5\\/\2\u04af\u00ef\3\2\2\2\u04b0\u04b2\5\u012c\u0097"+
		"\2\u04b1\u04b0\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4"+
		"\79\2\2\u04b4\u04b5\5\\/\2\u04b5\u00f1\3\2\2\2\u04b6\u04b7\7:\2\2\u04b7"+
		"\u04b9\5\u0178\u00bd\2\u04b8\u04ba\5\u018e\u00c8\2\u04b9\u04b8\3\2\2\2"+
		"\u04b9\u04ba\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bc\5\u00f4{\2\u04bc"+
		"\u00f3\3\2\2\2\u04bd\u04bf\7\13\2\2\u04be\u04c0\5V,\2\u04bf\u04be\3\2"+
		"\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\7\f\2\2\u04c2"+
		"\u00f5\3\2\2\2\u04c3\u04c4\5\u00f8}\2\u04c4\u04c5\5\u00fa~\2\u04c5\u04c6"+
		"\5\\/\2\u04c6\u04d0\3\2\2\2\u04c7\u04c8\5\u00f8}\2\u04c8\u04c9\5\u00fa"+
		"~\2\u04c9\u04ca\5t;\2\u04ca\u04d0\3\2\2\2\u04cb\u04cc\5\u00f8}\2\u04cc"+
		"\u04cd\5\u00fa~\2\u04cd\u04ce\5|?\2\u04ce\u04d0\3\2\2\2\u04cf\u04c3\3"+
		"\2\2\2\u04cf\u04c7\3\2\2\2\u04cf\u04cb\3\2\2\2\u04d0\u00f7\3\2\2\2\u04d1"+
		"\u04d3\5\u012c\u0097\2\u04d2\u04d1\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d4"+
		"\3\2\2\2\u04d4\u04d5\7;\2\2\u04d5\u04d6\5\u009eP\2\u04d6\u00f9\3\2\2\2"+
		"\u04d7\u04d9\7\60\2\2\u04d8\u04da\5\u012c\u0097\2\u04d9\u04d8\3\2\2\2"+
		"\u04d9\u04da\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\5\u0174\u00bb\2\u04dc"+
		"\u00fb\3\2\2\2\u04dd\u04e1\5\u00fe\u0080\2\u04de\u04e1\5\u0100\u0081\2"+
		"\u04df\u04e1\5\u0102\u0082\2\u04e0\u04dd\3\2\2\2\u04e0\u04de\3\2\2\2\u04e0"+
		"\u04df\3\2\2\2\u04e1\u00fd\3\2\2\2\u04e2\u04e3\7<\2\2\u04e3\u04e4\7=\2"+
		"\2\u04e4\u04e5\7<\2\2\u04e5\u04e6\7\13\2\2\u04e6\u04e7\7\f\2\2\u04e7\u00ff"+
		"\3\2\2\2\u04e8\u04e9\7<\2\2\u04e9\u04ea\7>\2\2\u04ea\u04eb\7<\2\2\u04eb"+
		"\u04ec\7\13\2\2\u04ec\u04ed\7\f\2\2\u04ed\u0101\3\2\2\2\u04ee\u04ef\7"+
		"<\2\2\u04ef\u04f0\7?\2\2\u04f0\u04f1\7<\2\2\u04f1\u04f2\7\13\2\2\u04f2"+
		"\u04f3\5\u0104\u0083\2\u04f3\u04f4\7\f\2\2\u04f4\u0103\3\2\2\2\u04f5\u04f7"+
		"\5\u0106\u0084\2\u04f6\u04f5\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7\u04f9\3"+
		"\2\2\2\u04f8\u04fa\5\u010a\u0086\2\u04f9\u04f8\3\2\2\2\u04f9\u04fa\3\2"+
		"\2\2\u04fa\u0105\3\2\2\2\u04fb\u04fc\7@\2\2\u04fc\u04fd\5\u0108\u0085"+
		"\2\u04fd\u0107\3\2\2\2\u04fe\u04ff\5\u019c\u00cf\2\u04ff\u0109\3\2\2\2"+
		"\u0500\u0501\7A\2\2\u0501\u0502\5\u010c\u0087\2\u0502\u010b\3\2\2\2\u0503"+
		"\u0504\t\4\2\2\u0504\u010d\3\2\2\2\u0505\u0506\b\u0088\1\2\u0506\u0508"+
		"\5\u0110\u0089\2\u0507\u0509\5\u0176\u00bc\2\u0508\u0507\3\2\2\2\u0508"+
		"\u0509\3\2\2\2\u0509\u0518\3\2\2\2\u050a\u050c\5\u0112\u008a\2\u050b\u050d"+
		"\5\u0176\u00bc\2\u050c\u050b\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u0518\3"+
		"\2\2\2\u050e\u0518\5\u0114\u008b\2\u050f\u0511\5\u0116\u008c\2\u0510\u0512"+
		"\5\u0176\u00bc\2\u0511\u0510\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0518\3"+
		"\2\2\2\u0513\u0518\5\u011c\u008f\2\u0514\u0515\7E\2\2\u0515\u0518\5\u0174"+
		"\u00bb\2\u0516\u0518\5\u0124\u0093\2\u0517\u0505\3\2\2\2\u0517\u050a\3"+
		"\2\2\2\u0517\u050e\3\2\2\2\u0517\u050f\3\2\2\2\u0517\u0513\3\2\2\2\u0517"+
		"\u0514\3\2\2\2\u0517\u0516\3\2\2\2\u0518\u051e\3\2\2\2\u0519\u051a\f\4"+
		"\2\2\u051a\u051b\7F\2\2\u051b\u051d\5\u0174\u00bb\2\u051c\u0519\3\2\2"+
		"\2\u051d\u0520\3\2\2\2\u051e\u051c\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u010f"+
		"\3\2\2\2\u0520\u051e\3\2\2\2\u0521\u0522\7\66\2\2\u0522\u0111\3\2\2\2"+
		"\u0523\u0524\5\u0192\u00ca\2\u0524\u0113\3\2\2\2\u0525\u0526\7\'\2\2\u0526"+
		"\u052a\5\u010e\u0088\2\u0527\u0528\7*\2\2\u0528\u052a\5\u010e\u0088\2"+
		"\u0529\u0525\3\2\2\2\u0529\u0527\3\2\2\2\u052a\u0115\3\2\2\2\u052b\u052d"+
		"\7\61\2\2\u052c\u052e\5\u0118\u008d\2\u052d\u052c\3\2\2\2\u052d\u052e"+
		"\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0530\7\62\2\2\u0530\u0117\3\2\2\2"+
		"\u0531\u0536\5\u011a\u008e\2\u0532\u0533\7\17\2\2\u0533\u0535\5\u011a"+
		"\u008e\2\u0534\u0532\3\2\2\2\u0535\u0538\3\2\2\2\u0536\u0534\3\2\2\2\u0536"+
		"\u0537\3\2\2\2\u0537\u0119\3\2\2\2\u0538\u0536\3\2\2\2\u0539\u053a\5\u010e"+
		"\u0088\2\u053a\u011b\3\2\2\2\u053b\u053d\5\u0178\u00bd\2\u053c\u053b\3"+
		"\2\2\2\u053c\u053d\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u053f\7)\2\2\u053f"+
		"\u0541\5\u00ba^\2\u0540\u0542\5\u0116\u008c\2\u0541\u0540\3\2\2\2\u0541"+
		"\u0542\3\2\2\2\u0542\u011d\3\2\2\2\u0543\u0546\5\u0120\u0091\2\u0544\u0546"+
		"\5\u0122\u0092\2\u0545\u0543\3\2\2\2\u0545\u0544\3\2\2\2\u0546\u011f\3"+
		"\2\2\2\u0547\u0548\7E\2\2\u0548\u0549\5\u0174\u00bb\2\u0549\u0121\3\2"+
		"\2\2\u054a\u054b\5\u010e\u0088\2\u054b\u054c\7F\2\2\u054c\u054d\5\u0174"+
		"\u00bb\2\u054d\u0123\3\2\2\2\u054e\u054f\5\u0134\u009b\2\u054f\u0125\3"+
		"\2\2\2\u0550\u0551\7G\2\2\u0551\u0553\5\u0128\u0095\2\u0552\u0554\5\u012a"+
		"\u0096\2\u0553\u0552\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0127\3\2\2\2\u0555"+
		"\u0556\5\u0192\u00ca\2\u0556\u0129\3\2\2\2\u0557\u0559\7\61\2\2\u0558"+
		"\u055a\5\u012e\u0098\2\u0559\u0558\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u055b"+
		"\3\2\2\2\u055b\u055c\7\62\2\2\u055c\u012b\3\2\2\2\u055d\u055f\5\u0126"+
		"\u0094\2\u055e\u055d\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u055e\3\2\2\2\u0560"+
		"\u0561\3\2\2\2\u0561\u012d\3\2\2\2\u0562\u0564\5\u0130\u0099\2\u0563\u0562"+
		"\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0563\3\2\2\2\u0565\u0566\3\2\2\2\u0566"+
		"\u012f\3\2\2\2\u0567\u0569\7\61\2\2\u0568\u056a\5\u012e\u0098\2\u0569"+
		"\u0568\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u057c\7\62"+
		"\2\2\u056c\u056e\7H\2\2\u056d\u056f\5\u012e\u0098\2\u056e\u056d\3\2\2"+
		"\2\u056e\u056f\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u057c\7I\2\2\u0571\u0573"+
		"\7\13\2\2\u0572\u0574\5\u012e\u0098\2\u0573\u0572\3\2\2\2\u0573\u0574"+
		"\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u057c\7\f\2\2\u0576\u057c\5\u0192\u00ca"+
		"\2\u0577\u057c\5\u0134\u009b\2\u0578\u057c\5\u0196\u00cc\2\u0579\u057c"+
		"\5\u019a\u00ce\2\u057a\u057c\5\u016c\u00b7\2\u057b\u0567\3\2\2\2\u057b"+
		"\u056c\3\2\2\2\u057b\u0571\3\2\2\2\u057b\u0576\3\2\2\2\u057b\u0577\3\2"+
		"\2\2\u057b\u0578\3\2\2\2\u057b\u0579\3\2\2\2\u057b\u057a\3\2\2\2\u057c"+
		"\u0131\3\2\2\2\u057d\u0582\5\u0134\u009b\2\u057e\u057f\7\17\2\2\u057f"+
		"\u0581\5\u0134\u009b\2\u0580\u057e\3\2\2\2\u0581\u0584\3\2\2\2\u0582\u0580"+
		"\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0133\3\2\2\2\u0584\u0582\3\2\2\2\u0585"+
		"\u0586\b\u009b\1\2\u0586\u0587\5\u0170\u00b9\2\u0587\u0588\5\u0134\u009b"+
		"\23\u0588\u058c\3\2\2\2\u0589\u058c\5\u0136\u009c\2\u058a\u058c\5\u0140"+
		"\u00a1\2\u058b\u0585\3\2\2\2\u058b\u0589\3\2\2\2\u058b\u058a\3\2\2\2\u058c"+
		"\u05bf\3\2\2\2\u058d\u058e\f\20\2\2\u058e\u058f\5\u016e\u00b8\2\u058f"+
		"\u0590\5\u0134\u009b\21\u0590\u05be\3\2\2\2\u0591\u0592\f\17\2\2\u0592"+
		"\u0593\5\u0138\u009d\2\u0593\u0594\5\u0134\u009b\20\u0594\u05be\3\2\2"+
		"\2\u0595\u0596\f\16\2\2\u0596\u0597\5\u013a\u009e\2\u0597\u0598\5\u0134"+
		"\u009b\17\u0598\u05be\3\2\2\2\u0599\u059a\f\r\2\2\u059a\u05be\5\u013c"+
		"\u009f\2\u059b\u059c\f\f\2\2\u059c\u05be\5\u0172\u00ba\2\u059d\u059e\f"+
		"\13\2\2\u059e\u05a0\5\u0164\u00b3\2\u059f\u05a1\5\u013e\u00a0\2\u05a0"+
		"\u059f\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05be\3\2\2\2\u05a2\u05a3\f\n"+
		"\2\2\u05a3\u05a4\7)\2\2\u05a4\u05be\78\2\2\u05a5\u05a6\f\t\2\2\u05a6\u05a7"+
		"\7)\2\2\u05a7\u05be\7d\2\2\u05a8\u05a9\f\b\2\2\u05a9\u05aa\7)\2\2\u05aa"+
		"\u05ac\5\u0192\u00ca\2\u05ab\u05ad\5N(\2\u05ac\u05ab\3\2\2\2\u05ac\u05ad"+
		"\3\2\2\2\u05ad\u05be\3\2\2\2\u05ae\u05af\f\7\2\2\u05af\u05b0\7)\2\2\u05b0"+
		"\u05be\7J\2\2\u05b1\u05b2\f\6\2\2\u05b2\u05b3\7)\2\2\u05b3\u05be\7K\2"+
		"\2\u05b4\u05b5\f\5\2\2\u05b5\u05b6\7H\2\2\u05b6\u05b7\5\u0132\u009a\2"+
		"\u05b7\u05b8\7I\2\2\u05b8\u05be\3\2\2\2\u05b9\u05ba\f\4\2\2\u05ba\u05be"+
		"\7L\2\2\u05bb\u05bc\f\3\2\2\u05bc\u05be\7M\2\2\u05bd\u058d\3\2\2\2\u05bd"+
		"\u0591\3\2\2\2\u05bd\u0595\3\2\2\2\u05bd\u0599\3\2\2\2\u05bd\u059b\3\2"+
		"\2\2\u05bd\u059d\3\2\2\2\u05bd\u05a2\3\2\2\2\u05bd\u05a5\3\2\2\2\u05bd"+
		"\u05a8\3\2\2\2\u05bd\u05ae\3\2\2\2\u05bd\u05b1\3\2\2\2\u05bd\u05b4\3\2"+
		"\2\2\u05bd\u05b9\3\2\2\2\u05bd\u05bb\3\2\2\2\u05be\u05c1\3\2\2\2\u05bf"+
		"\u05bd\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u0135\3\2\2\2\u05c1\u05bf\3\2"+
		"\2\2\u05c2\u05c3\7N\2\2\u05c3\u05c4\5\u0192\u00ca\2\u05c4\u0137\3\2\2"+
		"\2\u05c5\u05c6\7+\2\2\u05c6\u0139\3\2\2\2\u05c7\u05c8\7M\2\2\u05c8\u05c9"+
		"\5\u0134\u009b\2\u05c9\u05ca\7\16\2\2\u05ca\u013b\3\2\2\2\u05cb\u05cc"+
		"\7E\2\2\u05cc\u05d3\5\u0174\u00bb\2\u05cd\u05cf\7F\2\2\u05ce\u05d0\7M"+
		"\2\2\u05cf\u05ce\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1"+
		"\u05d3\5\u0174\u00bb\2\u05d2\u05cb\3\2\2\2\u05d2\u05cd\3\2\2\2\u05d3\u013d"+
		"\3\2\2\2\u05d4\u05d5\5\u015a\u00ae\2\u05d5\u013f\3\2\2\2\u05d6\u05d8\5"+
		"\u0192\u00ca\2\u05d7\u05d9\5N(\2\u05d8\u05d7\3\2\2\2\u05d8\u05d9\3\2\2"+
		"\2\u05d9\u05e2\3\2\2\2\u05da\u05e2\5\u0142\u00a2\2\u05db\u05e2\5\u0150"+
		"\u00a9\2\u05dc\u05e2\5\u0152\u00aa\2\u05dd\u05e2\5\u015a\u00ae\2\u05de"+
		"\u05e2\5\u0164\u00b3\2\u05df\u05e2\5\u0162\u00b2\2\u05e0\u05e2\5\u016a"+
		"\u00b6\2\u05e1\u05d6\3\2\2\2\u05e1\u05da\3\2\2\2\u05e1\u05db\3\2\2\2\u05e1"+
		"\u05dc\3\2\2\2\u05e1\u05dd\3\2\2\2\u05e1\u05de\3\2\2\2\u05e1\u05df\3\2"+
		"\2\2\u05e1\u05e0\3\2\2\2\u05e2\u0141\3\2\2\2\u05e3\u05eb\5\u019a\u00ce"+
		"\2\u05e4\u05eb\5\u0144\u00a3\2\u05e5\u05eb\5\u014a\u00a6\2\u05e6\u05eb"+
		"\7O\2\2\u05e7\u05eb\7P\2\2\u05e8\u05eb\7Q\2\2\u05e9\u05eb\7R\2\2\u05ea"+
		"\u05e3\3\2\2\2\u05ea\u05e4\3\2\2\2\u05ea\u05e5\3\2\2\2\u05ea\u05e6\3\2"+
		"\2\2\u05ea\u05e7\3\2\2\2\u05ea\u05e8\3\2\2\2\u05ea\u05e9\3\2\2\2\u05eb"+
		"\u0143\3\2\2\2\u05ec\u05ee\7H\2\2\u05ed\u05ef\5\u0146\u00a4\2\u05ee\u05ed"+
		"\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f1\7I\2\2\u05f1"+
		"\u0145\3\2\2\2\u05f2\u05f4\5\u0148\u00a5\2\u05f3\u05f5\7\17\2\2\u05f4"+
		"\u05f3\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u05fb\3\2\2\2\u05f6\u05f7\5\u0148"+
		"\u00a5\2\u05f7\u05f8\7\17\2\2\u05f8\u05f9\5\u0146\u00a4\2\u05f9\u05fb"+
		"\3\2\2\2\u05fa\u05f2\3\2\2\2\u05fa\u05f6\3\2\2\2\u05fb\u0147\3\2\2\2\u05fc"+
		"\u05fd\5\u0134\u009b\2\u05fd\u0149\3\2\2\2\u05fe\u05ff\7H\2\2\u05ff\u0600"+
		"\5\u014c\u00a7\2\u0600\u0601\7I\2\2\u0601\u0606\3\2\2\2\u0602\u0603\7"+
		"H\2\2\u0603\u0604\7\16\2\2\u0604\u0606\7I\2\2\u0605\u05fe\3\2\2\2\u0605"+
		"\u0602\3\2\2\2\u0606\u014b\3\2\2\2\u0607\u0609\5\u014e\u00a8\2\u0608\u060a"+
		"\7\17\2\2\u0609\u0608\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u060b\3\2\2\2"+
		"\u060b\u060c\5\u014e\u00a8\2\u060c\u060d\7\17\2\2\u060d\u060e\5\u014c"+
		"\u00a7\2\u060e\u014d\3\2\2\2\u060f\u0610\5\u0134\u009b\2\u0610\u0611\7"+
		"\16\2\2\u0611\u0612\5\u0134\u009b\2\u0612\u014f\3\2\2\2\u0613\u0620\7"+
		"J\2\2\u0614\u0615\7J\2\2\u0615\u0616\7)\2\2\u0616\u0620\5\u0192\u00ca"+
		"\2\u0617\u0618\7J\2\2\u0618\u0619\7H\2\2\u0619\u061a\5\u0134\u009b\2\u061a"+
		"\u061b\7I\2\2\u061b\u0620\3\2\2\2\u061c\u061d\7J\2\2\u061d\u061e\7)\2"+
		"\2\u061e\u0620\78\2\2\u061f\u0613\3\2\2\2\u061f\u0614\3\2\2\2\u061f\u0617"+
		"\3\2\2\2\u061f\u061c\3\2\2\2\u0620\u0151\3\2\2\2\u0621\u0626\5\u0154\u00ab"+
		"\2\u0622\u0623\5\u0156\u00ac\2\u0623\u0624\5\u0158\u00ad\2\u0624\u0626"+
		"\3\2\2\2\u0625\u0621\3\2\2\2\u0625\u0622\3\2\2\2\u0626\u0153\3\2\2\2\u0627"+
		"\u0628\7S\2\2\u0628\u0629\7)\2\2\u0629\u062a\5\u0192\u00ca\2\u062a\u0155"+
		"\3\2\2\2\u062b\u062c\7S\2\2\u062c\u062d\7H\2\2\u062d\u062e\5\u0134\u009b"+
		"\2\u062e\u062f\7I\2\2\u062f\u0157\3\2\2\2\u0630\u0631\7S\2\2\u0631\u0632"+
		"\7)\2\2\u0632\u0633\78\2\2\u0633\u0159\3\2\2\2\u0634\u0636\7\13\2\2\u0635"+
		"\u0637\5\u015c\u00af\2\u0636\u0635\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0638"+
		"\3\2\2\2\u0638\u0639\5\6\4\2\u0639\u063a\7\f\2\2\u063a\u015b\3\2\2\2\u063b"+
		"\u063d\5\u009eP\2\u063c\u063e\5\u0098M\2\u063d\u063c\3\2\2\2\u063d\u063e"+
		"\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u0640\7\5\2\2\u0640\u0659\3\2\2\2\u0641"+
		"\u0643\5\u0198\u00cd\2\u0642\u0644\5\u0098M\2\u0643\u0642\3\2\2\2\u0643"+
		"\u0644\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u0646\7\5\2\2\u0646\u0659\3\2"+
		"\2\2\u0647\u0648\5\u015e\u00b0\2\u0648\u064a\5\u009eP\2\u0649\u064b\5"+
		"\u0098M\2\u064a\u0649\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u064c\3\2\2\2"+
		"\u064c\u064d\7\5\2\2\u064d\u0659\3\2\2\2\u064e\u064f\5\u015e\u00b0\2\u064f"+
		"\u0651\5\u0198\u00cd\2\u0650\u0652\5\u0098M\2\u0651\u0650\3\2\2\2\u0651"+
		"\u0652\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0654\7\5\2\2\u0654\u0659\3\2"+
		"\2\2\u0655\u0656\5\u015e\u00b0\2\u0656\u0657\7\5\2\2\u0657\u0659\3\2\2"+
		"\2\u0658\u063b\3\2\2\2\u0658\u0641\3\2\2\2\u0658\u0647\3\2\2\2\u0658\u064e"+
		"\3\2\2\2\u0658\u0655\3\2\2\2\u0659\u015d\3\2\2\2\u065a\u065b\7H\2\2\u065b"+
		"\u065c\5\u0160\u00b1\2\u065c\u065d\5\u0134\u009b\2\u065d\u065e\7I\2\2"+
		"\u065e\u015f\3\2\2\2\u065f\u0660\t\5\2\2\u0660\u0161\3\2\2\2\u0661\u0662"+
		"\7)\2\2\u0662\u0663\5\u0192\u00ca\2\u0663\u0163\3\2\2\2\u0664\u0666\7"+
		"\61\2\2\u0665\u0667\5\u0166\u00b4\2\u0666\u0665\3\2\2\2\u0666\u0667\3"+
		"\2\2\2\u0667\u0668\3\2\2\2\u0668\u0669\7\62\2\2\u0669\u0165\3\2\2\2\u066a"+
		"\u0670\5\u0168\u00b5\2\u066b\u066c\5\u0168\u00b5\2\u066c\u066d\7\17\2"+
		"\2\u066d\u066e\5\u0166\u00b4\2\u066e\u0670\3\2\2\2\u066f\u066a\3\2\2\2"+
		"\u066f\u066b\3\2\2\2\u0670\u0167\3\2\2\2\u0671\u0677\5\u0134\u009b\2\u0672"+
		"\u0673\5\u0192\u00ca\2\u0673\u0674\7\16\2\2\u0674\u0675\5\u0134\u009b"+
		"\2\u0675\u0677\3\2\2\2\u0676\u0671\3\2\2\2\u0676\u0672\3\2\2\2\u0677\u0169"+
		"\3\2\2\2\u0678\u0679\7\66\2\2\u0679\u016b\3\2\2\2\u067a\u067b\t\6\2\2"+
		"\u067b\u016d\3\2\2\2\u067c\u067d\5\u016c\u00b7\2\u067d\u016f\3\2\2\2\u067e"+
		"\u067f\5\u016c\u00b7\2\u067f\u0171\3\2\2\2\u0680\u0681\5\u016c\u00b7\2"+
		"\u0681\u0173\3\2\2\2\u0682\u0683\b\u00bb\1\2\u0683\u0687\5\u0178\u00bd"+
		"\2\u0684\u0687\5\u017c\u00bf\2\u0685\u0687\5\u0186\u00c4\2\u0686\u0682"+
		"\3\2\2\2\u0686\u0684\3\2\2\2\u0686\u0685\3\2\2\2\u0687\u069a\3\2\2\2\u0688"+
		"\u0689\f\n\2\2\u0689\u068a\7\60\2\2\u068a\u0699\5\u0174\u00bb\13\u068b"+
		"\u068c\f\13\2\2\u068c\u068d\7H\2\2\u068d\u0699\7I\2\2\u068e\u068f\f\7"+
		"\2\2\u068f\u0699\7M\2\2\u0690\u0691\f\6\2\2\u0691\u0699\7L\2\2\u0692\u0693"+
		"\f\4\2\2\u0693\u0694\7)\2\2\u0694\u0699\7\\\2\2\u0695\u0696\f\3\2\2\u0696"+
		"\u0697\7)\2\2\u0697\u0699\7]\2\2\u0698\u0688\3\2\2\2\u0698\u068b\3\2\2"+
		"\2\u0698\u068e\3\2\2\2\u0698\u0690\3\2\2\2\u0698\u0692\3\2\2\2\u0698\u0695"+
		"\3\2\2\2\u0699\u069c\3\2\2\2\u069a\u0698\3\2\2\2\u069a\u069b\3\2\2\2\u069b"+
		"\u0175\3\2\2\2\u069c\u069a\3\2\2\2\u069d\u069f\7\16\2\2\u069e\u06a0\5"+
		"\u012c\u0097\2\u069f\u069e\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a1\3\2"+
		"\2\2\u06a1\u06a2\5\u0174\u00bb\2\u06a2\u0177\3\2\2\2\u06a3\u06a5\5\u017a"+
		"\u00be\2\u06a4\u06a6\5N(\2\u06a5\u06a4\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6"+
		"\u06af\3\2\2\2\u06a7\u06a9\5\u017a\u00be\2\u06a8\u06aa\5N(\2\u06a9\u06a8"+
		"\3\2\2\2\u06a9\u06aa\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06ac\7)\2\2\u06ac"+
		"\u06ad\5\u0178\u00bd\2\u06ad\u06af\3\2\2\2\u06ae\u06a3\3\2\2\2\u06ae\u06a7"+
		"\3\2\2\2\u06af\u0179\3\2\2\2\u06b0\u06b1\5\u0192\u00ca\2\u06b1\u017b\3"+
		"\2\2\2\u06b2\u06b4\7\61\2\2\u06b3\u06b5\5\u017e\u00c0\2\u06b4\u06b3\3"+
		"\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06b7\7\62\2\2\u06b7"+
		"\u017d\3\2\2\2\u06b8\u06ba\5\u0180\u00c1\2\u06b9\u06bb\7\63\2\2\u06ba"+
		"\u06b9\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u017f\3\2\2\2\u06bc\u06c2\5\u0182"+
		"\u00c2\2\u06bd\u06be\5\u0182\u00c2\2\u06be\u06bf\7\17\2\2\u06bf\u06c0"+
		"\5\u0180\u00c1\2\u06c0\u06c2\3\2\2\2\u06c1\u06bc\3\2\2\2\u06c1\u06bd\3"+
		"\2\2\2\u06c2\u0181\3\2\2\2\u06c3\u06c5\5\u012c\u0097\2\u06c4\u06c3\3\2"+
		"\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06c7\3\2\2\2\u06c6\u06c8\7\64\2\2\u06c7"+
		"\u06c6\3\2\2\2\u06c7\u06c8\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06d1\5\u0174"+
		"\u00bb\2\u06ca\u06cc\7\64\2\2\u06cb\u06ca\3\2\2\2\u06cb\u06cc\3\2\2\2"+
		"\u06cc\u06cd\3\2\2\2\u06cd\u06ce\5\u0184\u00c3\2\u06ce\u06cf\5\u0176\u00bc"+
		"\2\u06cf\u06d1\3\2\2\2\u06d0\u06c4\3\2\2\2\u06d0\u06cb\3\2\2\2\u06d1\u0183"+
		"\3\2\2\2\u06d2\u06d3\5\u0192\u00ca\2\u06d3\u0185\3\2\2\2\u06d4\u06d5\7"+
		"&\2\2\u06d5\u06d7\7\26\2\2\u06d6\u06d8\5\u0188\u00c5\2\u06d7\u06d6\3\2"+
		"\2\2\u06d7\u06d8\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06da\7\27\2\2\u06da"+
		"\u0187\3\2\2\2\u06db\u06e1\5\u018a\u00c6\2\u06dc\u06dd\5\u018a\u00c6\2"+
		"\u06dd\u06de\7\17\2\2\u06de\u06df\5\u0188\u00c5\2\u06df\u06e1\3\2\2\2"+
		"\u06e0\u06db\3\2\2\2\u06e0\u06dc\3\2\2\2\u06e1\u0189\3\2\2\2\u06e2\u06e3"+
		"\5\u0178\u00bd\2\u06e3\u018b\3\2\2\2\u06e4\u06e5\5\u0174\u00bb\2\u06e5"+
		"\u06e6\7)\2\2\u06e6\u06e7\7\\\2\2\u06e7\u06ed\3\2\2\2\u06e8\u06e9\5\u0174"+
		"\u00bb\2\u06e9\u06ea\7)\2\2\u06ea\u06eb\7]\2\2\u06eb\u06ed\3\2\2\2\u06ec"+
		"\u06e4\3\2\2\2\u06ec\u06e8\3\2\2\2\u06ed\u018d\3\2\2\2\u06ee\u06ef\7\16"+
		"\2\2\u06ef\u06f0\5\u0190\u00c9\2\u06f0\u018f\3\2\2\2\u06f1\u06f6\5\u0178"+
		"\u00bd\2\u06f2\u06f3\7\17\2\2\u06f3\u06f5\5\u0178\u00bd\2\u06f4\u06f2"+
		"\3\2\2\2\u06f5\u06f8\3\2\2\2\u06f6\u06f4\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7"+
		"\u0191\3\2\2\2\u06f8\u06f6\3\2\2\2\u06f9\u06fc\7`\2\2\u06fa\u06fc\5\u0196"+
		"\u00cc\2\u06fb\u06f9\3\2\2\2\u06fb\u06fa\3\2\2\2\u06fc\u0193\3\2\2\2\u06fd"+
		"\u06fe\t\7\2\2\u06fe\u0195\3\2\2\2\u06ff\u0700\t\b\2\2\u0700\u0197\3\2"+
		"\2\2\u0701\u0707\5\u0192\u00ca\2\u0702\u0703\5\u0192\u00ca\2\u0703\u0704"+
		"\7\17\2\2\u0704\u0705\5\u0198\u00cd\2\u0705\u0707\3\2\2\2\u0706\u0701"+
		"\3\2\2\2\u0706\u0702\3\2\2\2\u0707\u0199\3\2\2\2\u0708\u070c\5\u019c\u00cf"+
		"\2\u0709\u070c\7f\2\2\u070a\u070c\7g\2\2\u070b\u0708\3\2\2\2\u070b\u0709"+
		"\3\2\2\2\u070b\u070a\3\2\2\2\u070c\u019b\3\2\2\2\u070d\u070e\t\t\2\2\u070e"+
		"\u019d\3\2\2\2\u00d1\u01a0\u01a2\u01a9\u01ad\u01b1\u01b5\u01ba\u01bc\u01c1"+
		"\u01c7\u01cb\u01cf\u01d3\u01d8\u01dc\u01e0\u01e3\u01e7\u01f5\u01fe\u0204"+
		"\u0208\u020e\u0214\u021a\u0228\u0230\u0234\u0247\u0252\u0256\u025a\u0260"+
		"\u0265\u026e\u0279\u0283\u0287\u0291\u02a0\u02b3\u02b7\u02bb\u02c1\u02c6"+
		"\u02ca\u02d5\u02d9\u02dc\u02df\u02e9\u02ee\u0309\u030d\u0310\u0313\u031c"+
		"\u0325\u0328\u032e\u0332\u033b\u0344\u0347\u034c\u0353\u035c\u035f\u0363"+
		"\u0368\u036c\u037e\u0384\u0387\u038d\u0391\u0395\u039d\u03a4\u03a8\u03af"+
		"\u03b2\u03b5\u03b8\u03bc\u03c0\u03c3\u03c7\u03cb\u03cf\u03d2\u03d5\u03d9"+
		"\u03dd\u03e3\u03e7\u03ea\u03ee\u03f2\u03f8\u03fc\u03ff\u0409\u040d\u0415"+
		"\u041b\u0421\u0425\u0428\u0432\u0436\u043c\u0441\u0444\u044c\u0451\u0456"+
		"\u0459\u0461\u0466\u046b\u0473\u047c\u0480\u048a\u0490\u049a\u049d\u04a1"+
		"\u04a7\u04aa\u04b1\u04b9\u04bf\u04cf\u04d2\u04d9\u04e0\u04f6\u04f9\u0508"+
		"\u050c\u0511\u0517\u051e\u0529\u052d\u0536\u053c\u0541\u0545\u0553\u0559"+
		"\u0560\u0565\u0569\u056e\u0573\u057b\u0582\u058b\u05a0\u05ac\u05bd\u05bf"+
		"\u05cf\u05d2\u05d8\u05e1\u05ea\u05ee\u05f4\u05fa\u0605\u0609\u061f\u0625"+
		"\u0636\u063d\u0643\u064a\u0651\u0658\u0666\u066f\u0676\u0686\u0698\u069a"+
		"\u069f\u06a5\u06a9\u06ae\u06b4\u06ba\u06c1\u06c4\u06c7\u06cb\u06d0\u06d7"+
		"\u06e0\u06ec\u06f6\u06fb\u0706\u070b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}