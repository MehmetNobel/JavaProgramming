package replit6;

import java.util.*;

public class ArrayListt {

    public static void main(String[] args) {

        String[] list={"ahmet", "ayse","zeynep","esad"};

        ArrayList<String> list1=new ArrayList<>(Arrays.asList(list));

        System.out.println("list1 = " + list1);

        String list2[]=list1.toArray(new String[0]);

        System.out.println("list2 = " + Arrays.toString(list2));

        int list4[]={1,2,3,4,5};

        ArrayList<Integer> list5=new ArrayList<Integer>();

        for (Integer s : list4) {

            list5.add(s);

        }

        System.out.println("list5 = " + list5);


    }



}
