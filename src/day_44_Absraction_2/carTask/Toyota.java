package day_44_Absraction_2.carTask;

public class Toyota extends Car implements Autopark{

    public Toyota( String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void start() {

        System.out.println( getBrand()+ " is started now");

    }

    @Override
    public void drive() {
        System.out.println( getBrand()+ " is being driven now");

    }

    @Override
    public void autopark() {
        System.out.println(getBrand()+" autoparking now");

    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                '}';

    }
}
