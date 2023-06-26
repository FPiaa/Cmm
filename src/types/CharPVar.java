package types;

import java.util.ArrayList;

public class CharPVar extends Variable{
    private final ArrayList<Character> data;

    public CharPVar(String name, int size) {
        super(name, "char*");
        this.data = new ArrayList<>(size);
    }

    public Character index(int pos) {
        assert pos < data.size();
        return data.get(pos);
    }

    public void update(int pos, char value) {
        assert pos<data.size();
        this.data.set(pos, value);
    }
}
