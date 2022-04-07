package day_21_Arrays2ForEach;

import java.util.Arrays;

public class ReversedArray {

    public static void main(String[] args) {

        int nums[]={10,30,20,40};

        int rev[]=new int[nums.length];

        /*int k=0;

        for (int i = nums.length - 1; i >= 0; i--) {
            rev[k]=nums[i];
            k++;
        }

         */

        for (int i = nums.length - 1, j=0; i >= 0; i--,j++) {

            rev[j]=nums[i];

        }

        System.out.println(Arrays.toString(rev));





    }
}
