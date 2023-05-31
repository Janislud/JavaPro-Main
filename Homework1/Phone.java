package Homework1;

public class Phone {
    int number;
    String model;
    double weight;

    String receiveCall;

    int getNumberCall;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone() {

    }

    public String getReceiveCall() {
        return receiveCall;
    }

   public void setReceiveCall(String receiveCall) {
        this.receiveCall = receiveCall;
   }

    public int getGetNumberCall() {
        return getNumberCall;
    }

    public void setGetNumberCall(int getNumberCall) {
        this.getNumberCall = getNumberCall;
    }
}


//public int getNumber() {
//        return getNumber();
//   }
//
//   public  void setNumber(int getNumber) {
//        this.getNumberCall = getNumber;
//   }