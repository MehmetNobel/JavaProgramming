package day_39_Recap.quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListQuiz {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3));

        System.out.println("list = " + list);

        list.set(0,10);

        list.add(0,9);

        System.out.println("list = " + list);

        list.removeIf(p->p>=10);

        System.out.println("list = " + list);

        list.removeIf(p->p==2);

        System.out.println("list = " + list);

        System.out.println("list.get(0) = " + list.get(0));

        list.set(1,15);

        System.out.println("list = " + list);

        System.out.println("list.contains(15) = " + list.contains(15));

        list.clear();

        System.out.println("list.size() = " + list.size());

        list.addAll(Arrays.asList(10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,1000));

        System.out.println("list = " + list);

        list.removeAll(Arrays.asList(50,55,60));

        System.out.println("list = " + list);

        System.out.println(list.indexOf(95));

        System.out.println("list = " + list);

        Integer a=90;

        list.remove(a);  // if we wanna remove int from the list then firstly we should convert it to the wrapper class.

        System.out.println("list = " + list);

        ArrayList<Integer> list2=new ArrayList<>(list);

        System.out.println(list2.equals(list)); // return boolean is the list2 contests equals to the list.

        System.out.println(list2.containsAll(Arrays.asList(70, 75)));

        list2.removeAll(Arrays.asList(70,75));

        System.out.println(list2);

        list2.retainAll(Arrays.asList(20,22,24));

        System.out.println(list2);


    }
}
