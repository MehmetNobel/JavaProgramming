package day_20_Arrays;

import java.util.Arrays;

public class FindMaxElement {

    public static void main(String[] args) {

        //int max=-2000000000;

        int numbers[] = {4, 0, 5, 6, 5, 8, 9, 11, 11, 14, 2, 3};

       /* for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {

                max = numbers[i];

            }

        }

        */

        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]>max){

                max=numbers[i];
            }

        }

        System.out.println(Arrays.toString(numbers));

        System.out.println(max);


    }
}

