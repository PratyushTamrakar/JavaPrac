package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main2{
    public static void main(String[] args){

        String filepath = "src//FileHandling//Info.txt";

        try(FileReader reader= new FileReader(filepath)){
            System.out.println("File exists.... : \n");
            int data = reader.read();
            while(data != -1){
                System.out.print((char)data);
                data = reader.read();
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found ....");
        }
        catch(IOException e){
            System.out.println("IO Exception ....");
        }

    }
}