package day_38_Inheritance_3.carTask;

public class Toyota extends Car {

    public Toyota( String model, String color, int year, double price, double miles) {
        super("Toyota", model, color, year, price, miles);
    }

    public void reliable() {
        System.out.println(brand+" is reliable");
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", miles=" + miles +
                '}';
    }
}
