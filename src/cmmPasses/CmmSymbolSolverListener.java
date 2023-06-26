package cmmPasses;

import cmm.CmmBaseListener;
import cmm.CmmParser;
import exceptions.SymbolRedefinedException;
import symbol_table.SymbolTable;
import types.*;

import java.util.ArrayList;
import java.util.List;

public class CmmSymbolSolverListener extends CmmBaseListener {
    public SymbolTable symbols;
    public boolean failCompilation = false;

    @Override
    public void enterProg(CmmParser.ProgContext ctx) {
        symbols = new SymbolTable(null); // global scope has no parent
    }

    private Variable<?> createVar(String name, String type) {
        if (type.equals("int")) {
            return new IntVar(name);
        }
        if (type.equals("char")) {
            return new CharVar(name);
        }

        return null;
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

        return null;
    }
    @Override
    public void enterGlobal_variables(CmmParser.Global_variablesContext ctx) {
        String type = ctx.var_decl().type().getText();
        for (var v : ctx.var_decl().var()) {
            String arr_size = v.Intcon() != null ? v.Intcon().getText() : null;
            String name = v.Id().getText();
            int line = v.start.getLine();
            int column = v.start.getCharPositionInLine();

            Variable<?> symbol = createVar(name, type, arr_size);

            if (symbol != null) {
                symbol.setColumn(column);
                symbol.setLine(line);
                try {
                    symbols.addVar(symbol);
                } catch (SymbolRedefinedException e) {
                    System.out.println(e.toString());
                    failCompilation = true;
                }
            }
        }
    }

    private Types getType(String type) {
        if(type.equals("int")) {
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

            List<Variable<?>> locals = new ArrayList<>(8);
            var params = fun.param_types();
            for (int i = 0; i < params.type().size(); i++) {
                String var_name = params.Id(i).getText();
                String type = params.type(i).getText();
                var pointer = params.ArgPointer(i);
                String size = pointer != null ? "0" : null;
                Variable<?> v = createVar(var_name, type, size);
                locals.add(v);
            }
            boolean isExtern = ctx.extern() != null;
            boolean hasPrototype = true;
            try {
                Function f = new Function(fun_name, locals, return_type, isExtern, hasPrototype, symbols);
                symbols.addFunction(f);
            } catch (SymbolRedefinedException e) {
                System.out.println(e.toString());
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

            List<Variable<?>> locals = new ArrayList<>(8);
            var params = fun.param_types();
            for (int i = 0; i < params.type().size(); i++) {
                String var_name = params.Id(i).getText();
                String type = params.type(i).getText();
                var pointer = params.ArgPointer(i);
                String size = pointer != null ? "0" : null;
                Variable<?> v = createVar(var_name, type, size);
                locals.add(v);
            }
            boolean isExtern = ctx.extern() != null;
            boolean hasPrototype = true;
            try {
                Function f = new Function(fun_name, locals, Types.VOID, isExtern, hasPrototype, symbols);
                symbols.addFunction(f);
            } catch (SymbolRedefinedException e) {
                System.out.println(e.toString());
                failCompilation = true;
            } catch (Exception e) {
                failCompilation = true;
            }
        }
    }

    @Override
    public void enterFunction(CmmParser.FunctionContext ctx) {

    }
}

