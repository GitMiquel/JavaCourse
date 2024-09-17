package chapter13;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args){
        createNewFile();
        numbersExceptionHandling();

    }

    public static void createNewFile(){
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch(IOException e){
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }

    }

    public static void createNewFileThrow() throws IOException{
        File file = new File("resources/nonexistent.txt");
            file.createNewFile();


    }

    public static void numbersExceptionHandling(){
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            while(fileReader.hasNext()){
                double number = fileReader.nextDouble();
                System.out.println(number);
            }
        } catch(FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        } finally{
            //for code that you still want running after an exception has been thrown
            fileReader.close();
        }
    }
}
