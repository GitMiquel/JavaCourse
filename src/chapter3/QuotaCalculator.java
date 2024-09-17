package chapter3;

/*
IF ELSE Statement
All salespeople have a quota of 10 sales
For those who meet it, they get a congratulatory message
For those who dont meet it, they get notified how many sales they were short by
 */

import java.util.Scanner;

public class QuotaCalculator {
    public static void main (String args[]){

        //Initialize known values
        int quota = 10;

        //Get unknown values
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for quota - Output
        if (sales >= quota){
            System.out.print("Congrats, you made your quota");
        }
        else {
            int missed = quota - sales;
            System.out.print("You missed your quota by " + missed + " sales.");
        }
    }
}
