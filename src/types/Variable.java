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

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
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

    public Variable<T> copy() {
        return null;
    }

    @Override
    public int hashCode() {
        int result = getType().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getData().hashCode();
        result = 31 * result + getLine();
        result = 31 * result + getColumn();
        return result;
    }
}
