package runtime;

public class CharValue extends RuntimeValue<Character>{
    public CharValue (char c) {
        this.data = c;
    }

    public CharValue (int c) {
        this.data = (char) c;
    }

}
