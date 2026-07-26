package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args){

        String filepath = "src//FileHandling//Info.txt";

        try(FileWriter writer = new FileWriter(filepath,true)){
            System.out.println("File has been created or it already exists...");
            String data = """
                    Name : Pratyush Tamrakar
                    Age : 19
                    Gender : M
                    """;
            writer.write(data);
        }
        catch(FileNotFoundException e){
            System.out.println("File not found...");
        }
        catch (IOException e){
            System.out.println("IO exception ....");
        }


    }
}