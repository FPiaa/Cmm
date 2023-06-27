// Generated from /home/fidler/Estudos/UTFPR/compiladores/trabalho2/grammar/Cmm.g4 by ANTLR 4.12.0
package cmm;
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
	 * Enter a parse tree produced by the {@code global_variables}
	 * labeled alternative in {@link CmmParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_variables(CmmParser.Global_variablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code global_variables}
	 * labeled alternative in {@link CmmParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_variables(CmmParser.Global_variablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typed_prototype}
	 * labeled alternative in {@link CmmParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterTyped_prototype(CmmParser.Typed_prototypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typed_prototype}
	 * labeled alternative in {@link CmmParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitTyped_prototype(CmmParser.Typed_prototypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code void_prototype}
	 * labeled alternative in {@link CmmParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVoid_prototype(CmmParser.Void_prototypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code void_prototype}
	 * labeled alternative in {@link CmmParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVoid_prototype(CmmParser.Void_prototypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#extern}.
	 * @param ctx the parse tree
	 */
	void enterExtern(CmmParser.ExternContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#extern}.
	 * @param ctx the parse tree
	 */
	void exitExtern(CmmParser.ExternContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(CmmParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(CmmParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CmmParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CmmParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#var_param}.
	 * @param ctx the parse tree
	 */
	void enterVar_param(CmmParser.Var_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#var_param}.
	 * @param ctx the parse tree
	 */
	void exitVar_param(CmmParser.Var_paramContext ctx);
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
	 * Enter a parse tree produced by the {@code typed_function}
	 * labeled alternative in {@link CmmParser#function}.
	 * @param ctx the parse tree
	 */
	void enterTyped_function(CmmParser.Typed_functionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typed_function}
	 * labeled alternative in {@link CmmParser#function}.
	 * @param ctx the parse tree
	 */
	void exitTyped_function(CmmParser.Typed_functionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code void_function}
	 * labeled alternative in {@link CmmParser#function}.
	 * @param ctx the parse tree
	 */
	void enterVoid_function(CmmParser.Void_functionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code void_function}
	 * labeled alternative in {@link CmmParser#function}.
	 * @param ctx the parse tree
	 */
	void exitVoid_function(CmmParser.Void_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(CmmParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(CmmParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_stmt}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(CmmParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_stmt}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(CmmParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while_stmt}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(CmmParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while_stmt}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(CmmParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for_stmt}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(CmmParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for_stmt}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(CmmParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return_stmt}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(CmmParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return_stmt}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(CmmParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign_stmt}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(CmmParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign_stmt}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(CmmParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_call_stmt}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_stmt(CmmParser.Function_call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_call_stmt}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_stmt(CmmParser.Function_call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block_stmt}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterBlock_stmt(CmmParser.Block_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block_stmt}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitBlock_stmt(CmmParser.Block_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code semicolon}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(CmmParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code semicolon}
	 * labeled alternative in {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(CmmParser.SemicolonContext ctx);
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
	 * Enter a parse tree produced by {@link CmmParser#indexing}.
	 * @param ctx the parse tree
	 */
	void enterIndexing(CmmParser.IndexingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#indexing}.
	 * @param ctx the parse tree
	 */
	void exitIndexing(CmmParser.IndexingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParen_expr(CmmParser.Paren_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParen_expr(CmmParser.Paren_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt_expr(CmmParser.Int_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt_expr(CmmParser.Int_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expr(CmmParser.Add_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expr(CmmParser.Add_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId_expr(CmmParser.Id_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId_expr(CmmParser.Id_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexing_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIndexing_expr(CmmParser.Indexing_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexing_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIndexing_expr(CmmParser.Indexing_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmp_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCmp_expr(CmmParser.Cmp_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmp_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCmp_expr(CmmParser.Cmp_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult_expr(CmmParser.Mult_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult_expr(CmmParser.Mult_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expr(CmmParser.Unary_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expr(CmmParser.Unary_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString_expr(CmmParser.String_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString_expr(CmmParser.String_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(CmmParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(CmmParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr_expr(CmmParser.Or_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr_expr(CmmParser.Or_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eq_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEq_expr(CmmParser.Eq_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eq_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEq_expr(CmmParser.Eq_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_call_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_expr(CmmParser.Function_call_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_call_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_expr(CmmParser.Function_call_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterChar_expr(CmmParser.Char_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char_expr}
	 * labeled alternative in {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitChar_expr(CmmParser.Char_exprContext ctx);
}