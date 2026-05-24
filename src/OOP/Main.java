package OOP;

public class Main {
    public static void main(String[] args) {

        Book bk = new Book("Harry Potter", "JK Rowling", false);

        bk.borrowBook();

        bk.displayInfo();

        bk.returnBook();

        bk.displayInfo();
    }
}