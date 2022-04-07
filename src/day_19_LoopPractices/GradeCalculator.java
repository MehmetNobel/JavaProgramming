package day_19_LoopPractices;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String result = "";

        while (true) {

            System.out.println("please enter yor grade");

            double grade = scan.nextDouble();

            if (grade <= 0 || grade > 100) {

                System.err.println("Invalid Entry for grade");

                System.exit(0);

            } else if (grade >= 90) {
                result = "A"; }
            else if (grade >= 80) {
                result = "B"; }
            else if (grade >= 70) {
                result = "C"; }
            else if (grade >= 60) {
                result = "D"; }
            else if (grade >= 50) {
                result = "E"; }
            else  {
                result = "F"; }

                System.out.println("result = " + result);

                System.out.println("would you like to calculate another grade");

                String answer = scan.next();

                while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                    System.err.println("please enter valid answer!!");
                    answer = scan.next();
                }
                if (answer.equalsIgnoreCase("no")) {

                    System.out.println("Thank you for using Cydeo Circle Calculator APP");

                    break;


                }
            }

        }
    }

