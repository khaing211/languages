// Generated from RFilter.g4 by ANTLR 4.5.3
package com.github.kn.language.parser.impl.model.backend.r;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RFilter}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RFilterVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RFilter#stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream(RFilter.StreamContext ctx);
	/**
	 * Visit a parse tree produced by {@link RFilter#eat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEat(RFilter.EatContext ctx);
	/**
	 * Visit a parse tree produced by {@link RFilter#elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem(RFilter.ElemContext ctx);
	/**
	 * Visit a parse tree produced by {@link RFilter#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(RFilter.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link RFilter#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(RFilter.OpContext ctx);
}