package symbol_table;

import exceptions.SymbolRedefinedException;
import exceptions.UndefinedSymbolException;
import types.Function;
import types.Variable;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    public final SymbolTable parent;
    public final Map<Variable<?>, Variable<?>> variables = new HashMap<>();
    public final Map<Function, Function> functions = new HashMap<>();
    public SymbolTable(SymbolTable parent) {
        this.parent = parent;
    }
    public void addVar(Variable<?> variable) throws SymbolRedefinedException {
        Variable<?> v = variables.get(variable);
        if (v != null) {
            throw new SymbolRedefinedException("Variable %s already defined in %d:%d".formatted(v.toString(), v.getLine(), v.getColumn()));
        }

        variables.put(variable, variable);
    }

    public Variable<?> resolveVar(Variable<?> v) throws UndefinedSymbolException {
        Variable<?>  variable = variables.get(v);
        if(variable == null){
            if(parent == null) {
                throw new UndefinedSymbolException("Variable %s was not defined".formatted(v.toString()));
            }
            else {
                return parent.resolveVar(v);
            }
        }
        return variable;
    }

    public Variable<?> getVar(Variable<?> v) {
        return variables.get(v);
    }

//    public Variable<?> getVar(String v) {
//        return variables.get(Variable.dummy(v));
//    }
    public void addFunction(Function f) throws SymbolRedefinedException{
        Function fun = functions.get(f);
        if(fun != null) {
            throw new SymbolRedefinedException("Function %s was already defined before".formatted(f.name));
        }
        functions.put(f, f);
    }

    public Function getFunction(String name) {
        return functions.get(Function.dummy(name)) ;
    }

    public Function getFunction(Function f) {
        return functions.get(f);
    }

    public void setVar(Variable<?> v) {
        assert variables.get(v) != null;
        variables.put(v, v);
    }

    public boolean resolveFunction(Function f) throws UndefinedSymbolException {
        assert parent == null; // there is no support to local functions
        if (functions.get(f) == null) {
            throw new UndefinedSymbolException("Function %s was not defined".formatted(f.name));
        }
        return true;
    }
}
