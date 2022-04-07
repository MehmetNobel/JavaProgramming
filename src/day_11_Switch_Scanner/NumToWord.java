package day_11_Switch_Scanner;

import java.util.*;


public class NumToWord {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

            System.out.println("harfe çevrilecek numarayı giriniz: \nÇıkış için 0 a basınız");

            int num = scan.nextInt();

            String result = " ";

            switch (num) {

                case 1:
                    result = "bir";
                    break;
                case 2:
                    result = "iki";
                    break;
                case 3:
                    result = "üç";
                    break;
                case 4:
                    result = "dört";
                    break;
                case 5:
                    result = "beş";
                    break;
                case 6:
                    result = "altı";
                    break;

                default:
                    result = "invalid entry";

            }

            System.out.println(result);



    }
}
