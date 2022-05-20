package day_50_Collections_Continue;

import java.util.*;

public class IterablePractice {

    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        System.out.println("list1 = " + list1);

        System.out.println("list1.size() = " + list1.size());

        Set<Integer> set1=new HashSet<>(list1);

        System.out.println("set1 = " + set1);

        System.out.println("set1.size() = " + set1.size());

        // list1.removeIf(p->p<5);

        System.out.println("list1 = " + list1);

        set1.removeIf(p->p<5);

        System.out.println("set1 = " + set1);

        Iterator<Integer> it= list1.iterator();

        while(it.hasNext()){
            if(it.next()<5){
                it.remove();
            }

        }
        System.out.println("list1 after iterator = " + list1);

        List<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));


        // solution with for loop: but while is more readable.
        for ( Iterator<Integer> it2=list2.iterator(); it2.hasNext();) {

            if(it2.next()<5)
                it2.remove();

        }
        System.out.println("list2 = " + list2);


    }





}
