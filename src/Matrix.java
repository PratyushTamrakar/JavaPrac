
import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random= new Random();

        System.out.print("Enter the number of rows : ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns : ");
        int column = scanner.nextInt();
        System.out.print("Enter the range of numbers inside matrix (min,max) : ");
        int min = scanner.nextInt();
        int max= scanner.nextInt();

        System.out.println("Min: "+min +" ,"+"Max :"+ max);

        scanner.close();


        System.out.println();
        System.out.print("      ");
        for(int i = 0; i < column; i++) {
            System.out.printf("C%-4d", i);
        }
        System.out.println();
        for(int i = 0; i < column; i++) {
            System.out.print("------");
        }
        System.out.println();
        for(int j=0;j<rows;j++){
            System.out.printf("R%-2d",j);
            System.out.print("|");
            for(int i=0;i<column;i++){
                int ran = random.nextInt(min,max);
                System.out.printf("%4d ",ran);
            }
            System.out.print("  |");
            System.out.println();
        }
        System.out.println();
    }
}
