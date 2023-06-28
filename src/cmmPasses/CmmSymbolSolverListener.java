package cmmPasses;

import cmm.CmmBaseListener;
import cmm.CmmParser;
import exceptions.SymbolRedefinedException;
import exceptions.UndefinedSymbolException;
import symbol_table.SymbolTable;
import types.*;

import java.util.ArrayList;
import java.util.List;

public class CmmSymbolSolverListener extends CmmBaseListener {
    public SymbolTable symbols;
    public boolean failCompilation = false;

    @Override
    public void enterProg(CmmParser.ProgContext ctx) {
        symbols = new SymbolTable(null, "Global"); // global scope has no parent
    }

    private Variable<?> createVar(String name, String type) {
        if (type.equals("int")) {
            return new IntVar(name);
        }
        if (type.equals("char")) {
            return new CharVar(name);
        }

        throw new Error("Unreachable, Invalid variable type");
    }

    private Variable<?> createVar(String name, String type, String size) {
        if (size == null) {
            return createVar(name, type);
        }

        int s = Integer.parseInt(size);

        if (type.equals("int")) {
            return new IntPVar(name, s);
        }
        if (type.equals("char")) {
            return new CharPVar(name, s);
        }

        throw new Error("Unreachable, Invalid variable type");
    }

    @Override
    public void enterGlobal_variables(CmmParser.Global_variablesContext ctx) {
        var variables = processVarDecl(ctx.var_decl());
        for (Variable<?> symbol :
                variables) {
            try {
                symbols.addVar(symbol);
            } catch (SymbolRedefinedException e) {
                System.out.println(e.getMessage());
                failCompilation = true;

            }
        }


    }

    private Types getType(String type) {
        if (type.equals("int")) {
            return Types.INT;
        }
        if (type.equals("char")) {
            return Types.CHAR;
        }
        return Types.UNSUPPORTED;
    }

    @Override
    public void enterTyped_prototype(CmmParser.Typed_prototypeContext ctx) {
        for (var fun :
                ctx.function_def()) {
            String fun_name = fun.Id().getText();
            Types return_type = getType(ctx.type().getText());

            var params = fun.param_types();
            var locals = processArgs(params);
            boolean isExtern = ctx.extern() != null;
            boolean hasPrototype = true;
            try {
                Function f = new Function(fun_name, locals, return_type, isExtern, hasPrototype, symbols, null, fun.Id().getSymbol().getLine());
                symbols.addFunction(f);
            } catch (SymbolRedefinedException e) {
                System.out.println(e.getMessage());
                failCompilation = true;
            } catch (Exception e) {
                failCompilation = true;
            }
        }
    }

    @Override
    public void enterVoid_prototype(CmmParser.Void_prototypeContext ctx) {
        for (var fun :
                ctx.function_def()) {
            String fun_name = fun.Id().getText();

            var params = fun.param_types();
            var locals = processArgs(params);

            boolean isExtern = ctx.extern() != null;
            boolean hasPrototype = true;
            try {
                Function f = new Function(fun_name, locals, Types.VOID, isExtern, hasPrototype, symbols, null, fun.Id().getSymbol().getLine());
                symbols.addFunction(f);
            } catch (SymbolRedefinedException e) {
                System.out.println(e.getMessage());
                failCompilation = true;
            } catch (Exception e) {
                failCompilation = true;
            }
        }
    }

    List<Variable<?>> processArgs(CmmParser.Param_typesContext params) {
        List<Variable<?>> locals = new ArrayList<>(5);
        for (int i = 0; i < params.type().size(); i++) {
            String var_name = params.var_param(i).Id().getText();
            String type = params.type(i).getText();
            var pointer = params.var_param(i).ArgPointer();
            String size = pointer != null ? "0" : null;
            Variable<?> v = createVar(var_name, type, size);
            v.setLine(params.var_param(i).Id().getSymbol().getLine());
            v.setColumn(params.var_param(i).Id().getSymbol().getCharPositionInLine());
            locals.add(v);
        }
        return locals;
    }

    List<Variable<?>> processVarDecl(CmmParser.Var_declContext vars) {
        List<Variable<?>> variables = new ArrayList<>(10);
        String type = vars.type().getText();
        for (var v : vars.var()) {
            String arr_size = v.Intcon() != null ? v.Intcon().getText() : null;
            String name = v.Id().getText();
            int line = v.start.getLine();
            int column = v.start.getCharPositionInLine();

            Variable<?> symbol = createVar(name, type, arr_size);
            symbol.setColumn(column);
            symbol.setLine(line);

            variables.add(symbol);

        }
        return variables;
    }

