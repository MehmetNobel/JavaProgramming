package day_29_CollectionClass_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayVsReverseArrayList {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6};

        int reverse[]=new int[arr.length];

        int j=0;

        for (int i = arr.length - 1; i >= 0; i--) {

            reverse[j++]=arr[i];
        }

        System.out.println("arr = " + Arrays.toString(arr));

        System.out.println("reverse = " + Arrays.toString(reverse));


        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));  // direk buradan ekleme işlemini yapıyoruz.

        ArrayList<Integer> listReverse=new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {

            listReverse.add(list.get(i));
        }

        System.out.println("list = " + list);

        System.out.println("listReverse = " + listReverse);


    }
}
