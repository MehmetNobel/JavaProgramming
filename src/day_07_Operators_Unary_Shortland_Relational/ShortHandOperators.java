package day_07_Operators_Unary_Shortland_Relational;

public class ShortHandOperators {

    public static void main(String[] args) {
        // JUST ADDİTİONASSIGNMENT BE USED FOR STRİNG; NOT THE OTHERS
        String word = "ahmet";

        System.out.println(word);   // ahmet yazdı
        word = "Esad";
        System.out.println(word);  // esad olarak güncelledik ve esad yazdı..

        word += " Tuna";
        System.out.println("word = " + word);  // string de eklenebiliyor


        int num=100;

        num %=4;

        System.out.println("num = " + num);

        num +=100;

        System.out.println("num = " + num);

        num %=3;

        System.out.println("num = " + num);

        num -=1;

        System.out.println("num = " + num);


    }
}
