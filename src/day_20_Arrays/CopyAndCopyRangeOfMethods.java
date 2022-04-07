package day_20_Arrays;

import java.util.Arrays;

public class CopyAndCopyRangeOfMethods {

    public static void main(String[] args) {

        int arr1[]={1,2,3,4,5,6,7};

        int arr2[]=Arrays.copyOf(arr1,5);  // first give the original array name; then it starts from the beginning to the given index.

        int arr3[]=Arrays.copyOfRange(arr1,3,6);  //first give the the original array name; and define the range!!
        // like sustring method ; it doesnt include the last index.


        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));







    }
}
