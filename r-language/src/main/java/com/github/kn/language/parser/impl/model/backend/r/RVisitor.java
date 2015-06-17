// Generated from /home/developer/workspace/languages-parser/r-language/src/main/antlr/R.g4 by ANTLR 4.5
package com.github.kn.language.parser.impl.model.backend.r;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(RParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link RParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(RParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link RParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(RParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link RParser#formlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormlist(RParser.FormlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link RParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(RParser.FormContext ctx);
	/**
	 * Visit a parse tree produced by {@link RParser#sublist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSublist(RParser.SublistContext ctx);
	/**
	 * Visit a parse tree produced by {@link RParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(RParser.SubContext ctx);
}