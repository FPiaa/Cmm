package types;

public class IntVar extends Variable<Integer> {

    public IntVar(String name, int data) {
        this.name = name;
        this.type = Types.INT;
        this.data = data;
    }

    public IntVar(String name) {
        this.name = name;
        this.type = Types.INT;
        this.data = null;
    }
    public void setData(int data) {
        this.data = data;
    }
    public void setData(char data) {
        this.data = (int)data;
    }

    @Override
    public Variable<Integer> copy() {
        if(data != null) {
            return new IntVar(name, data.intValue());
        }
        return new IntVar(name);
    }
}
