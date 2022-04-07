package day_28_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWarmUpTests {

    public static void main(String[] args) {


        ArrayList<Integer> list=new ArrayList<>();


        list.addAll(Arrays.asList(5,10,15,20,25,30,40,45,50));

        System.out.println(list);

        //list.clear();

        System.out.println(list);

        list.addAll(Arrays.asList(55,60,65,70,75,80,85,90,95,100));

        System.out.println(list);

        ArrayList<Integer> list2=new ArrayList<>();


        for (Integer integer : list) {

            if(integer>=80)
                list2.add(integer);
        }

        System.out.println(list2);

        Integer i=95;

        list2.remove(i);

        System.out.println(list2);

        list2.addAll(Arrays.asList(80,85,100));

        System.out.println(list2);

        System.out.println("********************************");

        ArrayList<Integer> unique=new ArrayList<>();

        for (Integer integer : list2) {

            if(list2.indexOf(integer)==list2.lastIndexOf(integer))

                System.out.println(integer);

        }

        list2.remove(2);

        System.out.println(list2);

        System.out.println(list2.contains(85));

        System.out.println(list2.equals(list));

        







    }




}
