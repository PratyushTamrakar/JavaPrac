import java.util.Random;
import java.util.Scanner;

public class RandomUse {
    public static void main(String[] args) {

        System.out.println("\n\nHello. Welcome to the random number generator game.");
        System.out.println("To Win: You must have 2 same integers and the boolean must be true");

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        while (true) {

            int n1 = r.nextInt(11);
            System.out.println("\n1st integer : " + n1);

            int n2 = r.nextInt(11);
            System.out.println("2nd integer : " + n2);

            boolean n3 = r.nextBoolean();
            System.out.println("Boolean : " + n3);

            boolean result = (n1 == n2) && n3;

            if (result) {
                System.out.println("You have wonnn !!! 🏆🏆🎊🎊");
            } else {
                System.out.print("You have lost. Want to try again (Yes/No)? ");

                String a = sc.nextLine();

                if (!a.equalsIgnoreCase("yes")) {
                    System.out.println("Thanks for playing!");
                    break;
                }
            }
        }

        sc.close();
    }
}