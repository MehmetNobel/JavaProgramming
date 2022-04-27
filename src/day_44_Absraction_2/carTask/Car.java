package day_44_Absraction_2.carTask;

public abstract class Car {

    //make (final), model (final),
    //year (final), price, color

    private final String brand, model;
    private final int year;
    private double price;
    private String color;

    public Car(String brand, String model, int year, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        setColor(color);
    }

    public String getBrand() {

        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0)
            throw new RuntimeException("price cannot be zero or negative");
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty()||color.isBlank())
            throw new RuntimeException("color cannot be empty pr blank");
        this.color = color;
    }

    public abstract void start();

    public abstract void drive();

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
