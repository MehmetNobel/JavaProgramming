package day_20_Arrays;

import java.util.Arrays;

public class ReverseTheIntegers {

    public static void main(String[] args) {


        int array1[] = {1,3,2,4,6,7};

        int array2[]=new int[array1.length];

        int j=0;

        for (int i = array1.length - 1; i >= 0; i--,j++) {

            array2[j]=array1[i];


        }

        System.out.println(Arrays.toString(array1));

        System.out.println(Arrays.toString(array2));



    }
}
/*
5.  Write a program that can reverse an array of integers and
returns it as new array
ex:
array = {1,2,3,4,5};
output:
reversedArray = {5,4,3,2,1};
 */