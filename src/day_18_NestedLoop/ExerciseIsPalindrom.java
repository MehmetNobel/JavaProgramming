package day_18_NestedLoop;

import java.util.Scanner;

public class ExerciseIsPalindrom {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the sentence please");

        String sentence =scan.nextLine();

        String result ="";

        for (int i = sentence.length()-1; i >=0 ; i--) {

            result +=sentence.charAt(i);

        }
        System.out.println(result);

        if (sentence.equalsIgnoreCase(result)) {

            System.out.println("palindrom");
        }else {

            System.out.println("not palindrom");
        }

        int sum=0;

        for (int i = 1; i <=10 ; i++) {

            sum +=i;

        }
        System.out.println(sum);


        int num1 =2;

        int num2=3;


        int resultPower=1;
        for (int i = 1; i <=num2 ; i++) {

            resultPower *=num1;

        }

        System.out.println(resultPower);

    }
}
