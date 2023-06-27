package types;

import java.util.ArrayList;
import java.util.List;

public class CharPVar extends Variable<List<Character>>{

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

    public void set(int pos, int value) {
        assert pos<data.size();
        this.data.set(pos, (char) value);
    }

}
