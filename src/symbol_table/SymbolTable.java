package symbol_table;

import exceptions.SymbolRedefinedException;
import exceptions.UndefinedSymbolException;
import types.Function;
import types.Variable;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    public final SymbolTable parent;
    public final String name;
    public final Map<String, Variable<?>> variables = new HashMap<>();
    public final Map<String, Function> functions = new HashMap<>();
    public SymbolTable(SymbolTable parent, String name) {
        this.name = name;
        this.parent = parent;
    }

    public void addVar(Variable<?> variable) throws SymbolRedefinedException {
        Variable<?> v = variables.get(variable.getName());
        if (v != null) {
            throw new SymbolRedefinedException("Variable %s already defined in %d:%d".formatted(v.toString(), v.getLine(), v.getColumn()));
        }

        variables.put(variable.getName(), variable);
    }

    public Variable<?> resolveVar(String v) throws UndefinedSymbolException {
        Variable<?>  variable = variables.get(v);
//        System.out.printf("Trying to resolve variable %s in scope %s%n", v.getName(), name);
        if(variable == null){
            if(parent == null) {
                throw new UndefinedSymbolException("Variable %s was not defined".formatted(v));
            }
            else {
                return parent.resolveVar(v);
            }
        }
        return variable;
    }

    public Variable<?> resolveVarInfallible(String v) {
        Variable<?>  variable = variables.get(v);
        if(variable == null){
                return parent.resolveVarInfallible(v);
        }
        return variable;
    }

    public void addFunction(Function f) throws SymbolRedefinedException{
        Function fun = functions.get(f.name);
        if(fun != null) {
            throw new SymbolRedefinedException("Function %s was already defined before in line %d.".formatted(f.name, fun.getLine()));
        }
        functions.put(f.name, f);
    }

    public void setVar(Variable<?> v) {
        assert variables.get(v.getName()) != null;
        variables.put(v.getName(), v);
    }

    public Function getFunction(String name) {
        return functions.get(name);
    }

    public Variable<?> getVar(String name) {
        return variables.get(name);
    }
    public void addVarInfallible(Variable<?> v) {
        variables.put(v.getName(), v);
    }

    public void addFunctionInfallible(Function f) {
        functions.put(f.name, f);
    }
    public Function resolveFunction(String f) throws UndefinedSymbolException {
        Function fun = functions.get(f);
        if (fun == null) {
            if(parent != null) {
                return parent.resolveFunction(f);
            }else {
                throw new UndefinedSymbolException("Function %s was not defined.".formatted(f));
            }
        }
//        System.out.printf("Function %s, resolved in global scope%n", f.name);
        return fun;
    }

    public Function resolveFunctionInfallible(String f) {
        var fun = functions.get(f);
        if(fun == null) {
            return parent.resolveFunctionInfallible(f);
        }
        return fun;
    }
}
