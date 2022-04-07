package day_14_StringMetods_1;

import java.util.Scanner;

public class ReplaceExcercise {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("enter 1. word");

        String word=scan.nextLine();

        if (word.substring(0,1).equalsIgnoreCase("x")) {

            word=word.replace("x","a");
        }

        scan.close();

        System.out.println(word);




    }
}
