package tasksfromjavasite;

import java.util.Scanner;

public class TelephoneCall {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantity=0;

        double result = 0;

        while (true) {

            System.out.println("enter the call quantity");

            quantity = scan.nextInt();

            if (quantity <= 100) {

                result = 200;
            } else if (quantity <= 150) {

                result = 200 + (quantity - 100) * 0.60;
            } else if (quantity <= 200) {

                result = 200 + (quantity - 100) * 0.50;
            } else {

                result = 200 + (quantity - 200) * 0.40;
            }
            System.out.println("result = " + result);

            System.out.println("would u want to calculate new call..yes or no.");

            String answer=scan.next();

            while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))) {

                System.err.println("please enter a valid answer please: ");

                 answer=scan.next();

            }

            if(answer.equalsIgnoreCase("no")) {

                break;
            }

            }

        //System.out.println("result : "+result);

        }
    }
