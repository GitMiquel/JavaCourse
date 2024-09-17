package chapter7;

import java.util.Random;
import java.util.Scanner;

public class DayOfTheWeek {

    ;
    public static String week[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        printDate(date());

    }

    public static String date() {
        System.out.println("What day of the week would you like to know?");
        return week[(scanner.nextInt()) - 1];
    }


    public static void printDate(String date){

            System.out.print("The day of the week is " + date);
    }

}
