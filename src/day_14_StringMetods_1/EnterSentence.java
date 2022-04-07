package day_14_StringMetods_1;

import java.util.Scanner;

public class EnterSentence {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("enter 1. word");

        String word1=scan.nextLine();

        System.out.println("enter 2. word");

        String word2=scan.nextLine();

        String newword1=word1.substring(0,1).toUpperCase()+word1.substring(1).toLowerCase();

        String newword2=word2.substring(0,1).toUpperCase()+word2.substring(1).toLowerCase();


        System.out.println("word1 = " + word1);

        System.out.println("word2 = " + word2);

        System.out.println("newword1 = " + newword1);

        System.out.println("newword2 = " + newword2);

        System.out.println(newword1+" "+newword2);




    }
}
