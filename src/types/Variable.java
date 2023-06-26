package types;

public class Variable {
    public final Types type;
    public final String name;

    public Variable(String name, String type) {
        this.name = name;
        switch (type) {
            case "int" -> this.type = Types.INT;
            case "int*" -> this.type = Types.INT_P;
            case "char" -> this.type = Types.CHAR;
            case "char*" -> this.type = Types.CHAR_P;
            default ->  this.type = Types.UNSUPPORTED;
        }
    }

    public String getName() {
        return name;
    }

    public Types getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Variable variable)) return false;

        if (getType() != variable.getType()) return false;
        return getName().equals(variable.getName());
    }

    @Override
    public String toString() {
        return "Variable{type=%s, name='%s'}".formatted(type, name);
    }
    public static Variable dummy(String name) {
        return new Variable(name, "");
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
