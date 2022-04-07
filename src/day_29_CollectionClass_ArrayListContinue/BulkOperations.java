package day_29_CollectionClass_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.addAll(Arrays.asList(1,2,2,2,2,3,4,4,5,6,6,6,7,8,9,10));  // add all the elements as a collecton type.

        System.out.println("list = " + list);

        list.removeAll(Arrays.asList(2,4,6,8,10));  // remove all the matching elements as a collection type

        System.out.println("list = " + list);

        list.addAll(Arrays.asList(10,12,14,16,18,20));

        System.out.println("list = " + list);

        list.retainAll(Arrays.asList(10,12,14));  // removes all the non-matching elements from the array

        System.out.println("list = " + list);

    }
}
