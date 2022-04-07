package replit_1.tasks_muhtar;

import java.util.Scanner;

public class AvoidFirstChar {

    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in);

        System.out.println("enter two words");

        String word1= scan.next();

        String word2=scan.next();

        System.out.print(word1.substring(1));

        System.out.println(word2.substring(1));



    }
}
