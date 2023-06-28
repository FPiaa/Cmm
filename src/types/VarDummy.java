package types;

public class VarDummy extends Variable<Void> {
    public VarDummy(String name) {
        this.name = name;
        type = Types.VOID;
        data = null;
    }
}
