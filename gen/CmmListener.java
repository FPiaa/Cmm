// Generated from /home/fidler/Estudos/UTFPR/compiladores/trabalho2/grammar/Cmm.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CmmParser}.
 */
public interface CmmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CmmParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CmmParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CmmParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CmmParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CmmParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(CmmParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(CmmParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CmmParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CmmParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#param_types}.
	 * @param ctx the parse tree
	 */
	void enterParam_types(CmmParser.Param_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#param_types}.
	 * @param ctx the parse tree
	 */
	void exitParam_types(CmmParser.Param_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CmmParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CmmParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CmmParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CmmParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CmmParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CmmParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CmmParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CmmParser.ExprContext ctx);
}