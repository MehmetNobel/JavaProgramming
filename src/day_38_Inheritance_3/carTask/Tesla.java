package day_38_Inheritance_3.carTask;

public class Tesla extends Car{

    public Tesla( String model, String color, int year, double price, double miles) {
        super("Tesla", model, color, year, price, miles);
    }

    public void autoPilot(){
        System.out.println(brand+" is now on auto pilot");
    }


public String toString(){
    return "Tesla{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", color='" + color + '\'' +
            ", year=" + year +
            ", price=" + price +
            ", miles=" + miles +
            '}';
}


}
