package day_15_ForLoop;

public class startsWithEndsWith {

    public static void main(String[] args) {

        String sentence="I love java programming";

        System.out.println(sentence.toLowerCase().endsWith("ng"));// önce lowercase yapıp sonra kontrol ediyoruz.

        System.out.println(sentence.toLowerCase().startsWith("love")); // önce lowercase yapıp sonra kontrol ediyoruz

    }
}
