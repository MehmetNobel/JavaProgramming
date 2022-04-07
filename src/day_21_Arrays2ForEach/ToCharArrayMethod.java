package day_21_Arrays2ForEach;

public class ToCharArrayMethod {

    public static void main(String[] args) {

        String str="AHMET AYŞE ZEYNEP ESAD";

        char chars[]=str.toCharArray();

        int count=0;

        for (char aChar : chars) {

            System.out.print(aChar);

            count++;

        }

        System.out.println(count);




    }
}
