// Generated from Swift.g4 by ANTLR 4.5.3
package com.github.kn.language.parser.impl.model.backend.swift;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SwiftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SwiftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SwiftParser#top_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_level(SwiftParser.Top_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SwiftParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(SwiftParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(SwiftParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(SwiftParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#for_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_init(SwiftParser.For_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#for_in_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_in_statement(SwiftParser.For_in_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(SwiftParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#while_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_condition(SwiftParser.While_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#do_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_statement(SwiftParser.Do_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#branch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch_statement(SwiftParser.Branch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(SwiftParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#if_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condition(SwiftParser.If_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#else_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_clause(SwiftParser.Else_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(SwiftParser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#switch_cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_cases(SwiftParser.Switch_casesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#switch_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_case(SwiftParser.Switch_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#case_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_label(SwiftParser.Case_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#case_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_item_list(SwiftParser.Case_item_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#default_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_label(SwiftParser.Default_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#guard_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard_clause(SwiftParser.Guard_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#guard_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard_expression(SwiftParser.Guard_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_statement(SwiftParser.Labeled_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#statement_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_label(SwiftParser.Statement_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#label_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_name(SwiftParser.Label_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#control_transfer_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_transfer_statement(SwiftParser.Control_transfer_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(SwiftParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(SwiftParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#fallthrough_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFallthrough_statement(SwiftParser.Fallthrough_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(SwiftParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#generic_parameter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_parameter_clause(SwiftParser.Generic_parameter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#generic_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_parameter_list(SwiftParser.Generic_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#generic_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_parameter(SwiftParser.Generic_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#requirement_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement_clause(SwiftParser.Requirement_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#requirement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement_list(SwiftParser.Requirement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement(SwiftParser.RequirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#conformance_requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConformance_requirement(SwiftParser.Conformance_requirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#same_type_requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSame_type_requirement(SwiftParser.Same_type_requirementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#generic_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_argument_clause(SwiftParser.Generic_argument_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#generic_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_argument_list(SwiftParser.Generic_argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#generic_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_argument(SwiftParser.Generic_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SwiftParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(SwiftParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_specifiers(SwiftParser.Declaration_specifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#declaration_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_specifier(SwiftParser.Declaration_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(SwiftParser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#import_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_declaration(SwiftParser.Import_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#import_kind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_kind(SwiftParser.Import_kindContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#import_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_path(SwiftParser.Import_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#import_path_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_path_identifier(SwiftParser.Import_path_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#constant_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declaration(SwiftParser.Constant_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#pattern_initializer_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_initializer_list(SwiftParser.Pattern_initializer_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#pattern_initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_initializer(SwiftParser.Pattern_initializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(SwiftParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(SwiftParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#variable_declaration_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration_head(SwiftParser.Variable_declaration_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(SwiftParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#getter_setter_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_setter_block(SwiftParser.Getter_setter_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#getter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_clause(SwiftParser.Getter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#setter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter_clause(SwiftParser.Setter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#setter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter_name(SwiftParser.Setter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#getter_setter_keyword_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_setter_keyword_block(SwiftParser.Getter_setter_keyword_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#getter_keyword_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter_keyword_clause(SwiftParser.Getter_keyword_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#setter_keyword_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter_keyword_clause(SwiftParser.Setter_keyword_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#willSet_didSet_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWillSet_didSet_block(SwiftParser.WillSet_didSet_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#willSet_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWillSet_clause(SwiftParser.WillSet_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#didSet_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDidSet_clause(SwiftParser.DidSet_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#typealias_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_declaration(SwiftParser.Typealias_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#typealias_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_head(SwiftParser.Typealias_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#typealias_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_name(SwiftParser.Typealias_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#typealias_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypealias_assignment(SwiftParser.Typealias_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(SwiftParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#function_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_head(SwiftParser.Function_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SwiftParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#function_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_signature(SwiftParser.Function_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#function_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_result(SwiftParser.Function_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(SwiftParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#parameter_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_clauses(SwiftParser.Parameter_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#parameter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_clause(SwiftParser.Parameter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(SwiftParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(SwiftParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_name(SwiftParser.Parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#local_parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_parameter_name(SwiftParser.Local_parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#default_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_argument_clause(SwiftParser.Default_argument_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#enum_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_declaration(SwiftParser.Enum_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#union_style_enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum(SwiftParser.Union_style_enumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#union_style_enum_members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_members(SwiftParser.Union_style_enum_membersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#union_style_enum_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_member(SwiftParser.Union_style_enum_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#union_style_enum_case_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_case_clause(SwiftParser.Union_style_enum_case_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#union_style_enum_case_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_case_list(SwiftParser.Union_style_enum_case_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#union_style_enum_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_style_enum_case(SwiftParser.Union_style_enum_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#enum_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_name(SwiftParser.Enum_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#enum_case_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_case_name(SwiftParser.Enum_case_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#raw_value_style_enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum(SwiftParser.Raw_value_style_enumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#raw_value_style_enum_members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_members(SwiftParser.Raw_value_style_enum_membersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#raw_value_style_enum_member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_member(SwiftParser.Raw_value_style_enum_memberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#raw_value_style_enum_case_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_case_clause(SwiftParser.Raw_value_style_enum_case_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#raw_value_style_enum_case_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_case_list(SwiftParser.Raw_value_style_enum_case_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#raw_value_style_enum_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_style_enum_case(SwiftParser.Raw_value_style_enum_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#raw_value_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaw_value_assignment(SwiftParser.Raw_value_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(SwiftParser.Struct_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#struct_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_name(SwiftParser.Struct_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#struct_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_body(SwiftParser.Struct_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(SwiftParser.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(SwiftParser.Class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(SwiftParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_declaration(SwiftParser.Protocol_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_name(SwiftParser.Protocol_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_body(SwiftParser.Protocol_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_member_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_member_declaration(SwiftParser.Protocol_member_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_member_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_member_declarations(SwiftParser.Protocol_member_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_property_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_property_declaration(SwiftParser.Protocol_property_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_method_declaration(SwiftParser.Protocol_method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_initializer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_initializer_declaration(SwiftParser.Protocol_initializer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_subscript_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_subscript_declaration(SwiftParser.Protocol_subscript_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_associated_type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_associated_type_declaration(SwiftParser.Protocol_associated_type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#initializer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_declaration(SwiftParser.Initializer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#initializer_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_head(SwiftParser.Initializer_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#initializer_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_body(SwiftParser.Initializer_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#deinitializer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeinitializer_declaration(SwiftParser.Deinitializer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#extension_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_declaration(SwiftParser.Extension_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#extension_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_body(SwiftParser.Extension_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#subscript_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_declaration(SwiftParser.Subscript_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#subscript_head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_head(SwiftParser.Subscript_headContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#subscript_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_result(SwiftParser.Subscript_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_declaration(SwiftParser.Operator_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#prefix_operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_operator_declaration(SwiftParser.Prefix_operator_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#postfix_operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_operator_declaration(SwiftParser.Postfix_operator_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#infix_operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix_operator_declaration(SwiftParser.Infix_operator_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#infix_operator_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfix_operator_attributes(SwiftParser.Infix_operator_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#precedence_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_clause(SwiftParser.Precedence_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#precedence_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence_level(SwiftParser.Precedence_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#associativity_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociativity_clause(SwiftParser.Associativity_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#associativity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociativity(SwiftParser.AssociativityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(SwiftParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#wildcard_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard_pattern(SwiftParser.Wildcard_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#identifier_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_pattern(SwiftParser.Identifier_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#value_binding_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_binding_pattern(SwiftParser.Value_binding_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#tuple_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_pattern(SwiftParser.Tuple_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#tuple_pattern_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_pattern_element_list(SwiftParser.Tuple_pattern_element_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#tuple_pattern_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_pattern_element(SwiftParser.Tuple_pattern_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#enum_case_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_case_pattern(SwiftParser.Enum_case_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#type_casting_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_casting_pattern(SwiftParser.Type_casting_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#is_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_pattern(SwiftParser.Is_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#as_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_pattern(SwiftParser.As_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#expression_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_pattern(SwiftParser.Expression_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(SwiftParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#attribute_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name(SwiftParser.Attribute_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#attribute_argument_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_argument_clause(SwiftParser.Attribute_argument_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(SwiftParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#balanced_tokens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalanced_tokens(SwiftParser.Balanced_tokensContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#balanced_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalanced_token(SwiftParser.Balanced_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(SwiftParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SwiftParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#in_out_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_out_expression(SwiftParser.In_out_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(SwiftParser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#conditional_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_operator(SwiftParser.Conditional_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#type_casting_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_casting_operator(SwiftParser.Type_casting_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#trailing_closure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailing_closure(SwiftParser.Trailing_closureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(SwiftParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#literal_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_expression(SwiftParser.Literal_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#array_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal(SwiftParser.Array_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#array_literal_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal_items(SwiftParser.Array_literal_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#array_literal_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal_item(SwiftParser.Array_literal_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#dictionary_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_literal(SwiftParser.Dictionary_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#dictionary_literal_items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_literal_items(SwiftParser.Dictionary_literal_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#dictionary_literal_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_literal_item(SwiftParser.Dictionary_literal_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#self_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf_expression(SwiftParser.Self_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#superclass_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_expression(SwiftParser.Superclass_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#superclass_method_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_method_expression(SwiftParser.Superclass_method_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#superclass_subscript_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_subscript_expression(SwiftParser.Superclass_subscript_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#superclass_initializer_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_initializer_expression(SwiftParser.Superclass_initializer_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#closure_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure_expression(SwiftParser.Closure_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#closure_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure_signature(SwiftParser.Closure_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#capture_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_list(SwiftParser.Capture_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#capture_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapture_specifier(SwiftParser.Capture_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#implicit_member_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicit_member_expression(SwiftParser.Implicit_member_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#parenthesized_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesized_expression(SwiftParser.Parenthesized_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#expression_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_element_list(SwiftParser.Expression_element_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#expression_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_element(SwiftParser.Expression_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#wildcard_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard_expression(SwiftParser.Wildcard_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(SwiftParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator(SwiftParser.Binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#prefix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_operator(SwiftParser.Prefix_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#postfix_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_operator(SwiftParser.Postfix_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SwiftParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#type_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_annotation(SwiftParser.Type_annotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#type_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_identifier(SwiftParser.Type_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SwiftParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#tuple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type(SwiftParser.Tuple_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#tuple_type_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type_body(SwiftParser.Tuple_type_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#tuple_type_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type_element_list(SwiftParser.Tuple_type_element_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#tuple_type_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple_type_element(SwiftParser.Tuple_type_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#element_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_name(SwiftParser.Element_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_composition_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_composition_type(SwiftParser.Protocol_composition_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_identifier_list(SwiftParser.Protocol_identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#protocol_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_identifier(SwiftParser.Protocol_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#metatype_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetatype_type(SwiftParser.Metatype_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#type_inheritance_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_inheritance_clause(SwiftParser.Type_inheritance_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#type_inheritance_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_inheritance_list(SwiftParser.Type_inheritance_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SwiftParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SwiftParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#context_sensitive_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContext_sensitive_keyword(SwiftParser.Context_sensitive_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(SwiftParser.Identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SwiftParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SwiftParser#integer_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_literal(SwiftParser.Integer_literalContext ctx);
}