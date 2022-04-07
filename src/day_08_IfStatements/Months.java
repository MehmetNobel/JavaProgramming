package day_08_IfStatements;

import java.util.Scanner;

public class Months {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Kaçıncı ay olduğunu giriniz : " + "\nÇıkmak için 0 ' ya basınız .. ");

            int month = scan.nextInt();


            boolean result = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
            boolean result1 = month == 4 || month == 6 || month == 9 || month == 11;
            boolean result2 = month == 2;

            if (result) {

                System.out.println("bu ay 31 gündür");
            }

            if (result1) {

                System.out.println("bu ay 30 gündür");
            }

            if (result2) {

                System.out.println("bu ay 28 gündür");
            }

            if (!result && !result1 && !result2) {

                System.out.println("yanlış giriş");

                System.out.println("programdan çıkılıyor");

                break;
            }
            if (month==0) {

                System.out.println("programdan çıkılıyor");

                break;
            }


        }
    }
}


