package symbol_table;

public class UndefinedSymbolException extends Exception{
   public UndefinedSymbolException(String message) {
       super(message);
   }
}
