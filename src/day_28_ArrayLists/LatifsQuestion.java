package day_28_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class LatifsQuestion {

    public static void main(String[] args) {


        /*
        write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]

         */


        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> listNew=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        for (Integer integer : list) {
            if(integer%2==1)
            listNew.add(integer*2);
            else
            listNew.add(integer);
        }

        System.out.println(listNew);



    }
}
