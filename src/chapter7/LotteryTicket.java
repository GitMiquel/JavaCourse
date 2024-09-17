package chapter7;

import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAXTICKETNUMBER = 69;
    private static final int MINTICKETNUMBER = 1;

    public static void main(String[] args){

    int[] ticket = generateNumbers();
    printTicket(ticket);

    }

    public static int[] generateNumbers(){

        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i = 0; i < LENGTH; i++){
            ticket[i] = random.nextInt(MINTICKETNUMBER,MAXTICKETNUMBER);

        }
        return ticket;
    }

    public static void printTicket(int ticket[]){
        for (int i = 0; i < LENGTH; i++) {
        System.out.print(ticket[i] + " | ");
        }
    }


}
