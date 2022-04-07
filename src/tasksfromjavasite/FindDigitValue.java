package tasksfromjavasite;

import java.util.Scanner;

public class FindDigitValue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1 = 1;

        while (n1 > 0) {

            System.out.println("enter the number");

            n1 = scan.nextInt();

            int birler = n1 % 10;

            int temproray = n1 / 10;

            int onlar = temproray % 10;

            temproray = temproray / 10;

            int yuzler = temproray;

            System.out.println("yuzler = " + yuzler);
            System.out.println("onlar = " + onlar);
            System.out.println("birler = " + birler);

            if ((yuzler*yuzler*yuzler)+(onlar*onlar*onlar)+(birler*birler*birler)==n1) {

                System.out.println("this is a armstrong number");
            }else {

                System.out.println("this is not a armstrong number");
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

    }


}
