package chapter10;

public class Zoo {

    public static void main (String[] args){

        Dog kelly = new Dog();
        kelly.fetch();
        kelly.makeSound();
        feed(kelly);

        Animal kebab = new Dog();
        kebab.makeSound();


        kebab = new Cat();
        kebab.makeSound();
        //kebab is type Animal, which has been polymorphed into Cat, so it has no access to Cat's methods
        //This has a workaround with "casting", which doesn't change the type, but it does for this instance
        ((Cat) kebab).scratch();
        feed(kebab);
    }

    public static void feed (Animal animal){

        if(animal instanceof Dog){
            System.out.println("I love dog food");
        } else if(animal instanceof Cat){
            System.out.println("I love cat food");
        }
    }
}
