package day_37_Inheritance_2.phoneTasks;

public class Iphone extends Phone {


    public Iphone(String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }

    public void faceTime(Long number){
        System.out.println(brand+" "+model+" is on face time negotiation to number "+number);
    }


}
