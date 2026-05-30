package OOP.Inheritance;

public class Dog extends Animal{
    boolean isBig ;
    Dog(){
        isBig=true;
    }
    void sound(){
        System.out.println("The Dog is barking ....");
    }
}