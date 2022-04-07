package day_26_CustomMethodsPractices;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElement {

    //remove the given index's of element from the given array and returns new array.
    public static int[] removeElement(int arr[],int a){

        if(a<0||a>arr.length-1) {

            System.err.println("invalid index" + a);

            System.exit(0);
        }

        int arr2[]=new int[arr.length-1];

        int j=0;

        for (int i = 0; i < arr.length; i++) {

            if(i==a)
                continue;

            arr2[j++]=arr[i];

        }
        return arr2;

    }

    //remove the given index's of element from the given array and returns new array.
    public static double[] removeElement(double arr[],int a){

        if(a<0||a>arr.length-1) {

            System.err.println("invalid index" + a);

            System.exit(0);
        }

        double arr2[]=new double[arr.length-1];

        int j=0;

        for (int i = 0; i < arr.length; i++) {

            if(i==a)
                continue;

            arr2[j++]=arr[i];

        }
        return arr2;

    }

    //remove the given index's of element from the given array and returns new array.
    public static char[] removeElement(char arr[],int a){

        if(a<0||a>arr.length-1) {

            System.err.println("invalid index" + a);

            System.exit(0);
        }

        char arr2[]=new char[arr.length-1];

        int j=0;

        for (int i = 0; i < arr.length; i++) {

            if(i==a)
                continue;

            arr2[j++]=arr[i];

        }
        return arr2;

    }

    //remove the given index's of element from the given array and returns new array.
    public static String[] removeElement(String arr[],int a){

        if(a<0||a>arr.length-1) {

            System.err.println("invalid index" + a);

            System.exit(0);
        }

        String arr2[]=new String[arr.length-1];

        int j=0;

        for (int i = 0; i < arr.length; i++) {

            if(i==a)
                continue;

            arr2[j++]=arr[i];

        }
        return arr2;

    }


    public static void main(String[] args) {

        int arr[]={1,2,3,4};

        System.out.println(Arrays.toString(removeElement(arr,0)));

        System.out.println(Arrays.toString(removeElement(arr,3)));
        
        arr=removeElement(arr,2);

        System.out.println(Arrays.toString(arr));




    }
}
