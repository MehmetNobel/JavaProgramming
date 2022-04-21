package day_38_Inheritance_3.deviceTask;

import java.util.ArrayList;

public class MyDevices {

    public static void main(String[] args) {

        Device d1=new Device("samsung","i12",1200,true,true);

        Phone p1=new Phone("APPLE","i12",1200,true,true);

        ArrayList<Phone> list=new ArrayList<>();

        System.out.println("p1 = " + p1);

        System.out.println("d1 = " + d1);

        for (int i = 1; i <5 ; i++) {

            list.add(new Phone("APPLE","i12",1200,true,true));

        }
        System.out.println("list.size() = " + list.size());

        System.out.println("list = " + list);

        list.removeIf(p->p.getPrice()>1100);

        System.out.println("list = " + list);


    }
}
