package day_11_Switch_Scanner;

import javax.swing.*;
import java.util.Scanner;

public class Switch_Grade_Report {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter the grade word ..");

        String word=scan.nextLine();

        switch (word) {

            case "A":
                System.out.println("excellent");
                break;
            case "B":
                System.out.println("GREAT");
                break;
            case "C":
                System.out.println("GOOD");
                break;
            case "D":
                System.out.println("PASSED");
                break;
            case "E":
                System.out.println("FAILED");
                break;
            default:
                System.out.println("invalid item");
            break;


        }

    }

}
