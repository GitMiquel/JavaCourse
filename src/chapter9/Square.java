package chapter9;

//We need to override a method from the Rectangle Superclass (calculatePerimeter)

public class Square extends Rectangle{

    @Override
    public double calculatePerimeter(){
        System.out.println("Im the overriden method");
        return sides * length;
    }

}
