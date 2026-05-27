package OOP;

public class Car {

    String model ;
    String color;
    Boolean isRunning= false;
    Car(String model, String color){
        this.model=model;
        this.color=color;
    }
    void run(){
        isRunning = true;
    }
    void display(){
        System.out.printf("\nThe model of car is %s and color is %s.\n",model,color);
        if(isRunning==true){
            System.out.println("The car is running......");
        }else{
            System.out.println("The car isn't running." );
        }

    }
}
