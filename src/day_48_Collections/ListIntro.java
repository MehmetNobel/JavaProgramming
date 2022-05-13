package day_48_Collections;

import java.util.*;

public class ListIntro {

    public static void main(String[] args) {

        // List<Integer> list=new List<Integer>();  // since List is an interface we cannot create objects from that.

        List<Integer> list1=new ArrayList<>();   // this is a polymorphism

        list1.addAll(Arrays.asList(10,15,20,25,30,35,40));

        List<Integer> list2=new LinkedList<>();   // this is a polymorphism

        list2.addAll(Arrays.asList(10,15,20,25,30,35,40));

        List<Integer> list3=new Vector<>();   // this is a polymorphism

        list3.addAll(Arrays.asList(10,15,20,25,30,35,40));

        List<Integer> list4=new Stack<>();   // this is a polymorphism

        list4.addAll(Arrays.asList(10,15,20,25,30,35,40));

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);
        System.out.println("list4 = " + list4);

        ((Stack) list4).pop();   // there is downcasting here. tha last element will be removed from the list. LIFO --STACK

        //Since we wanna use the unique pop method of stack then we must dwoncast it.Because list do not contain such a method.

        System.out.println("list4 = " + list4);


    }
}
