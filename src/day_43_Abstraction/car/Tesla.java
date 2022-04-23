package day_43_Abstraction.car;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {

        System.out.println("say \"Hello\" to start Tesla "+getModel());

    }

    @Override
    public void stop() {

    }

    public void autoPilot(){
        System.out.println(getbrand()+" "+getModel()+" is now autoparking.");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "brand='" + getbrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", price=" + getPrice() +
                '}';
    }
}
