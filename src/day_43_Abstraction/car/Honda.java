package day_43_Abstraction.car;

public class Honda extends Car{


    public Honda( String model, String color, int year, double price) {
        super("honda", model, color, year, price);
    }

    @Override
    public void start() {

        System.out.println("i am twisting the key to start ");

    }

    @Override
    public void stop() {

        System.out.println("i am twisting the key to stop ");

    }
    @Override
    public String toString() {
        return "Honda{" +
                "brand='" + getbrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", price=" + getPrice() +
                '}';
    }


}
