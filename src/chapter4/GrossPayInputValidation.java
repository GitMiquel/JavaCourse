package chapter4;

//WHILE LOOP

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main (String args[]){

        //Known Data
        int rate = 15;
        int maxHours = 40;
        int minHours = 1;


        //Unknown Data
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();


        //Validate Input
        while (hoursWorked > maxHours || hoursWorked < minHours){
            System.out.println("You can only work up to 40 hours, try again");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        double pay = hoursWorked * rate;
        System.out.println("Your pay is " + pay);
    }
}
