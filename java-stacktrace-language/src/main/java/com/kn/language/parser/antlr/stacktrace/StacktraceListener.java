// Generated from Stacktrace.g4 by ANTLR 4.5.3
package com.kn.language.parser.antlr.stacktrace;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StacktraceParser}.
 */
public interface StacktraceListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StacktraceParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(StacktraceParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link StacktraceParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(StacktraceParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link StacktraceParser#stackTrace}.
	 * @param ctx the parse tree
	 */
	void enterStackTrace(StacktraceParser.StackTraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link StacktraceParser#stackTrace}.
	 * @param ctx the parse tree
	 */
	void exitStackTrace(StacktraceParser.StackTraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link StacktraceParser#stackTraceLine}.
	 * @param ctx the parse tree
	 */
	void enterStackTraceLine(StacktraceParser.StackTraceLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link StacktraceParser#stackTraceLine}.
	 * @param ctx the parse tree
	 */
	void exitStackTraceLine(StacktraceParser.StackTraceLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link StacktraceParser#atLine}.
	 * @param ctx the parse tree
	 */
	void enterAtLine(StacktraceParser.AtLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link StacktraceParser#atLine}.
	 * @param ctx the parse tree
	 */
	void exitAtLine(StacktraceParser.AtLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link StacktraceParser#causedByLine}.
	 * @param ctx the parse tree
	 */
	void enterCausedByLine(StacktraceParser.CausedByLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link StacktraceParser#causedByLine}.
	 * @param ctx the parse tree
	 */
	void exitCausedByLine(StacktraceParser.CausedByLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link StacktraceParser#ellipsisLine}.
	 * @param ctx the parse tree
	 */
	void enterEllipsisLine(StacktraceParser.EllipsisLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link StacktraceParser#ellipsisLine}.
	 * @param ctx the parse tree
	 */
	void exitEllipsisLine(StacktraceParser.EllipsisLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link StacktraceParser#messageLine}.
	 * @param ctx the parse tree
	 */
	void enterMessageLine(StacktraceParser.MessageLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link StacktraceParser#messageLine}.
	 * @param ctx the parse tree
	 */
	void exitMessageLine(StacktraceParser.MessageLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link StacktraceParser#qualifiedClass}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedClass(StacktraceParser.QualifiedClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link StacktraceParser#qualifiedClass}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedClass(StacktraceParser.QualifiedClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link StacktraceParser#innerClassName}.
	 * @param ctx the parse tree
	 */
	void enterInnerClassName(StacktraceParser.InnerClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StacktraceParser#innerClassName}.
	 * @param ctx the parse tree
	 */
	void exitInnerClassName(StacktraceParser.InnerClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StacktraceParser#classFile}.
	 * @param ctx the parse tree
	 */
	void enterClassFile(StacktraceParser.ClassFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link StacktraceParser#classFile}.
	 * @param ctx the parse tree
	 */
	void exitClassFile(StacktraceParser.ClassFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link StacktraceParser#qualifiedMethod}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedMethod(StacktraceParser.QualifiedMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link StacktraceParser#qualifiedMethod}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedMethod(StacktraceParser.QualifiedMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link StacktraceParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(StacktraceParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link StacktraceParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(StacktraceParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link StacktraceParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(StacktraceParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StacktraceParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(StacktraceParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StacktraceParser#packagePath}.
	 * @param ctx the parse tree
	 */
	void enterPackagePath(StacktraceParser.PackagePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link StacktraceParser#packagePath}.
	 * @param ctx the parse tree
	 */
	void exitPackagePath(StacktraceParser.PackagePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link StacktraceParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(StacktraceParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StacktraceParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(StacktraceParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StacktraceParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(StacktraceParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link StacktraceParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(StacktraceParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link StacktraceParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(StacktraceParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link StacktraceParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(StacktraceParser.MessageContext ctx);
}