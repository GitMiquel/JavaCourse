package chapter10;

public class Apple extends Fruit{

    public static void main (String[] args) {
        Apple apple = new Apple();
        apple.setCalories(20);

    }

    public static boolean removeSeeds(Fruit apple){
        boolean seedsRemoved = true;
        System.out.println("Seeds are removed");
        return seedsRemoved;
    }

    public static void makeJuice(Apple apple){
        if (removeSeeds(apple)) {
            System.out.println("Apple juice is made");
        }
    }
}
