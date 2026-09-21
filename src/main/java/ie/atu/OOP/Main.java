package ie.atu.OOP;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello World");

        Book firstBook = new Book();

        firstBook.title = "Duen";
        firstBook.author = "Frank";
        firstBook.pageCount = "412";

        System.out.println("First Book: " + firstBook.title);
        System.out.println("First Book: " + firstBook.author);
        System.out.println("First Book: " + firstBook.pageCount);

        Book secondBook = new Book();
        secondBook.title = "Star trek";
        secondBook.author = "Dave";
        secondBook.pageCount = 300;
        secondBook.available = true;

        secondBook.displayDetails();



    }
}