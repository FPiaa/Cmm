package exceptions;

public class SymbolRedefinedException extends Exception{
    public SymbolRedefinedException(String error) {
        super (error);
    }
}
