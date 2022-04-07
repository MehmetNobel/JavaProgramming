package day_15_ForLoop.day_17_DoWhileLoop;

import java.util.Scanner;

public class CountJava {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the sentence");

        String str = scan.nextLine();

        System.out.println("enter the word");

        String word = scan.next();

        int count=0;


        while (str.contains(word)) {

            str=str.replaceFirst(word,"");

            count++;
        }

        System.out.println("count = " + count);







    }
}
