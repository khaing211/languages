// Generated from Bnf.g4 by ANTLR 4.5.3
package com.github.kn.language.parser.impl.model.backend.bnf;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BnfParser}.
 */
public interface BnfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BnfParser#rulelist}.
	 * @param ctx the parse tree
	 */
	void enterRulelist(BnfParser.RulelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfParser#rulelist}.
	 * @param ctx the parse tree
	 */
	void exitRulelist(BnfParser.RulelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link BnfParser#rule_}.
	 * @param ctx the parse tree
	 */
	void enterRule_(BnfParser.Rule_Context ctx);
	/**
	 * Exit a parse tree produced by {@link BnfParser#rule_}.
	 * @param ctx the parse tree
	 */
	void exitRule_(BnfParser.Rule_Context ctx);
	/**
	 * Enter a parse tree produced by {@link BnfParser#lhs}.
	 * @param ctx the parse tree
	 */
	void enterLhs(BnfParser.LhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfParser#lhs}.
	 * @param ctx the parse tree
	 */
	void exitLhs(BnfParser.LhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BnfParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhs(BnfParser.RhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhs(BnfParser.RhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BnfParser#alternatives}.
	 * @param ctx the parse tree
	 */
	void enterAlternatives(BnfParser.AlternativesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfParser#alternatives}.
	 * @param ctx the parse tree
	 */
	void exitAlternatives(BnfParser.AlternativesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BnfParser#alternative}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(BnfParser.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfParser#alternative}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(BnfParser.AlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BnfParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(BnfParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(BnfParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BnfParser#optional}.
	 * @param ctx the parse tree
	 */
	void enterOptional(BnfParser.OptionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfParser#optional}.
	 * @param ctx the parse tree
	 */
	void exitOptional(BnfParser.OptionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BnfParser#zeroormore}.
	 * @param ctx the parse tree
	 */
	void enterZeroormore(BnfParser.ZeroormoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfParser#zeroormore}.
	 * @param ctx the parse tree
	 */
	void exitZeroormore(BnfParser.ZeroormoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link BnfParser#oneormore}.
	 * @param ctx the parse tree
	 */
	void enterOneormore(BnfParser.OneormoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfParser#oneormore}.
	 * @param ctx the parse tree
	 */
	void exitOneormore(BnfParser.OneormoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link BnfParser#captext}.
	 * @param ctx the parse tree
	 */
	void enterCaptext(BnfParser.CaptextContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfParser#captext}.
	 * @param ctx the parse tree
	 */
	void exitCaptext(BnfParser.CaptextContext ctx);
	/**
	 * Enter a parse tree produced by {@link BnfParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(BnfParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(BnfParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link BnfParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(BnfParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(BnfParser.IdContext ctx);
}