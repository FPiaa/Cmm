package cmmPasses;

import cmm.CmmBaseVisitor;
import cmm.CmmParser;
import runtime.*;
import symbol_table.SymbolTable;
import types.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CmmEval extends CmmBaseVisitor<RuntimeValue<?>> {
    public final Stack<SymbolTable> symbols;

    public CmmEval(SymbolTable s) {
        symbols = new Stack<>();
        symbols.push(s);
    }


    @Override
    public RuntimeValue<?> visitTyped_function(CmmParser.Typed_functionContext ctx) {
        var symbol = symbols.peek();
        var f = symbol.resolveFunctionInfallible(ctx.function_def().Id().getText());
        return visit(ctx.function_body());
    }

    @Override
    public RuntimeValue<?> visitVoid_function(CmmParser.Void_functionContext ctx) {
        var symbol = symbols.peek();
        var f = symbol.resolveFunctionInfallible(ctx.function_def().Id().getText());
        return visit(ctx.function_body());
    }

    @Override
    public RuntimeValue<?> visitFunction_body(CmmParser.Function_bodyContext ctx) {
        for (var d : ctx.var_decl()) {
            visit(d);
        }
        for (var s :
                ctx.stmt()) {
            var ret = visit(s);
            if (ret instanceof ReturnValue<?>) {
                return ((ReturnValue<?>) ret).getData();
            }
        }

        return new VoidValue();
    }

    @Override
    public RuntimeValue<?> visitIf_stmt(CmmParser.If_stmtContext ctx) {
        BoolValue condition = (BoolValue) visit(ctx.expr());
        if (condition.getData()) {
            return visit(ctx.stmt(0));
        } else {
            if (ctx.stmt().size() == 2) {
                return visit(ctx.stmt(1));
            }
        }
        return new VoidValue();
    }

    @Override
    public RuntimeValue<?> visitWhile_stmt(CmmParser.While_stmtContext ctx) {
        BoolValue condition = (BoolValue) visit(ctx.expr());
        while (condition.getData()) {
            var eval = visit(ctx.stmt());
            if (eval instanceof ReturnValue<?>) {
                return eval;
            }
            condition = (BoolValue) visit(ctx.expr());
        }

        return new VoidValue();
    }

    @Override
    public RuntimeValue<?> visitFor_stmt(CmmParser.For_stmtContext ctx) {
        if (ctx.def != null) {
            visit(ctx.def);
        }

        BoolValue condition = ctx.expr() != null ? (BoolValue) visit(ctx.expr()) : new BoolValue(true);

        while (condition.getData()) {

            var eval = visit(ctx.stmt());
            if (eval instanceof ReturnValue<?>) {
                return eval;
            }
            if (ctx.up != null) {
                visit(ctx.up);
            }
            condition = ctx.expr() != null ? (BoolValue) visit(ctx.expr()) : new BoolValue(true);
        }

        return new VoidValue();
    }

    @Override
    public RuntimeValue<?> visitReturn_stmt(CmmParser.Return_stmtContext ctx) {
        if (ctx.expr() == null) {
            return new ReturnValue<RuntimeValue<?>>(new VoidValue());
        } else {
            return new ReturnValue<RuntimeValue<?>>(visit(ctx.expr()));
        }
    }

    @Override
    public RuntimeValue<?> visitAssign_stmt(CmmParser.Assign_stmtContext ctx) {
        return visitAssign(ctx.assign());
    }

    @Override
    public RuntimeValue<?> visitAssign(CmmParser.AssignContext ctx) {
        var symbol = symbols.peek();
        var variable = symbol.resolveVarInfallible(ctx.Id().getText());
        var index = ctx.indexing() != null ? (IntValue) visit(ctx.indexing().expr()) : null;
        var value = visit(ctx.expr());
        updateVariable(variable, value, index);

        return new VoidValue();
    }

    private void updateVariable(Variable<?> variable, RuntimeValue<?> value, IntValue index) {
        switch (variable.getType()) {
            case INT_P -> {
                // array to array
                if (index == null) {
                    var v = (IntPValue) value;
                    ((IntPVar) variable).setData(v.getData());
                } else {
                    if (value instanceof IntValue) {
                        var v = (IntValue) value;
                        ((IntPVar) variable).set(index.getData(), v.getData());
                    }
                    if (value instanceof CharValue) {
                        var v = (CharValue) value;
                        ((IntPVar) variable).set(index.getData(), v.getData());
                    }
                }
            }
            case CHAR_P -> {
                if (index == null) {
                    var v = (CharPValue) value;
                    ((CharPVar) variable).setData(v.getData());
                } else {
                    if (value instanceof IntValue) {
                        var v = (IntValue) value;
                        ((CharPVar) variable).set(index.getData(), v.getData());
                    }
                    if (value instanceof CharValue) {
                        var v = (CharValue) value;
                        ((CharPVar) variable).set(index.getData(), v.getData());
                    }
                }
            }
            case CHAR -> {
                assert index == null;
                if (value instanceof IntValue) {
                    var v = (IntValue) value;
                    ((CharVar) variable).setData(v.getData());
                }
                if (value instanceof CharValue) {
                    var v = (CharValue) value;
                    ((CharVar) variable).setData(v.getData());
                }
            }
            case INT -> {
                assert index == null;
                if (value instanceof IntValue) {
                    var v = (IntValue) value;
                    ((IntVar) variable).setData(v.getData());
                }
                if (value instanceof CharValue) {
                    var v = (CharValue) value;
                    ((IntVar) variable).setData(v.getData());
                }
            }
        }
    }

    private void setupFunctionCall(Function f, List<RuntimeValue<?>> args) {
        for (int i = 0; i < args.size(); i++) {
            var v = f.args.get(i);
            var symbol = symbols.peek();
            var variable = symbol.resolveVarInfallible(v.getName());
            updateVariable(variable, args.get(i), null);
        }
    }

    public RuntimeValue<?> runFunction(Function f, List<RuntimeValue<?>> args) {
        Function clone = null;
        try {
            clone = (Function) f.clone();
        } catch (CloneNotSupportedException ignored) {
            throw new Error("Unsupported clone in function");
        }
        symbols.push(clone.variables);
        setupFunctionCall(f, args);
        var ret = visit(f.start);
        symbols.pop();
        return ret;
    }

    @Override
    public RuntimeValue<?> visitFunction_call_stmt(CmmParser.Function_call_stmtContext ctx) {
        List<RuntimeValue<?>> args = new ArrayList<>();
        var symbol = symbols.peek();
        Function f = symbol.resolveFunctionInfallible(ctx.Id().getText());
        for (var e :
                ctx.expr()) {
            args.add(visit(e));
        }
        return runFunction(f, args);
    }

    @Override
    public RuntimeValue<?> visitBlock_stmt(CmmParser.Block_stmtContext ctx) {
        for (var s :
                ctx.stmt()) {
            var eval = visit(s);
            if (eval instanceof ReturnValue<?>) {
                return eval;
            }
        }
        return new VoidValue();
    }

    @Override
    public RuntimeValue<?> visitPrint_stmt(CmmParser.Print_stmtContext ctx) {
        var value = visit(ctx.expr());
        System.out.println(value.toString());
        return new VoidValue();
    }

    @Override
    public RuntimeValue<?> visitUnary_expr(CmmParser.Unary_exprContext ctx) {
        var expr = visit(ctx.expr());
        switch (ctx.op.getText()) {
            case "!" -> {
                var v = (BoolValue) expr;
                return new BoolValue(!v.getData());
            }
            case "-" -> {
                var v = (IntValue) expr;
                return new IntValue(-v.getData());
            }
        }
        throw new Error("Error visiting unary expr %s".formatted(ctx.getText()));
    }

    private RuntimeValue<?> runOp(RuntimeValue<?> e1, RuntimeValue<?> e2, String op) {

        switch (op) {
            case "*" -> {
                if (e1 instanceof IntValue && e2 instanceof IntValue) {
                    var t1 = (IntValue) e1;
                    var t2 = (IntValue) e2;
                    return new IntValue(t1.getData() * t2.getData());
                }
                if (e1 instanceof IntValue && e2 instanceof CharValue) {
                    var t1 = (IntValue) e1;
                    var t2 = (CharValue) e2;
                    return new IntValue(t1.getData() * t2.getData());
                }
                if (e1 instanceof CharValue && e2 instanceof IntValue) {
                    var t1 = (CharValue) e1;
                    var t2 = (IntValue) e2;
                    return new IntValue(t1.getData() * t2.getData());
                }
                if (e1 instanceof CharValue && e2 instanceof CharValue) {
                    var t1 = (CharValue) e1;
                    var t2 = (CharValue) e2;
                    return new IntValue(t1.getData() * t2.getData());
                }
            }
            case "/" -> {
                if (e1 instanceof IntValue && e2 instanceof IntValue) {
                    var t1 = (IntValue) e1;
                    var t2 = (IntValue) e2;
                    return new IntValue(t1.getData() / t2.getData());
                }
                if (e1 instanceof IntValue && e2 instanceof CharValue) {
                    var t1 = (IntValue) e1;
                    var t2 = (CharValue) e2;
                    return new IntValue(t1.getData() / t2.getData());
                }
                if (e1 instanceof CharValue && e2 instanceof IntValue) {
                    var t1 = (CharValue) e1;
                    var t2 = (IntValue) e2;
                    return new IntValue(t1.getData() / t2.getData());
                }
                if (e1 instanceof CharValue && e2 instanceof CharValue) {
                    var t1 = (CharValue) e1;
                    var t2 = (CharValue) e2;
                    return new IntValue(t1.getData() / t2.getData());
                }
            }
            case "-" -> {

                if (e1 instanceof IntValue && e2 instanceof IntValue) {
                    var t1 = (IntValue) e1;
                    var t2 = (IntValue) e2;
                    return new IntValue(t1.getData() - t2.getData());
                }
                if (e1 instanceof IntValue && e2 instanceof CharValue) {
                    var t1 = (IntValue) e1;
                    var t2 = (CharValue) e2;
                    return new IntValue(t1.getData() - t2.getData());
                }
                if (e1 instanceof CharValue && e2 instanceof IntValue) {
                    var t1 = (CharValue) e1;
                    var t2 = (IntValue) e2;
                    return new IntValue(t1.getData() - t2.getData());
                }
                if (e1 instanceof CharValue && e2 instanceof CharValue) {
                    var t1 = (CharValue) e1;
                    var t2 = (CharValue) e2;
                    return new IntValue(t1.getData() - t2.getData());
                }
            }
            case "+" -> {

                if (e1 instanceof IntValue && e2 instanceof IntValue) {
                    var t1 = (IntValue) e1;
                    var t2 = (IntValue) e2;
                    return new IntValue(t1.getData() + t2.getData());
                }
                if (e1 instanceof IntValue && e2 instanceof CharValue) {
                    var t1 = (IntValue) e1;
                    var t2 = (CharValue) e2;
                    return new IntValue(t1.getData() + t2.getData());
                }
                if (e1 instanceof CharValue && e2 instanceof IntValue) {
                    var t1 = (CharValue) e1;
                    var t2 = (IntValue) e2;
                    return new IntValue(t1.getData() + t2.getData());
                }
                if (e1 instanceof CharValue && e2 instanceof CharValue) {
                    var t1 = (CharValue) e1;
                    var t2 = (CharValue) e2;
                    return new IntValue(t1.getData() + t2.getData());
                }
            }
            case "<" -> {
                if (e1 instanceof IntValue && e2 instanceof IntValue) {
                    var t1 = (IntValue) e1;
                    var t2 = (IntValue) e2;
                    return new BoolValue(t1.getData() < t2.getData());
                }
                if (e1 instanceof IntValue && e2 instanceof CharValue) {
                    var t1 = (IntValue) e1;
                    var t2 = (CharValue) e2;
                    return new BoolValue(t1.getData() < t2.getData());
                }
                if (e1 instanceof CharValue && e2 instanceof IntValue) {
                    var t1 = (CharValue) e1;
                    var t2 = (IntValue) e2;
                    return new BoolValue(t1.getData() < t2.getData());
                }
                if (e1 instanceof CharValue && e2 instanceof CharValue) {
                    var t1 = (CharValue) e1;
                    var t2 = (CharValue) e2;
                    return new BoolValue(t1.getData() < t2.getData());
                }
            }
            case "<=" -> {
                if (e1 instanceof IntValue && e2 instanceof IntValue) {
                    var t1 = (IntValue) e1;
                    var t2 = (IntValue) e2;
                    return new BoolValue(t1.getData() <= t2.getData());
                }
                if (e1 instanceof IntValue && e2 instanceof CharValue) {
                    var t1 = (IntValue) e1;
                    var t2 = (CharValue) e2;
                    return new BoolValue(t1.getData() <= t2.getData());
                }
                if (e1 instanceof CharValue && e2 instanceof IntValue) {
                    var t1 = (CharValue) e1;
                    var t2 = (IntValue) e2;
                    return new BoolValue(t1.getData() <= t2.getData());
                }
                if (e1 instanceof CharValue && e2 instanceof CharValue) {
                    var t1 = (CharValue) e1;
                    var t2 = (CharValue) e2;
                    return new BoolValue(t1.getData() <= t2.getData());
                }
            }

            case ">" -> {
                if (e1 instanceof IntValue && e2 instanceof IntValue) {
                    var t1 = (IntValue) e1;
                    var t2 = (IntValue) e2;
                    return new BoolValue(t1.getData() > t2.getData());
                }
                if (e1 instanceof IntValue && e2 instanceof CharValue) {
                    var t1 = (IntValue) e1;
                    var t2 = (CharValue) e2;
                    return new BoolValue(t1.getData() > t2.getData());
                }
                if (e1 instanceof CharValue && e2 instanceof IntValue) {
                    var t1 = (CharValue) e1;
                    var t2 = (IntValue) e2;
                    return new BoolValue(t1.getData() > t2.getData());
                }
                if (e1 instanceof CharValue && e2 instanceof CharValue) {
                    var t1 = (CharValue) e1;
                    var t2 = (CharValue) e2;
                    return new BoolValue(t1.getData() > t2.getData());
                }
            }

            case ">=" -> {
                if (e1 instanceof IntValue && e2 instanceof IntValue) {
                    var t1 = (IntValue) e1;
                    var t2 = (IntValue) e2;
                    return new BoolValue(t1.getData() >= t2.getData());
                }
                if (e1 instanceof IntValue && e2 instanceof CharValue) {
                    var t1 = (IntValue) e1;
                    var t2 = (CharValue) e2;
                    return new BoolValue(t1.getData() >= t2.getData());
                }
                if (e1 instanceof CharValue && e2 instanceof IntValue) {
                    var t1 = (CharValue) e1;
                    var t2 = (IntValue) e2;
                    return new BoolValue(t1.getData() >= t2.getData());
                }
                if (e1 instanceof CharValue && e2 instanceof CharValue) {
                    var t1 = (CharValue) e1;
                    var t2 = (CharValue) e2;
                    return new BoolValue(t1.getData() >= t2.getData());
                }
            }

            case "==" -> {
                if (e1 instanceof IntValue && e2 instanceof IntValue) {
                    var t1 = (IntValue) e1;
                    var t2 = (IntValue) e2;
                    return new BoolValue(t1.getData().equals(t2.getData()));
                }
                if (e1 instanceof IntValue && e2 instanceof CharValue) {
                    var t1 = (IntValue) e1;
                    var t2 = (CharValue) e2;
                    return new BoolValue(t1.getData().equals(Character.getNumericValue(t2.getData())));
                }
                if (e1 instanceof CharValue && e2 instanceof IntValue) {
                    var t1 = (CharValue) e1;
                    var t2 = (IntValue) e2;
                    return new BoolValue(t2.getData().equals(Character.getNumericValue(t1.getData())));
                }
                if (e1 instanceof CharValue && e2 instanceof CharValue) {
                    var t1 = (CharValue) e1;
                    var t2 = (CharValue) e2;
                    return new BoolValue(t1.getData().equals(t2.getData()));
                }
            }

            case "!=" -> {
                if (e1 instanceof IntValue && e2 instanceof IntValue) {
                    var t1 = (IntValue) e1;
                    var t2 = (IntValue) e2;
                    return new BoolValue(!t1.getData().equals(t2.getData()));
                }
                if (e1 instanceof IntValue && e2 instanceof CharValue) {
                    var t1 = (IntValue) e1;
                    var t2 = (CharValue) e2;
                    return new BoolValue(!t1.getData().equals(Character.getNumericValue(t2.getData())));
                }
                if (e1 instanceof CharValue && e2 instanceof IntValue) {
                    var t1 = (CharValue) e1;
                    var t2 = (IntValue) e2;
                    return new BoolValue(!t2.getData().equals(Character.getNumericValue(t1.getData())));
                }
                if (e1 instanceof CharValue && e2 instanceof CharValue) {
                    var t1 = (CharValue) e1;
                    var t2 = (CharValue) e2;
                    return new BoolValue(t1.getData() != t2.getData());
                }
            }
        }
        throw new Error("Invalid binary op " + op);
    }

    @Override
    public RuntimeValue<?> visitMult_expr(CmmParser.Mult_exprContext ctx) {
        var e1 = visit(ctx.expr(0));
        var e2 = visit(ctx.expr(1));
        return runOp(e1, e2, ctx.op.getText());
    }

    @Override
    public RuntimeValue<?> visitAdd_expr(CmmParser.Add_exprContext ctx) {
        var e1 = visit(ctx.expr(0));
        var e2 = visit(ctx.expr(1));
        return runOp(e1, e2, ctx.op.getText());
    }

    @Override
    public RuntimeValue<?> visitCmp_expr(CmmParser.Cmp_exprContext ctx) {
        var e1 = visit(ctx.expr(0));
        var e2 = visit(ctx.expr(1));
        return runOp(e1, e2, ctx.op.getText());
    }

    @Override
    public RuntimeValue<?> visitEq_expr(CmmParser.Eq_exprContext ctx) {
        var e1 = visit(ctx.expr(0));
        var e2 = visit(ctx.expr(1));
        return runOp(e1, e2, ctx.op.getText());
    }

    @Override
    public RuntimeValue<?> visitOr_expr(CmmParser.Or_exprContext ctx) {
        var e1 = (BoolValue) visit(ctx.expr(0));
        var e2 = (BoolValue) visit(ctx.expr(1));
        return new BoolValue(e1.getData() || e2.getData());
    }

    @Override
    public RuntimeValue<?> visitAnd_expr(CmmParser.And_exprContext ctx) {
        var e1 = (BoolValue) visit(ctx.expr(0));
        var e2 = (BoolValue) visit(ctx.expr(1));
        return new BoolValue(e1.getData() || e2.getData());
    }

    @Override
    public RuntimeValue<?> visitFunction_call_expr(CmmParser.Function_call_exprContext ctx) {
        var symbol = symbols.peek();
        Function f = symbol.resolveFunctionInfallible(ctx.Id().getText());
        List<RuntimeValue<?>> args = new ArrayList<>();
        for (var e :
                ctx.expr()) {
            args.add(visit(e));
        }

        return runFunction(f, args);
    }

    @Override
    public RuntimeValue<?> visitIndexing_expr(CmmParser.Indexing_exprContext ctx) {
        var index = (IntValue) visit(ctx.indexing().expr());
        var symbol = symbols.peek();
        var variable = symbol.resolveVarInfallible(ctx.Id().getText());
        switch (variable.getType()) {
            case INT_P -> {
                var ret = ((IntPVar) variable).getData().get(index.getData());
                return new IntValue(ret);
            }
            case CHAR_P -> {
                var ret = ((CharPVar) variable).getData().get(index.getData());
                return new CharValue(ret);
            }
        }

        throw new Error("Indexing wrong stuff");
    }

    @Override
    public RuntimeValue<?> visitId_expr(CmmParser.Id_exprContext ctx) {
        var symbol = symbols.peek();
        var variable = symbol.resolveVarInfallible(ctx.Id().getText());
        switch (variable.getType()) {
            case INT_P -> {
                return new IntPValue(((IntPVar) variable).getData());
            }
            case INT -> {
                return new IntValue(((IntVar) variable).getData());
            }
            case CHAR_P -> {
                return new CharPValue(((CharPVar) variable).getData());
            }
            case CHAR -> {
                return new CharValue(((CharVar) variable).getData());
            }
        }

        throw new Error("Invalid id type");
    }

    @Override
    public RuntimeValue<?> visitParen_expr(CmmParser.Paren_exprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public RuntimeValue<?> visitInt_expr(CmmParser.Int_exprContext ctx) {
        return new IntValue(Integer.parseInt(ctx.Intcon().getText()));
    }

    @Override
    public RuntimeValue<?> visitChar_expr(CmmParser.Char_exprContext ctx) {
        var c = ctx.Charcon().getText();
        c = c.substring(1, c.length() - 1);
        if (c.charAt(0) == '\\') {
            switch (c.charAt(1)) {
                case '\\' -> {
                    return new CharValue('\\');
                }
                case '"' -> {
                    return new CharValue('\"');
                }
                case 'b' -> {
                    return new CharValue('\b');
                }
                case 'n' -> {
                    return new CharValue('\n');
                }
                case 'r' -> {
                    return new CharValue('\r');
                }
                case 't' -> {
                    return new CharValue('\t');
                }
                case '0' -> {
                    return new CharValue('\0');
                }
            }
        }
        return new CharValue(c.charAt(0));
    }

    @Override
    public RuntimeValue<?> visitString_expr(CmmParser.String_exprContext ctx) {
        var s = ctx.Stringcon().getText();
        s = s.substring(1, s.length() - 1);
        List<Character> a = new ArrayList<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '\\') {
                i++;
                switch (s.charAt(i)) {
                    case '\\' -> a.add('\\');
                    case '"' -> a.add('\"');
                    case 'b' -> a.add('\b');
                    case 'n' -> a.add('\n');
                    case 'r' -> a.add('\r');
                    case 't' -> a.add('\t');
                    case '0' -> a.add('\0');
                }
                continue;
            }
            a.add(s.charAt(i));
        }
        a.add('\0');

        return new CharPValue(a);
    }
}
