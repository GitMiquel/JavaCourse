package chapter4;

//FOR LOOP

import java.util.Scanner;

public class Cashier {

    public static void main (String args[]){
        System.out.println("Enter the number of items you would like to scan:");
        Scanner scanner = new Scanner(System.in);
        double itemNumber = scanner.nextDouble();


        double total = 0;

        for (int i=0; i<itemNumber; i++){
            System.out.println("Enter the cost of the item: ");
            double price = scanner.nextDouble();
            total = total + price;
        }
        scanner.close();
        System.out.println("Your total is: " + total);
    }
}
