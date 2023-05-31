package Homework1;

public class PersonTest {
    public static void main(String[] args) {


        Person person1 = new Person();


        person1.fullName = "Ivar";
        person1.age = 32;
        System.out.println(person1.fullName + " " + person1.age);

        person1.talk();
        person1.move();

        Person person2 = new Person("Peter" , 18);
        System.out.println(person2.fullName + " " + person2.age);

    }
}
