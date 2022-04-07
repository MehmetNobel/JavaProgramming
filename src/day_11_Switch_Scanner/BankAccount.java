package day_11_Switch_Scanner;

import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("hesap bakiyenizi giriniz:");

        int bakiye = scan.nextInt();

        System.out.println("yapılacak işlemi seçiniz:\n1-Hesap Bakiyesi sorma\n2-Para çekme\n3-Para Yatırma");

        int islem = scan.nextInt();

        switch (islem) {

            case 1:
                System.out.println("hesabınızda " + bakiye + " tl var.");
                break;
            case 2:
                System.out.println("çekilecek tutarı giriniz:");
                int tutar =scan.nextInt();
                bakiye-=tutar;
                System.out.println("yeni bakiyeniz : "+ bakiye);
                break;

            case 3:
                System.out.println("yatırılacak tutarı giriniz:");
                int tutar2 =scan.nextInt();
                bakiye+=tutar2;
                System.out.println("yeni bakiyeniz : "+ bakiye);
                break;

            default:
                System.out.println("eksik veya yanlış işlem!");

        }


    }


}
