package replit_1.tasks_muhtar;

import java.util.Scanner;

public class FrequencyOfTheWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the sentence");
        String sentence= scan.nextLine();

        System.out.println("enter the word to be find out");
        String word= scan.next();
        int k=0;

        for (int i = 0; i <sentence.length() ; i++) {

            if (sentence.substring(i).startsWith(word)){

                k++;
            }

        }


        System.out.println("k = " + k);

    }
}
