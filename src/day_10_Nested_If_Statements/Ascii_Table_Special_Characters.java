package day_10_Nested_If_Statements;

import java.util.Scanner;

public class Ascii_Table_Special_Characters {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);



        /*int ch = scan.nextInt();

        if (ch >= 48 && ch <= 57) {

            System.out.println("ch is digit: 0-----10 ");
        } else if (ch >= 65 && ch <= 90) {

            System.out.println("ch is alphabetic: A-----Z ");
        } else if (ch >= 97 && ch <= 122) {

            System.out.println("ch is alphabetic: a-----z ");
        } else {
            System.out.println("ch is a special character");
        }*/


       // System.out.println("enter char value");

        char ch = '5';

        if (ch >= 'a' && ch <= 'z')
            System.out.println("a ve z arasında..");
            else if (ch > 'A' && ch < 'Z')
                System.out.println("A ve Z arasında..");
            else if (ch >= '1' && ch <= '9')
                    System.out.println("1 ve 9 arasında..");







        }
    }
