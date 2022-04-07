package day_11_Switch_Scanner;

import java.util.Scanner;

public class Switch_Grade_Report2 {

    public static void main(String[] args) {

       char ch='C';

        switch (ch) {

            case 'A':
                System.out.println("excellent");
                break;
            case 'B':
                System.out.println("GREAT");
                break;
            case 'C':
                System.out.println("GOOD");
                break;
            case 'D':
                System.out.println("PASSED");
                break;
            case 'E':
                System.out.println("FAILED");
                break;
            default:
                System.out.println("invalid item");
                break;


        }



    }
}
