package day_37_Inheritance_2.phoneTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone i1=new Iphone("12","6.7 inch","black",1000);

        System.out.println("i1 = " + i1);

        Samsung s1=new Samsung("s19","6.1 inch","white",900);

        System.out.println("s1 = " + s1);

        System.out.println("s1.price = " + s1.price);

        Lg lg1=new Lg("lg001","6.2","yellow",800);

        System.out.println("lg1 = " + lg1);


        ArrayList<Phone> list=new ArrayList<>();

        list.addAll(Arrays.asList(i1,s1,lg1));

        for (Phone phone : list) {

            System.out.println(phone.brand + "=====>>>"+phone.price);

        }

        System.out.println("Phone.hasBattery = " + Phone.hasBattery);

        System.out.println("s1.brand = " + s1.brand);

        System.out.println("Samsung.hasBattery = " + Samsung.hasBattery);


    }
}
