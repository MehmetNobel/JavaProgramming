package day_26_CustomMethodsPractices;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTheTwoArrays {

    public static void main(String[] args) {

        int a[]={1,2,3,4};
        int b[]={4,5,6,7};

        int result[]= ArraysUtility.merge(a,b);

        System.out.println(Arrays.toString(result));





    }
}
