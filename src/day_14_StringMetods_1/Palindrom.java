package day_14_StringMetods_1;


import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("enter the sentence");

        String sentence=scan.nextLine();

        String result ="";

        for (int i = sentence.length()-1; i >=0 ; i--) {

            result +=sentence.charAt(i);

        }
        System.out.println(sentence);
        System.out.println(result);

        if (sentence.equals(result)) {

            System.out.println("palindrom");
        } else {

            System.out.println("it is not a polindrom sentence");
        }








    }
}
