package replit_1.tasks_muhtar;

import java.util.Scanner;

public class MiddleLetterOfTheWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter the sentence");

        String sentence = scan.nextLine();

        if (sentence.length() < 3) {
            System.out.println("sentence is too short");
        } else if (sentence.length() > 3) {
            System.out.println("sentence is too long");

        } else if (sentence.length() == 3) {

            System.out.println("the letter in the middle is :" + sentence.charAt(1));
        }


    }
}
