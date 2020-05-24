// Generated from dimensions.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dimensionsParser}.
 */
public interface dimensionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dimensionsParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(dimensionsParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimensionsParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(dimensionsParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimensionsParser#statList}.
	 * @param ctx the parse tree
	 */
	void enterStatList(dimensionsParser.StatListContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimensionsParser#statList}.
	 * @param ctx the parse tree
	 */
	void exitStatList(dimensionsParser.StatListContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimensionsParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(dimensionsParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimensionsParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(dimensionsParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimensionsParser#dim}.
	 * @param ctx the parse tree
	 */
	void enterDim(dimensionsParser.DimContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimensionsParser#dim}.
	 * @param ctx the parse tree
	 */
	void exitDim(dimensionsParser.DimContext ctx);
	/**
	 * Enter a parse tree produced by {@link dimensionsParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(dimensionsParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimensionsParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(dimensionsParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnn}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnn(dimensionsParser.ExprUnnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnn}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnn(dimensionsParser.ExprUnnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDouble}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDouble(dimensionsParser.ExprDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDouble}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDouble(dimensionsParser.ExprDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSumMin}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSumMin(dimensionsParser.ExprSumMinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSumMin}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSumMin(dimensionsParser.ExprSumMinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInt(dimensionsParser.ExprIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInt(dimensionsParser.ExprIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(dimensionsParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(dimensionsParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPower}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPower(dimensionsParser.ExprPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPower}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPower(dimensionsParser.ExprPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(dimensionsParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(dimensionsParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DimPower}
	 * labeled alternative in {@link dimensionsParser#unitdim}.
	 * @param ctx the parse tree
	 */
	void enterDimPower(dimensionsParser.DimPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DimPower}
	 * labeled alternative in {@link dimensionsParser#unitdim}.
	 * @param ctx the parse tree
	 */
	void exitDimPower(dimensionsParser.DimPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DimUnn}
	 * labeled alternative in {@link dimensionsParser#unitdim}.
	 * @param ctx the parse tree
	 */
	void enterDimUnn(dimensionsParser.DimUnnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DimUnn}
	 * labeled alternative in {@link dimensionsParser#unitdim}.
	 * @param ctx the parse tree
	 */
	void exitDimUnn(dimensionsParser.DimUnnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DimSumMin}
	 * labeled alternative in {@link dimensionsParser#unitdim}.
	 * @param ctx the parse tree
	 */
	void enterDimSumMin(dimensionsParser.DimSumMinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DimSumMin}
	 * labeled alternative in {@link dimensionsParser#unitdim}.
	 * @param ctx the parse tree
	 */
	void exitDimSumMin(dimensionsParser.DimSumMinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DimMultDiv}
	 * labeled alternative in {@link dimensionsParser#unitdim}.
	 * @param ctx the parse tree
	 */
	void enterDimMultDiv(dimensionsParser.DimMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DimMultDiv}
	 * labeled alternative in {@link dimensionsParser#unitdim}.
	 * @param ctx the parse tree
	 */
	void exitDimMultDiv(dimensionsParser.DimMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DimID}
	 * labeled alternative in {@link dimensionsParser#unitdim}.
	 * @param ctx the parse tree
	 */
	void enterDimID(dimensionsParser.DimIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DimID}
	 * labeled alternative in {@link dimensionsParser#unitdim}.
	 * @param ctx the parse tree
	 */
	void exitDimID(dimensionsParser.DimIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link dimensionsParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(dimensionsParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link dimensionsParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(dimensionsParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link dimensionsParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(dimensionsParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleType}
	 * labeled alternative in {@link dimensionsParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(dimensionsParser.DoubleTypeContext ctx);
}