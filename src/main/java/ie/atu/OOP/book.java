package ie.atu.OOP;

import java.awt.print.Book;

public class book
{
    private String title ;
    private String author ;
    private int pageCount;


    public book(String title, String author, int pageCount){
        if(title==null || title.isBlank())
        {
            throw new IllegalArgumentException("Title is null or blank");
        }

        if(author==null || author.isBlank())
        {
            throw new IllegalArgumentException("Author is null or blank");
        }

        if(pageCount<1)
        {
            throw new IllegalArgumentException("Page Count cant be less than 1 ");
        }

        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }
}
