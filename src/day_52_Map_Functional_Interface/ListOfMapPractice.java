package day_52_Map_Functional_Interface;

import java.util.*;

public class ListOfMapPractice {

    public static void main(String[] args) {

        Map<String,String> team1=new LinkedHashMap<>();

        team1.put("ahmet","tester");
        team1.put("ayşe","dev");
        team1.put("esad","dev");
        team1.put("zeynep","tester");


        Map<String,String> team2=new LinkedHashMap<>();

        team2.put("mehmet","tester");
        team2.put("sema","dev");
        team2.put("kader","dev");
        team2.put("heidi","tester");


        Map<String,String> team3=new LinkedHashMap<>();

        team3.put("ırmak","tester");
        team3.put("sena","dev");
        team3.put("kurtulmuş","dev");
        team3.put("ali","tester");


        Map<String,String> team4=new LinkedHashMap<>();

        team4.put("safari","tester");
        team4.put("sultan","dev");
        team4.put("ömer","dev");
        team4.put("cengiz","tester");


        List<LinkedHashMap<String,String>> list1=new ArrayList<LinkedHashMap<String,String>>();

        list1.add((LinkedHashMap<String, String>) team1);
        list1.add((LinkedHashMap<String, String>) team2);
        list1.add((LinkedHashMap<String, String>) team3);
        list1.add((LinkedHashMap<String, String>) team4);

        System.out.println("list1 = " + list1);

        System.out.println("list1.get(0) = " + list1.get(0));

        for (LinkedHashMap<String, String> each : list1) {

            for (Map.Entry<String, String> entry : each.entrySet()) {

                if(entry.getValue().equals("tester"))

                System.out.println(entry.getKey()+" : "+entry.getValue());

            }

        }

        System.out.println("*******************************");

        for (LinkedHashMap<String, String> each : list1) {

            for (Map.Entry<String, String> entry : each.entrySet()) {

                if(entry.getKey().startsWith("a"))

                    System.out.println("entry.getValue() = " + entry.getValue());


            }
        }

    }
}
