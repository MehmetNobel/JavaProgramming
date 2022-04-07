package day_28_ArrayLists;

import java.util.ArrayList;

public class ArrayListMethods_2 {

    public static void main(String[] args) {


        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(250);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int i = 6; i <=10 ; i++) {

            list.add(i);
        }
        System.out.println(list);

        System.out.println(list.size());

        list.add(9,100);

        System.out.println(list);

        System.out.println("------------------------------------");

        for (int i = 0; i <list.size() ; i++) {

            System.out.print(list.get(i)+" ");

        }
        list.set(9,90);

        System.out.println();

        Integer i=250;   // removing Integer objects from the arraylist

        list.remove(i);

        System.out.println(list);

       // list.clear();  // clears all the elements in the arraylist

        System.out.println(list);

        Integer i1=3;

        System.out.println(list.contains(i1));

    }
}
