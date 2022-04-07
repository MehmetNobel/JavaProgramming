package day_28_ArrayLists;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        for (int i = 0; i <11 ; i++) {

            list.add(i);

        }
        System.out.println(list);

        for (int i = 0; i <11 ; i++) {

            list.set(i,list.get(i)*2);

        }

        System.out.println(list);


        ArrayList<String> list2=new ArrayList<>();

        list2.add("ahmet");
        list2.add("mehmet");
        list2.add("esad");

        System.out.println(list2);

        list2.remove(0);

        System.out.println(list2);









    }
}
