package day_29_CollectionClass_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice1 {

    public static void main(String[] args) {


        String arr[] = {"USA", "DENMARK", "FINLAND", "GERMANY", "RUSSIA", "TURKEY", "FRANCE"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        ArrayList<String> newList = new ArrayList<>();

        String result = "";

        for (String s : list) {

            if (s.length() <= 6) {
                result += s + " ";
                newList.add(s);
            }
        }
        System.out.println("result = " + result);

        System.out.println("newList = " + newList);

        System.out.println(newList);

        ArrayList<String> list2 = new ArrayList<>(list);

        System.out.println("list2 = " + list2);

        list2.removeIf(p->p.length()>6);

        System.out.println("list2 = " + list2);

        String arr3[]=new String[4];
        int j=0;

        for (String s : list2) {

            arr3[j++]=s;

        }
        System.out.println(Arrays.toString(arr3));

        String countries[]=list2.toArray(new String[0]);  // arraylistin arraye cevrilmesi

        System.out.println("list2.toArray(new String[0]) = " + Arrays.toString(countries));

        System.out.println(countries.length);





    }
}
