package day_15_ForLoop.day_17_DoWhileLoop;

import java.util.Scanner;

public class MarryWithMe {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("will u marry with me?");

        String answer = scan.next();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {

            System.out.println("will u marry with me?");

            answer = scan.next();
        }

        if (answer.equalsIgnoreCase("yes")){

            System.out.println("congrats");
        } else if (answer.equalsIgnoreCase("no")){

            System.out.println("good bye");
        }

    }
}
