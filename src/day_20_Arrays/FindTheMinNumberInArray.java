package day_20_Arrays;

import java.util.Arrays;

public class FindTheMinNumberInArray {

    public static void main(String[] args) {

        int numbers[]={1,2,3,-5,12,14};

        int min=numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i]<min) {

                min=numbers[i];
            }

        }
        System.out.println("min = " + min);

        System.out.println(Arrays.toString(numbers));



    }
}
