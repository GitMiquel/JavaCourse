package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket2 {

    private static final int LENGTH = 6;
    private static final int MAXTICKETNUMBER = 69;
    private static final int MINTICKETNUMBER = 1;

    public static void main(String[] args){

    int[] ticket = generateNumbers();
    Arrays.sort(ticket);
    printTicket(ticket);

    }

    public static int[] generateNumbers(){

        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i = 0; i < LENGTH; i++){

            int randomNumber;

            //Generate random ticket number then search for duplicates.
            do {
                randomNumber = random.nextInt(MINTICKETNUMBER,MAXTICKETNUMBER);
            } while (search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }
        return ticket;
    }


    /**
     * Does a sequential search on the array for a specific value
     * @param array Array to search through
     * @param numberToSearchFor Value to find
     * @return true if found, false if not
     */

    public static boolean search(int[] array, int numberToSearchFor){
        /*This is an enhanced loop
          It iterates through 'array' and each time it assigns the current element to value
        */

        for(int value: array){
            if (value == numberToSearchFor){
                return true;
            }
        }
        /*
        If this point was reached then the value was not found in the array
         */
        return false;
    }


    public static boolean binarySearch (int[] array, int numberToSearchFor){
            //Array must be sorted first
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);

        if (index >= 0){
            return true;
        }else {
            return false;
        }

    }

    public static void printTicket(int ticket[]){
        for (int i = 0; i < LENGTH; i++) {
        System.out.print(ticket[i] + " | ");
        }
    }


}
