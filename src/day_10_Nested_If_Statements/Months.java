package day_10_Nested_If_Statements;

import java.util.Scanner;

public class Months {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number of the year: ");

        int number = scan.nextInt();

        String result = " ";

        if (number > 0 && number <= 12) {

            if (number == 1) {

                result = "january";
            } else if (number == 2) {

                result = "february";
            } else if (number == 3) {

                result = "march";
            } else if (number == 4) {

                result = "april";
            } else if (number == 5) {

                result = "may";
            } else if (number == 6) {

                result = "june";
            } else if (number == 7) {

                result = "july";
            } else if (number == 8) {

                result = "august";
            } else if (number == 9) {

                result = "september";
            } else if (number == 10) {

                result = "october";
            } else if (number == 11) {

                result = "november";
            } else {

                result = "december";
            }

            System.out.println("result = " + result);

        } else {

            System.out.println("please enter a valid number !!");


        }


    }
}
