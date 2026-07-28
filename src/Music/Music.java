package Music;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Music{
    public static void main(String[] args){

        String filepath = "src//Music//misery.wav";
        File file = new File(filepath);

        try(AudioInputStream audio = AudioSystem.getAudioInputStream(file)){

            Scanner s = new Scanner(System.in);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);

            String response = "";

            while(!response.equals("q")){

                System.out.println("----------------------------------------");
                System.out.println("\nPlay(p)");
                System.out.println("Reset(r)");
                System.out.println("Pause(s)");
                System.out.println("Quit(q)");
                System.out.print("Enter your choice : ");
                response = s.next();

                switch(response.toLowerCase()){
                    case "p" -> {
                        if(clip.getFrameLength() == clip.getFramePosition()){
                            clip.setMicrosecondPosition(0);
                        }
                        clip.start();
                    }
                    case "r" -> clip.setFramePosition(0);
                    case "s" -> clip.stop();
                    case "q" -> clip.close();
                    default -> System.out.println("Invalid choice ");
                }

            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found ..");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("File type not supported ..");
        }
        catch (LineUnavailableException e) {
            System.out.println("Resources mmissing ....");
        }
        catch (IOException e) {
            System.out.println("IO exception ..");
        }

    }
}