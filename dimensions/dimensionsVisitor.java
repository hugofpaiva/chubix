// Generated from dimensions.g4 by ANTLR 4.8

    import java.util.Map;
    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link dimensionsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface dimensionsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link dimensionsParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(dimensionsParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimensionsParser#statList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatList(dimensionsParser.StatListContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimensionsParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(dimensionsParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimitiveDim}
	 * labeled alternative in {@link dimensionsParser#dim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDim(dimensionsParser.PrimitiveDimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelativeDim}
	 * labeled alternative in {@link dimensionsParser#dim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativeDim(dimensionsParser.RelativeDimContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimensionsParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(dimensionsParser.UnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUnn}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnn(dimensionsParser.ExprUnnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDouble}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDouble(dimensionsParser.ExprDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSumMin}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSumMin(dimensionsParser.ExprSumMinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDiv(dimensionsParser.ExprMultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSign}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSign(dimensionsParser.ExprSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPower}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPower(dimensionsParser.ExprPowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link dimensionsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprID(dimensionsParser.ExprIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DimPower}
	 * labeled alternative in {@link dimensionsParser#unitdim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimPower(dimensionsParser.DimPowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DimUnn}
	 * labeled alternative in {@link dimensionsParser#unitdim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimUnn(dimensionsParser.DimUnnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DimMultDiv}
	 * labeled alternative in {@link dimensionsParser#unitdim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimMultDiv(dimensionsParser.DimMultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DimID}
	 * labeled alternative in {@link dimensionsParser#unitdim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimID(dimensionsParser.DimIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link dimensionsParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(dimensionsParser.TypeContext ctx);
}