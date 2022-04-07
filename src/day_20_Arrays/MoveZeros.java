package day_20_Arrays;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {


        int array[] = {10, 0, 5, 0, 1, 0};

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        int reversedArray[]=new int[array.length];

        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {

            reversedArray[j]=array[i];
            j++;
        }

        System.out.println(Arrays.toString(reversedArray));




    }
}
/*
6. write a program that can move all the zeros to the end of the array
Ex:
array = {10, 0, 5, 0, 1, 0};
output:
{10, 5, 1, 0, 0, 0}
 */