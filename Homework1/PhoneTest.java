package Homework1;

public class PhoneTest {
    public static void main(String[] args) {


        Phone allParameter = new Phone(2323232,"Nokia",4.2);

        System.out.println("Phone model: " + allParameter.model +  " Phone number: " + allParameter.number + " Phone weight is: " + allParameter.weight);



        Phone phone22 = new Phone();
        phone22.setReceiveCall("Call : Omen");
        System.out.println(phone22.getReceiveCall());

        Phone phone23 = new Phone();
        phone23.setGetNumberCall(+371235624);
        System.out.println(phone23.getGetNumberCall());





    }


}
