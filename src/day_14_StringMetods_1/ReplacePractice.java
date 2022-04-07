package day_14_StringMetods_1;

public class ReplacePractice {

    public static void main(String[] args) {


        String sentence = " java java java";

        String sentence2 = sentence.replaceAll("ja", "C");

        System.out.println("sentence = " + sentence);

        System.out.println("sentence2 = " + sentence2);

    }
}
