package day_10_Nested_If_Statements;

import java.util.Scanner;

public class Nested_If_Intro {

    public static void main(String[] args) {


        while (true) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Please enter q for quit!for continue press c..");

            String ans = scan.nextLine();

            if (ans.equalsIgnoreCase("q")) {

                System.out.println("signing off the program");

                break;
            }

            System.out.println("Please enter the score");

            int score = scan.nextInt();

            if (ans.equalsIgnoreCase("c")) {

                if (score >= 0 && score <= 100) {

                    if (score >= 60) {

                        System.out.println("you have passed from the exam.congratulations..");
                    } else {
                        System.out.println("you have failed from the exam..");
                    }

                }
                    else {

                        System.out.println("ınvalid entry..please control the datas..");
                    }
                }

            }
        }
    }
