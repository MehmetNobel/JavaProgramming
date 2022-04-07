package day_22_Multi_DimensionalArray;

import java.util.Arrays;

public class SplitTheWords {

    public static void main(String[] args) {


        String sentence="ahmet\n"+
                "nasılsın\n"+"750 ne yapıyosun 800\n"+"iyimisin";

        System.out.println(sentence);

        String str[]=sentence.split("\n");

        System.out.println(Arrays.toString(str));

        System.out.println(str[2]);

        String str3[]=str[2].split(" ");

        System.out.println(str3[3]);






    }

}
