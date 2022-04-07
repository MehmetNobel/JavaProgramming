package day_20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {


        String arr[]=new String[5];

        arr[0]="Ahmet";
        arr[1]="Mehmet";
        arr[2]="Esad";
        arr[3]="zeynep";
        arr[4]="ayşe";

        //System.out.println(arr);

        System.out.println(Arrays.toString(arr));  // arraysleri yazdırma şekli.

        int numbers[]=new int[4];

        numbers[1]=2;
        numbers[3]=4;

        System.out.println(Arrays.toString(numbers));




    }
}
