package Ejendomsvurdering;

public class Vurdering {

    public static void main(String[] args){
        Ejendom k29 =new Ejendom(new Bygning(200, 8000), new Grund(800, 500, 400000));
        Ejendom a11 =new Ejendom(new Bygning( 70, 4000), new Grund(700, 30, 24000));

        System.out.println(k29.vurdering());
        System.out.println(a11.vurdering());

        Ejendom[] ejendomme = { k29, a11 };
        System.out.println(vurdering(ejendomme));

        Grund g = new Grund(800,500,400000);
        System.out.println(g.vurdering());

        ForurenetGrund f1 = new ForurenetGrund(800, 500, 400000,300);
        System.out.println(f1.vurdering());
        f1.setFradrag(500);
        System.out.println(f1.vurdering());

    }



    static int vurdering(Ejendom[] ejd){
        int SUM = 0;
        for (Ejendom e : ejd){
            SUM = SUM + e.vurdering();
        }
        return SUM;
    }


}
