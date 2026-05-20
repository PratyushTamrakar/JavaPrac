import java.util.Scanner;

public class SimpleBank {

    static double balance = 1000;
    static Scanner sc = new Scanner(System.in);
    static int opt;
    static boolean quit = true;

    public static void main(String[] args){

        while(quit){

            System.out.println("*--------------------------------------------------------------------*");
            System.out.println("*--------------------------  Bank  System  --------------------------*");
            System.out.println("Options : ");
            System.out.println("1)Deposit Money    2)Withdraw Money     3)Check Balance     4)Exit");
            System.out.println("*--------------------------------------------------------------------*");
            System.out.println();

            System.out.print("Choose the number(1-4) : ");
            opt = sc.nextInt();

            System.out.println("\n*--------------------------------------------------------------------*\n");

            switch (opt){

                case 1:

                    double addedMoney = depositMoney();
                    balance += addedMoney;

                    System.out.printf("Balance : Rs.%.2f\n\n", balance);
                    break;

                case 2:

                    double withdrawnMoney = withdrawMoney();

                    if(withdrawnMoney <= balance){

                        balance -= withdrawnMoney;

                        System.out.println("Withdrawal Successful.");
                        System.out.printf("Balance : Rs.%.2f\n\n", balance);

                    } else {

                        System.out.println("Insufficient Balance.\n");
                    }

                    break;

                case 3:

                    checkBalance();
                    break;

                case 4:

                    quit = Exit(quit);

                    System.out.println("Thank you for using our bank....\n");
                    break;

                default:

                    System.out.println("Invalid input. Input number between 1 and 4. !!!!");
            }

            System.out.println("*--------------------------------------------------------------------*");
        }

        sc.close();
    }

    // Deposit money
    static double depositMoney(){

        System.out.printf("Current Balance : Rs.%.2f\n", balance);

        System.out.print("Enter amount to deposit : ");
        return sc.nextDouble();
    }

    // Withdraw money
    static double withdrawMoney(){

        System.out.printf("Current Balance : Rs.%.2f\n", balance);

        System.out.print("Enter amount to withdraw : ");
        return sc.nextDouble();
    }

    // Check balance
    static void checkBalance(){

        System.out.printf("Current Balance : Rs.%.2f\n\n", balance);
    }

    // Exit program
    static boolean Exit(boolean exit){

        return !exit;
    }
}