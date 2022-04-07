package day_14_StringMetods_1;

public class StringMethods3_SubString {

    public static void main(String[] args) {

        String word="Java Programming Language";

        String word1=word.substring(word.indexOf("P"), word.indexOf(" L")+1);

        System.out.println(word1);

        System.out.println(word.substring(word.indexOf("J"),word.indexOf(" P")));

        System.out.println(word.substring(word.indexOf("P"), word.indexOf(" L")));

        System.out.println(word.substring(word.indexOf("L")));

        String family="Ahmet Ayşe Zeynep Esad";

        String word4=family.substring(family.indexOf("A"),family.indexOf(" A"));

        System.out.println("word4 = " + word4);

        String word2=family.substring(family.indexOf("Ay"),family.indexOf(" Z"));

        System.out.println("word2 = " + word2);

        String word3=family.substring(family.indexOf("E"));

        System.out.println("word3 =" +word3);

        String word5=family.substring(family.indexOf("Z"), family.indexOf(" E"));

        System.out.println("word5 = " + word5);

        String st="Java Programming is cool";

        String st1=st.replace("Java","Pyhton");

        System.out.println("st1 = " + st1);

        System.out.println(family.replace("Esad", "Tuna"));

        System.out.println(family.indexOf("Z"));










    }
}
