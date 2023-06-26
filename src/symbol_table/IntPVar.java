package symbol_table;

import java.util.ArrayList;

public class IntPVar extends Variable{
    private final ArrayList<Integer> data;

    public IntPVar(String name, int size) {
        super(name, "int*");
        this.data = new ArrayList<>(size);
    }

    public Integer index(int pos) {
        assert pos < data.size();
        return data.get(pos);
    }

    public void update(int pos, int value) {
        assert pos<data.size();
        this.data.set(pos, value);
    }
}


