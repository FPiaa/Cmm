package types;

import java.util.ArrayList;
import java.util.List;

public class IntPVar extends Variable<List<Integer>>{

    public IntPVar(String name, int size) {
        this.name = name;
        this.type = Types.INT_P;
        this.data = new ArrayList<>(size);
    }

    public Integer index(int pos) {
        assert pos < data.size();
        return data.get(pos);
    }

    public void set(int pos, int value) {
        assert pos<data.size();
        this.data.set(pos, value);
    }

    public void set(int pos, char value) {
        assert pos<data.size();
        this.data.set(pos, (int)value);
    }
}


