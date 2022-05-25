package day_51_Map;

import java.util.*;

public class EarlyBirdsVsAngryBirds {

    public static void main(String[] args) {

        //we can iterate the map via key ==>>  students.keySet();
        //we can iterate the map via value ==>>  students.values();
        //we can iterate the map via key&value both ==>>students.entrySet()  this is very useful method to iterate both of them


        Map<String, Integer> students=new HashMap<>();

        students.put("mehmet",85);
        students.put("yahya",93);
        students.put("ali",80);
        students.put("enes",92);
        students.put("esad",98);
        students.put("zeynep",97);


        Map<String, Integer> earlyBirds=new HashMap<>();
        Map<String, Integer> angryBirds=new HashMap<>();

        //to iterate the map we use keyset method.

        Set<String> keys = students.keySet();

        for (String key : keys) {

            if(students.get(key)>=90){

                // System.out.println(key+ " is earlybird: "+students.get(key));

                earlyBirds.put(key,students.get(key));
            }

            else{

                angryBirds.put(key,students.get(key));
            }

        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);


        // Set<String> keys = students.keySet();

        //we can convert the set to the array

        String[] array = keys.toArray(new String[0]);

        System.out.println(Arrays.toString(array));

        List<String> list1=new ArrayList<>(keys);

        System.out.println("list1 = " + list1);

        Collection<Integer> values = students.values();

        List<Integer> list2=new ArrayList<>(values);


        System.out.println("values = " + values);

        System.out.println("list2.size() = " + list2.size());

        System.out.println("list2 = " + list2);

        System.out.println("Collections.max(list2) = " + Collections.max(list2));

        System.out.println("Collections.min(list2) = " + Collections.min(list2));

        int toplam=0;
        int ort=0;

        for (Integer integer : list2) {

            toplam+=integer;


        }

        ort=toplam/list2.size();

        System.out.println("toplam = " + toplam);

        System.out.println("ort = " + ort);

        int count=0;

        for (Integer value : students.values()) {

            if(value>=90)
                count++;

        }

        System.out.println("count = " + count);

        System.out.println("**************** entry set method USEFULL !!!  ");


        for (Map.Entry<String, Integer> entry : students.entrySet()) {

            System.out.println(entry.getKey()+" : "+entry.getValue());

        }


    }

}
