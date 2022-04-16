package day_41_Exceptions;

import java.util.Locale;

public class Checked_Vs_Unchecked {

    public static void main(String[] args) {

        // unchecked exceptions

        int a=10;

        int b=0;

        // System.out.println(a/b);   this is an arithmeticexception  unchecked exception. and exit code 1.

        System.out.println("ahmet");

        char chars[]={'a','b','c'};

        // System.out.println(chars[99]); gives indexoutofexception ==>> unchecked exception.

        //null pointer exception

        // Student student1=null; if we null to the object then it says nullpointerexception

        String str="ahmet";

        System.out.println("str.toUpperCase() = " + str.toUpperCase());

        str=null;

        System.out.println("str.toLowerCase() = " + str.toLowerCase());


        System.out.println("hello");

        //Thread.sleep(3000);    checked exception

        System.out.println("cydeo");



    }
}
