package day_26_CustomMethodsPractices;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {


    /*public static int[] reverseArray(int arr[]){

        int reverseArray[]={};

        for (int i=arr.length-1; i>=0; i--) {

            reverseArray= ArraysUtility.addElement(reverseArray,arr[i]);
        }

        return reverseArray;

    }

     */

    public static int[] reverseArray(int arr[]){

        int j=0;

        int reversedArray[]=new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            reversedArray[j++]=arr[i];

        }
        return reversedArray;



    }

    public static void main(String[] args) {


        int a[]={1,2,3,4};
        int b[]={4,5,6,7};


        System.out.println(Arrays.toString(reverseArray(a)));

        System.out.println(Arrays.toString(reverseArray(b)));



    }
}
