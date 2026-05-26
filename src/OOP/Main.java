package OOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        choose();

    }

    public static void choose(){
        Scanner sc = new Scanner(System.in);

        System.out.println("1)Book 2)StudentInfo 3)Caulculator");
        System.out.print("Enter the object u want to run : ");
        int num = sc.nextInt();
        System.out.println();

        switch(num){
            case 1 -> classBook();
            case 2 -> Studentinfo();
            case 3 -> Calculator();
            default -> System.out.println("Invalid number");
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
        StudentInfo sd1= new StudentInfo("Pratyush Tamrakar",19,58.68);
        StudentInfo sd2 = new StudentInfo("Nishan Subedi",20,78.28);

        System.out.println("<!------ Welcome to the StudentInfo class ------!>\n");

        sd1.display();
        sd2.display();

    }
    public static void Calculator(){

        Calculator numbs1 = new Calculator(100,20);
        Calculator numbs2 = new Calculator(40,2);

        System.out.println("<!------ Calculator ------!> \n");

        numbs2.add(5,2);
        numbs2.add(4,6);

        numbs2.subtract(5,2);
        numbs2.subtract(4,6);

        numbs2.multiply(5,2);
        numbs2.multiply(4,6);

        numbs2.divide(5,2);
        numbs2.divide(4,6);
    }
}