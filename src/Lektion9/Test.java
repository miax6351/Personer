package Lektion9;

import java.util.Arrays;

public class Test {

    private static Ansat[] personoplysninger = {
            new Ansat("Lotte","DTU"),
            new Ansat("Berit","DTU"),
            new Ansat("Preben","DTU"),
            new Ansat("Julianne","DTU"),
    };

    public static void main(String[] args) {
        System.out.println("PERSON");
        Person p1 = new Person("Berit");
        System.out.println(p1);

        System.out.println("STUDERENDE");
        Studerende s1 = new Studerende("s205353","Berit");
        System.out.println(s1);

        System.out.println("ANSAT");
        Ansat a1 = new Ansat("Berit","DTU");
        System.out.println(a1);

        System.out.println("VIP");
        Vip v1 = new Vip("Berit","DTU", new String[]{"62531","02312"});
        System.out.println(v1);

        System.out.println("ARBEJDSTID");
        Tap t1 = new Tap("Berit","DTU",10);
        System.out.println(t1);

        getPersonOplysninger();



    }

    public static void getPersonOplysninger(){
        for (Ansat a : personoplysninger){
            System.out.println(a);
        }

    }


}
