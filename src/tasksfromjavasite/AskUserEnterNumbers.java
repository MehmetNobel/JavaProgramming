package tasksfromjavasite;

import java.util.Scanner;

public class AskUserEnterNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String countOfPositives = "";
        String countOfNegatives = "";
        String countOfZeros = "";

        int countp=0;
        int countn=0;
        int countz=0;


        while (true) {

            System.out.println("enter the number");

            int n1 = scan.nextInt();

            if (n1 > 0) {

                countOfPositives += n1+",";
                countp++;

            } else if (n1 < 0) {

                countOfNegatives += n1+",";
                countn++;
            }else {

                countOfZeros += n1+",";
                countz++;
            }

            System.out.println("do u want to go on");

            String answer = scan.next();


            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {

                System.err.println("please enter valid answer : yes or no");

                answer = scan.next();

            }
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }
        System.out.println("countOfZeros = " + countOfZeros+" adedi: "+countz);
        System.out.println("countOfPositives = " + countOfPositives+ " adedi: "+countp);
        System.out.println("countOfNegatives = " + countOfNegatives+ " adedi: "+countn);

    }
}
