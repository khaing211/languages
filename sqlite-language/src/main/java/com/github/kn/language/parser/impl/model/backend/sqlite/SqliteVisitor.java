// Generated from /home/developer/workspace/languages-parser/sqlite-language/src/main/antlr/Sqlite.g4 by ANTLR 4.5
package com.github.kn.language.parser.impl.model.backend.sqlite;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqliteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqliteVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqliteParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SqliteParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(SqliteParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(SqliteParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(SqliteParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(SqliteParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#analyze_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze_stmt(SqliteParser.Analyze_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#attach_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttach_stmt(SqliteParser.Attach_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#begin_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_stmt(SqliteParser.Begin_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#commit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_stmt(SqliteParser.Commit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_select_stmt(SqliteParser.Compound_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(SqliteParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(SqliteParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_trigger_stmt(SqliteParser.Create_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#create_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view_stmt(SqliteParser.Create_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_virtual_table_stmt(SqliteParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(SqliteParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt_limited(SqliteParser.Delete_stmt_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#detach_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDetach_stmt(SqliteParser.Detach_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index_stmt(SqliteParser.Drop_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(SqliteParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_trigger_stmt(SqliteParser.Drop_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view_stmt(SqliteParser.Drop_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactored_select_stmt(SqliteParser.Factored_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(SqliteParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#pragma_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_stmt(SqliteParser.Pragma_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#reindex_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindex_stmt(SqliteParser.Reindex_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#release_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelease_stmt(SqliteParser.Release_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#rollback_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_stmt(SqliteParser.Rollback_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_stmt(SqliteParser.Savepoint_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select_stmt(SqliteParser.Simple_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(SqliteParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#select_or_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_values(SqliteParser.Select_or_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(SqliteParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt_limited(SqliteParser.Update_stmt_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_stmt(SqliteParser.Vacuum_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(SqliteParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SqliteParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(SqliteParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#conflict_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_clause(SqliteParser.Conflict_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SqliteParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(SqliteParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#raise_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_function(SqliteParser.Raise_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(SqliteParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(SqliteParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(SqliteParser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(SqliteParser.Qualified_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(SqliteParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#pragma_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_value(SqliteParser.Pragma_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(SqliteParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(SqliteParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(SqliteParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(SqliteParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(SqliteParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(SqliteParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(SqliteParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#compound_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_operator(SqliteParser.Compound_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#cte_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_table_name(SqliteParser.Cte_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(SqliteParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(SqliteParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SqliteParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(SqliteParser.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#module_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_argument(SqliteParser.Module_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(SqliteParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SqliteParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SqliteParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SqliteParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(SqliteParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SqliteParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#table_or_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_index_name(SqliteParser.Table_or_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(SqliteParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SqliteParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(SqliteParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(SqliteParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(SqliteParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(SqliteParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(SqliteParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(SqliteParser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#pragma_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_name(SqliteParser.Pragma_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(SqliteParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SqliteParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(SqliteParser.Transaction_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqliteParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(SqliteParser.Any_nameContext ctx);
}