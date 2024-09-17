package chapter3;

/*
Nested IF Statement
Person needs to make 30k a year
Person needs to have been in their current job at least 2 years
 */

import java.util.Scanner;

public class LoanQualifyer {

    public static void main (String args[]){
        //Known data
        int neededSalary = 30000;
        int neededYears = 2;

        //Unknown data
        System.out.println("What is your Salary?");
        Scanner scanner = new Scanner(System.in);
        int actualSalary = scanner.nextInt();

        //Output
        if (actualSalary >= neededSalary){
            System.out.println("How many years have you worked at your current job?");
            int actualYears = scanner.nextInt();
            scanner.close();
            if(actualYears >= neededYears){
                System.out.println("Congratulations, you are elegible for a loan");
            }
            else {
                System.out.println("Sorry, you have not worked long enough at your current job to be elegible for a loan");
        }


    }
        else {
            System.out.println("Sorry, you dont earn enough to be elegible for a loan");
        }
}}
