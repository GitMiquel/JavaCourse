package chapter4;

//FOR LOOP

import java.util.Scanner;

public class LetterSearch {
    public static void main(String args[]) {

        //Get Text
        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search for letter A
        for(int i=0; i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
        if (letterFound){
            System.out.println("The letter A has been found");
        } else {
            System.out.println("The letter A has not been found");
        }


    }
}
