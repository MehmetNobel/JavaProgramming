package day_26_CustomMethodsPractices;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {


    public static int[] removeDuplicates(int arr[]){

        int result[]={};

        for (int i : arr) {

            if(!ArraysUtility.isContain(result,i))
                result=ArraysUtility.addElement(result,i);

        }
        return result;

    }


    public static void main(String[] args) {

        int a[]={1,2,3,4,4,2,5,5,5,7};

        int result[]=removeDuplicates(a);

        System.out.println(Arrays.toString(result));


    }
}
