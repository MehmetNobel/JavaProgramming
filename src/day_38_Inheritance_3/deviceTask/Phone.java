package day_38_Inheritance_3.deviceTask;

public class Phone extends Device{

    public Phone(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void call(Long number){
        System.out.println("now ı am calling "+ number);
    }

    public void text(Long number){
        System.out.println("now ı am sending message to "+ number);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice()+
                ", hasBattery=" + isHasBattery() +
                ", hasPowerButton=" + isHasPowerButton() +
                '}';


    }
}
