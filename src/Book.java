//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

public class Book extends Item{
    private long isbn_number;
    private String author;

    //constructors
    public Book () {
    }

    public Book (String title, String author, long isbn_number) {
        setTitle(title);
        this.author = author;
        this.isbn_number = isbn_number;
    }

    //getters & setters
    public long getIsbn_number() {
        return isbn_number;
    }

    public String getAuthor() {
        return author;
    }

    public void setIsbn_number(long isbn_number) {
        this.isbn_number = isbn_number;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getListing() {
        return "Book Name - " + getTitle() + "\nAuthor - " + getAuthor() + "\nISBN # - " + getIsbn_number();
    }
}
