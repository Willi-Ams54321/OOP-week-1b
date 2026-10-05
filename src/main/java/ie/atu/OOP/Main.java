package ie.atu.OOP;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book first = new Book("Dune", "Frank Herbert", 412);
        Book second = new Book("Clean Code", "Robert C. Martin",464);
        LibraryService service = new LibraryService();

        service.addBook(first);
        service.addBook(second);

        /*System.out.println("Total books in Library service is " + service.getBookCount());

        for(Book book : service.getAllBook())
        {
            System.out.println(book.getTitle());
        }*/
        Book found = service.fiindBookByTitle("Dune");

       /* if(found != null) {
            System.out.println("Found: " + found.getTitle());
        }

        Book missing = service.fiindBookByTitle("The Hobbit");

        if(missing == null) {
            System.out.println("The hobbit was not found ");
        }*/
        System.out.println( "Remove Clean Code :"
                + service.removeBook("Clean Code"));
        System.out.println( "Remove Again :"
                + service.removeBook("clean Code"));
        System.out.println("Books left"
        + service.getBookCount());
    }
    }


