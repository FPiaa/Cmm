package types;

public class Variable<T> {
    protected Types type;
    protected String name;
    protected T data;
    protected int line;
    protected int column;


    public String getName() {
        return name;
    }

    public Types getType() {
        return type;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    public void setLine(int line) {
        this.line = line;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Variable<?> variable)) return false;

        return getName().equals(variable.getName());
    }

    @Override
    public String toString() {
        return "Variable{type=%s, name='%s'}".formatted(type, name);
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

}
