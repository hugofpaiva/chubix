// Generated from dimensions.g4 by ANTLR 4.8

    import java.util.Map;
    import java.util.HashMap;

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
	 * Enter a parse tree produced by the {@code PrimitiveDim}
	 * labeled alternative in {@link dimensionsParser#dim}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDim(dimensionsParser.PrimitiveDimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimitiveDim}
	 * labeled alternative in {@link dimensionsParser#dim}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDim(dimensionsParser.PrimitiveDimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelativeDim}
	 * labeled alternative in {@link dimensionsParser#dim}.
	 * @param ctx the parse tree
	 */
	void enterRelativeDim(dimensionsParser.RelativeDimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelativeDim}
	 * labeled alternative in {@link dimensionsParser#dim}.
	 * @param ctx the parse tree
	 */
	void exitRelativeDim(dimensionsParser.RelativeDimContext ctx);
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
	 * Enter a parse tree produced by the {@code ExprSign}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSign(dimensionsParser.ExprSignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSign}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSign(dimensionsParser.ExprSignContext ctx);
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
	 * Enter a parse tree produced by {@link dimensionsParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(dimensionsParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dimensionsParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(dimensionsParser.TypeContext ctx);
}