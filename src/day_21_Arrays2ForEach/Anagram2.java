package day_21_Arrays2ForEach;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Anagram2 {

    public static void main(String[] args) {

        String str1 = "listen";

        String str2 = "silent";

        char ch1[] = str1.toCharArray();

        char ch2[] = str2.toCharArray();

        Arrays.sort(ch1);

        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {

            System.out.println("anagram");

        } else {
            System.out.println("not anagram");

        }




    }
}
