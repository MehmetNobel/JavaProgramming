package day_10_Nested_If_Statements;

import java.util.Scanner;

public class GradeReportt {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the score .. ");

        int score = scan.nextInt();

        String result = " ";

        if (score >= 0 && score <= 100) {

            if (score >= 90) {

               result="excellent";

            } else if (score >= 80) {

                result="great";

            } else if (score >= 70) {

                result="good";

            } else if (score >= 60) {

                result="passed";

            } else {

                result="failed";
            }
            System.out.println("result = " + result);

        } else {

            System.out.println("ınvalid enrty..please correct the score value !!");
        }



    }
}
