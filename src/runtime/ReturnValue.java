package runtime;

public class ReturnValue<T extends RuntimeValue<?>> extends RuntimeValue<T> {
    public ReturnValue(T data) {
        this.data = data;
    }

}
