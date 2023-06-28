// Generated from /home/fidler/Estudos/UTFPR/compiladores/trabalho2/grammar/Cmm.g4 by ANTLR 4.12.0
package cmm;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface CmmVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link CmmParser#prog}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProg(CmmParser.ProgContext ctx);

    /**
     * Visit a parse tree produced by the {@code global_variables}
     * labeled alternative in {@link CmmParser#declaration}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGlobal_variables(CmmParser.Global_variablesContext ctx);

    /**
     * Visit a parse tree produced by the {@code typed_prototype}
     * labeled alternative in {@link CmmParser#declaration}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTyped_prototype(CmmParser.Typed_prototypeContext ctx);

    /**
     * Visit a parse tree produced by the {@code void_prototype}
     * labeled alternative in {@link CmmParser#declaration}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVoid_prototype(CmmParser.Void_prototypeContext ctx);

    /**
     * Visit a parse tree produced by {@link CmmParser#extern}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExtern(CmmParser.ExternContext ctx);

    /**
     * Visit a parse tree produced by {@link CmmParser#function_def}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunction_def(CmmParser.Function_defContext ctx);

    /**
     * Visit a parse tree produced by {@link CmmParser#var}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVar(CmmParser.VarContext ctx);

    /**
     * Visit a parse tree produced by {@link CmmParser#var_param}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVar_param(CmmParser.Var_paramContext ctx);

    /**
     * Visit a parse tree produced by {@link CmmParser#var_decl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVar_decl(CmmParser.Var_declContext ctx);

    /**
     * Visit a parse tree produced by {@link CmmParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitType(CmmParser.TypeContext ctx);

    /**
     * Visit a parse tree produced by {@link CmmParser#param_types}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParam_types(CmmParser.Param_typesContext ctx);

    /**
     * Visit a parse tree produced by the {@code typed_function}
     * labeled alternative in {@link CmmParser#function}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTyped_function(CmmParser.Typed_functionContext ctx);

    /**
     * Visit a parse tree produced by the {@code void_function}
     * labeled alternative in {@link CmmParser#function}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVoid_function(CmmParser.Void_functionContext ctx);

    /**
     * Visit a parse tree produced by {@link CmmParser#function_body}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunction_body(CmmParser.Function_bodyContext ctx);

    /**
     * Visit a parse tree produced by the {@code if_stmt}
     * labeled alternative in {@link CmmParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIf_stmt(CmmParser.If_stmtContext ctx);

    /**
     * Visit a parse tree produced by the {@code while_stmt}
     * labeled alternative in {@link CmmParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWhile_stmt(CmmParser.While_stmtContext ctx);

    /**
     * Visit a parse tree produced by the {@code for_stmt}
     * labeled alternative in {@link CmmParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFor_stmt(CmmParser.For_stmtContext ctx);

    /**
     * Visit a parse tree produced by the {@code return_stmt}
     * labeled alternative in {@link CmmParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReturn_stmt(CmmParser.Return_stmtContext ctx);

    /**
     * Visit a parse tree produced by the {@code assign_stmt}
     * labeled alternative in {@link CmmParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssign_stmt(CmmParser.Assign_stmtContext ctx);

    /**
     * Visit a parse tree produced by the {@code function_call_stmt}
     * labeled alternative in {@link CmmParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunction_call_stmt(CmmParser.Function_call_stmtContext ctx);

    /**
     * Visit a parse tree produced by the {@code block_stmt}
     * labeled alternative in {@link CmmParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBlock_stmt(CmmParser.Block_stmtContext ctx);

    /**
     * Visit a parse tree produced by the {@code print_stmt}
     * labeled alternative in {@link CmmParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrint_stmt(CmmParser.Print_stmtContext ctx);

    /**
     * Visit a parse tree produced by the {@code semicolon}
     * labeled alternative in {@link CmmParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSemicolon(CmmParser.SemicolonContext ctx);

    /**
     * Visit a parse tree produced by {@link CmmParser#assign}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssign(CmmParser.AssignContext ctx);

    /**
     * Visit a parse tree produced by {@link CmmParser#indexing}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIndexing(CmmParser.IndexingContext ctx);

    /**
     * Visit a parse tree produced by the {@code paren_expr}
     * labeled alternative in {@link CmmParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParen_expr(CmmParser.Paren_exprContext ctx);

    /**
     * Visit a parse tree produced by the {@code int_expr}
     * labeled alternative in {@link CmmParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInt_expr(CmmParser.Int_exprContext ctx);

    /**
     * Visit a parse tree produced by the {@code add_expr}
     * labeled alternative in {@link CmmParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAdd_expr(CmmParser.Add_exprContext ctx);

    /**
     * Visit a parse tree produced by the {@code id_expr}
     * labeled alternative in {@link CmmParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitId_expr(CmmParser.Id_exprContext ctx);

    /**
     * Visit a parse tree produced by the {@code indexing_expr}
     * labeled alternative in {@link CmmParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIndexing_expr(CmmParser.Indexing_exprContext ctx);

    /**
     * Visit a parse tree produced by the {@code cmp_expr}
     * labeled alternative in {@link CmmParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCmp_expr(CmmParser.Cmp_exprContext ctx);

    /**
     * Visit a parse tree produced by the {@code mult_expr}
     * labeled alternative in {@link CmmParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMult_expr(CmmParser.Mult_exprContext ctx);

    /**
     * Visit a parse tree produced by the {@code unary_expr}
     * labeled alternative in {@link CmmParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnary_expr(CmmParser.Unary_exprContext ctx);

    /**
     * Visit a parse tree produced by the {@code string_expr}
     * labeled alternative in {@link CmmParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitString_expr(CmmParser.String_exprContext ctx);

    /**
     * Visit a parse tree produced by the {@code and_expr}
     * labeled alternative in {@link CmmParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAnd_expr(CmmParser.And_exprContext ctx);

    /**
     * Visit a parse tree produced by the {@code or_expr}
     * labeled alternative in {@link CmmParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOr_expr(CmmParser.Or_exprContext ctx);

    /**
     * Visit a parse tree produced by the {@code eq_expr}
     * labeled alternative in {@link CmmParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEq_expr(CmmParser.Eq_exprContext ctx);

    /**
     * Visit a parse tree produced by the {@code function_call_expr}
     * labeled alternative in {@link CmmParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunction_call_expr(CmmParser.Function_call_exprContext ctx);

    /**
     * Visit a parse tree produced by the {@code char_expr}
     * labeled alternative in {@link CmmParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitChar_expr(CmmParser.Char_exprContext ctx);
}