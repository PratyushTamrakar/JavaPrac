import java.util.Scanner;

public class empSalArr{
    public static void main(String[] args){
        double[] salary = employee();
        dis_salary(salary);
        highest_salary((salary));
        avg_salary((salary));
    }

    public static double[] employee(){

        Scanner sc = new Scanner(System.in);
        double[] emp = new double[5];

        for(int i=0;i<emp.length;i++){
            System.out.printf("Enter the salary of employee[%d] : ",i+1);
            emp[i] = sc.nextDouble();
        }
        return emp;
    }

    public static void dis_salary(double emp[]){
        for(int i=0;i<emp.length;i++){
            System.out.printf("Employee[%d] : %f\n",i,emp[i]);
        }
    }

    public static void highest_salary(double emp[]){
        double highest = 0;
        for(int i=0;i<emp.length;i++){
           highest= highest<emp[i] ? emp[i]:highest;
        }
        System.out.printf("The highest salary between employee is : %.2f\n",highest);

    }
    public static void avg_salary(double emp[]){
        double sum=0;
        for(double e: emp){
            sum+=e;
        }
        double avg= sum/emp.length;
        System.out.printf("The average salary of the employees is %.2f \n",avg);
    }
}