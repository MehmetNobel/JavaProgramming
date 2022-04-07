package replit_1.tasks_muhtar;

import java.util.Scanner;

public class CatsAndDogs2 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("enter the sentence");
        String sentence= scan.nextLine();

        sentence=sentence.toLowerCase();

        int k=0;
        int l=0;

        for (int i = 0; i <sentence.length() ; i++) {

            if (sentence.substring(i).startsWith("cat")){

                k++;
            } else if (sentence.substring(i).startsWith("dog")){

                l++;
            }

        }


        if (k==l) {

            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
