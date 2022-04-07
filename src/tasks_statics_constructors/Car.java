package tasks_statics_constructors;

public class Car {

    public String make,model,color;
    public int year;
    public double price;
    public static int numberOfWheels;
    public static boolean hasBattery,hasSeats;

    public Car(String make, String model, String color,int year,double price){
        this.make=make;
        this.model=model;
        this.color=color;
        this.year=year;
        this.price=price;

    }

    static {
        numberOfWheels=4;
        hasBattery=true;
        hasSeats=true;

    }
    public String toString(){

        return "\nmake : "+make+
                "\nmodel : "+model+
                "\ncolor : "+color+
                "\nyear : "+year+
                "\nprice : "+price+
                "\nhasBattery : "+hasBattery+
                "\nhasSeats : "+hasSeats+
                "\nnumberOfWheels : "+numberOfWheels;

    }

    public void drive(){

        System.out.println(" I am driving "+ model+" now");

    }


}

class TestCar{

    public static void main(String[] args) {

        Car c1=new Car("USA","FORD","BLACK",2022,52000);

        System.out.println("c1 = " + c1);

        c1.drive();


    }

}
/*
7. Car Task:
1. Create a class called Car
Attributes:
instance: make, model, color, year, price
static: numberOfWheels, hasBattery, hasSeats
Add a constructor to initialize all the fields
Methods:
drive()
toString()
 */