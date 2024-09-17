package chapter10;

public class Banana extends Fruit{

    public static void main (String[] args) {
        Banana banana = new Banana();
        banana.setCalories(70);

    }

    public static boolean removePeel(Fruit banana){
        boolean peelRemoved = true;
        System.out.println("Peel is removed");
        return peelRemoved;
    }

    public static void makeJuice(Banana banana){
        if (removePeel(banana)) {
            System.out.println("Apple juice is made");
        }
    }

}
