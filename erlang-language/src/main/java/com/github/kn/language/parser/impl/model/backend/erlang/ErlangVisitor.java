// Generated from Erlang.g4 by ANTLR 4.5.3
package com.github.kn.language.parser.impl.model.backend.erlang;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ErlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ErlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ErlangParser#forms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForms(ErlangParser.FormsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForm(ErlangParser.FormContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tokAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokAtom(ErlangParser.TokAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tokVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokVar(ErlangParser.TokVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tokFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokFloat(ErlangParser.TokFloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tokInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokInteger(ErlangParser.TokIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tokChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokChar(ErlangParser.TokCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tokString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokString(ErlangParser.TokStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(ErlangParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#typeSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpec(ErlangParser.TypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#specFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecFun(ErlangParser.SpecFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#typedAttrVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedAttrVal(ErlangParser.TypedAttrValContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#typedRecordFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedRecordFields(ErlangParser.TypedRecordFieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#typedExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedExprs(ErlangParser.TypedExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#typedExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedExpr(ErlangParser.TypedExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#typeSigs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSigs(ErlangParser.TypeSigsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#typeSig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSig(ErlangParser.TypeSigContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#typeGuards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeGuards(ErlangParser.TypeGuardsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#typeGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeGuard(ErlangParser.TypeGuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#topTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopTypes(ErlangParser.TopTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#topType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopType(ErlangParser.TopTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#topType100}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopType100(ErlangParser.TopType100Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#type200}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType200(ErlangParser.Type200Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#type300}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType300(ErlangParser.Type300Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#type400}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType400(ErlangParser.Type400Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#type500}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType500(ErlangParser.Type500Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ErlangParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#funType100}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunType100(ErlangParser.FunType100Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#funType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunType(ErlangParser.FunTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#fieldTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldTypes(ErlangParser.FieldTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#fieldType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldType(ErlangParser.FieldTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#binaryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryType(ErlangParser.BinaryTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#binBaseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinBaseType(ErlangParser.BinBaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#binUnitType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinUnitType(ErlangParser.BinUnitTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#attrVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrVal(ErlangParser.AttrValContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ErlangParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#functionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionClause(ErlangParser.FunctionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#clauseArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseArgs(ErlangParser.ClauseArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#clauseGuard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseGuard(ErlangParser.ClauseGuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#clauseBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClauseBody(ErlangParser.ClauseBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ErlangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr100}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr100(ErlangParser.Expr100Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr150}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr150(ErlangParser.Expr150Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr160}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr160(ErlangParser.Expr160Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr200}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr200(ErlangParser.Expr200Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr300}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr300(ErlangParser.Expr300Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr400}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr400(ErlangParser.Expr400Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr500}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr500(ErlangParser.Expr500Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr600}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr600(ErlangParser.Expr600Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr700}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr700(ErlangParser.Expr700Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#expr800}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr800(ErlangParser.Expr800Context ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#exprMax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMax(ErlangParser.ExprMaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(ErlangParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTail(ErlangParser.TailContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(ErlangParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#binElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinElements(ErlangParser.BinElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#binElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinElement(ErlangParser.BinElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#bitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpr(ErlangParser.BitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#optBitSizeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptBitSizeExpr(ErlangParser.OptBitSizeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#optBitTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptBitTypeList(ErlangParser.OptBitTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#bitTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitTypeList(ErlangParser.BitTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#bitType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitType(ErlangParser.BitTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#bitSizeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitSizeExpr(ErlangParser.BitSizeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#listComprehension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListComprehension(ErlangParser.ListComprehensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#binaryComprehension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryComprehension(ErlangParser.BinaryComprehensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#lcExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcExprs(ErlangParser.LcExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#lcExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLcExpr(ErlangParser.LcExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(ErlangParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#recordExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordExpr(ErlangParser.RecordExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#recordTuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordTuple(ErlangParser.RecordTupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#recordFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordFields(ErlangParser.RecordFieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#recordField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordField(ErlangParser.RecordFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ErlangParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#ifExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(ErlangParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#ifClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfClauses(ErlangParser.IfClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#ifClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfClause(ErlangParser.IfClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#caseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpr(ErlangParser.CaseExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#crClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrClauses(ErlangParser.CrClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#crClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrClause(ErlangParser.CrClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#receiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiveExpr(ErlangParser.ReceiveExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#funExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunExpr(ErlangParser.FunExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#atomOrVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomOrVar(ErlangParser.AtomOrVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#integerOrVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerOrVar(ErlangParser.IntegerOrVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#funClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunClauses(ErlangParser.FunClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#funClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunClause(ErlangParser.FunClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryExpr(ErlangParser.TryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tryCatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryCatch(ErlangParser.TryCatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tryClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryClauses(ErlangParser.TryClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#tryClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryClause(ErlangParser.TryClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(ErlangParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprs(ErlangParser.ExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard(ErlangParser.GuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic(ErlangParser.AtomicContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#prefixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixOp(ErlangParser.PrefixOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#multOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOp(ErlangParser.MultOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(ErlangParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#listOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOp(ErlangParser.ListOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(ErlangParser.CompOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#ruleClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleClauses(ErlangParser.RuleClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#ruleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleClause(ErlangParser.RuleClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ErlangParser#ruleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleBody(ErlangParser.RuleBodyContext ctx);
}