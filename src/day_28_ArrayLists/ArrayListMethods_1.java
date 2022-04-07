package day_28_ArrayLists;

import java.util.ArrayList;

public class ArrayListMethods_1 {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.add(10);

        list.add(20);

        list.add(30);
        list.add(40);
        System.out.println(list);

        for (Integer integer : list) {

            System.out.print(integer+" ");

        }

        list.add(1,50);

        System.out.println(list);

        System.out.println(list.size());// gives the quantit of element

        System.out.println(list.get(2)); // brings the element that indexs given






    }
}
