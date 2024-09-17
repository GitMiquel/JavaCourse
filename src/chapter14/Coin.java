package chapter14;
import java.util.Random;

public class Coin {

    Random random = new Random();
    public static final String headsSide = "Heads";
    public static final String tailsSide = "Tails";
    private String topSide;

    public Coin(){
    }

    public void Flip(){
        if (random.nextInt(6) >= 4){
            setTopSide(headsSide);
        } else {
            setTopSide(tailsSide);
        }
        System.out.println("The coin has landed on " + topSide);

    }

    public void setTopSide(String side) {
        this.topSide = side;
    }

    public String getTopSide() {
        return topSide;
    }










}
