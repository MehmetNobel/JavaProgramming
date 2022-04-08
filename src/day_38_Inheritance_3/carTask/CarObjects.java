package day_38_Inheritance_3.carTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Toyota toyota=new Toyota("avensis","white",2022,52000,1200);
        Bmw bmw=new Bmw("i7","black",2022,75000,900);
        Tesla tesla=new Tesla("t1","yellow",2022,80000,800);

        System.out.println("toyota = " + toyota);
        System.out.println("bmw = " + bmw);
        System.out.println("tesla = " + tesla);

        ArrayList<Car> carList=new ArrayList<>();

        carList.addAll(Arrays.asList(toyota,bmw,tesla));

        System.out.println("carList = " + carList);

        System.out.println("carList.size() = " + carList.size());

        carList.removeIf(p->p.miles>1000);

        System.out.println("carList = " + carList);

        bmw.start();
        toyota.reliable();
        tesla.autoPilot();
        bmw.breaksDown();


    }



}
