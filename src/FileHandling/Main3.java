package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main3{
    public static void main(String[] args){

        String filepath= "src//FileHandling//Name.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filepath));){
            System.out.println("File has been found ....");
            String data;
            while((data = reader.readLine()) != null){
                System.out.println(data);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found....");
        }
        catch(IOException e){
            System.out.println("IO Exception ....");
        }


    }
}