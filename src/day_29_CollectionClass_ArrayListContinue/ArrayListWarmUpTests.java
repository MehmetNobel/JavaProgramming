package day_29_CollectionClass_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWarmUpTests {

    public static void main(String[] args) {


        ArrayList<String> list=new ArrayList<>();

        list.addAll(Arrays.asList("ahmet","ayşe","zeynep","tekin","esad","ahmet","ayşe","zeynep","zeynep","esad","veli","ahmet"));

        ArrayList<String> newList=new ArrayList<>();

        for (String s : list) {

            if(!newList.contains(s))
                newList.add(s);

        }

        System.out.println("newList = " + newList);

        for (String s : newList) {

            int count=0;

            for (String s1 : list) {

                if(s.equals(s1))
                    count++;

            }

            if(count==1)
            {System.out.println(s);
            break;}

        }

        System.out.println("*********************************");

        for (String s : list) {
            if(list.indexOf(s)==list.lastIndexOf(s)){
                System.out.println("unique element is : "+ s);
            break;}
        }

        System.out.println("-----------------------------------");

        for (String s : list) {

            int freq = 0;

            for (String s1 : list) {

                if (s.equals(s1))
                    freq++;

            }

            if (freq == 1){
                System.out.println(s);
            break;
        }

        }


        }



    }

