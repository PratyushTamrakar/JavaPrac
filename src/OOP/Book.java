package OOP;

public class Book {

    String title;
    String author;
    float price;
    int pages;
    boolean isBorrowed;

    // Constructor
    Book(String title, String author, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }

    // overload constructor same concept as overload method
    Book(String title, String author, float price, int pages, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages = pages;
        this.isBorrowed = isBorrowed;
    }

    void borrowBook() {
        isBorrowed = true;
    }

    void returnBook() {
        isBorrowed = false;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Borrowed: " + isBorrowed);
    }
}