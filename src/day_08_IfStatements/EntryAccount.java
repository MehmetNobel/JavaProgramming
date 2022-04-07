package day_08_IfStatements;

import java.util.Scanner;

public class EntryAccount {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int password = 1234;

        String accountName = "Ahmet";

        System.out.println("Hesap adını giriniz : ");

        String acc = scan.nextLine();

        System.out.println("şifreyi giriniz : ");

        int pass = scan.nextInt();

        boolean result = pass == 1234 && acc == "Ahmet";
        boolean result1 = pass == 1234 && acc != "Ahmet";
        boolean result2 = pass != 1234 && acc == "Ahmet";

        if (result) {

            System.out.println("giriş başarılı");
        }

        if (result1) {

            System.out.println("hesap adı yanlış; şifre doğru : giriş başarısız");
        }

        if (result2) {

            System.out.println("hesap adı doğru; şifre yanlış : giriş başarısız");
        }

        if (!result&&!result1&&!result2) {

            System.out.println("hesap adı ve şifre yanlış : giriş başarısız");
        }


    }
}
