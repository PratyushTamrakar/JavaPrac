import java.util.Scanner;

public class SimpleBank {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int opt ;
        boolean quit=true;

        while(quit){
            System.out.println("*--------------------------------------------------------------------*");
            System.out.println("*--------------------------  Bank  System  --------------------------*");
            System.out.println("Options : ");
            System.out.println("1)Deposit Money    2)Withdraw Money     3)Check Balance     4)Exit  ");
            System.out.println("*--------------------------------------------------------------------*");
            System.out.println();
            System.out.print("Choose the number(1-4) : ");
            opt = sc.nextInt();

            switch (opt){
                case 1:
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("hello2");
                    break;
                case 3:
                    System.out.println("hello3");
                    break;
                case 4:
                    quit= Exit(quit);
                    System.out.println("\n*--------------------------------------------------------------------*");
                    System.out.println();
                    System.out.println("Thank you for using our bank....\n");
                    break;
                default:
                    System.out.println("Invalid input. Input number between 1 and 4. !!!!");
            }
            System.out.println("*--------------------------------------------------------------------*");

        }
    }

    //Deposit money
    static double depositMoney(double despositmoney){
        return despositmoney;
    };
    //Withdraw money
    static double withdrawMoney(double withdrawMoney){
        return withdrawMoney;
    }
    //Check balance
    static double checkBalance(double balance){
        return balance;
    }
    //Exit program
    static boolean Exit(boolean exit){
        return !exit;
    }
}
