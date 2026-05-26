package OOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        choose();

    }

    public static void choose(){
        Scanner sc = new Scanner(System.in);

        System.out.println("1)Book ");
        System.out.print("Enter the program u what to run : ");
        int num = sc.nextInt();
        System.out.println();

        switch(num){
            case 1 -> classBook();
            case 2 -> Studentinfo();
            default -> System.out.println("invalid number");
        }
    }
    public static void classBook(){
        Book bk1 = new Book("Harry Potter", "JK Rowling", false);
        Book bk2 = new Book("Lord of the mysteries","Cuttlefish that loves diving",true);

        System.out.println("<!------ Welcome to the book class ------!> \n");

        bk2.displayInfo();
        System.out.println();
        bk1.borrowBook();
        bk1.displayInfo();

    }
    public static void Studentinfo(){
        System.out.println("This is the students info..");
    }
}