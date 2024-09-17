package chapter3;

/*
IF Statement
All salespeople get £1000 a week
All sales people who exceed 10 sales a week gwt a bonus of £250
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main (String args[]){

        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        //Get unknown values
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();



        //Quick detour for bonus earners
         if(sales >= quota){
         salary = salary + bonus;
        }
        // Output
        System.out.println("The employee earned £" + salary);
    }
}
