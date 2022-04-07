package day_14_StringMetods_1;

public class TrimMethod_IndexOf_Last_IndexOf {

    public static void main(String[] args) {

        String str = "   JAVA PROGRAMMING IS COOL  ";

        String str1 = str.toLowerCase().trim();   // hem kücük harf hem de white space leri temizledi.

        String str2 = str.toUpperCase();

        System.out.println("str1:" +str1);

        System.out.println("str2 = " + str2);

        String strTrim = str.trim();

        System.out.println("str = " + strTrim);

        String str10 = "JAVA 11 PROGRAMMING IS COOL";

        int pIndex=str10.indexOf("1 ")+2;   // + 2 diyerek p ye ulaştık

        System.out.println("pindex:" +pIndex);

        int secondA=str10.indexOf("A ");

        System.out.println("secondA = " + secondA);

        System.out.println(str10.indexOf("A "));

        System.out.println(str10.lastIndexOf("C"));

        int secondR=str10.indexOf("RA");

        System.out.println(secondR);

        System.out.println(str10.lastIndexOf("RA"));

        System.out.println(str10.lastIndexOf("OO"));

        System.out.println(str10.indexOf("11"));

        System.out.println(str10.lastIndexOf("IS")); // I NIN INDEKSINI VERİR.



    }


}
