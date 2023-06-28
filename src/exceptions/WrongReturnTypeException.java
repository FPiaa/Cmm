package exceptions;

public class WrongReturnTypeException extends Exception {
    public WrongReturnTypeException(String error) {
        super(error);
    }
}
