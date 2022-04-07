package day_29_CollectionClass_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeTests2 {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>(Arrays.asList("ahmet","mehmet","ahmet","can","semih","david"));
        ArrayList<String> newList=new ArrayList<>();

        System.out.println("list = " + list);

        for (int i = 0; i < list.size(); i++) {

            if((list.get(i).equals("ahmet")||list.get(i).equals("david")))

                newList.add(list.get(i));

        }
        System.out.println("newList = " + newList);

        list.removeIf(p->!(p.equals("ahmet")||p.equals("david")));

        System.out.println("list = " + list);


        list.addAll(Arrays.asList("mehmet","ahmet","hasan","huseyin","semih"));

        list.retainAll(Arrays.asList("semih","mehmet"));

        System.out.println("list = " + list);


    }
}
