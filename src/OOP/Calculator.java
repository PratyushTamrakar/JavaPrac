package OOP;

public class Calculator {
    int a;
    int b;

    Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    void add(int a,int b){
        double c = a+b;
        System.out.printf("\nSum(%d+%d)= %.2f\n",a,b,c);
    }
    void subtract(int a, int b){
        double c = a-b;
        System.out.printf("\nDifference(%d-%d)= %.2f\n",a,b,c);
    }
    void multiply(int a, int b){
        double c=a*b;
        System.out.printf("\nMultiply(%d*%d)= %.2f\n",a,b,c);
    }
    void divide(int a, int b){
        double c=a/b;
        System.out.printf("Divide(%d/%d)= %.2f\n",a,b,c);
    }


}
/*
Requirements:
Create methods:
add(int a, int b)
subtract(int a, int b)
multiply(int a, int b)
divide(int a, int b)
Each method should print the result directly.
In main():
Create a Calculator object
Call all methods with sample values
Bonus:

 */