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

        System.out.println("Count "+ service.getBookCount());

        Book found = service.findBookByTitle("Dune");
        if(found != null){
            System.out.println("Found: " +found.getTitle());
        }

        System.out.println("Loan Dune: "
                + service.loanBook("Dune",7));
        System.out.println("Dune Status: "+first.getStatus());

        System.out.println("Loan missing: "
        + service.loanBook("The Hobbit",7));

        System.out.println("Return Dune: "
        +service.returnBook("Dune"));
        System.out.println("Dune Status: "+ first.getStatus());

        System.out.println("Remove Clean Code: "
        +service.removeBook("Clean Code"));
        System.out.println("Final Count: "
        +service.getBookCount());

    }
    }


