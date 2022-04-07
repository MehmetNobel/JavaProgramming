package day_11_Switch_Scanner;

import javax.swing.*;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        char ch = 'a';

        Scanner scan = new Scanner(System.in);

        System.out.println("1. sayıyı giriniz : ");

        int sayi1 = scan.nextInt();

        System.out.println("2. sayıyı giriniz : ");

        int sayi2 = scan.nextInt();

        int result = 0;

        if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

            switch (ch) {

                case '+':

                    result = sayi1 + sayi2;

                    break;

                case '-':

                    result = sayi1 - sayi2;

                    break;

                case '*':

                    result = sayi1 * sayi2;

                    break;

                default:

                    result = sayi1 / sayi2;

                    break;


            }

            System.out.println(result);

        }else {
                    System.err.println("yanlış operator; lutfen dogru giriniz:");


            }





        }
    }
