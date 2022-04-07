package day_32_Constructors;

public class Contstructors_Overloading {

    public String brand, model, color;

    public double price;

    public int year;

    public Contstructors_Overloading(String brand) {

        this.brand=brand;

        System.out.println(brand);

    }

    public Contstructors_Overloading(String brand, String model) {

        this(brand);

        this.model=model;

        System.out.println(brand+" "+model);

    }

    public Contstructors_Overloading(String brand, String model, int year) {

        this(brand, model);

        this.year=year;

        System.out.println(brand+" "+model + " " + year);

    }

    public Contstructors_Overloading(String brand, String model, int year,double price) {

        this(brand, model, year);

        this.price=price;

        System.out.println(brand+" "+model + " " + year + " " + price);

    }

    public Contstructors_Overloading(String brand, String model, int year, double price, String color) {

        this(brand, model, year, price);

        this.color=color;

        System.out.println(brand+" "+model + " " + year + " " + price + " " + color);

    }

    public String toString() {
        return "Contstructors_Overloading{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
