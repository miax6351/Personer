package Polymorfi;

public class ReadingMatter {

    private String title;
    private double isbn;

    public ReadingMatter(String title, double isbn){
        this.title = title;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return title + "\t" + isbn;
    }

    public void content(){
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + isbn);
    }
}
