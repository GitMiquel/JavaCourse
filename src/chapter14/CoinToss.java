package chapter14;

import java.util.*;

public class CoinToss{
    static Random random = new Random();
    private static final Player player1 = new Player("Miquel");
    private static final Player player2 = new Player("Kasia");
    private static final Coin coin = new Coin();
    private static Player starter;
    private static Player nonStarter;

    public static void main(String[] args){

       //Randomly assign a starting player
        startingPlayer();
        //Ask starting player their guess
        starter.askGuess(starter);
        //Map their, and their opponent's choice
        assignPlayerGuess();
        //Flip the coin
        coin.Flip();
        //Check which player won and let them know
        checkWinner(coin.getTopSide());
    }

    public static void startingPlayer(){
        if (random.nextInt(6) >= 4){
            starter = player1;
            nonStarter = player2;
        } else {
            starter  = player2;
            nonStarter = player1;
        }
    }

    public static void assignPlayerGuess(){
        if(Objects.equals(starter.getGuess(), "Heads")){
            nonStarter.setGuess("Tails");
        } else {
            nonStarter.setGuess("Heads");
        }
    }

    public static void checkWinner(String topside){
        if(Objects.equals(topside, starter.getGuess())){
            System.out.println("Congratulations " + starter.getName() + ". You are the winner!");
        } else {
            System.out.println("Congratulations " + nonStarter.getName() + ". You are the winner!");
        }
    }


}
