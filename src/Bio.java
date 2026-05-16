
import java.util.Scanner;

public class Bio{
    public static void main(String[] args){

        String name;
        int age;
        String college;
        String gender;
        boolean isStudent;
        String course;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");             //Pratyush Tamrakar
        name= sc.nextLine();
        System.out.print("Enter your age : ");              //19
        age= sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your college : ");          //kfa college
        college= sc.nextLine();
        System.out.print("Enter your gender : ");           //male
        gender= sc.nextLine();
        System.out.print("Enter your isStudent : ");        //true
        isStudent= sc.nextBoolean();
        sc.nextLine();
        System.out.print("Enter your course : ");           //bca
        course= sc.nextLine();

        System.out.print("\nHello, I am "+name+".");
        System.out.print(" I am "+age+"years old.");
        System.out.print(" i m currently studying in "+college+".");
        System.out.print(" I am studying "+course+".");
        System.out.print(" I am a "+gender+".");

        if(isStudent){
            System.out.print(" I am a student right now.");
        }else{
            System.out.println(" I am not a student right now.");
        }

       sc.close();
    }
}