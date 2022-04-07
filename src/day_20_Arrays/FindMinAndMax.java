package day_20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinAndMax {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("hom many numbers would u want to enter");

        int length = scan.nextInt();

        int numbers[] = new int[length];

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("enter the number: ");

            numbers[i] = scan.nextInt();

        }

        System.out.println(Arrays.toString(numbers));

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < min)

                min = numbers[i];

            if (numbers[i] > max)

                max = numbers[i];

        }

        System.out.println("min = " + min);

        System.out.println("max = " + max);

        double avrg = 0;

        for (int i = 0; i < numbers.length; i++) {

            avrg += numbers[i];

        }

        System.out.println("Avrg= " + (avrg / numbers.length));


    }


}
