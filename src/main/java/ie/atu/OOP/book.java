package ie.atu.OOP;

public class Book {
    public String title ;
    public String author ;
    public int pageCount;
    public boolean available = true;

    public voidisplayDetails()
    {
        System.out.println("Book: " +title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Page Count: " + pageCount);
        System.out.println("Is book available: " + available);
    }

}
