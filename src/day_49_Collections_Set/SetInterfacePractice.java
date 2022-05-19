package day_49_Collections_Set;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<>(Arrays.asList(1,2,52,56,54,54,25,1));

        System.out.println("list1 = " + list1);




        Set<Integer> set1=new HashSet<>(Arrays.asList(4,4,5,5,67,68,8,8,9,9,18,20,20,5,5,1,1,2,3));

        set1.add(null);  // can accept null values inside the hashset

        Set<Integer> set2=new LinkedHashSet<>(Arrays.asList(6,6,1,2,3,3,4,4));

        set2.add(5);

        set2.add(null);  // can accept null values inside the hashset

        Set<Integer> set3=new TreeSet<>(Arrays.asList(6,6,7,1,2,3,68,69,69,68,70,71,71,80,54,54,53));

        set3.add(4);

       // set3.add(null);  // does not accept null values inside the hashset

        System.out.println("set1 = " + set1);

        System.out.println("set2 = " + set2);

        System.out.println("set3 = " + set3);




    }
}
