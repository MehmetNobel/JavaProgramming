package day_37_Inheritance_2.phoneTasks;

public class Phone {

    public String brand, model, size,color;
    public double price;
    public static boolean hasBattery;

    public Phone(String brand, String model, String size, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    static {
        hasBattery=true;
    }




    public void call(Long number){
        System.out.println(brand+" "+model+" is calling to number "+number);

    }

    public void text(Long number){
        System.out.println(brand+" "+model+" is sending message to number "+number);

    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                '}';
    }
}
