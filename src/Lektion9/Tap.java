package Lektion9;

public class Tap extends Ansat {

    private int arbejdstid;

    public Tap(String navn, String institut, int arbejdstid){
        super(navn,institut);
        this.arbejdstid = arbejdstid;
    }

    @Override
    public String toString() {
        return super.toString() + "arbejdstid:" + arbejdstid +
                "t" + "\n";
    }
}
