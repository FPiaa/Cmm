package types;

import java.util.ArrayList;
import java.util.List;

public class CharPVar extends Variable<List<Character>> {
    private final int capacity;

    public CharPVar(String name, int size) {
        this.name = name;
        this.type = Types.CHAR_P;
        this.data = new ArrayList<>(size);
        capacity = size;
        for (int i = 0; i < size; i++) {
            this.data.add('\0');
        }
    }

    public Character index(int pos) {
        assert pos < capacity;
        return data.get(pos);
    }

    public void set(int pos, char value) {
        assert pos < capacity;
        this.data.set(pos, value);
    }

    public void set(int pos, int value) {
        assert pos < capacity;
        this.data.set(pos, (char) value);
    }

    @Override
    public void setData(List<Character> data) {
        this.data = data;
        if (this.data.size() > capacity) {
            return;
        }

        for (int i = this.data.size(); i < capacity; i++) {
            this.data.add('\0');
        }
    }

    @Override
    public Variable<List<Character>> copy() {
        return this;
    }
}
