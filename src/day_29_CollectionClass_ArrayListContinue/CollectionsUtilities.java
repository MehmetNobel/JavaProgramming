package day_29_CollectionClass_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilities {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.addAll(Arrays.asList(1,22,33,4,55,6));

        Collections.sort(list);

        System.out.println("list = " + list);

        Collections.reverse(list);

        System.out.println("list = " + list);

        Collections.swap(list,2,4);  // önce arraylist adını giriyoruz sonra değişim olacak indisleri giriyoruz.

        System.out.println("list = " + list);

        System.out.println("Collections.frequency(list,6) = " + Collections.frequency(list, 6));

        System.out.println("Collections.max(list) = " + Collections.max(list));

        System.out.println("Collections.min(list) = " + Collections.min(list));

        list.addAll(Arrays.asList(2,4,6,8,10,12,14,16,18,20));

        System.out.println("list = " + list);

        Collections.replaceAll(list,6,16);

        System.out.println("list = " + list);

        System.out.println("Collections.frequency(list,16) = " + Collections.frequency(list, 16));

    }
}
