// Generated from /home/fidler/Estudos/UTFPR/compiladores/trabalho2/grammar/Cmm.g4 by ANTLR 4.12.0
package cmm;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CmmParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CmmParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code global_variables}
	 * labeled alternative in {@link CmmParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_variables(CmmParser.Global_variablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typed_prototype}
	 * labeled alternative in {@link CmmParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyped_prototype(CmmParser.Typed_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code void_prototype}
	 * labeled alternative in {@link CmmParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid_prototype(CmmParser.Void_prototypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(CmmParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(CmmParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CmmParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#param_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_types(CmmParser.Param_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CmmParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(CmmParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(CmmParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#indexing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexing(CmmParser.IndexingContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CmmParser.ExprContext ctx);
}