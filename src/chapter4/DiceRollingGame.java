package chapter4;

import java.util.Random;
import java.util.Scanner;

public class DiceRollingGame {
    public static void main(String args[]) {

        //Initialize known data
        int boardSpaces = 20;
        int numberOfRolls = 4;
        int start = 0;
        boolean win = false;

        Random random = new Random();
        int die = random.nextInt(6) + 1;

/*
        //Roll the dice
        for(int i=0; i<numberOfRolls; i++){
            start = start + die;
            System.out.println("You've rolled a " + die + " You are now on space " + start + " and have " + (boardSpaces - start) + " more to go");
            if(start == boardSpaces){
                win = true;
                break;
            } else {
                System.out.println("Roll again");
            }
        }



        if (win){
            System.out.println("You won!");
        } else {
            System.out.println("You lost, you are on space " + start);
        }
*/


        boolean roll = false;

        do {

            System.out.println("Want to roll? True or False");
            Scanner scanner = new Scanner(System.in);
            roll = scanner.nextBoolean();
            start = start + die;

        } while (roll);


    }
}
