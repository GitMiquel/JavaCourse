package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main (String args[]){

        //Initialize known data


        //Obtain unknown data
        double actualSalary = getSalary();
        int actualCreditScore = getCreditScore();
        scanner.close();

        //Check for Credit qualification
        boolean qualified = isUserQualified(actualSalary, actualCreditScore);

        //Output
        notifyUser (qualified);
    }


    public static double getSalary(){
        System.out.println("What is your salary?");
        double actualSalary = scanner.nextDouble();
        return actualSalary;
    }

    public static int getCreditScore(){
        System.out.println("What is your credit score?");
        int actualCreditScore = scanner.nextInt();
        return actualCreditScore;
    }


    public static boolean isUserQualified(double actualSalary, int actualCreditScore) {
        if (actualSalary >= requiredSalary && actualCreditScore >= requiredCreditScore) {
            return true;

        } else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats you have been approved");
        } else {
            System.out.println("You have not have been approved");
        }
    }
}
