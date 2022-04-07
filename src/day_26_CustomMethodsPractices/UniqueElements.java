package day_26_CustomMethodsPractices;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

   /* public static int[] uniqueElements(int arr[]) {

        int j = 0;
        for (int i : arr) {

            int count = ArraysUtility.frequencyOfElement(arr, i);
            if (count == 1)
                j++;

        }

        int arrNew[] = new int[j];
        int k = 0;
        for (int i : arr) {
            int count = ArraysUtility.frequencyOfElement(arr, i);
            if (count == 1)
                arrNew[k++] = i;

        }
        return arrNew;

    }

    */    // finding unique elements old method

    public static int[] uniqueElements(int arr[]) {

        int result[]={};

        for (int i : arr) {

            int count = ArraysUtility.frequencyOfElement(arr, i);
            if (count == 1)
                result=ArraysUtility.addElement(result,i);

        }
        return result;

    }

    public static double[] uniqueElements(double arr[]) {

        double result[]={};

        for (double i : arr) {

            int count = ArraysUtility.frequencyOfElement(arr, i);
            if (count == 1)
                result=ArraysUtility.addElement(result,i);

        }
        return result;

    }

    public static char[] uniqueElements(char arr[]) {

        char result[]={};

        for (char i : arr) {

            int count = ArraysUtility.frequencyOfElement(arr, i);
            if (count == 1)
                result=ArraysUtility.addElement(result,i);

        }
        return result;

    }

    public static String[] uniqueElements(String arr[]) {

        String result[]={};

        for (String i : arr) {

            int count = ArraysUtility.frequencyOfElement(arr, i);
            if (count == 1)
                result=ArraysUtility.addElement(result,i);

        }
        return result;

    }
    
    
    
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2};

        String str[]={"a","b","c","c"};

        System.out.println(Arrays.toString(uniqueElements(arr)));

        System.out.println(Arrays.toString(uniqueElements(str)));
    }



}


