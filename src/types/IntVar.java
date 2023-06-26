package types;

public class IntVar extends Variable{
    public int data;

    public IntVar(String name, int data) {
        super(name, "int");
        this.data = data;
    }

    public IntVar(String name) {
        super(name, "int");
        this.data = 0;
    }
}
