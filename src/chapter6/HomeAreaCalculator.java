package chapter6;

/*
Write a class that calls tha creates instances of the rectangle class to calculate
the total area of two rooms in a house.
 */

public class HomeAreaCalculator {

    public static void main (String args[]){

        /********************
         * RECTANGLE 1
         ********************/

        //Create instance of the rectangle class
        Rectangle room1 = new Rectangle();
        room1.setLength(25);
        room1.setWidth(50);

        double areaOfRoom1 = room1.areaCalculator();


        /********************
         * RECTANGLE 2
         ********************/

        //Create instance of the rectangle class
        Rectangle room2 = new Rectangle(30, 75);

        double areaOfRoom2 = room2.areaCalculator();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("The total area of both rooms is " + totalArea);

    }
}
