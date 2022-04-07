package day_16_ForLoopsAndStringExercise;

import java.util.Scanner;

public class ForLoopExercise {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the sentence : ");

        String sentence = scan.nextLine();

        String result = "";

        for (int i = sentence.length() - 1; i >= 0; i--) {

            result += sentence.charAt(i);

        }

        System.out.println("sentence : " + sentence);

        System.out.println("reversesentence : " + result);


    }


}
