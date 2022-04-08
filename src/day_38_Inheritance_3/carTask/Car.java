package day_38_Inheritance_3.carTask;

public class Car {

    public String brand, model, color;
    public int year;
    public double price,miles;

    public Car(String brand, String model, String color, int year, double price, double miles) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        this.miles = miles;
    }

    public void start(){
        System.out.println(brand+" is started now");
    }
    public void drive(){
        System.out.println(brand+" is being driven by me now");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", miles=" + miles +
                '}';
    }
}
