package day_51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {


        Map<String, Integer> map1=new LinkedHashMap<>();

        System.out.println("map1 = " + map1);
        System.out.println("map1.size() = " + map1.size());

        map1.put("ahmet",95);
        map1.put("ahmet",95);
        map1.put("ahmet",95);
        map1.put("ahmet",95);  // we put just one of it.since all of them are the same.

        System.out.println("map1 = " + map1);
        System.out.println("map1.size() = " + map1.size());

        map1.put("mehmet",80);
        map1.put("yahya",95);
        map1.put("serhat",80);

        System.out.println("map1.size() = " + map1.size());

        System.out.println("map1.size() = " + map1.size());

        System.out.println("map1.get(\"serhat\") = " + map1.get("serhat"));

        map1.replace("serhat",100);

        System.out.println("map1.get(\"serhat\") = " + map1.get("serhat"));
        System.out.println("map1 = " + map1);

        map1.remove("serhat");

        System.out.println("map1 = " + map1);

        System.out.println("map1.containsKey(\"muhtar\") = " + map1.containsKey("muhtar"));

        System.out.println("map1.containsKey(\"mehmet\") = " + map1.containsKey("mehmet"));

        System.out.println("map1.containsValue(105) = " + map1.containsValue(105));

        Map<String, Integer> map2=new LinkedHashMap<>(map1);
        Map<String, Integer> map3=new LinkedHashMap<>(map1);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);
        System.out.println("map3 = " + map3);

        boolean b = map2 == map1;   // since we create 2 different map with "new" keyword then 2 different object will be created.
        //and since they are in diff. locations then map1==map2 will be false

        System.out.println("b = " + b);

        boolean b1 = map1.equals(map2);    // checks the contents

        System.out.println("b1 = " + b1);

        map1.clear();   // clears all the contents

        System.out.println("map1 = " + map1);


    }
}
