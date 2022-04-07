package replit_1.tasks_muhtar;

import java.util.Scanner;

public class CharNumber {


    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("enter the sentence:");

        String sentence= scan.nextLine();

        System.out.println("enter the letter you want to find out:");

        String letter= scan.next();

        char ch=letter.charAt(0);

        int k=0;


        for (int i = 0; i <sentence.length() ; i++) {

            if (sentence.charAt(i)==ch){

                k++;
            }

        }

        System.out.println("k = " + k);








    }



}
