package week01;

import java.util.Locale;
import java.util.Scanner;

public class StringPractices {


    public static String word(String str) {

        str = str.substring(0, 2).toUpperCase();

        return str;

    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word");

        String str=scan.next();

        System.out.println(word(str));


    }
}
