package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main (String args[]){

        //Get letter grade
        System.out.println("What is your grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch (grade){
            case "A":
                message = "Excellent job";
            break;
            case "B":
                message = "Great job";
                break;
            case "C":
                message = "Good job";
                break;
            case "D":
                message = "Try harder";
                break;
            case "F":
                message = "Uh oh";
                break;
            default:
                message = "Error. Invalid Grade.";
                break;
        }
        System.out.println(message);
    }
}
