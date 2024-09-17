package chapter14;

import java.util.Scanner;
import java.util.Set;

public class Player {

    private static final Set<String> AS = Set.of("heads", "tails");
    private String name;
    private String guess;

    public void askGuess(Player player) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Heads or Tails, " + player.getName() + "?");
        String guessChoice = scanner.nextLine().trim().toLowerCase();
        if (AS.contains(guessChoice)) {
            setGuess(guessChoice);
        } else {
            System.out.println("That's not a valid choice");
            askGuess(player);
        }
    }

    public Player(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }
}
