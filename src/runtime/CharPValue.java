package runtime;

import java.util.List;

public class CharPValue extends RuntimeValue<List<Character>> {
    public CharPValue(List<Character> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        var s = new StringBuilder();
        for (Character c :
                data) {
            s.append(c);
        }
        return s.toString();
    }
}
