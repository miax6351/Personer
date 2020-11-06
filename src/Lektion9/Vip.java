package Lektion9;

import java.util.Arrays;

public class Vip extends Ansat {

    private String[] kurser;
    private String kursusnummer;

    public Vip(String navn, String institut, String[] kurser){
        super(navn, institut);
        //this.kurser = Arrays.copyOf(kurser,kurser.length);

        this.kurser = new String[kurser.length];
        for (int i = 0; i < kurser.length; i++){
            this.kurser[i] = kurser[i];
        }


    }

    @Override
    public String toString() {
        return "Ansat " + super.toString() +
                "Kurser:" + Arrays.toString(kurser) + "\n";
    }

}
