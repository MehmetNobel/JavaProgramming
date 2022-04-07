package day_30_CustomClassIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {

    public static void main(String[] args) {


        ArrayList<Integer> list=new ArrayList<>();

        list.addAll(Arrays.asList(80,2,3,4,5,7,8,9,10,11));

        System.out.println("list = " + list);

        Collections.swap(list,0,list.size()-1);

        System.out.println("list = " + list);


        // move all the zeros at the end of the list

        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(2,0,4,0,6,6,0,8,0));

        System.out.println("list2 = " + list2);

        Collections.sort(list2);

        Collections.reverse(list2);

        System.out.println("list2 = " + list2);

        ArrayList<Integer> list3=new ArrayList<>(list2);

        System.out.println("list3 = " + list3);

        ArrayList<Integer> sorted=new ArrayList<>();

        int j=0;

        for (int i = 0; i < list3.size(); i++) {

            int max=Collections.max(list3);

            sorted.add(max);

            list3.removeIf(p->Collections.max(list3)==p);

        }

        for (int i = 0; i <list3.size() ; i++) {

            sorted.add(list3.get(i));

        }

       // sorted.addAll(Arrays.asList(0,0,0,0));

        System.out.println("sorted = " + sorted);



    }




}
