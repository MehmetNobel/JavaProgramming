package day_21_Arrays2ForEach;

import java.util.Arrays;

public class MergeCharArrays {

    public static void main(String[] args) {


        char ch1[]={'a','b','c'};
        char ch2[]={'d','e','f'};

        char merged[]=new char[ch1.length+ ch2.length];

        int i=0;

        for (char c : ch1) {

            merged[i++]=c;
        }

        for (char c : ch2) {

            merged[i++]=c;

        }

        System.out.println(Arrays.toString(merged));


    }
}
