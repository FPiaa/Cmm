package runtime;

public abstract class RuntimeValue<T> {
    protected T data;

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
