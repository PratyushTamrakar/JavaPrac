
import java.util.Random;
import java.util.Scanner;

public class RandomUseGuess{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random rn= new Random();

        boolean play= true;
        while(play){
            int min=0;
            int max=0;
            System.out.print("Enter minimum number : ");
            min = sc.nextInt();
            System.out.print("Enter maximum number : ");
            max = sc.nextInt();
            System.out.println();
            int random = rn.nextInt(min,max+1);
            int guess=0;


            while(random != guess){

                System.out.print("Enter your guess : ");
                guess = sc.nextInt();

                if(random > guess){
                    System.out.println("Too low, guess again !!");
                }else if(random < guess){
                    System.out.println("Too high, guess again !!");
                }else{
                    System.out.printf("%d is the correct guess.",guess);
                }
            }
            sc.nextLine();
            System.out.println();
            System.out.println();
            System.out.print("Wanna play again ?(YES/NO) :");
            String ans = sc.nextLine().toUpperCase();

            if(!ans.equals("YES")){
                System.out.println();
                System.out.println("Thank you for playing the game. ");
                play=false;
            }
        }


        sc.close();

    }
}