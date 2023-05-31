package Homework1;

public class Person {
    String fullName;
    int age;

    public void move () {
        System.out.println("Person moves: West");

    }

    public void talk () {
        System.out.println("Person says: Go to west");

    }

    public  Person () {
    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

}
