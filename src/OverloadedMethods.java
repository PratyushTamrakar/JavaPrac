public class OverloadedMethods {
    public static void main(String[] args){

        //normal function
        System.out.println(square(6));

        //overloaded function
        //same name diff amount of parameters
        System.out.println(add(3,7));
        System.out.println(add(3,5,8));
    }

    //normal method or function
    static int square(int num){
        return num*num;
    }

    //overloaded function
    //here basically there are different functions with same name but diff amount of parameters

    static double add(double a, double b){
        return a+b;
    }
    static double add(double a, double b, double c){
        return a+b+c;
    }

}
