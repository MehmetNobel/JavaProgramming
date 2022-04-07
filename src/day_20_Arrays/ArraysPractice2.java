package day_20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter the size of array");

        int size = scan.nextInt();

        if (size <= 0) {
            System.err.println("invalid entry!!!");

            System.exit(0);   // terminates JVM

        }

        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {

            System.out.println("please enter the number: ");

            numbers[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        scan.close();


    }
}
