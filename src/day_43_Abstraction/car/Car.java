package day_43_Abstraction.car;

public abstract class Car {

    private final String brand, model;
    public String color;
    private final int year;
    private double price;

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColor(color);
        if(year<1900)
            new RuntimeException("car year cannot be less than 1900");
        this.year = year;
        setPrice(price);
    }

    public abstract void start();

    public abstract void stop();


    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getbrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
