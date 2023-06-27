package types;


public class CharVar extends Variable<Character>{

    public CharVar(String name, char data) {
        this.name = name;
        this.type = Types.CHAR;
        this.data = data;
    }

    public CharVar(String name) {
        this.name = name;
        this.type= Types.CHAR;
        this.data = null;
    }

    public void setData(int data) {
        this.data = (char) data;
    }
    public void setData(char data) {
        this.data = data;
    }

    @Override
    public Variable<Character> copy() {
        return new CharVar(name, data.charValue());
    }
}

