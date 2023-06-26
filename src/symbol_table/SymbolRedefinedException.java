package symbol_table;

public class SymbolRedefinedException extends Exception{
    public SymbolRedefinedException(String error) {
        super (error);
    }
}
