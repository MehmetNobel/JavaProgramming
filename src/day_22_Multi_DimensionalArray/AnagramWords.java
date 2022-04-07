package day_22_Multi_DimensionalArray;

import java.util.Arrays;

public class AnagramWords {


    public static void main(String[] args) {

        String s="silent";

        String s2="listen";

        String sArray[]=s.split("");

        String s2Array[]=s2.split("");

        Arrays.sort(sArray);

        Arrays.sort(s2Array);


        System.out.println(Arrays.toString(sArray));

        System.out.println(Arrays.toString(s2Array));

        boolean b=Arrays.equals(s2Array,sArray);

        if (b)

            System.out.println("anagram");

        else
            System.out.println("not anagram");


    }
}


