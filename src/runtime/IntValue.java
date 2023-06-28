package runtime;

public class IntValue extends RuntimeValue<Integer> {
    public IntValue(char c) {
        this.data = (int) c;
    }

    public IntValue(int c) {
        this.data = c;
    }

}
