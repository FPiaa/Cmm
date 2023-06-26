package types;

import java.util.ArrayList;

public class CharPVar extends Variable<ArrayList<Character>>{

    public CharPVar(String name, int size) {
        this.name = name;
        this.type = Types.CHAR_P;
        this.data = new ArrayList<>(size);
    }

    public Character index(int pos) {
        assert pos < data.size();
        return data.get(pos);
    }

    public void set(int pos, char value) {
        assert pos<data.size();
        this.data.set(pos, value);
    }

}
