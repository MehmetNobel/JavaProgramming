package albertJavaTasks;

import java.util.*;

public class Assessment {

    public static void main(String[] args) {


        Map<Integer,String> map1=new HashMap<>();

        map1.put(1,"ahmet");
        map1.put(2,"mehmet");
        map1.put(5,"semih");
        map1.put(3,"metin");
        map1.put(null,null);   // null is accepted

        Map<Integer,String> map2=new HashMap<>(map1);

        for (Map.Entry<Integer, String> each : map1.entrySet()) {

            //System.out.println("each = " + each);
            System.out.println("each.getKey()+ \":\"+ each.getKey() = " + each.getKey() + ":" + each.getValue());


        }

        System.out.println("map1.equals(map2) = " + map1.equals(map2));

        for (String value : map1.values()) {

            System.out.println("value = " + value);

        }

        for (Integer integer : map1.keySet()) {

            System.out.println("integer = " + integer);

        }


        System.out.println("map1 = " + map1);

        System.out.println("map1.get(1) = " + map1.get(1));

        System.out.println("map1.containsValue(\"ahmet\") = " + map1.containsValue("ahmet"));

        System.out.println("map1.containsKey(2) = " + map1.containsKey(20));

        System.out.println("map1.size() = " + map1.size());


        for (Map.Entry<Integer, String> each : map1.entrySet()) {

            System.out.println("each.getKey() = " + each.getKey());
            System.out.println("each.getValue() = " + each.getValue());

        }





        Set<Integer> set1=new HashSet();
        Set<Integer> set2=new LinkedHashSet<>();

        set1.add(12);
        set1.add(51);
        set1.add(7);
        set1.add(8);
        set2.add(12);
        set2.add(51);
        set2.add(7);
        set2.add(8);

        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);








        /*try{

            System.out.println(9/0);



        }catch (RuntimeException e){

            e.printStackTrace();
            System.out.println("catch1");
            System.out.println("catch2");
            System.out.println("catch3");

        }

        System.out.println("hello");

        System.out.println(5/5);

        throw new RuntimeException("wrong");

         */

       //  System.out.println(10/10);  ==>> unreacheble






    }


}
