package day_52_Map_Functional_Interface;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class ArrayOfMap {

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

        Map<String,String> arr[]=new Map[4];

        arr[0]=team1;
        arr[1]=team2;
        arr[2]=team3;
        arr[3]=team4;

        System.out.println(Arrays.toString(arr));

        System.out.println("arr.length = " + arr.length);

        for (Map<String, String> each : arr) {

            for (Map.Entry<String, String> entry : each.entrySet()) {

                System.out.println("entry.getKey()+\" : \"+entry.getValue() = " + entry.getKey() + " : " + entry.getValue());
            }


        }


    }
}
