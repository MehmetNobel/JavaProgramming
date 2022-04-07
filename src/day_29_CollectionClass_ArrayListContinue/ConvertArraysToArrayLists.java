package day_29_CollectionClass_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArraysToArrayLists {

    public static ArrayList<Integer> convertArraysToArrayList(int arr[]){

        ArrayList<Integer> list=new ArrayList<>();

        for (int i : arr) {

            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {

        String arr[]={"ahmet","ayse","esad","zeynep"};
        String arr2[]={"ahmet","ayse","esad","zeynep"};

        ArrayList<String> list=new ArrayList<>(Arrays.asList(arr)); // non-primitive lerde Arrays.asList metodunu kullanmalıyız.

        list.addAll(Arrays.asList(arr2));

        System.out.println(list);

        System.out.println("************************");

        System.out.println(Arrays.toString(arr));

        int arr5[]={1,2,3,4,5,6};

        System.out.println("convertArraysToArrayList(arr) = " + convertArraysToArrayList(arr5));

        ArrayList<Integer> list6=new ArrayList<>(convertArraysToArrayList(arr5)); // parantez içine metodu yazdık.

        System.out.println("list6 = " + list6);


    }




}
