// Generated from chubix.g4 by ANTLR 4.8

  import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link chubixParser}.
 */
public interface chubixListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link chubixParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(chubixParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link chubixParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(chubixParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link chubixParser#instList}.
	 * @param ctx the parse tree
	 */
	void enterInstList(chubixParser.InstListContext ctx);
	/**
	 * Exit a parse tree produced by {@link chubixParser#instList}.
	 * @param ctx the parse tree
	 */
	void exitInstList(chubixParser.InstListContext ctx);
	/**
	 * Enter a parse tree produced by {@link chubixParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(chubixParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link chubixParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(chubixParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link chubixParser#importDim}.
	 * @param ctx the parse tree
	 */
	void enterImportDim(chubixParser.ImportDimContext ctx);
	/**
	 * Exit a parse tree produced by {@link chubixParser#importDim}.
	 * @param ctx the parse tree
	 */
	void exitImportDim(chubixParser.ImportDimContext ctx);
	/**
	 * Enter a parse tree produced by {@link chubixParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(chubixParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link chubixParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(chubixParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link chubixParser#returnFunc}.
	 * @param ctx the parse tree
	 */
	void enterReturnFunc(chubixParser.ReturnFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link chubixParser#returnFunc}.
	 * @param ctx the parse tree
	 */
	void exitReturnFunc(chubixParser.ReturnFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link chubixParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(chubixParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link chubixParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(chubixParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link chubixParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(chubixParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link chubixParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(chubixParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link chubixParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(chubixParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link chubixParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(chubixParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link chubixParser#declAssig}.
	 * @param ctx the parse tree
	 */
	void enterDeclAssig(chubixParser.DeclAssigContext ctx);
	/**
	 * Exit a parse tree produced by {@link chubixParser#declAssig}.
	 * @param ctx the parse tree
	 */
	void exitDeclAssig(chubixParser.DeclAssigContext ctx);
	/**
	 * Enter a parse tree produced by {@link chubixParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(chubixParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link chubixParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(chubixParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link chubixParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(chubixParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link chubixParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(chubixParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalElse}
	 * labeled alternative in {@link chubixParser#elseCond}.
	 * @param ctx the parse tree
	 */
	void enterConditionalElse(chubixParser.ConditionalElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalElse}
	 * labeled alternative in {@link chubixParser#elseCond}.
	 * @param ctx the parse tree
	 */
	void exitConditionalElse(chubixParser.ConditionalElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instElse}
	 * labeled alternative in {@link chubixParser#elseCond}.
	 * @param ctx the parse tree
	 */
	void enterInstElse(chubixParser.InstElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instElse}
	 * labeled alternative in {@link chubixParser#elseCond}.
	 * @param ctx the parse tree
	 */
	void exitInstElse(chubixParser.InstElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link chubixParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(chubixParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link chubixParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(chubixParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link chubixParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(chubixParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link chubixParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(chubixParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link chubixParser#breakLoop}.
	 * @param ctx the parse tree
	 */
	void enterBreakLoop(chubixParser.BreakLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link chubixParser#breakLoop}.
	 * @param ctx the parse tree
	 */
	void exitBreakLoop(chubixParser.BreakLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link chubixParser#continueLoop}.
	 * @param ctx the parse tree
	 */
	void enterContinueLoop(chubixParser.ContinueLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link chubixParser#continueLoop}.
	 * @param ctx the parse tree
	 */
	void exitContinueLoop(chubixParser.ContinueLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link chubixParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(chubixParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link chubixParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(chubixParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link chubixParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(chubixParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link chubixParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(chubixParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link chubixParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(chubixParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link chubixParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(chubixParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strType}
	 * labeled alternative in {@link chubixParser#type}.
	 * @param ctx the parse tree
	 */
	void enterStrType(chubixParser.StrTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strType}
	 * labeled alternative in {@link chubixParser#type}.
	 * @param ctx the parse tree
	 */
	void exitStrType(chubixParser.StrTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidType}
	 * labeled alternative in {@link chubixParser#type}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(chubixParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidType}
	 * labeled alternative in {@link chubixParser#type}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(chubixParser.VoidTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dimensionType}
	 * labeled alternative in {@link chubixParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDimensionType(chubixParser.DimensionTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dimensionType}
	 * labeled alternative in {@link chubixParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDimensionType(chubixParser.DimensionTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDoubleExpr(chubixParser.DoubleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDoubleExpr(chubixParser.DoubleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(chubixParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(chubixParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpr(chubixParser.IntegerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpr(chubixParser.IntegerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(chubixParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(chubixParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInputExpr(chubixParser.InputExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInputExpr(chubixParser.InputExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(chubixParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(chubixParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprConvUnit}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprConvUnit(chubixParser.ExprConvUnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprConvUnit}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprConvUnit(chubixParser.ExprConvUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpr(chubixParser.FunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpr(chubixParser.FunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(chubixParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(chubixParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleSumMin}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDoubleSumMin(chubixParser.DoubleSumMinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleSumMin}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDoubleSumMin(chubixParser.DoubleSumMinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code signExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSignExpr(chubixParser.SignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code signExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSignExpr(chubixParser.SignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multDivRestExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDivRestExpr(chubixParser.MultDivRestExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDivRestExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDivRestExpr(chubixParser.MultDivRestExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(chubixParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(chubixParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpr(chubixParser.ConditionalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpr(chubixParser.ConditionalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(chubixParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(chubixParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DimPower}
	 * labeled alternative in {@link chubixParser#unitdim}.
	 * @param ctx the parse tree
	 */
	void enterDimPower(chubixParser.DimPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DimPower}
	 * labeled alternative in {@link chubixParser#unitdim}.
	 * @param ctx the parse tree
	 */
	void exitDimPower(chubixParser.DimPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DimUnn}
	 * labeled alternative in {@link chubixParser#unitdim}.
	 * @param ctx the parse tree
	 */
	void enterDimUnn(chubixParser.DimUnnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DimUnn}
	 * labeled alternative in {@link chubixParser#unitdim}.
	 * @param ctx the parse tree
	 */
	void exitDimUnn(chubixParser.DimUnnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DimMultDiv}
	 * labeled alternative in {@link chubixParser#unitdim}.
	 * @param ctx the parse tree
	 */
	void enterDimMultDiv(chubixParser.DimMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DimMultDiv}
	 * labeled alternative in {@link chubixParser#unitdim}.
	 * @param ctx the parse tree
	 */
	void exitDimMultDiv(chubixParser.DimMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DimID}
	 * labeled alternative in {@link chubixParser#unitdim}.
	 * @param ctx the parse tree
	 */
	void enterDimID(chubixParser.DimIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DimID}
	 * labeled alternative in {@link chubixParser#unitdim}.
	 * @param ctx the parse tree
	 */
	void exitDimID(chubixParser.DimIDContext ctx);
}