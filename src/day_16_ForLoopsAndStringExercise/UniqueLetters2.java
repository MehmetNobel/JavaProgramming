package day_16_ForLoopsAndStringExercise;

import java.util.Scanner;

public class UniqueLetters2 {

    public static void main(String[] args) {

        String str = "ĞNNKMMHJGFDDZSŞŞŞTTTTURRR";

        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {

            String ch = "" + str.charAt(i);

            if ((str.indexOf(ch)==str.lastIndexOf(ch))) {

                result +=ch;

            }


        }

        System.out.println("str = " + str);

        System.out.println("result = " + result);


    }
}
