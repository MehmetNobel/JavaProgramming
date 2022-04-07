package day_12_Scanner;

import java.util.Scanner;

public class ScannerEx {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the age");

        String result=" ";

        byte gradeLevel = scan.nextByte();

        if (gradeLevel >= 1 && gradeLevel <= 18) {

            if (gradeLevel<= 5) {
               result ="elemantry";
            } else if (gradeLevel <= 8) {
                result ="middle school";
            } else if (gradeLevel <= 12) {
                result ="high school";
            } else if (gradeLevel <= 16) {
                result ="college";
            } else {
                result ="grad school";
            }

        } else {

            result ="invalid entry";
        }

        System.out.println(result);

    }
    }
