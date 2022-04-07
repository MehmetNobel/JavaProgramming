package day_18_NestedLoop;

import java.util.Scanner;

public class FindUniqueCharacters {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("enter the sentence please");

        String sentence = scan.nextLine();

        String result = "";

        for (int i = 0; i < sentence.length(); i++) {

            char ch=sentence.charAt(i);

            boolean equal= sentence.indexOf(ch)==sentence.lastIndexOf(ch);

            if(equal) {

                result += ch;

            }

        }

        System.out.println("result = " + result);


    }
}
