package day_02;

public class Java1 {


    public static void giriskontrol(String isim, int parola) {

        if (isim.equals("ahmet") & parola == 123) {
            System.out.println("giriş başarılı");
        } else {
            System.out.println("giriş başarısız");
        }

    }


    public static void main(String[] args) {


        giriskontrol("ahmet", 123);

        giriskontrol("esad", 123);

        giriskontrol("zeynep", 1235);

        giriskontrol("esad1", 15);

        giriskontrol("ahmet", 123);


    }

}
