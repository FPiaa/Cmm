package symbol_table;

import exceptions.SymbolRedefinedException;
import exceptions.UndefinedSymbolException;
import types.Function;
import types.Variable;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    public final SymbolTable parent;
    public final Map<Variable, Variable> variables = new HashMap<>();
    public final Map<Function, Function> functions = new HashMap<>();
    public SymbolTable(SymbolTable parent) {
        this.parent = parent;
    }
    public void addVar(Variable variable, String scope) throws SymbolRedefinedException {
        if (variables.get(variable) != null) {
            throw new SymbolRedefinedException("Variable %s already defined in Function %s".formatted(variable.toString(), scope));
        }

        variables.put(variable, variable);
    }

    public boolean resolveVar(Variable v, String scope) throws UndefinedSymbolException {
        if(variables.get(v) == null){
            if(parent == null) {
                throw new UndefinedSymbolException("Variable %s not defined".formatted(v.toString()));
            }
            else {
                return parent.resolveVar(v, scope);
            }
        }
        return true;
    }

    public Variable<?> getVar(Variable<?> v) {
        return variables.get(v);
    }

//    public Variable<?> getVar(String v) {
//        return variables.get(Variable.dummy(v));
//    }
    public void addFunction(Function f) throws SymbolRedefinedException{
        Function fun = functions.get(f);
        if(fun != null && fun.isExtern) {

            throw new SymbolRedefinedException("Function %s was already defined before");
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
