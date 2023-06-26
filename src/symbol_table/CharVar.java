package symbol_table;


public class CharVar extends Variable{
    public char data;

    public CharVar(String name, char data) {
        super(name, "char");
        this.data = data;
    }

    public CharVar(String name) {
        super(name, "char");
        this.data = 0;
    }
}

