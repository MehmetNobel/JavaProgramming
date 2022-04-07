package day_22_Multi_DimensionalArray;

import java.util.Arrays;

public class ReverseSecondSentence {

    public static void main(String[] args) {


        String str = "I love java";

        String str2[] = str.split(" ");

        String secondWord = "";

        for (int i = 0; i < str2.length; i++) {

            secondWord = str2[1];

        }

        String secondReversed="";

        for (int i = secondWord.length()-1; i >=0 ; i--) {

            secondReversed+=secondWord.charAt(i);

        }

        str2[1]=secondReversed;

        System.out.println(Arrays.toString(str2));




    }
}
