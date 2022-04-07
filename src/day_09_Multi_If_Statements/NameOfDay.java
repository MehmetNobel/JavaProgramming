package day_09_Multi_If_Statements;

import java.util.Scanner;

public class NameOfDay {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("write the order  of the day in the week\nPress 0 for quit !");

            int day = scan.nextInt();

            if (day == 1) {

                System.out.println("gün : pazartesi = " + day);
            } else if (day == 2) {

                System.out.println("gün : salı = " + day);
            } else if (day == 3) {

                System.out.println("gün : çarşamba = " + day);
            } else if (day == 4) {

                System.out.println("gün : perşembe = " + day);
            } else if (day == 5) {

                System.out.println("gün : cuma = " + day);
            } else if (day == 6) {

                System.out.println("gün : cumartesi = " + day);
            } else if (day == 7){

                System.out.println("gün : pazar = " + day);
            } else if (day==0){

                System.out.println("Programdan çıkılıyor"); break;
            } else {

                System.out.println("yanlış giriş, tekrar deneyin.");
            }

        }

    }

}
