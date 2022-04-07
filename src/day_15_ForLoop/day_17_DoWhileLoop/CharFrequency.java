package day_15_ForLoop.day_17_DoWhileLoop;

import java.util.Scanner;

public class CharFrequency {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String sentence=scan.nextLine();

        int count=0;

        for (int i = 0; i <sentence.length() ; i++) {

            if (sentence.charAt(i)=='a') {

                count ++;
            }

        }
        System.out.println("count = " + count);






    }
}
