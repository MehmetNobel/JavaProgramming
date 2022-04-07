package day_23_CustomMethods_Intro;

public class CustomMethodsIntro {

    public static void display(String str) {

        System.out.println("how are u today " + str);

    }

    public static void greeetingCydeo(String str) {

        for (int i = 0; i <5 ; i++) {

            System.out.println("hello cydeo" + str);

        }

    }

    public static void greeetingEu8(String str) {

        for (int i = 0; i <5 ; i++) {

            System.out.println("hello EU8" + str);

        }

    }

    public static void main(String[] args) {

        display("mehmet");

        greeetingCydeo("Mehmet");

        greeetingEu8("Mehmet2");


    }
}
