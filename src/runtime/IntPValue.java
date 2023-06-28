package runtime;

import java.util.List;

public class IntPValue extends RuntimeValue<List<Integer>> {

    public IntPValue(List<Integer> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        var s = new StringBuilder();
        s.append('[');
        for (Integer c :
                data) {
            s.append(c);
            s.append(", ");
        }
        s.append(']');
        return s.toString();
    }
}
