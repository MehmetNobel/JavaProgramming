package day_24_CustomMethodReturn;

public class ReturnMethodIntro {

    public static String reverseTheWord(String word){

        String result="";

        for (int i=word.length()-1;i>=0; i-- ) {

            result+=word.charAt(i);

        }
        return result;

    }

    public static void main(String[] args) {


        System.out.println(reverseTheWord("ayşe"));



    }
}
