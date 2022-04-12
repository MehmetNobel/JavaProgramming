package day_39_Recap.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList3 {


    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.addAll(Arrays.asList(10,50,385,40,520,60,70,80,90));

        Collections.sort(list);

        System.out.println("list = " + list);

        Collections.reverse(list);

        System.out.println("list = " + list);

        System.out.println("Collections.max(list) = " + Collections.max(list));

        System.out.println("Collections.min(list) = " + Collections.min(list));

        Collections.swap(list,0,1);

        System.out.println("list = " + list);

        Collections.swap(list,0,list.size()-1);

        System.out.println("list = " + list);

        Collections.sort(list);

        Collections.reverse(list);

        System.out.println("list = " + list);

        Collections.swap(list,0,list.size()-1);

        System.out.println("list = " + list);

        System.out.println("Collections.frequency(list,10) = " + Collections.frequency(list, 10));

        list.add(2,100);

        System.out.println("list = " + list);


    }


}
