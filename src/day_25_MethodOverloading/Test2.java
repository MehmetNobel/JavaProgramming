package day_25_MethodOverloading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

        int arr[]={1,2,3,10,15};

        System.out.println(ArraysUtility.max(arr));

        System.out.println(ArraysUtility.max(new int[]{100, 200, 300}));

        System.out.println(ArraysUtility.max(new double[]{2.2,2.5,25}));

        System.out.println(ArraysUtility.min(new double[]{2.1,1,3,4}));

        System.out.println(ArraysUtility.min(new int[]{1,2,3,13,-2}));

        System.out.println(ArraysUtility.isContain(new int[]{1,2,3},3));


    }
}
