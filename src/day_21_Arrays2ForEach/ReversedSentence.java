package day_21_Arrays2ForEach;

import java.util.Arrays;

public class ReversedSentence {
    public static void main(String[] args) {


        String str[] = {"seni seviyorum", "güzel ailem", "zeynep", "tuna"};




        for (String s : str) {
            String result = "";
            for (int i1 = s.length() - 1; i1 >= 0; i1--) {

                result += s.charAt(i1);

            }
            System.out.println(result);
        }


    }


}



