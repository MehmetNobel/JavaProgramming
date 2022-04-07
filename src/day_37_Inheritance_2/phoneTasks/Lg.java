package day_37_Inheritance_2.phoneTasks;

public class Lg extends Phone{

    public Lg( String model, String size, String color, double price) {
        super("Lg", model, size, color, price);
    }

    public void selfDefence(){
        System.out.println(brand+" "+model+" is performing self defence");
    }







}
