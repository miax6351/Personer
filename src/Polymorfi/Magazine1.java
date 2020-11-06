package Polymorfi;

public class Magazine1 extends ReadingMatter{

    private int weeknumber;

    public Magazine1 (String title, double isbn, int weeknumber1)
    {
        super(title,isbn);
        weeknumber = weeknumber1;
    }

    public String toString()
    {
        return super.toString() + "\t" + weeknumber;
    }

    public void content()
    {
        super.content();
        System.out.println ("Weeknumber: " + weeknumber);
    }

}
