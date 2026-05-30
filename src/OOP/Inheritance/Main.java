package OOP.Inheritance;

public class Main{
    public static void main(String[] args){

        Plant plant = new Plant();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("PLANT");
        System.out.println("isAlive : "+plant.isAlive);
        System.out.println("canPhotosynthesis : "+plant.canPhotosynthesize);
        System.out.println("isGreen : "+plant.isGreen);
        System.out.println("isBig : "+plant.isBig);

        System.out.println("\nDOG");
        System.out.println("isAlive : "+dog.isAlive);
        System.out.println("canPhotosynthesis : "+dog.canPhotosynthesize);
        System.out.println("isGreen : "+dog.isGreen);
        System.out.println("isBig : "+dog.isBig);
        dog.sound();

        System.out.println("\nCAT");
        System.out.println("isAlive : "+cat.isAlive);
        System.out.println("canPhotosynthesis : "+cat.canPhotosynthesize);
        System.out.println("isGreen : "+cat.isGreen);
        System.out.println("isBig : "+cat.isBig);
        cat.sound();
    }
}