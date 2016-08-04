// Generated from Stacktrace.g4 by ANTLR 4.5.3
package com.kn.language.parser.antlr.stacktrace;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StacktraceParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StacktraceVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StacktraceParser#startRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartRule(StacktraceParser.StartRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link StacktraceParser#stackTrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackTrace(StacktraceParser.StackTraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link StacktraceParser#stackTraceLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStackTraceLine(StacktraceParser.StackTraceLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link StacktraceParser#atLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtLine(StacktraceParser.AtLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link StacktraceParser#causedByLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCausedByLine(StacktraceParser.CausedByLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link StacktraceParser#ellipsisLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEllipsisLine(StacktraceParser.EllipsisLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link StacktraceParser#messageLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageLine(StacktraceParser.MessageLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link StacktraceParser#qualifiedClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedClass(StacktraceParser.QualifiedClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link StacktraceParser#innerClassName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerClassName(StacktraceParser.InnerClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StacktraceParser#classFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassFile(StacktraceParser.ClassFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link StacktraceParser#qualifiedMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedMethod(StacktraceParser.QualifiedMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link StacktraceParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(StacktraceParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link StacktraceParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(StacktraceParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StacktraceParser#packagePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackagePath(StacktraceParser.PackagePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link StacktraceParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(StacktraceParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StacktraceParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(StacktraceParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link StacktraceParser#message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage(StacktraceParser.MessageContext ctx);
}