package day_24_CustomMethodReturn;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTheArrays {

    public static int[] mergeArrays(int[] a, int[] b) {

        int intArray[] = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {

            intArray[i] = a[i];

        }
        for (int i = a.length,j=0; i < intArray.length; i++,j++) {

            intArray[i] = b[j];
        }

        return intArray;

    }//end mergR

    public static double[] mergeArrays(double[] a, double[] b) {

        double doubleArray[] = new double[a.length + b.length];

        for (int i = 0; i < a.length; i++) {

            doubleArray[i] = a[i];

        }
        for (int i = a.length,j=0; i < doubleArray.length; i++,j++) {

            doubleArray[i] = b[j];
        }

        return doubleArray;

    }//end mergR

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[in.nextInt()];
        int[] nums2 = new int[in.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        double arr1[]={1.2,3.4};
        double arr2[]={2.6,3.3};

        System.out.println(Arrays.toString(mergeArrays(nums, nums2)));

        System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));


    }
}