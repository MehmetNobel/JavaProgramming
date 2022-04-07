package day_30_CustomClassIntro;

public class Car {

    public String name;
    public String model;
    public int year;
    public  int price;

    public Car(String name, String model, int year,int price) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.price=price;
    }

    public void drive(){

        System.out.println(name+ " " + model+" is now driving by my friend.");
    }

    public void start(){

        System.out.println(name+ " " + model+ " is now driving by my friend.");
    }

    public void stop(){

        System.out.println(year+" " + name+ " is now stopped by my friend.");
    }

    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
