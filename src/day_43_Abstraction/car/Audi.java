package day_43_Abstraction.car;

public class Audi extends Car{

    public Audi( String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void start() {

        System.out.println("i am starting the "+ getbrand()+" now ");

    }

    @Override
    public void stop() {

        System.out.println("i am stopping the "+ getbrand()+" now ");

    }

    @Override
    public String toString() {
        return "Audi{" +
                "brand='" + getbrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", price=" + getPrice() +
                '}';
    }
}
