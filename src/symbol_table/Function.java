package symbol_table;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Function {
    public final String name;
    private final SymbolTable variables;
    public final Types returnType;
    public final boolean isExtern;
    public final boolean hasPrototype;

    public Function(String name, List<Variable> locals, Types returnType, boolean isExtern, boolean hasPrototype, SymbolTable scope) throws SymbolRedefinedException {
        this.name = name;
        this.returnType = returnType;
        this.variables = new SymbolTable(scope);
        this.isExtern = isExtern;
        this.hasPrototype = hasPrototype;
        for (Variable v : locals){
            variables.addVar(v, name);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Function function)) return false;

        return Objects.equals(name, function.name);
    }

    public static Function dummy(String name) {
        try {
            return new Function(name, new ArrayList<>(), null, false,false, null);
        } catch (SymbolRedefinedException ignored) {

        }
        return null;
    }
    @Override
    public int hashCode() {
        return  name.hashCode();
    }
}