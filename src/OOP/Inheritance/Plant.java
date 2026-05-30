package OOP.Inheritance;

public class Plant extends Organism{

    boolean isGreen;
    Plant(){
        isGreen=true;
        canPhotosynthesize=true;
    }
    void Photosynthesis(){
        System.out.println("The plant can photosynthesize.");
    }
}
