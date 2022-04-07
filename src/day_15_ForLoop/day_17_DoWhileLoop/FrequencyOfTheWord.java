package day_15_ForLoop.day_17_DoWhileLoop;

import java.util.Scanner;

public class FrequencyOfTheWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the sentence");

        String str = scan.nextLine();

        System.out.println("enter the word");

        String word = scan.next();

        int count = 0;

       /* for (int i = 0; i < str.length(); i++) {

            if (str.substring(i).startsWith(word)) {

                count++;
            }

        }*/


        for (int i = 0; i <=str.length()-4 ; i++) {

            if(str.substring(i,i+4).equals(word)){

                count++;
            }

        }

        System.out.println("count = " + count);


    }
}
