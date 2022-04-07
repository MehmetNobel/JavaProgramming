package day_29_CollectionClass_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

    public static void main(String[] args) {

        //int arr[]={1,2,3,4,5};

        ArrayList<Integer> list=new ArrayList<>();

        ArrayList<String> list2=new ArrayList<>(Arrays.asList("a","b","c"));

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println("list = " + list);

        Integer[] arr =list.toArray(new Integer[0]);

        System.out.println("arr = " + Arrays.toString(arr));

        System.out.println("list2 = " + list2);

        String arr2[]=list2.toArray(new String[0]);

        System.out.println("string array : " +Arrays.toString(arr2));


    }




}
