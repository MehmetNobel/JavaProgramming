package day_43_Abstraction.car;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

       // Car car1=new Car("tesla","12","white",2022,70000);
        //this is an abstract class. so we can not create objects from that.

        Audi a1=new Audi("a8","black",2022,65000);

        Honda h1=new Honda("ACCORD","WHITE",2022,48000);

        Tesla t1=new Tesla("T12","grey",2022,70000);

        ArrayList<Car> list=new ArrayList<>(Arrays.asList(a1,h1,t1));

        System.out.println("a1 = " + a1);

        System.out.println("h1 = " + h1);

        System.out.println("t1 = " + t1);

        System.out.println("list = " + list);

        list.removeIf(p->p.getPrice()>50000);

        System.out.println("list = " + list);

        t1.start();

        t1.autoPilot();


    }
}
