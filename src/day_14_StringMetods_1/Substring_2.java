package day_14_StringMetods_1;

public class Substring_2 {

    public static void main(String[] args){


        String word="veya uzun bir";

        String word1=word.substring(0,word.indexOf(" "));

        System.out.println("word1 = " + word1);

        String word2=word.substring(word.indexOf(" ")+1,word.lastIndexOf(" "));

        System.out.println("word2 = " + word2);

        String word3=word.substring(word.lastIndexOf(" "));

        System.out.println("word3 = " + word3);







    }




}
