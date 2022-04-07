package day_13_String;

import java.util.Locale;

public class CharAt_2 {

    public static void main(String[] args) {

        String str ="Java Programming is so cool! Have a great day..";

        str=str.toUpperCase();

        System.out.println(str);

        System.out.println(str.length());

        System.out.println(str.charAt(str.length()-1)); // en son harfi yazdırmak için.

        String str2="HAVE A GREAT DAY!";

        str2=str2.toLowerCase();

        System.out.println(str2);








    }

}
