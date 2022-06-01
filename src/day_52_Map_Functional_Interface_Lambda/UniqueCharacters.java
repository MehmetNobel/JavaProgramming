package day_52_Map_Functional_Interface_Lambda;

import java.util.*;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str="aaabbcccddeeeegt";

        Map<String, Integer> map1=new LinkedHashMap<>();

        List<String> list1=new ArrayList<>(Arrays.asList(str.split("")));

        for (String s : list1) {

            map1.put(s,Collections.frequency(list1,s));

        }

        System.out.println("map1 = " + map1);


        for (Map.Entry<String, Integer> entry : map1.entrySet()) {

            if(entry.getValue()==1) {
                System.out.println(entry.getKey()+" = "+ entry.getValue());
            }

        }

        int max=0;

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {

            int freq=Collections.frequency(list1,entry.getKey());

            if(freq>max) {
                max=freq;
            }
        }

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {

            if(entry.getValue()==max) {
                System.out.println(entry.getKey());
            }

        }

        List<String> list2=new ArrayList<>(Arrays.asList("java","java","c","go"));

        Map<String, Integer> map2=new LinkedHashMap<>();

        for (String s : list2) {

            map2.put(s,Collections.frequency(list2,s));

        }


        System.out.println("map2 = " + map2);

        int max2=0;

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {

            if(entry.getValue()>max2)
                max2=entry.getValue();


        }

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {

            if(entry.getValue()==max2)
                System.out.println(entry.getKey());
        }


    }
}
