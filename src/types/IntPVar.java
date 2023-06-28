package types;

import java.util.ArrayList;
import java.util.List;

public class IntPVar extends Variable<List<Integer>>{

    private int capacity;
    public IntPVar(String name, int size) {
        this.name = name;
        this.type = Types.INT_P;
        capacity = size;
        this.data = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.data.add(0);
        }
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

    @Override
    public void setData(List<Integer> data) {
        this.data = data;
        while(this.data.size() < capacity) {
            this.data.add(0);
        }
    }

    @Override
    public Variable<List<Integer>> copy() {
        return this;
    }
}


