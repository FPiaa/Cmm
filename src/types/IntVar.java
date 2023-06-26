package types;

public class IntVar extends Variable<Integer> {

    public IntVar(String name, int data) {
        this.name = name;
        this.type = Types.INT;
        this.data = data;
    }

}
