// Generated from chubix.g4 by ANTLR 4.8

  import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link chubixParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface chubixVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link chubixParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(chubixParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link chubixParser#instList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstList(chubixParser.InstListContext ctx);
	/**
	 * Visit a parse tree produced by {@link chubixParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(chubixParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link chubixParser#importDim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDim(chubixParser.ImportDimContext ctx);
	/**
	 * Visit a parse tree produced by {@link chubixParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(chubixParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link chubixParser#returnFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFunc(chubixParser.ReturnFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link chubixParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(chubixParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link chubixParser#callFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(chubixParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link chubixParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(chubixParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link chubixParser#declAssig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclAssig(chubixParser.DeclAssigContext ctx);
	/**
	 * Visit a parse tree produced by {@link chubixParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(chubixParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link chubixParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(chubixParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalElse}
	 * labeled alternative in {@link chubixParser#elseCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalElse(chubixParser.ConditionalElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instElse}
	 * labeled alternative in {@link chubixParser#elseCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstElse(chubixParser.InstElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link chubixParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(chubixParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link chubixParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(chubixParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link chubixParser#breakLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakLoop(chubixParser.BreakLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link chubixParser#continueLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueLoop(chubixParser.ContinueLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link chubixParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(chubixParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link chubixParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(chubixParser.DoubleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link chubixParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolType(chubixParser.BoolTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strType}
	 * labeled alternative in {@link chubixParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrType(chubixParser.StrTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidType}
	 * labeled alternative in {@link chubixParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(chubixParser.VoidTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dimensionType}
	 * labeled alternative in {@link chubixParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionType(chubixParser.DimensionTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleExpr(chubixParser.DoubleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(chubixParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpr(chubixParser.IntegerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpr(chubixParser.BooleanExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputExpr(chubixParser.InputExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(chubixParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprConvUnit}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprConvUnit(chubixParser.ExprConvUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpr(chubixParser.FunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(chubixParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleSumMin}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleSumMin(chubixParser.DoubleSumMinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code signExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignExpr(chubixParser.SignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDivRestExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivRestExpr(chubixParser.MultDivRestExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(chubixParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpr(chubixParser.ConditionalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(chubixParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DimPower}
	 * labeled alternative in {@link chubixParser#unitdim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimPower(chubixParser.DimPowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DimUnn}
	 * labeled alternative in {@link chubixParser#unitdim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimUnn(chubixParser.DimUnnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DimMultDiv}
	 * labeled alternative in {@link chubixParser#unitdim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimMultDiv(chubixParser.DimMultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DimID}
	 * labeled alternative in {@link chubixParser#unitdim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimID(chubixParser.DimIDContext ctx);
}