package day_38_Inheritance_3.deviceTask;

public class Device {

    private String brand, model;
    private double price;
    private boolean hasBattery, hasPowerButton;

    public Device(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton){
        setBrand(brand);
        this.model=model;
        this.price=price;
        this.hasBattery=hasBattery;
        this.hasPowerButton=hasPowerButton;
    }

    public void setBrand(String brand){
        if (brand==null||brand.isBlank()||brand.isEmpty()){
            System.err.println("brand name cannot be empty or blank!");
        }
        this.brand=brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }


    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
