package chapter11;

public interface Animal {

   String makeSound();

    default void eat(){
        System.out.println("Eat some food");
    }


}
