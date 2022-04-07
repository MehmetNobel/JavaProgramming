package day_29_CollectionClass_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindThe_nth_LargestNumber {

    public static int findTheNumber(ArrayList<Integer> list1, int a) {

        for (int i = 1; i <a ; i++) {

            Collections.replaceAll(list1,Collections.max(list1),0);
        }

        return Collections.max(list1);

    }

    public static int findTheNumber2(ArrayList<Integer> list1, int a) {

        for (int i = 1; i <a ; i++) {

            list1.removeIf(p->Collections.max(list1)==p);
        }


        return Collections.max(list1);

    }


    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,150,190,200));

        int a=findTheNumber2(list, 3);

        System.out.println(a);


    }
}
