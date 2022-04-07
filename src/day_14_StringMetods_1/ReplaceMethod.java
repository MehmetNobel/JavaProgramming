package day_14_StringMetods_1;

import java.util.Scanner;

import java.util.Scanner;

public class ReplaceMethod {

    public static void main(String[] args) {



     Scanner scan=new Scanner(System.in);

        System.out.println(" Enter the sentence");

        String sentence= scan.nextLine();

        System.out.println("sentence = " + sentence);

        String word=sentence.substring(0,sentence.indexOf(" "));

        System.out.println("word = " + word);

        String word2=sentence.replace("Today","Tomorrow");

        System.out.println("word2 = " + word2);



    }
}
