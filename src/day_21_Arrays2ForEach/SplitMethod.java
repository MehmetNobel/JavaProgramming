package day_21_Arrays2ForEach;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {

        String email="woodenspoon@cydeo.com";

        String str[]=email.split("@");

        System.out.println(Arrays.toString(str));

        System.out.println(str.length);

        String st[]=email.split("");

        System.out.println(Arrays.toString(st));

        char ch[]=email.toCharArray();

        System.out.println(Arrays.toString(ch));







    }
}
