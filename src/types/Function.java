package types;

import cmm.CmmParser;
import exceptions.SymbolRedefinedException;
import symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Function implements Cloneable {
    public final String name;
    public final SymbolTable variables;
    public final List<Variable<?>> args;
    public final Types returnType;
    public boolean isExtern;
    public boolean hasPrototype;
    public boolean failCompilation = false;
    public CmmParser.FunctionContext start;
    public int line;

    public Function(String name, List<Variable<?>> locals, Types returnType, boolean isExtern, boolean hasPrototype, SymbolTable scope, CmmParser.FunctionContext start, int line) {
        this.name = name;
        this.returnType = returnType;
        this.variables = new SymbolTable(scope, name);
        this.isExtern = isExtern;
        this.hasPrototype = hasPrototype;
        this.start = start;
        this.line = line;
        boolean failCompilation = false;
        args = locals;
        for (Variable<?> v : locals) {
            try {
                variables.addVar(v);
            } catch (SymbolRedefinedException e) {
                System.out.println(e);
                failCompilation = true;
            }
        }
    }

    public Function(String name, List<Variable<?>> locals, Types returnType, SymbolTable table, CmmParser.FunctionContext start, int line) {
        this.name = name;
        this.returnType = returnType;
        this.variables = table;
        this.start = start;
        this.line = line;
        isExtern = false;
        hasPrototype = false;
        args = locals;

    }

    public static Function dummy(String name) {
        try {
            return new Function(name, new ArrayList<>(), null, false, false, null, null, 0);
        } catch (Exception ignored) {

        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Function function)) return false;

        return Objects.equals(name, function.name);
    }

    public void setVariableValue(Variable<?> v) {
        variables.setVar(v);
    }

    public int getLine() {
        return line;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        SymbolTable symbolTable = new SymbolTable(variables.parent, variables.name);
        for (var v : variables.variables.keySet()) {
            symbolTable.addVarInfallible(variables.resolveVarInfallible(v).copy());
        }
        for (var v : variables.functions.keySet()) {
            symbolTable.addFunctionInfallible(variables.resolveFunctionInfallible(v));
        }
        Function f = new Function(name, args, returnType, symbolTable, start, line);
        f.isExtern = isExtern;
        f.hasPrototype = hasPrototype;
        return f;
    }
}
