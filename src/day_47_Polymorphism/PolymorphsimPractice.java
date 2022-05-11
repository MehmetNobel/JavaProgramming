package day_47_Polymorphism;

import day_38_Inheritance_3.carTask.Bmw;
import day_38_Inheritance_3.carTask.Car;
import day_38_Inheritance_3.carTask.Tesla;
import day_38_Inheritance_3.carTask.Toyota;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphsimPractice {

    public static void main(String[] args) {


        Car[] cars = {
                new
                        Toyota("Highlander", "yellow", 25000, 49000, 255000),
                new Bmw("X5", "white",
                        32000, 65000, 12000),
                new Toyota("Corolla",
                        "white", 20000, 12500, 310000),
                new Bmw("M3", "white",
                        33000, 65000, 14030),
                new Bmw("M5", "white",
                        35000, 48000, 15000),
                new Bmw("M4", "white",
                        40000, 51000, 19000),
                new Bmw("7 Series",
                        "white", 30000, 78000, 21000),
                new Bmw("i3", "black",
                        30000, 81000, 9000),
                new Toyota("Camry",
                        "white", 30000, 48000, 185000),
                new Toyota("Rav4",
                        "white", 23000, 24000, 285000),
                new Toyota("Avalon",
                        "white", 35000, 24000, 175230),
                new Tesla("Model 3",
                        "white", 45000, 24000, 235000),
                new Tesla("Model Y",
                        "white", 65000, 24000, 135000),
                new Tesla("Model X",
                        "white", 48000, 24000, 235000),
                new Tesla("Model X",
                        "white", 48000, 24000, 236000),
        };


        for (Car car : cars) {

            if (car.model.equals("Camry")) {
                System.out.println(car.model);
                System.out.println("car.price = " + car.price);

            }

        }

        System.out.println("cars.length = " + cars.length);

        ArrayList<Car> list = new ArrayList<>(Arrays.asList(cars));

        System.out.println("list = " + list);

        System.out.println("list.size() = " + list.size());

        list.removeIf(p -> p.model.equals("Camry"));

        System.out.println("list.size() = " + list.size());

        list.removeIf(p -> !(p.model.equals("Model X")));

        System.out.println("list.size() = " + list.size());

        System.out.println("list = " + list);

        Car car1 = new Toyota("corolla", "black", 2022, 55000, 11);

        car1.drive();

        ((Toyota) car1).reliable();   // we are downcasting to reach the method of subclass

        //   car1.reliable();  // we cant access the reliable method. because it is not in parent class.

        int i = 1;
        for (Car car : list) {

            if (car instanceof Tesla) {
                System.out.println("this is    " + i++ + " . Tesla");
                System.out.println(car);

            }

        }
        System.out.println("*******************************");
        System.out.println(Arrays.toString(cars));


        Car highsetMilesCar=cars[0];

        for (Car car : cars) {

            if(car.miles>highsetMilesCar.miles){
                highsetMilesCar=car;
            }

        }
        System.out.println("highest miles car is : "+ highsetMilesCar);




    }
}
