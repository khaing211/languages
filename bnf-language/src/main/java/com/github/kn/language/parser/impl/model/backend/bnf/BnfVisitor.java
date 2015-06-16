// Generated from /home/developer/workspace/languages-parser/bnf-language/src/main/antlr/Bnf.g4 by ANTLR 4.5
package com.github.kn.language.parser.impl.model.backend.bnf;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BnfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BnfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BnfParser#rulelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulelist(BnfParser.RulelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link BnfParser#rule_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_(BnfParser.Rule_Context ctx);
	/**
	 * Visit a parse tree produced by {@link BnfParser#lhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLhs(BnfParser.LhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BnfParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRhs(BnfParser.RhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BnfParser#alternatives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternatives(BnfParser.AlternativesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BnfParser#alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative(BnfParser.AlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BnfParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(BnfParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BnfParser#optional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptional(BnfParser.OptionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BnfParser#zeroormore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroormore(BnfParser.ZeroormoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link BnfParser#oneormore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneormore(BnfParser.OneormoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link BnfParser#captext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptext(BnfParser.CaptextContext ctx);
	/**
	 * Visit a parse tree produced by {@link BnfParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(BnfParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link BnfParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(BnfParser.IdContext ctx);
}