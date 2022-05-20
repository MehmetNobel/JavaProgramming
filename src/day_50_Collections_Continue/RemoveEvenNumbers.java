package day_50_Collections_Continue;

import java.util.*;

public class RemoveEvenNumbers {

    public static void main(String[] args) {


        Set<Integer> set1=new HashSet<>(Arrays.asList(2,4,5,6,8,9,10,11,12,15,16,18,17,11));

        System.out.println("Before removeif set1 = " + set1);

        //set1.removeIf(p->(p%2==0));

        Iterator<Integer> it=set1.iterator();

        while(it.hasNext()){

            if(it.next()%2==0)
                it.remove();

        }

        System.out.println("After removeif set1 = " + set1);


        List<String> list1=new LinkedList<>(Arrays.asList("esad","emre","ahmet","mehmet","ayşe","zeynep"));

        System.out.println("before list1 = " + list1);

        Iterator<String> it1=list1.iterator();

        while(it1.hasNext()){

            if(!it1.next().startsWith("e"))
                it1.remove();

        }

        System.out.println("after list1 = " + list1);

        list1.removeIf(p->p.startsWith("em"));

        System.out.println("last list1 = " + list1);


    }
}
