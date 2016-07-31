// Generated from Erlang.g4 by ANTLR 4.5.3
package com.github.kn.language.parser.impl.model.backend.erlang;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ErlangParser}.
 */
public interface ErlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ErlangParser#forms}.
	 * @param ctx the parse tree
	 */
	void enterForms(ErlangParser.FormsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#forms}.
	 * @param ctx the parse tree
	 */
	void exitForms(ErlangParser.FormsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#form}.
	 * @param ctx the parse tree
	 */
	void enterForm(ErlangParser.FormContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#form}.
	 * @param ctx the parse tree
	 */
	void exitForm(ErlangParser.FormContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tokAtom}.
	 * @param ctx the parse tree
	 */
	void enterTokAtom(ErlangParser.TokAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tokAtom}.
	 * @param ctx the parse tree
	 */
	void exitTokAtom(ErlangParser.TokAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tokVar}.
	 * @param ctx the parse tree
	 */
	void enterTokVar(ErlangParser.TokVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tokVar}.
	 * @param ctx the parse tree
	 */
	void exitTokVar(ErlangParser.TokVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tokFloat}.
	 * @param ctx the parse tree
	 */
	void enterTokFloat(ErlangParser.TokFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tokFloat}.
	 * @param ctx the parse tree
	 */
	void exitTokFloat(ErlangParser.TokFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tokInteger}.
	 * @param ctx the parse tree
	 */
	void enterTokInteger(ErlangParser.TokIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tokInteger}.
	 * @param ctx the parse tree
	 */
	void exitTokInteger(ErlangParser.TokIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tokChar}.
	 * @param ctx the parse tree
	 */
	void enterTokChar(ErlangParser.TokCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tokChar}.
	 * @param ctx the parse tree
	 */
	void exitTokChar(ErlangParser.TokCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tokString}.
	 * @param ctx the parse tree
	 */
	void enterTokString(ErlangParser.TokStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tokString}.
	 * @param ctx the parse tree
	 */
	void exitTokString(ErlangParser.TokStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(ErlangParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(ErlangParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpec(ErlangParser.TypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpec(ErlangParser.TypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#specFun}.
	 * @param ctx the parse tree
	 */
	void enterSpecFun(ErlangParser.SpecFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#specFun}.
	 * @param ctx the parse tree
	 */
	void exitSpecFun(ErlangParser.SpecFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#typedAttrVal}.
	 * @param ctx the parse tree
	 */
	void enterTypedAttrVal(ErlangParser.TypedAttrValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typedAttrVal}.
	 * @param ctx the parse tree
	 */
	void exitTypedAttrVal(ErlangParser.TypedAttrValContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#typedRecordFields}.
	 * @param ctx the parse tree
	 */
	void enterTypedRecordFields(ErlangParser.TypedRecordFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typedRecordFields}.
	 * @param ctx the parse tree
	 */
	void exitTypedRecordFields(ErlangParser.TypedRecordFieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#typedExprs}.
	 * @param ctx the parse tree
	 */
	void enterTypedExprs(ErlangParser.TypedExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typedExprs}.
	 * @param ctx the parse tree
	 */
	void exitTypedExprs(ErlangParser.TypedExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#typedExpr}.
	 * @param ctx the parse tree
	 */
	void enterTypedExpr(ErlangParser.TypedExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typedExpr}.
	 * @param ctx the parse tree
	 */
	void exitTypedExpr(ErlangParser.TypedExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#typeSigs}.
	 * @param ctx the parse tree
	 */
	void enterTypeSigs(ErlangParser.TypeSigsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typeSigs}.
	 * @param ctx the parse tree
	 */
	void exitTypeSigs(ErlangParser.TypeSigsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#typeSig}.
	 * @param ctx the parse tree
	 */
	void enterTypeSig(ErlangParser.TypeSigContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typeSig}.
	 * @param ctx the parse tree
	 */
	void exitTypeSig(ErlangParser.TypeSigContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#typeGuards}.
	 * @param ctx the parse tree
	 */
	void enterTypeGuards(ErlangParser.TypeGuardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typeGuards}.
	 * @param ctx the parse tree
	 */
	void exitTypeGuards(ErlangParser.TypeGuardsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#typeGuard}.
	 * @param ctx the parse tree
	 */
	void enterTypeGuard(ErlangParser.TypeGuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#typeGuard}.
	 * @param ctx the parse tree
	 */
	void exitTypeGuard(ErlangParser.TypeGuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#topTypes}.
	 * @param ctx the parse tree
	 */
	void enterTopTypes(ErlangParser.TopTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#topTypes}.
	 * @param ctx the parse tree
	 */
	void exitTopTypes(ErlangParser.TopTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#topType}.
	 * @param ctx the parse tree
	 */
	void enterTopType(ErlangParser.TopTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#topType}.
	 * @param ctx the parse tree
	 */
	void exitTopType(ErlangParser.TopTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#topType100}.
	 * @param ctx the parse tree
	 */
	void enterTopType100(ErlangParser.TopType100Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#topType100}.
	 * @param ctx the parse tree
	 */
	void exitTopType100(ErlangParser.TopType100Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#type200}.
	 * @param ctx the parse tree
	 */
	void enterType200(ErlangParser.Type200Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#type200}.
	 * @param ctx the parse tree
	 */
	void exitType200(ErlangParser.Type200Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#type300}.
	 * @param ctx the parse tree
	 */
	void enterType300(ErlangParser.Type300Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#type300}.
	 * @param ctx the parse tree
	 */
	void exitType300(ErlangParser.Type300Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#type400}.
	 * @param ctx the parse tree
	 */
	void enterType400(ErlangParser.Type400Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#type400}.
	 * @param ctx the parse tree
	 */
	void exitType400(ErlangParser.Type400Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#type500}.
	 * @param ctx the parse tree
	 */
	void enterType500(ErlangParser.Type500Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#type500}.
	 * @param ctx the parse tree
	 */
	void exitType500(ErlangParser.Type500Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ErlangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ErlangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#funType100}.
	 * @param ctx the parse tree
	 */
	void enterFunType100(ErlangParser.FunType100Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#funType100}.
	 * @param ctx the parse tree
	 */
	void exitFunType100(ErlangParser.FunType100Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#funType}.
	 * @param ctx the parse tree
	 */
	void enterFunType(ErlangParser.FunTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#funType}.
	 * @param ctx the parse tree
	 */
	void exitFunType(ErlangParser.FunTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#fieldTypes}.
	 * @param ctx the parse tree
	 */
	void enterFieldTypes(ErlangParser.FieldTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#fieldTypes}.
	 * @param ctx the parse tree
	 */
	void exitFieldTypes(ErlangParser.FieldTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#fieldType}.
	 * @param ctx the parse tree
	 */
	void enterFieldType(ErlangParser.FieldTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#fieldType}.
	 * @param ctx the parse tree
	 */
	void exitFieldType(ErlangParser.FieldTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#binaryType}.
	 * @param ctx the parse tree
	 */
	void enterBinaryType(ErlangParser.BinaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binaryType}.
	 * @param ctx the parse tree
	 */
	void exitBinaryType(ErlangParser.BinaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#binBaseType}.
	 * @param ctx the parse tree
	 */
	void enterBinBaseType(ErlangParser.BinBaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binBaseType}.
	 * @param ctx the parse tree
	 */
	void exitBinBaseType(ErlangParser.BinBaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#binUnitType}.
	 * @param ctx the parse tree
	 */
	void enterBinUnitType(ErlangParser.BinUnitTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binUnitType}.
	 * @param ctx the parse tree
	 */
	void exitBinUnitType(ErlangParser.BinUnitTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#attrVal}.
	 * @param ctx the parse tree
	 */
	void enterAttrVal(ErlangParser.AttrValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#attrVal}.
	 * @param ctx the parse tree
	 */
	void exitAttrVal(ErlangParser.AttrValContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ErlangParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ErlangParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#functionClause}.
	 * @param ctx the parse tree
	 */
	void enterFunctionClause(ErlangParser.FunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#functionClause}.
	 * @param ctx the parse tree
	 */
	void exitFunctionClause(ErlangParser.FunctionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#clauseArgs}.
	 * @param ctx the parse tree
	 */
	void enterClauseArgs(ErlangParser.ClauseArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#clauseArgs}.
	 * @param ctx the parse tree
	 */
	void exitClauseArgs(ErlangParser.ClauseArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#clauseGuard}.
	 * @param ctx the parse tree
	 */
	void enterClauseGuard(ErlangParser.ClauseGuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#clauseGuard}.
	 * @param ctx the parse tree
	 */
	void exitClauseGuard(ErlangParser.ClauseGuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#clauseBody}.
	 * @param ctx the parse tree
	 */
	void enterClauseBody(ErlangParser.ClauseBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#clauseBody}.
	 * @param ctx the parse tree
	 */
	void exitClauseBody(ErlangParser.ClauseBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ErlangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ErlangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr100}.
	 * @param ctx the parse tree
	 */
	void enterExpr100(ErlangParser.Expr100Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr100}.
	 * @param ctx the parse tree
	 */
	void exitExpr100(ErlangParser.Expr100Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr150}.
	 * @param ctx the parse tree
	 */
	void enterExpr150(ErlangParser.Expr150Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr150}.
	 * @param ctx the parse tree
	 */
	void exitExpr150(ErlangParser.Expr150Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr160}.
	 * @param ctx the parse tree
	 */
	void enterExpr160(ErlangParser.Expr160Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr160}.
	 * @param ctx the parse tree
	 */
	void exitExpr160(ErlangParser.Expr160Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr200}.
	 * @param ctx the parse tree
	 */
	void enterExpr200(ErlangParser.Expr200Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr200}.
	 * @param ctx the parse tree
	 */
	void exitExpr200(ErlangParser.Expr200Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr300}.
	 * @param ctx the parse tree
	 */
	void enterExpr300(ErlangParser.Expr300Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr300}.
	 * @param ctx the parse tree
	 */
	void exitExpr300(ErlangParser.Expr300Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr400}.
	 * @param ctx the parse tree
	 */
	void enterExpr400(ErlangParser.Expr400Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr400}.
	 * @param ctx the parse tree
	 */
	void exitExpr400(ErlangParser.Expr400Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr500}.
	 * @param ctx the parse tree
	 */
	void enterExpr500(ErlangParser.Expr500Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr500}.
	 * @param ctx the parse tree
	 */
	void exitExpr500(ErlangParser.Expr500Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr600}.
	 * @param ctx the parse tree
	 */
	void enterExpr600(ErlangParser.Expr600Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr600}.
	 * @param ctx the parse tree
	 */
	void exitExpr600(ErlangParser.Expr600Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr700}.
	 * @param ctx the parse tree
	 */
	void enterExpr700(ErlangParser.Expr700Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr700}.
	 * @param ctx the parse tree
	 */
	void exitExpr700(ErlangParser.Expr700Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#expr800}.
	 * @param ctx the parse tree
	 */
	void enterExpr800(ErlangParser.Expr800Context ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#expr800}.
	 * @param ctx the parse tree
	 */
	void exitExpr800(ErlangParser.Expr800Context ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#exprMax}.
	 * @param ctx the parse tree
	 */
	void enterExprMax(ErlangParser.ExprMaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#exprMax}.
	 * @param ctx the parse tree
	 */
	void exitExprMax(ErlangParser.ExprMaxContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(ErlangParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(ErlangParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tail}.
	 * @param ctx the parse tree
	 */
	void enterTail(ErlangParser.TailContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tail}.
	 * @param ctx the parse tree
	 */
	void exitTail(ErlangParser.TailContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(ErlangParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(ErlangParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#binElements}.
	 * @param ctx the parse tree
	 */
	void enterBinElements(ErlangParser.BinElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binElements}.
	 * @param ctx the parse tree
	 */
	void exitBinElements(ErlangParser.BinElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#binElement}.
	 * @param ctx the parse tree
	 */
	void enterBinElement(ErlangParser.BinElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binElement}.
	 * @param ctx the parse tree
	 */
	void exitBinElement(ErlangParser.BinElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(ErlangParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(ErlangParser.BitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#optBitSizeExpr}.
	 * @param ctx the parse tree
	 */
	void enterOptBitSizeExpr(ErlangParser.OptBitSizeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#optBitSizeExpr}.
	 * @param ctx the parse tree
	 */
	void exitOptBitSizeExpr(ErlangParser.OptBitSizeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#optBitTypeList}.
	 * @param ctx the parse tree
	 */
	void enterOptBitTypeList(ErlangParser.OptBitTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#optBitTypeList}.
	 * @param ctx the parse tree
	 */
	void exitOptBitTypeList(ErlangParser.OptBitTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#bitTypeList}.
	 * @param ctx the parse tree
	 */
	void enterBitTypeList(ErlangParser.BitTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#bitTypeList}.
	 * @param ctx the parse tree
	 */
	void exitBitTypeList(ErlangParser.BitTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#bitType}.
	 * @param ctx the parse tree
	 */
	void enterBitType(ErlangParser.BitTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#bitType}.
	 * @param ctx the parse tree
	 */
	void exitBitType(ErlangParser.BitTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#bitSizeExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitSizeExpr(ErlangParser.BitSizeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#bitSizeExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitSizeExpr(ErlangParser.BitSizeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#listComprehension}.
	 * @param ctx the parse tree
	 */
	void enterListComprehension(ErlangParser.ListComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#listComprehension}.
	 * @param ctx the parse tree
	 */
	void exitListComprehension(ErlangParser.ListComprehensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#binaryComprehension}.
	 * @param ctx the parse tree
	 */
	void enterBinaryComprehension(ErlangParser.BinaryComprehensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#binaryComprehension}.
	 * @param ctx the parse tree
	 */
	void exitBinaryComprehension(ErlangParser.BinaryComprehensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#lcExprs}.
	 * @param ctx the parse tree
	 */
	void enterLcExprs(ErlangParser.LcExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#lcExprs}.
	 * @param ctx the parse tree
	 */
	void exitLcExprs(ErlangParser.LcExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#lcExpr}.
	 * @param ctx the parse tree
	 */
	void enterLcExpr(ErlangParser.LcExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#lcExpr}.
	 * @param ctx the parse tree
	 */
	void exitLcExpr(ErlangParser.LcExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(ErlangParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(ErlangParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#recordExpr}.
	 * @param ctx the parse tree
	 */
	void enterRecordExpr(ErlangParser.RecordExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#recordExpr}.
	 * @param ctx the parse tree
	 */
	void exitRecordExpr(ErlangParser.RecordExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#recordTuple}.
	 * @param ctx the parse tree
	 */
	void enterRecordTuple(ErlangParser.RecordTupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#recordTuple}.
	 * @param ctx the parse tree
	 */
	void exitRecordTuple(ErlangParser.RecordTupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#recordFields}.
	 * @param ctx the parse tree
	 */
	void enterRecordFields(ErlangParser.RecordFieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#recordFields}.
	 * @param ctx the parse tree
	 */
	void exitRecordFields(ErlangParser.RecordFieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#recordField}.
	 * @param ctx the parse tree
	 */
	void enterRecordField(ErlangParser.RecordFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#recordField}.
	 * @param ctx the parse tree
	 */
	void exitRecordField(ErlangParser.RecordFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ErlangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ErlangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(ErlangParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(ErlangParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#ifClauses}.
	 * @param ctx the parse tree
	 */
	void enterIfClauses(ErlangParser.IfClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#ifClauses}.
	 * @param ctx the parse tree
	 */
	void exitIfClauses(ErlangParser.IfClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#ifClause}.
	 * @param ctx the parse tree
	 */
	void enterIfClause(ErlangParser.IfClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#ifClause}.
	 * @param ctx the parse tree
	 */
	void exitIfClause(ErlangParser.IfClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#caseExpr}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpr(ErlangParser.CaseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#caseExpr}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpr(ErlangParser.CaseExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#crClauses}.
	 * @param ctx the parse tree
	 */
	void enterCrClauses(ErlangParser.CrClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#crClauses}.
	 * @param ctx the parse tree
	 */
	void exitCrClauses(ErlangParser.CrClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#crClause}.
	 * @param ctx the parse tree
	 */
	void enterCrClause(ErlangParser.CrClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#crClause}.
	 * @param ctx the parse tree
	 */
	void exitCrClause(ErlangParser.CrClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#receiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterReceiveExpr(ErlangParser.ReceiveExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#receiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitReceiveExpr(ErlangParser.ReceiveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#funExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunExpr(ErlangParser.FunExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#funExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunExpr(ErlangParser.FunExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#atomOrVar}.
	 * @param ctx the parse tree
	 */
	void enterAtomOrVar(ErlangParser.AtomOrVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#atomOrVar}.
	 * @param ctx the parse tree
	 */
	void exitAtomOrVar(ErlangParser.AtomOrVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#integerOrVar}.
	 * @param ctx the parse tree
	 */
	void enterIntegerOrVar(ErlangParser.IntegerOrVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#integerOrVar}.
	 * @param ctx the parse tree
	 */
	void exitIntegerOrVar(ErlangParser.IntegerOrVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#funClauses}.
	 * @param ctx the parse tree
	 */
	void enterFunClauses(ErlangParser.FunClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#funClauses}.
	 * @param ctx the parse tree
	 */
	void exitFunClauses(ErlangParser.FunClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#funClause}.
	 * @param ctx the parse tree
	 */
	void enterFunClause(ErlangParser.FunClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#funClause}.
	 * @param ctx the parse tree
	 */
	void exitFunClause(ErlangParser.FunClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tryExpr}.
	 * @param ctx the parse tree
	 */
	void enterTryExpr(ErlangParser.TryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tryExpr}.
	 * @param ctx the parse tree
	 */
	void exitTryExpr(ErlangParser.TryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tryCatch}.
	 * @param ctx the parse tree
	 */
	void enterTryCatch(ErlangParser.TryCatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tryCatch}.
	 * @param ctx the parse tree
	 */
	void exitTryCatch(ErlangParser.TryCatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tryClauses}.
	 * @param ctx the parse tree
	 */
	void enterTryClauses(ErlangParser.TryClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tryClauses}.
	 * @param ctx the parse tree
	 */
	void exitTryClauses(ErlangParser.TryClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#tryClause}.
	 * @param ctx the parse tree
	 */
	void enterTryClause(ErlangParser.TryClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#tryClause}.
	 * @param ctx the parse tree
	 */
	void exitTryClause(ErlangParser.TryClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(ErlangParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(ErlangParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#exprs}.
	 * @param ctx the parse tree
	 */
	void enterExprs(ErlangParser.ExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#exprs}.
	 * @param ctx the parse tree
	 */
	void exitExprs(ErlangParser.ExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(ErlangParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(ErlangParser.GuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAtomic(ErlangParser.AtomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAtomic(ErlangParser.AtomicContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOp(ErlangParser.PrefixOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#prefixOp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOp(ErlangParser.PrefixOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#multOp}.
	 * @param ctx the parse tree
	 */
	void enterMultOp(ErlangParser.MultOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#multOp}.
	 * @param ctx the parse tree
	 */
	void exitMultOp(ErlangParser.MultOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(ErlangParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(ErlangParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#listOp}.
	 * @param ctx the parse tree
	 */
	void enterListOp(ErlangParser.ListOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#listOp}.
	 * @param ctx the parse tree
	 */
	void exitListOp(ErlangParser.ListOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(ErlangParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(ErlangParser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#ruleClauses}.
	 * @param ctx the parse tree
	 */
	void enterRuleClauses(ErlangParser.RuleClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#ruleClauses}.
	 * @param ctx the parse tree
	 */
	void exitRuleClauses(ErlangParser.RuleClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#ruleClause}.
	 * @param ctx the parse tree
	 */
	void enterRuleClause(ErlangParser.RuleClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#ruleClause}.
	 * @param ctx the parse tree
	 */
	void exitRuleClause(ErlangParser.RuleClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ErlangParser#ruleBody}.
	 * @param ctx the parse tree
	 */
	void enterRuleBody(ErlangParser.RuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ErlangParser#ruleBody}.
	 * @param ctx the parse tree
	 */
	void exitRuleBody(ErlangParser.RuleBodyContext ctx);
}