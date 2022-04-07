package day_14_StringMetods_1;

import java.util.Scanner;

public class DigitOrNot {

    public static void main(String[] args) {

        System.out.println("enter the character");

        String word = new Scanner(System.in).next();

        char first = word.charAt(0);

        String result = "";

        if (first >= 'a' && first <= 'z') {

            result = "lowercase";
        } else if (first >= 'A' && first <= 'Z') {

            result = "uppercase";
        } else if (first >= '0' && first <= '9') {

            result = "digit";
        } else {

            result = "special character";

        }

        System.out.println("result = " + result);

        boolean b1=result.isEmpty(); // if str.length() is 0

        boolean b2=result.isBlank(); // if there is only white spaces

        System.out.println("b1 = " + b1);

        System.out.println("b2 = " + b2);
    }
}