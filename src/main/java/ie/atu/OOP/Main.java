package ie.atu.OOP;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Dune", "Frank Herbert", 412);
        book.borrowBook();
        book.returnBook();
        try{
            book.returnBook();
        }catch(IllegalStateException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(book.getBookStatus());
    }
    }


