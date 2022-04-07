package day_23_CustomMethods_Intro;

import java.time.Year;

public class CustomMethodsWithParameters {

    public static void evenOrOdd(int n) {

        if (n % 2 == 0)

            System.out.println("this is an even number");

        else

            System.out.println("this is not an even number");


    }

    public static void ageOfPerson(int birthYear){

        int age=2022-birthYear;

        System.out.println("your age is"+ age);

    }

    public static void xBetweenYNumbers(int X, int Y) {

        for (int i = X; i<=Y ; i++) {

            System.out.print(i);

        }


    }

    public static void writeaToZ(){

        for (char i = 'a'; i <='z' ; i++) {

            System.out.println(i);
        }

    }

    public static void main(String[] args) {


        evenOrOdd(21);

        ageOfPerson(1980);

        xBetweenYNumbers(20,30);

        System.out.println(" *************************");

        writeaToZ();


    }
}
