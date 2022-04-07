package day_29_CollectionClass_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeTest3 {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>(Arrays.asList("Mehmet","metin", "can", "canan"));

        String arr[]={"mehmet","Murtaza","Mestan"};

        list.addAll(Arrays.asList("Mustafa","Murat"));

        list.addAll(Arrays.asList(arr));

        System.out.println("list = " + list);

        list.removeIf(p->(p.charAt(0)=='M'));   // eğer ilk harf M ise;

        System.out.println(list);

        arr=list.toArray(new String[0]);  // arraylistin arraye cevrilmesi.

        System.out.println("arr = " + Arrays.toString(arr));

        System.out.println("arr.length = " + arr.length);


    }
}
