// Generated from chubix.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link chubixParser#elseCond}.
	 * @param ctx the parse tree
	 */
	void enterElseCond(chubixParser.ElseCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link chubixParser#elseCond}.
	 * @param ctx the parse tree
	 */
	void exitElseCond(chubixParser.ElseCondContext ctx);
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
	 * Enter a parse tree produced by the {@code realExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRealExpr(chubixParser.RealExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRealExpr(chubixParser.RealExprContext ctx);
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
	 * Enter a parse tree produced by the {@code comparisonExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(chubixParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonExpr}
	 * labeled alternative in {@link chubixParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(chubixParser.ComparisonExprContext ctx);
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
}