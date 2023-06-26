package types;


public class CharVar extends Variable<Character>{

    public CharVar(String name, char data) {
        this.name = name;
        this.type = Types.CHAR;
        this.data = data;
    }


}