    @Override
    public void enterTyped_function(CmmParser.Typed_functionContext ctx) {
        var type = getType(ctx.type().getText());
        var name = ctx.function_def().Id().getText();
        var args = ctx.function_def().param_types();
        var locals = processArgs(args);
        Function f = symbols.getFunction(name);
        if (f != null) {
            if (type != f.returnType) {
                System.out.println(new Exception("Function %s has prototype with return type %s, found %s".formatted(f.name, f.returnType.toString(), type.toString())).getMessage());
                failCompilation = true;
            }
            if (!f.args.equals(locals)) {
                System.out.println(new Exception("Function %s has prototype with args %s, found %s".formatted(f.name, f.args.toString(), locals.toString())).getMessage());
                failCompilation = true;
                for (var v :
                        locals) {
                    f.variables.addVarInfallible(v);
                }
            }
            f.start = ctx;
            f.line = ctx.start.getLine();

        } else {
            f = new Function(name, locals, type, false, false, symbols, ctx, ctx.start.getLine());
            try {
                symbols.addFunction(f);
            } catch (SymbolRedefinedException e) {
                // should never run, this function didn't exist before
                System.out.println(e.getMessage());
                failCompilation = true;
            }
        }
        symbols = f.variables;
        failCompilation = failCompilation || f.failCompilation;
    }

    @Override
    public void enterVoid_function(CmmParser.Void_functionContext ctx) {
        var name = ctx.function_def().Id().getText();
        var args = ctx.function_def().param_types();
        var locals = processArgs(args);
        Function f = symbols.getFunction(name);
        if (f != null) {
            if (Types.VOID != f.returnType) {
                System.out.println(new Exception("Function %s has prototype with return type %s, found %s".formatted(f.name, f.returnType.toString(), Types.VOID.toString())).getMessage());
                failCompilation = true;
            }
            if (!f.args.equals(locals)) {
                System.out.println(new Exception("Function %s has prototype with args %s, found %s".formatted(f.name, f.args.toString(), locals.toString())).getMessage());
                failCompilation = true;
                for (var v :
                        locals) {
                    f.variables.addVarInfallible(v);
                }
            }
            f.start = ctx;
            f.line = ctx.start.getLine();

        } else {
            f = new Function(name, locals, Types.VOID, false, false, symbols, ctx, ctx.start.getLine());
            try {
                symbols.addFunction(f);
            } catch (SymbolRedefinedException e) {
                // should never run, this function didn't exist before
                System.out.println(e.getMessage());
                failCompilation = true;
            }
        }
        symbols = f.variables;
        failCompilation = failCompilation || f.failCompilation;
    }

    @Override
    public void enterFunction_body(CmmParser.Function_bodyContext ctx) {
        List<Variable<?>> locals = new ArrayList<>();
        for (var decl :
                ctx.var_decl()) {
            locals.addAll(processVarDecl(decl));
        }

        for (var v :
                locals) {
            try {
                symbols.addVar(v);
            } catch (SymbolRedefinedException e) {
                System.out.println(e.getMessage());
                failCompilation = true;
            }
        }
    }

    @Override
    public void exitTyped_function(CmmParser.Typed_functionContext ctx) {
        symbols = symbols.parent;
    }

    @Override
    public void exitVoid_function(CmmParser.Void_functionContext ctx) {
        symbols = symbols.parent;
    }

    @Override
    public void enterFunction_call_stmt(CmmParser.Function_call_stmtContext ctx) {
        String name = ctx.Id().getText();

        try {
            symbols.resolveFunction(name);
        } catch (UndefinedSymbolException e) {
            String message = e.getMessage();
            System.out.printf("Line %d: %s%n", ctx.start.getLine(), message);
            failCompilation = true;
        }
    }

    @Override
    public void enterFunction_call_expr(CmmParser.Function_call_exprContext ctx) {
        String name = ctx.Id().getText();

        try {
            symbols.resolveFunction(name);
        } catch (UndefinedSymbolException e) {
            String message = e.getMessage();
            System.out.printf("Line %d: %s%n", ctx.start.getLine(), message);
            failCompilation = true;
        }
    }

    @Override
    public void enterIndexing_expr(CmmParser.Indexing_exprContext ctx) {
        String name = ctx.Id().getText();

        try {
            symbols.resolveVar(name);
        } catch (UndefinedSymbolException e) {
            String message = e.getMessage();
            System.out.printf("Line %d: %s%n", ctx.start.getLine(), message);
            failCompilation = true;
        }
    }

    @Override
    public void enterId_expr(CmmParser.Id_exprContext ctx) {
        String name = ctx.Id().getText();

        try {
            symbols.resolveVar(name);
        } catch (UndefinedSymbolException e) {
            String message = e.getMessage();
            System.out.printf("Line %d: %s%n", ctx.start.getLine(), message);
            failCompilation = true;
        }
    }
}

