package Polymorfi;

public class BookClub {


    public static void main(String[] args) {

        Book1 ref0 = new Book1("Great Eskimo Vocabulary Hoax", 812345678, "Pullum, Geoffrey");

        Magazine1 ref1 = new Magazine1("ACM Crossroads", 678078979, 23);

        ref0.content();
        System.out.println();

        ref1.content();
        System.out.println();

    }
}