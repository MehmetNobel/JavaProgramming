package day_51_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IteratingTheMap {

    public static void main(String[] args){


        Map<String, Integer> map1=new HashMap<>();

        map1.put("mehmet",80);
        map1.put("yahya",95);
        map1.put("serhat",80);

        Set<String> keys = map1.keySet();   // gives all the keys as a set.

        for (String key : keys) {

            System.out.println(key+" "+ map1.get(key));

        }

        for (String key : keys) {

            if(key.startsWith("s"))
                System.out.println(key+" : "+map1.get(key));
        }

        for (String key : keys) {

            if(map1.get(key)>85)
                System.out.println(key+ ": "+map1.get(key));

        }

        for (String key : keys) {

            map1.replace(key,map1.get(key),map1.get(key)+5);

        }
        System.out.println("*******************aftre increase");

        System.out.println("map1 = " + map1);

        System.out.println("*********less than 90**************");

        for (String key : keys) {

            Integer eachvalue=map1.get(key);
            if(eachvalue<90) {
                System.out.println("map1.get(key) = " +key+" : "+ map1.get(key));
            }
        }


    }
}
