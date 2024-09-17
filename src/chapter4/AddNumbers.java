package chapter4;

// DO WHILE LOOP

import java.util.Scanner;

public class AddNumbers {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        boolean again;

        do {
            System.out.println("Enter a number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter a number");
            double num2 = scanner.nextDouble();

            double total = num1 + num2;
            System.out.println("The total is " + total);

            System.out.println("Would you like to do it again? True or False");
            again = scanner.nextBoolean();

        } while (again);

    scanner.close();
    }
}
