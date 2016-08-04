// Generated from Jpa.g4 by ANTLR 4.5.3
package com.kn.language.parser.antlr.jpa;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JpaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JpaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JpaParser#ql_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQl_statement(JpaParser.Ql_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(JpaParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(JpaParser.Update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(JpaParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(JpaParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#identification_variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentification_variable_declaration(JpaParser.Identification_variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#range_variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_variable_declaration(JpaParser.Range_variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin(JpaParser.JoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#fetch_join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_join(JpaParser.Fetch_joinContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#join_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_spec(JpaParser.Join_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#join_association_path_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_association_path_expression(JpaParser.Join_association_path_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#join_collection_valued_path_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_collection_valued_path_expression(JpaParser.Join_collection_valued_path_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#join_single_valued_association_path_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_single_valued_association_path_expression(JpaParser.Join_single_valued_association_path_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#collection_member_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_member_declaration(JpaParser.Collection_member_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#single_valued_path_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_valued_path_expression(JpaParser.Single_valued_path_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#state_field_path_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_field_path_expression(JpaParser.State_field_path_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#single_valued_association_path_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_valued_association_path_expression(JpaParser.Single_valued_association_path_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#collection_valued_path_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_valued_path_expression(JpaParser.Collection_valued_path_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#state_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_field(JpaParser.State_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#update_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_clause(JpaParser.Update_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#update_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_item(JpaParser.Update_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#new_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_value(JpaParser.New_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#delete_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_clause(JpaParser.Delete_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_clause(JpaParser.Select_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#select_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_expression(JpaParser.Select_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#constructor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_expression(JpaParser.Constructor_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#constructor_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_item(JpaParser.Constructor_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#aggregate_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_expression(JpaParser.Aggregate_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(JpaParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#groupby_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupby_clause(JpaParser.Groupby_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#groupby_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupby_item(JpaParser.Groupby_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(JpaParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#orderby_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby_clause(JpaParser.Orderby_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#orderby_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby_item(JpaParser.Orderby_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(JpaParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#subquery_from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_from_clause(JpaParser.Subquery_from_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#subselect_identification_variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubselect_identification_variable_declaration(JpaParser.Subselect_identification_variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#association_path_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociation_path_expression(JpaParser.Association_path_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#simple_select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select_clause(JpaParser.Simple_select_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#simple_select_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select_expression(JpaParser.Simple_select_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(JpaParser.Conditional_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#conditional_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_term(JpaParser.Conditional_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#conditional_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_factor(JpaParser.Conditional_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#conditional_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_primary(JpaParser.Conditional_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#simple_cond_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_cond_expression(JpaParser.Simple_cond_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#between_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_expression(JpaParser.Between_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#in_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_expression(JpaParser.In_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#in_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_item(JpaParser.In_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#like_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike_expression(JpaParser.Like_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#null_comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_comparison_expression(JpaParser.Null_comparison_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#empty_collection_comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_collection_comparison_expression(JpaParser.Empty_collection_comparison_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#collection_member_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_member_expression(JpaParser.Collection_member_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#exists_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists_expression(JpaParser.Exists_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#all_or_any_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_or_any_expression(JpaParser.All_or_any_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_expression(JpaParser.Comparison_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(JpaParser.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_expression(JpaParser.Arithmetic_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#simple_arithmetic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_arithmetic_expression(JpaParser.Simple_arithmetic_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#arithmetic_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_term(JpaParser.Arithmetic_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#arithmetic_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_factor(JpaParser.Arithmetic_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#arithmetic_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_primary(JpaParser.Arithmetic_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#string_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_expression(JpaParser.String_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#string_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_primary(JpaParser.String_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#datetime_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_expression(JpaParser.Datetime_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#datetime_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_primary(JpaParser.Datetime_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_expression(JpaParser.Boolean_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#boolean_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_primary(JpaParser.Boolean_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#enum_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_expression(JpaParser.Enum_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#enum_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_primary(JpaParser.Enum_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#entity_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_expression(JpaParser.Entity_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#simple_entity_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_entity_expression(JpaParser.Simple_entity_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#functions_returning_numerics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions_returning_numerics(JpaParser.Functions_returning_numericsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#functions_returning_datetime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions_returning_datetime(JpaParser.Functions_returning_datetimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#functions_returning_strings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions_returning_strings(JpaParser.Functions_returning_stringsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#trim_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim_specification(JpaParser.Trim_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_literal(JpaParser.Numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#pattern_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_value(JpaParser.Pattern_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#input_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_parameter(JpaParser.Input_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JpaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#constructor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_name(JpaParser.Constructor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#enum_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_literal(JpaParser.Enum_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(JpaParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#simple_state_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_state_field(JpaParser.Simple_state_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#embedded_class_state_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmbedded_class_state_field(JpaParser.Embedded_class_state_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#single_valued_association_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_valued_association_field(JpaParser.Single_valued_association_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#collection_valued_association_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_valued_association_field(JpaParser.Collection_valued_association_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link JpaParser#abstract_schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstract_schema_name(JpaParser.Abstract_schema_nameContext ctx);
}