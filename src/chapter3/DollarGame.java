package chapter3;

/*
Objective is to make it to exactly $1
Ask the player how many coins of each type they want: pennies, nickles, dimes, quarters they want
If their coins make it up to $1, they win
If their coins come under 1$, they need to know by how many coins they're under $1
If their coins come over 1$, they need to know by how many coins they're over $1

 */

import java.util.Scanner;

public class DollarGame {

    public static void main (String args[]){
        //Known data
        int penny = 1;
        double nickle = 10;
        double dime = 20;
        double quarter = 25;
        double dollar = 100;

        //Unknown data
        System.out.println("How many pennies do you want?");
        Scanner scanner = new Scanner(System.in);
        double pennies = scanner.nextDouble();

        System.out.println("How many nickles do you want?");
        double nickles = scanner.nextDouble();
        double totalNickles = nickles * nickle;

        System.out.println("How many dimes do you want?");
        double dimes = scanner.nextDouble();
        double totalDimes = dimes * dime;

        System.out.println("How many quarters do you want?");
        double quarters = scanner.nextDouble();
        double totalQuarters = quarters * quarter;
        scanner.close();

         double total = pennies + totalNickles + totalDimes + totalQuarters;

        //Output
        if (total == dollar){
            System.out.println("Congratulations, you won!");
            }

            else if (total < dollar){
            double under = dollar - total;
            System.out.println("Sorry, you missed it by " + under + " pennies");
            }

            else {
            double over = total - dollar;
            System.out.println("Sorry, you went over by " + over + " pennies");
        }


    }
}
