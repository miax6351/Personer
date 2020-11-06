package Lektion9;

public class Studerende extends Person {

    private String studienummer;

    public Studerende(String studienummer, String navn){
        super(navn);
        this.studienummer = studienummer;

    }

    @Override
    public String toString() {
        return super.toString() + "studienummer = " + studienummer + "\n";
    }
}
