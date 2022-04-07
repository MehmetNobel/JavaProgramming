package day_30_CustomClassIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {

    public static void main(String[] args) {


        Car car1=new Car("mercedes", "E320",2022,50000);
        Car car2=new Car("bmw", "3.20",2022,45000);
        Car car3=new Car("audi", "a8",2022,40000);
        Car car4=new Car("Toyota", "Corolla",2018,40000);
        Car car5=new Car("Toyota", "Corona",2022,40000);

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);


        car1.drive();

        car2.stop();

        car3.start();

        ArrayList<Car> carsList=new ArrayList<>();

        carsList.addAll(Arrays.asList(car1,car2,car3,car4,car5));

        System.out.println("carsList = " + carsList);

        for (Car car : carsList) {

            System.out.println(car.name+": "+ car.price);
        }

        carsList.removeIf(p -> p.name.equals("Toyota") && p.year == 2018);

        System.out.println("carsList = " + carsList);

    }




}
