package replit4;

import java.util.Scanner;

public class AvoidX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the word");

        String word = scan.next();

        String newWord = "";

        int length = word.length();

        boolean first1 = word.substring(0, 1).equalsIgnoreCase("x");

        String xSt=""+word.charAt(word.length()-1);

        boolean last = xSt.equalsIgnoreCase("x");


        if (first1 && last) {

            newWord = word.substring(1, length - 1);

        } else if (first1) {

            newWord = word.substring(1);

        } else if (last) {

            newWord = word.substring(0, length - 1);

        }else {

            newWord=word;
        }

        System.out.println(word);
        System.out.println(newWord);


    }
}