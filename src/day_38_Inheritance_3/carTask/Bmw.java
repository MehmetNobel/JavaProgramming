package day_38_Inheritance_3.carTask;

public class Bmw extends Car{

    public Bmw( String model, String color, int year, double price, double miles) {
        super("Bmw", model, color, year, price, miles);
    }

    public void breaksDown(){
        System.out.println(brand+" is broken down");
    }

    public void racing(){
        System.out.println(brand+" is racing down");
    }


   public String toString(){
       return "Bmw{" +
               "brand='" + brand + '\'' +
               ", model='" + model + '\'' +
               ", color='" + color + '\'' +
               ", year=" + year +
               ", price=" + price +
               ", miles=" + miles +
               '}';
   }

}
