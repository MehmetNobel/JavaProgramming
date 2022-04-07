package day_25_MethodOverloading;

import utilities.ArraysUtility;
import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        StringUtility.printEachChar("AHMET");

        System.out.println();

        System.out.println(StringUtility.reverse("ahmet"));

        System.out.println(StringUtility.isPalindrom("anna"));

        String arr1[]={"ahmet","ayse","zeynep","anna","mam"};

        int count=0;

        for (String s : arr1) {

            if(StringUtility.isPalindrom(s)) {
                count++;
                System.out.println(s);
            }
        }

        System.out.println("palindrom count is: "+ count);


        System.out.println(StringUtility.isAnagram("listen","silent"));

        System.out.println(StringUtility.removeDuplicates("aabbccccdd"));

        ArraysUtility.printEachElement(new int[]{1,2,3,4});

        ArraysUtility.printEachElement(new String[]{"ahmet","ayse"});





    }
}
