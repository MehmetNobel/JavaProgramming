package day_51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {


        Map<String, String> map1=new HashMap<>();

        map1.put("AHMET","M");
        map1.put("AYŞE","F");
        map1.put("ESAD","M");
        map1.put("ZEYNEP","F");
        map1.put("LATİF","M");
        map1.put("KADİR","M");
        map1.put("ALİ","M");
        map1.put("ÖMER","M");

        System.out.println("map1.size() = " + map1.size());

        System.out.println("map1 = " + map1);

        for (Map.Entry<String, String> entry : map1.entrySet()) {

            System.out.println("entry = " + entry);
        }

        System.out.println("**********************");

        for (Map.Entry<String, String> entry2 : map1.entrySet()) {

            if(entry2.getValue().equals("A"))
                System.out.println("entry2 = " + entry2);
            if(entry2.getKey().equals("AHMET"))
                System.out.println("entry2.getKey().substring(3) = " + entry2.getKey().substring(3));
        }

        System.out.println("===========================================");

        // ENTRY IS THE INNER INTERFACE OF THE MAP

        for (Map.Entry<String, String> entry : map1.entrySet()) {

            if(entry.getValue().equals("M"))

            entry.setValue("MALE");

            if(entry.getValue().equals("F"))

                entry.setValue("FEMALE");

        }

        System.out.println("map1 = " + map1);

        // just to write females:

        for (Map.Entry<String, String> entry : map1.entrySet()) {
            if(entry.getValue().equalsIgnoreCase("FEMALE"))
                System.out.println("entry = " + entry);
        }


    }
}
