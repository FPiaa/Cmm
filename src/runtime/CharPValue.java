package runtime;

import java.util.List;

public class CharPValue extends RuntimeValue<List<Character>> {
    public CharPValue(List<Character> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        var s = new StringBuilder();
        for (int i = 0; this.data.get(i) != '\0'; i++) {
            s.append(this.data.get(i));
        }
        return s.toString();
    }
}
