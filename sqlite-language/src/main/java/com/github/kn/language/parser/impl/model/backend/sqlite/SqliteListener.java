// Generated from Sqlite.g4 by ANTLR 4.5.3
package com.github.kn.language.parser.impl.model.backend.sqlite;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqliteParser}.
 */
public interface SqliteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqliteParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SqliteParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SqliteParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(SqliteParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(SqliteParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(SqliteParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(SqliteParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(SqliteParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(SqliteParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(SqliteParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(SqliteParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze_stmt(SqliteParser.Analyze_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze_stmt(SqliteParser.Analyze_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttach_stmt(SqliteParser.Attach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttach_stmt(SqliteParser.Attach_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_stmt(SqliteParser.Begin_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_stmt(SqliteParser.Begin_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(SqliteParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(SqliteParser.Commit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_select_stmt(SqliteParser.Compound_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_select_stmt(SqliteParser.Compound_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(SqliteParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(SqliteParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(SqliteParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(SqliteParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger_stmt(SqliteParser.Create_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger_stmt(SqliteParser.Create_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_stmt(SqliteParser.Create_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_stmt(SqliteParser.Create_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_virtual_table_stmt(SqliteParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_virtual_table_stmt(SqliteParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(SqliteParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(SqliteParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt_limited(SqliteParser.Delete_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt_limited(SqliteParser.Delete_stmt_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDetach_stmt(SqliteParser.Detach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDetach_stmt(SqliteParser.Detach_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index_stmt(SqliteParser.Drop_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index_stmt(SqliteParser.Drop_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(SqliteParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(SqliteParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger_stmt(SqliteParser.Drop_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger_stmt(SqliteParser.Drop_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_stmt(SqliteParser.Drop_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_stmt(SqliteParser.Drop_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(SqliteParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(SqliteParser.Factored_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(SqliteParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(SqliteParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPragma_stmt(SqliteParser.Pragma_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPragma_stmt(SqliteParser.Pragma_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReindex_stmt(SqliteParser.Reindex_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReindex_stmt(SqliteParser.Reindex_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRelease_stmt(SqliteParser.Release_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRelease_stmt(SqliteParser.Release_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(SqliteParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(SqliteParser.Rollback_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_stmt(SqliteParser.Savepoint_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_stmt(SqliteParser.Savepoint_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_stmt(SqliteParser.Simple_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_stmt(SqliteParser.Simple_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SqliteParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SqliteParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(SqliteParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(SqliteParser.Select_or_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(SqliteParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(SqliteParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt_limited(SqliteParser.Update_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt_limited(SqliteParser.Update_stmt_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_stmt(SqliteParser.Vacuum_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_stmt(SqliteParser.Vacuum_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(SqliteParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(SqliteParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(SqliteParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(SqliteParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(SqliteParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(SqliteParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void enterConflict_clause(SqliteParser.Conflict_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void exitConflict_clause(SqliteParser.Conflict_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SqliteParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SqliteParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(SqliteParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(SqliteParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void enterRaise_function(SqliteParser.Raise_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void exitRaise_function(SqliteParser.Raise_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(SqliteParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(SqliteParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(SqliteParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(SqliteParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(SqliteParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(SqliteParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(SqliteParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(SqliteParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(SqliteParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(SqliteParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(SqliteParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(SqliteParser.Pragma_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(SqliteParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(SqliteParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(SqliteParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(SqliteParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(SqliteParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(SqliteParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(SqliteParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(SqliteParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(SqliteParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(SqliteParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(SqliteParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(SqliteParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(SqliteParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(SqliteParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompound_operator(SqliteParser.Compound_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompound_operator(SqliteParser.Compound_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(SqliteParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(SqliteParser.Cte_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(SqliteParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(SqliteParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(SqliteParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(SqliteParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(SqliteParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(SqliteParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(SqliteParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(SqliteParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(SqliteParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(SqliteParser.Module_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(SqliteParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(SqliteParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SqliteParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SqliteParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SqliteParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SqliteParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SqliteParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SqliteParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(SqliteParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(SqliteParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SqliteParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SqliteParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(SqliteParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(SqliteParser.Table_or_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(SqliteParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(SqliteParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SqliteParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SqliteParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(SqliteParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(SqliteParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(SqliteParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(SqliteParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(SqliteParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(SqliteParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(SqliteParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(SqliteParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(SqliteParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(SqliteParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(SqliteParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(SqliteParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(SqliteParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(SqliteParser.Pragma_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(SqliteParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(SqliteParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SqliteParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SqliteParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(SqliteParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(SqliteParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqliteParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(SqliteParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqliteParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(SqliteParser.Any_nameContext ctx);
}