package day_49_Collections_Set;

import java.util.*;

public class Practice3 {

    public static void main(String[] args) {

        String str="aaabbccccddfff";

        String str2;  // a3b2c4d2f3

        String arr1[]=str.split("");

        System.out.println(Arrays.toString(arr1));

        ArrayList<String> list1=new ArrayList<>(Arrays.asList(arr1));

        list1=new ArrayList<>(new LinkedHashSet<>(list1));

        System.out.println("list1 = " + list1);

        Integer nums[]={1,2,3,5,6,6,8,5,6,7};

        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(nums));

        list2=new ArrayList<>(new LinkedHashSet<>(list2));

        System.out.println("list2.get(5) = " + list2.get(5));

        Set<String> names=new HashSet<>(Arrays.asList("ahmet","ahmet","mehmet","john"));

        System.out.println("names = " + names);

        List<String> names2=new ArrayList<>(names);

        System.out.println("names2 = " + names2);


    }
}
