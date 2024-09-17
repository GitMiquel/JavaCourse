package chapter9;

public class Person {

    private String name;
    private String gender;
    private int age;

    public Person(){
        System.out.println("I'm Person's default constructor");
    }
    public Person(String name){
        System.out.println("I'm Person's 2nd constructor that takes a String");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
