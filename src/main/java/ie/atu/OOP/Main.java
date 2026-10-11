package ie.atu.OOP;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book first = new Book("Dune","Frank Herbert",412);
        Book middle = new Book("1984","George Orwell",328);
        Book second = new Book("Clean Code", "Robert C. Martin",464);

        LibraryService service = new LibraryService();

        service.addBook(first);
        service.addBook(second);
        service.addBook(middle);

        Book found = service.findBookByTitle("Dune");

        System.out.println( "Remove Clean Code: "
                + service.removeBook("Clean Code"));
        System.out.println( "Remove Again: "
                + service.removeBook("clean Code"));
        System.out.println("Books left: "
        + service.getBookCount());
    }
    }


