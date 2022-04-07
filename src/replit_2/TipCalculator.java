package replit_2;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String summary="";

        double totaltip = 0;

        // System.out.println("split or not - Yes or No");

        String answer=scan.next();

        //System.out.println("enter the number of people");

        int people = scan.nextInt();

        //System.out.println("enter the amount");

        String symbol="";

        for (int i = 1; i <= people; i++) {

            symbol +="&";

        }





        double amount = scan.nextDouble();

        scan.nextLine();

        //System.out.println("how about service quality");

        String service = scan.nextLine();

        switch (service) {

            case "Poor":
                totaltip = amount * 0.05;
                break;
            case "Fair":
                totaltip = amount * 0.10;
                break;
            case "Good":
                totaltip = amount * 0.15;
                break;
            case "Great":
                totaltip = amount * 0.20;
                break;
            case "Excellent":
                totaltip = amount * 0.25;

        }



        if (answer.equalsIgnoreCase("Yes")) {

            summary = "Split:\nNumber of people:\nCheck amount:\nService Quality:\nNumber of people entered: " +symbol +
                    "\nTotal to pay: " + (amount+totaltip)
                    + "\nTotal tip: " + totaltip
                    + "\nTotal per person: " + ((amount + totaltip) / people)
                    + "\nTip per person: " + (totaltip / people);


        } else {

            summary = "Split:\nNumber of people:\nCheck amount:\nService Quality:\nNumber of people entered: "+symbol +
                    "\nTotal to pay: " + (amount +totaltip)+ "\nTotal tip: " + totaltip;

        }


        System.out.println(summary);


    }


}
