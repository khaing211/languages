// Generated from Antlr4Parser.g4 by ANTLR 4.5.3
package com.github.kn.language.parser.impl.model.backend.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Antlr4Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Antlr4ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#grammarSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarSpec(Antlr4Parser.GrammarSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#grammarType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarType(Antlr4Parser.GrammarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#prequelConstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrequelConstruct(Antlr4Parser.PrequelConstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#optionsSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionsSpec(Antlr4Parser.OptionsSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(Antlr4Parser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#optionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionValue(Antlr4Parser.OptionValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#delegateGrammars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegateGrammars(Antlr4Parser.DelegateGrammarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#delegateGrammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelegateGrammar(Antlr4Parser.DelegateGrammarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#tokensSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokensSpec(Antlr4Parser.TokensSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(Antlr4Parser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#actionScopeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionScopeName(Antlr4Parser.ActionScopeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#modeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModeSpec(Antlr4Parser.ModeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(Antlr4Parser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#ruleSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleSpec(Antlr4Parser.RuleSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#parserRuleSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParserRuleSpec(Antlr4Parser.ParserRuleSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#exceptionGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionGroup(Antlr4Parser.ExceptionGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#exceptionHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionHandler(Antlr4Parser.ExceptionHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#finallyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyClause(Antlr4Parser.FinallyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#rulePrequel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulePrequel(Antlr4Parser.RulePrequelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#ruleReturns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleReturns(Antlr4Parser.RuleReturnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#throwsSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowsSpec(Antlr4Parser.ThrowsSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#localsSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalsSpec(Antlr4Parser.LocalsSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#ruleAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleAction(Antlr4Parser.RuleActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#ruleModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleModifiers(Antlr4Parser.RuleModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#ruleModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleModifier(Antlr4Parser.RuleModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#ruleBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleBlock(Antlr4Parser.RuleBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#ruleAltList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleAltList(Antlr4Parser.RuleAltListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#labeledAlt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledAlt(Antlr4Parser.LabeledAltContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#lexerRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerRule(Antlr4Parser.LexerRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#lexerRuleBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerRuleBlock(Antlr4Parser.LexerRuleBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#lexerAltList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerAltList(Antlr4Parser.LexerAltListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#lexerAlt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerAlt(Antlr4Parser.LexerAltContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#lexerElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerElements(Antlr4Parser.LexerElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#lexerElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerElement(Antlr4Parser.LexerElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#labeledLexerElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledLexerElement(Antlr4Parser.LabeledLexerElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#lexerBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerBlock(Antlr4Parser.LexerBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#lexerCommands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerCommands(Antlr4Parser.LexerCommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#lexerCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerCommand(Antlr4Parser.LexerCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#lexerCommandName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerCommandName(Antlr4Parser.LexerCommandNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#lexerCommandExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerCommandExpr(Antlr4Parser.LexerCommandExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#altList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltList(Antlr4Parser.AltListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#alternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternative(Antlr4Parser.AlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(Antlr4Parser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#labeledElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledElement(Antlr4Parser.LabeledElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#ebnf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEbnf(Antlr4Parser.EbnfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#blockSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSuffix(Antlr4Parser.BlockSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#ebnfSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEbnfSuffix(Antlr4Parser.EbnfSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#lexerAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexerAtom(Antlr4Parser.LexerAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(Antlr4Parser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#notSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotSet(Antlr4Parser.NotSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#blockSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSet(Antlr4Parser.BlockSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#setElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetElement(Antlr4Parser.SetElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Antlr4Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#ruleref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleref(Antlr4Parser.RulerefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(Antlr4Parser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal(Antlr4Parser.TerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#elementOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementOptions(Antlr4Parser.ElementOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#elementOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementOption(Antlr4Parser.ElementOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Antlr4Parser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(Antlr4Parser.IdContext ctx);
}