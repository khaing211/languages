// Generated from Jpa.g4 by ANTLR 4.5.3
package com.kn.language.parser.antlr.jpa;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JpaParser}.
 */
public interface JpaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JpaParser#ql_statement}.
	 * @param ctx the parse tree
	 */
	void enterQl_statement(JpaParser.Ql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#ql_statement}.
	 * @param ctx the parse tree
	 */
	void exitQl_statement(JpaParser.Ql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(JpaParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(JpaParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(JpaParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(JpaParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(JpaParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(JpaParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(JpaParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(JpaParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#identification_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterIdentification_variable_declaration(JpaParser.Identification_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#identification_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitIdentification_variable_declaration(JpaParser.Identification_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#range_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRange_variable_declaration(JpaParser.Range_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#range_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRange_variable_declaration(JpaParser.Range_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(JpaParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(JpaParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#fetch_join}.
	 * @param ctx the parse tree
	 */
	void enterFetch_join(JpaParser.Fetch_joinContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#fetch_join}.
	 * @param ctx the parse tree
	 */
	void exitFetch_join(JpaParser.Fetch_joinContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#join_spec}.
	 * @param ctx the parse tree
	 */
	void enterJoin_spec(JpaParser.Join_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#join_spec}.
	 * @param ctx the parse tree
	 */
	void exitJoin_spec(JpaParser.Join_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#join_association_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterJoin_association_path_expression(JpaParser.Join_association_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#join_association_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitJoin_association_path_expression(JpaParser.Join_association_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#join_collection_valued_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterJoin_collection_valued_path_expression(JpaParser.Join_collection_valued_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#join_collection_valued_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitJoin_collection_valued_path_expression(JpaParser.Join_collection_valued_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#join_single_valued_association_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterJoin_single_valued_association_path_expression(JpaParser.Join_single_valued_association_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#join_single_valued_association_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitJoin_single_valued_association_path_expression(JpaParser.Join_single_valued_association_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#collection_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCollection_member_declaration(JpaParser.Collection_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#collection_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCollection_member_declaration(JpaParser.Collection_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#single_valued_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterSingle_valued_path_expression(JpaParser.Single_valued_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#single_valued_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitSingle_valued_path_expression(JpaParser.Single_valued_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#state_field_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterState_field_path_expression(JpaParser.State_field_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#state_field_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitState_field_path_expression(JpaParser.State_field_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#single_valued_association_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterSingle_valued_association_path_expression(JpaParser.Single_valued_association_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#single_valued_association_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitSingle_valued_association_path_expression(JpaParser.Single_valued_association_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#collection_valued_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterCollection_valued_path_expression(JpaParser.Collection_valued_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#collection_valued_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitCollection_valued_path_expression(JpaParser.Collection_valued_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#state_field}.
	 * @param ctx the parse tree
	 */
	void enterState_field(JpaParser.State_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#state_field}.
	 * @param ctx the parse tree
	 */
	void exitState_field(JpaParser.State_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#update_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_clause(JpaParser.Update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#update_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_clause(JpaParser.Update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#update_item}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_item(JpaParser.Update_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#update_item}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_item(JpaParser.Update_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#new_value}.
	 * @param ctx the parse tree
	 */
	void enterNew_value(JpaParser.New_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#new_value}.
	 * @param ctx the parse tree
	 */
	void exitNew_value(JpaParser.New_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#delete_clause}.
	 * @param ctx the parse tree
	 */
	void enterDelete_clause(JpaParser.Delete_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#delete_clause}.
	 * @param ctx the parse tree
	 */
	void exitDelete_clause(JpaParser.Delete_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(JpaParser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(JpaParser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#select_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelect_expression(JpaParser.Select_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#select_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelect_expression(JpaParser.Select_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#constructor_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_expression(JpaParser.Constructor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#constructor_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_expression(JpaParser.Constructor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#constructor_item}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_item(JpaParser.Constructor_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#constructor_item}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_item(JpaParser.Constructor_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#aggregate_expression}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_expression(JpaParser.Aggregate_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#aggregate_expression}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_expression(JpaParser.Aggregate_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(JpaParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(JpaParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroupby_clause(JpaParser.Groupby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroupby_clause(JpaParser.Groupby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#groupby_item}.
	 * @param ctx the parse tree
	 */
	void enterGroupby_item(JpaParser.Groupby_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#groupby_item}.
	 * @param ctx the parse tree
	 */
	void exitGroupby_item(JpaParser.Groupby_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(JpaParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(JpaParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_clause(JpaParser.Orderby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_clause(JpaParser.Orderby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#orderby_item}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_item(JpaParser.Orderby_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#orderby_item}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_item(JpaParser.Orderby_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(JpaParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(JpaParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#subquery_from_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_from_clause(JpaParser.Subquery_from_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#subquery_from_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_from_clause(JpaParser.Subquery_from_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#subselect_identification_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubselect_identification_variable_declaration(JpaParser.Subselect_identification_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#subselect_identification_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubselect_identification_variable_declaration(JpaParser.Subselect_identification_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#association_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssociation_path_expression(JpaParser.Association_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#association_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssociation_path_expression(JpaParser.Association_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#simple_select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_clause(JpaParser.Simple_select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#simple_select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_clause(JpaParser.Simple_select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#simple_select_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_expression(JpaParser.Simple_select_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#simple_select_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_expression(JpaParser.Simple_select_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(JpaParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(JpaParser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#conditional_term}.
	 * @param ctx the parse tree
	 */
	void enterConditional_term(JpaParser.Conditional_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#conditional_term}.
	 * @param ctx the parse tree
	 */
	void exitConditional_term(JpaParser.Conditional_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#conditional_factor}.
	 * @param ctx the parse tree
	 */
	void enterConditional_factor(JpaParser.Conditional_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#conditional_factor}.
	 * @param ctx the parse tree
	 */
	void exitConditional_factor(JpaParser.Conditional_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#conditional_primary}.
	 * @param ctx the parse tree
	 */
	void enterConditional_primary(JpaParser.Conditional_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#conditional_primary}.
	 * @param ctx the parse tree
	 */
	void exitConditional_primary(JpaParser.Conditional_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#simple_cond_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_cond_expression(JpaParser.Simple_cond_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#simple_cond_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_cond_expression(JpaParser.Simple_cond_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#between_expression}.
	 * @param ctx the parse tree
	 */
	void enterBetween_expression(JpaParser.Between_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#between_expression}.
	 * @param ctx the parse tree
	 */
	void exitBetween_expression(JpaParser.Between_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#in_expression}.
	 * @param ctx the parse tree
	 */
	void enterIn_expression(JpaParser.In_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#in_expression}.
	 * @param ctx the parse tree
	 */
	void exitIn_expression(JpaParser.In_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#in_item}.
	 * @param ctx the parse tree
	 */
	void enterIn_item(JpaParser.In_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#in_item}.
	 * @param ctx the parse tree
	 */
	void exitIn_item(JpaParser.In_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#like_expression}.
	 * @param ctx the parse tree
	 */
	void enterLike_expression(JpaParser.Like_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#like_expression}.
	 * @param ctx the parse tree
	 */
	void exitLike_expression(JpaParser.Like_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#null_comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterNull_comparison_expression(JpaParser.Null_comparison_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#null_comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitNull_comparison_expression(JpaParser.Null_comparison_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#empty_collection_comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_collection_comparison_expression(JpaParser.Empty_collection_comparison_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#empty_collection_comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_collection_comparison_expression(JpaParser.Empty_collection_comparison_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#collection_member_expression}.
	 * @param ctx the parse tree
	 */
	void enterCollection_member_expression(JpaParser.Collection_member_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#collection_member_expression}.
	 * @param ctx the parse tree
	 */
	void exitCollection_member_expression(JpaParser.Collection_member_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#exists_expression}.
	 * @param ctx the parse tree
	 */
	void enterExists_expression(JpaParser.Exists_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#exists_expression}.
	 * @param ctx the parse tree
	 */
	void exitExists_expression(JpaParser.Exists_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#all_or_any_expression}.
	 * @param ctx the parse tree
	 */
	void enterAll_or_any_expression(JpaParser.All_or_any_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#all_or_any_expression}.
	 * @param ctx the parse tree
	 */
	void exitAll_or_any_expression(JpaParser.All_or_any_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparison_expression(JpaParser.Comparison_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparison_expression(JpaParser.Comparison_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(JpaParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(JpaParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expression(JpaParser.Arithmetic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expression(JpaParser.Arithmetic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#simple_arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_arithmetic_expression(JpaParser.Simple_arithmetic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#simple_arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_arithmetic_expression(JpaParser.Simple_arithmetic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#arithmetic_term}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_term(JpaParser.Arithmetic_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#arithmetic_term}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_term(JpaParser.Arithmetic_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#arithmetic_factor}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_factor(JpaParser.Arithmetic_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#arithmetic_factor}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_factor(JpaParser.Arithmetic_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#arithmetic_primary}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_primary(JpaParser.Arithmetic_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#arithmetic_primary}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_primary(JpaParser.Arithmetic_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void enterString_expression(JpaParser.String_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void exitString_expression(JpaParser.String_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#string_primary}.
	 * @param ctx the parse tree
	 */
	void enterString_primary(JpaParser.String_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#string_primary}.
	 * @param ctx the parse tree
	 */
	void exitString_primary(JpaParser.String_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_expression(JpaParser.Datetime_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_expression(JpaParser.Datetime_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#datetime_primary}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_primary(JpaParser.Datetime_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#datetime_primary}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_primary(JpaParser.Datetime_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(JpaParser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(JpaParser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#boolean_primary}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_primary(JpaParser.Boolean_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#boolean_primary}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_primary(JpaParser.Boolean_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#enum_expression}.
	 * @param ctx the parse tree
	 */
	void enterEnum_expression(JpaParser.Enum_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#enum_expression}.
	 * @param ctx the parse tree
	 */
	void exitEnum_expression(JpaParser.Enum_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#enum_primary}.
	 * @param ctx the parse tree
	 */
	void enterEnum_primary(JpaParser.Enum_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#enum_primary}.
	 * @param ctx the parse tree
	 */
	void exitEnum_primary(JpaParser.Enum_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#entity_expression}.
	 * @param ctx the parse tree
	 */
	void enterEntity_expression(JpaParser.Entity_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#entity_expression}.
	 * @param ctx the parse tree
	 */
	void exitEntity_expression(JpaParser.Entity_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#simple_entity_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_entity_expression(JpaParser.Simple_entity_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#simple_entity_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_entity_expression(JpaParser.Simple_entity_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#functions_returning_numerics}.
	 * @param ctx the parse tree
	 */
	void enterFunctions_returning_numerics(JpaParser.Functions_returning_numericsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#functions_returning_numerics}.
	 * @param ctx the parse tree
	 */
	void exitFunctions_returning_numerics(JpaParser.Functions_returning_numericsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#functions_returning_datetime}.
	 * @param ctx the parse tree
	 */
	void enterFunctions_returning_datetime(JpaParser.Functions_returning_datetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#functions_returning_datetime}.
	 * @param ctx the parse tree
	 */
	void exitFunctions_returning_datetime(JpaParser.Functions_returning_datetimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#functions_returning_strings}.
	 * @param ctx the parse tree
	 */
	void enterFunctions_returning_strings(JpaParser.Functions_returning_stringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#functions_returning_strings}.
	 * @param ctx the parse tree
	 */
	void exitFunctions_returning_strings(JpaParser.Functions_returning_stringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#trim_specification}.
	 * @param ctx the parse tree
	 */
	void enterTrim_specification(JpaParser.Trim_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#trim_specification}.
	 * @param ctx the parse tree
	 */
	void exitTrim_specification(JpaParser.Trim_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(JpaParser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(JpaParser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#pattern_value}.
	 * @param ctx the parse tree
	 */
	void enterPattern_value(JpaParser.Pattern_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#pattern_value}.
	 * @param ctx the parse tree
	 */
	void exitPattern_value(JpaParser.Pattern_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#input_parameter}.
	 * @param ctx the parse tree
	 */
	void enterInput_parameter(JpaParser.Input_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#input_parameter}.
	 * @param ctx the parse tree
	 */
	void exitInput_parameter(JpaParser.Input_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JpaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JpaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#constructor_name}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_name(JpaParser.Constructor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#constructor_name}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_name(JpaParser.Constructor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#enum_literal}.
	 * @param ctx the parse tree
	 */
	void enterEnum_literal(JpaParser.Enum_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#enum_literal}.
	 * @param ctx the parse tree
	 */
	void exitEnum_literal(JpaParser.Enum_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(JpaParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(JpaParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#simple_state_field}.
	 * @param ctx the parse tree
	 */
	void enterSimple_state_field(JpaParser.Simple_state_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#simple_state_field}.
	 * @param ctx the parse tree
	 */
	void exitSimple_state_field(JpaParser.Simple_state_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#embedded_class_state_field}.
	 * @param ctx the parse tree
	 */
	void enterEmbedded_class_state_field(JpaParser.Embedded_class_state_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#embedded_class_state_field}.
	 * @param ctx the parse tree
	 */
	void exitEmbedded_class_state_field(JpaParser.Embedded_class_state_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#single_valued_association_field}.
	 * @param ctx the parse tree
	 */
	void enterSingle_valued_association_field(JpaParser.Single_valued_association_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#single_valued_association_field}.
	 * @param ctx the parse tree
	 */
	void exitSingle_valued_association_field(JpaParser.Single_valued_association_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#collection_valued_association_field}.
	 * @param ctx the parse tree
	 */
	void enterCollection_valued_association_field(JpaParser.Collection_valued_association_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#collection_valued_association_field}.
	 * @param ctx the parse tree
	 */
	void exitCollection_valued_association_field(JpaParser.Collection_valued_association_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JpaParser#abstract_schema_name}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_schema_name(JpaParser.Abstract_schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JpaParser#abstract_schema_name}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_schema_name(JpaParser.Abstract_schema_nameContext ctx);
}