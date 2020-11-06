package Lektion9;

public class Ansat extends Person {

    private String institut;

    public Ansat(String navn, String institut){
        super(navn);
        this.institut = institut;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Institut:" + institut + "\n";
    }
}
