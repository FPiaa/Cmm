package cmmPasses;
import cmm.CmmBaseVisitor;
import cmm.CmmParser;
import symbol_table.SymbolTable;
import types.Function;
import types.Types;
import types.VarDummy;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class CmmTypeChecking extends CmmBaseVisitor<Types>{
    public SymbolTable symbols;
    private Function currentFunction;
    private boolean hasReturn;
    public boolean failCompilation = false;

    private boolean compatible_with(Types t1, Types t2) {
        if(t1.equals(t2)) {
            return true;
        }
        else if(t1 == Types.INT && t2 == Types.CHAR) {
            return true;
        }
        else return t1 == Types.CHAR && t2 == Types.INT;

    }

    public CmmTypeChecking(SymbolTable symbols) {
        this.symbols = symbols;
    }

    @Override
    public Types visitTyped_function(CmmParser.Typed_functionContext ctx) {
        currentFunction = symbols.resolveFunctionInfallible(Function.dummy(ctx.function_def().Id().getText()));
        symbols = currentFunction.variables;
        hasReturn = false;
        return visit(ctx.function_body());
    }

    @Override
    public Types visitVoid_function(CmmParser.Void_functionContext ctx) {
        currentFunction = symbols.resolveFunctionInfallible(Function.dummy(ctx.function_def().Id().getText()));
        symbols = currentFunction.variables;
        hasReturn = false;
        return visit(ctx.function_body());
    }

    @Override
    public Types visitFunction_body(CmmParser.Function_bodyContext ctx) {
        for (var s: ctx.stmt()) {
           visit(s);
        }
        if (!currentFunction.returnType.equals(Types.VOID) && !hasReturn) {
            System.out.printf("Line %d: Function %s with return type %s has to have at least one 'return' statement.%n"
                    , ctx.start.getLine(), currentFunction.name, currentFunction.returnType.toString());
            failCompilation = true;
        }
        symbols = symbols.parent;
        return Types.VOID;
    }

    @Override
    public Types visitAssign_stmt(CmmParser.Assign_stmtContext ctx) {
        return visit(ctx.assign());
    }

    @Override
    public Types visitAssign(CmmParser.AssignContext ctx) {
        var variable = symbols.resolveVarInfallible(new VarDummy(ctx.Id().getText()));
        Types type = variable.getType();

        if(ctx.indexing() != null) {
            visit(ctx.indexing());
            if(variable.getType().equals(Types.INT_P)) {
                type = Types.INT;
            } else if (variable.getType().equals(Types.CHAR_P)) {
                type  = Types.CHAR;
            }
        }

        var expr_type = visit(ctx.expr());

        if(!compatible_with(type, expr_type)) {
            System.out.printf("Line %d: Left side expected type %s, but right side evaluated to %s in %s.%n",
                    ctx.start.getLine(), variable.getType().toString(), expr_type.toString(), ctx.getText());
            failCompilation = true;
        }


        return Types.VOID;
    }

    @Override
    public Types visitIf_stmt(CmmParser.If_stmtContext ctx) {
        var cond_type = visit(ctx.expr());
        if(!compatible_with(Types.BOOL, cond_type)) {
            System.out.printf("Line %d: 'If' condition has to have type BOOL, found %s in %s.%n",
                    ctx.start.getLine(), cond_type.toString(), ctx.getText());
            failCompilation = true;
        }
        visit(ctx.stmt(0));
        if(ctx.stmt().size() == 2) {
            visit(ctx.stmt(1));
        }

        return Types.VOID;
    }


    @Override
    public Types visitWhile_stmt(CmmParser.While_stmtContext ctx) {
        var cond_type = visit(ctx.expr());
        if(!compatible_with(Types.BOOL, cond_type)) {
            System.out.printf("Line %d: 'While' condition has to have type BOOL, found %s in %s.%n",
                    ctx.start.getLine(), cond_type.toString(), ctx.getText());
            failCompilation = true;
        }

        visit(ctx.stmt());

        return Types.VOID;
    }

    @Override
    public Types visitFor_stmt(CmmParser.For_stmtContext ctx) {
        if(ctx.def != null) {
            visit(ctx.def);
        }
        if (ctx.expr() != null) {
            var cond_type = visit(ctx.expr());
            if(!compatible_with(Types.BOOL, cond_type)) {
                System.out.printf("Line %d: 'For' condition has to have type BOOL, found %s in %s.%n",
                        ctx.start.getLine(), cond_type.toString(), ctx.getText());
                failCompilation = true;
            }
        }
        if(ctx.up != null) {
            visit(ctx.up);
        }

        visit(ctx.stmt());

        return Types.VOID;
    }

    @Override
    public Types visitReturn_stmt(CmmParser.Return_stmtContext ctx) {
        hasReturn = true;
        if(currentFunction.returnType == Types.VOID) {
            if(ctx.expr() != null) {
                System.out.printf("Line %d: 'return' cannot have a expression in a VOID function %s.%n",
                        ctx.start.getLine(), currentFunction.name);
                failCompilation = true;
            }
        }
        else {
            if(ctx.expr() == null) {
                System.out.printf("Line %d: 'return' cannot be empty in function %s %s.%n",
                        ctx.start.getLine(), currentFunction.returnType, currentFunction.name);
                failCompilation = true;
            }
            else {
                var ret_type = visit(ctx.expr());
                if (!compatible_with(ret_type, currentFunction.returnType)) {

                    System.out.printf("Line %d: 'return' has type %s, expected %s from function %s definition.%n",
                            ctx.start.getLine(), ret_type, currentFunction.returnType.toString(), currentFunction.name);
                    failCompilation = true;
                }
            }

        }

        return Types.VOID;
    }

    @Override
    public Types visitFunction_call_stmt(CmmParser.Function_call_stmtContext ctx) {
        List<Types> types = new ArrayList<>();
        for (var exp :
                ctx.expr()) {
            types.add(visit(exp));
        }
        var f = symbols.resolveFunctionInfallible(Function.dummy(ctx.Id().getText()));

        if(f.args.size() != types.size()) {
            System.out.printf("Line %d: calling function '%s' with %d arguments, expected %d.%n",
                    ctx.start.getLine(), f.name, types.size(), f.args.size());
            failCompilation = true;
        }
        else {
            for (int i = 0; i < types.size(); ++i) {
                if(!compatible_with(types.get(i), f.args.get(i).getType())) {
                    System.out.printf("Line %d: calling function '%s' with argument in position %d with type %s, expected %s.%n",
                            ctx.start.getLine(), f.name, i, types.get(i), f.args.get(i).getType());
                    failCompilation = true;
                }
            }
        }

        return Types.VOID;
    }

    @Override
    public Types visitBlock_stmt(CmmParser.Block_stmtContext ctx) {
        for (var s :
                ctx.stmt()) {
            visit(s);
        }
        return Types.VOID;
    }

    @Override
    public Types visitSemicolon(CmmParser.SemicolonContext ctx) {
        return Types.VOID;
    }

    @Override
    public Types visitIndexing(CmmParser.IndexingContext ctx) {
        Types index = visit(ctx.expr());
        if(!compatible_with(Types.INT, index)) {
            System.out.printf("Line %d: Array indexing expected to have type INT found %s.%n", ctx.start.getLine(), index.toString());
            failCompilation = true;
        }
        return index;
    }

    @Override
    public Types visitUnary_expr(CmmParser.Unary_exprContext ctx) {
        if (ctx.op.getText().equals("!")) {
            var type = visit(ctx.expr());
            if(!compatible_with(type, Types.BOOL)) {
                System.out.printf("Line %d: '!' can only be applied to a BOOL, found %s in %s.%n",
                        ctx.start.getLine(), type, ctx.getText());
                failCompilation = true;
            }
            return type;
        }
        if(ctx.op.getText().equals("-")) {
            var type = visit(ctx.expr());
            if(!compatible_with(type, Types.INT)) {
                System.out.printf("Line %d: unary '-' can only be applied to an INT, found %s in %s.%n",
                        ctx.start.getLine(), type, ctx.getText());
                failCompilation = true;
            }
            return type;
        }
        return Types.UNSUPPORTED;
    }

    @Override
    public Types visitMult_expr(CmmParser.Mult_exprContext ctx) {
        var t1 = visit(ctx.expr(0));
        var t2 = visit(ctx.expr(1));
        if(!compatible_with(t1, Types.INT)) {
            System.out.printf("Line %d:  Only possible to '* | /' INTs, found %s in left side %s.%n",
                    ctx.start.getLine(), t1, ctx.expr(0).getText());
            failCompilation = true;
            return t1;
        }
        if(!compatible_with(t2, Types.INT)) {
            System.out.printf("Line %d:  Only possible to '* | /' INTs, found %s in right side %s.%n",
                    ctx.start.getLine(), t2, ctx.expr(1).getText());
            failCompilation = true;
            return t2;
        }
        return Types.INT;
    }

    @Override
    public Types visitAdd_expr(CmmParser.Add_exprContext ctx) {
        var t1 = visit(ctx.expr(0));
        var t2 = visit(ctx.expr(1));
        if(!compatible_with(t1, Types.INT)) {
            System.out.printf("Line %d:  Only possible to '+ | -' INTs, found %s in left side %s.%n",
                    ctx.start.getLine(), t1, ctx.expr(0).getText());
            failCompilation = true;
            return t1;
        }
        if(!compatible_with(t2, Types.INT)) {
            System.out.printf("Line %d:  Only possible to '+ | -' INTs, found %s in right side %s.%n",
                    ctx.start.getLine(), t2, ctx.expr(1).getText());
            failCompilation = true;
            return t2;
        }
        return Types.INT;
    }

    @Override
    public Types visitCmp_expr(CmmParser.Cmp_exprContext ctx) {
        var t1 = visit(ctx.expr(0));
        var t2 = visit(ctx.expr(1));
        if(!compatible_with(t1, Types.INT)) {
            System.out.printf("Line %d:  Only possible to '< | <= | > | >=' with INTs, found %s in left side %s.%n",
                    ctx.start.getLine(), t1, ctx.expr(0).getText());
            failCompilation = true;
            return t1;
        }
        if(!compatible_with(t2, Types.INT)) {
            System.out.printf("Line %d:  Only possible to '< | <= | > | >=' with INTs, found %s in right side %s.%n",
                    ctx.start.getLine(), t2, ctx.expr(1).getText());
            failCompilation = true;
            return t2;
        }
        return Types.BOOL;
    }

    @Override
    public Types visitEq_expr(CmmParser.Eq_exprContext ctx) {
        var t1 = visit(ctx.expr(0));
        var t2 = visit(ctx.expr(1));
        if(!compatible_with(t1, Types.INT)) {
            System.out.printf("Line %d:  Only possible to '== | !=' with INTs, found %s in left side %s.%n",
                    ctx.start.getLine(), t1, ctx.expr(0).getText());
            failCompilation = true;
            return t1;
        }
        if(!compatible_with(t2, Types.INT)) {
            System.out.printf("Line %d:  Only possible to '== | !=' with INTs, found %s in right side %s.%n",
                    ctx.start.getLine(), t2, ctx.expr(1).getText());
            failCompilation = true;
            return t2;
        }
        return Types.BOOL;
    }

    @Override
    public Types visitAnd_expr(CmmParser.And_exprContext ctx) {
        var t1 = visit(ctx.expr(0));
        var t2 = visit(ctx.expr(1));
        if(!compatible_with(t1, Types.BOOL)) {
            System.out.printf("Line %d:  Only possible to '&&' with BOOLs, found %s in left side %s.%n",
                    ctx.start.getLine(), t1, ctx.expr(0).getText());
            failCompilation = true;
            return t1;
        }
        if(!compatible_with(t2, Types.BOOL)) {
            System.out.printf("Line %d:  Only possible to '&&' with BOOls, found %s in right side %s.%n",
                    ctx.start.getLine(), t2, ctx.expr(1).getText());
            failCompilation = true;
            return t2;
        }
        return Types.BOOL;
    }

    @Override
    public Types visitOr_expr(CmmParser.Or_exprContext ctx) {
        var t1 = visit(ctx.expr(0));
        var t2 = visit(ctx.expr(1));
        if(!compatible_with(t1, Types.BOOL)) {
            System.out.printf("Line %d:  Only possible to '||' with BOOLs, found %s in left side %s.%n",
                    ctx.start.getLine(), t1, ctx.expr(0).getText());
            failCompilation = true;
            return t1;
        }
        if(!compatible_with(t2, Types.BOOL)) {
            System.out.printf("Line %d:  Only possible to '||' with BOOls, found %s in right side %s.%n",
                    ctx.start.getLine(), t2, ctx.expr(1).getText());
            failCompilation = true;
            return t2;
        }
        return Types.BOOL;
    }

    @Override
    public Types visitFunction_call_expr(CmmParser.Function_call_exprContext ctx) {
        List<Types> types = new ArrayList<>();
        for (var exp :
                ctx.expr()) {
            types.add(visit(exp));
        }

        var f = symbols.resolveFunctionInfallible(Function.dummy(ctx.Id().getText()));

        if(f.args.size() != types.size()) {
            System.out.printf("Line %d: calling function '%s' with %d arguments, expected %d.%n",
                    ctx.start.getLine(), f.name, types.size(), f.args.size());
            failCompilation = true;
        }
        else {
            for (int i = 0; i < types.size(); ++i) {
                if(!compatible_with(types.get(i), f.args.get(i).getType())) {
                    System.out.printf("Line %d: calling function '%s' with argument in position %d with type %s, expected %s.%n",
                            ctx.start.getLine(), f.name, i, types.get(i), f.args.get(i).getType());
                    failCompilation = true;
                }
            }
        }

        return f.returnType;
    }

    @Override
    public Types visitIndexing_expr(CmmParser.Indexing_exprContext ctx) {
        var v = symbols.resolveVarInfallible(new VarDummy(ctx.Id().getText()));
        visit(ctx.indexing());
        if(v.getType().equals(Types.CHAR_P)) {
            return Types.CHAR;
        }
        if(v.getType().equals(Types.INT_P)) {
            return Types.INT;
        }
        return Types.UNSUPPORTED;
    }

    @Override
    public Types visitId_expr(CmmParser.Id_exprContext ctx) {
        var v = symbols.resolveVarInfallible(new VarDummy(ctx.Id().getText()));
        return v.getType();
    }

    @Override
    public Types visitParen_expr(CmmParser.Paren_exprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Types visitInt_expr(CmmParser.Int_exprContext ctx) {
        return Types.INT;
    }

    @Override
    public Types visitChar_expr(CmmParser.Char_exprContext ctx) {
        return Types.CHAR;
    }

    @Override
    public Types visitString_expr(CmmParser.String_exprContext ctx) {
        return Types.CHAR_P;
    }
}
