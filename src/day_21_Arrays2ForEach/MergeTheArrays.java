package day_21_Arrays2ForEach;

import java.util.Arrays;

public class MergeTheArrays {

    public static void main(String[] args) {


        int arr1[] = {1, 2, 3, 4};

        int arr2[] = {5, 6};

        int merged[] = new int[arr1.length + arr2.length];

        int k=0;

        for (int i = 0; i < arr1.length; i++) {

            merged[k] = arr1[i];

            k++;

        }

        for (int i = 0; i < arr2.length; i++) {

            merged[k]=arr2[i];
            k++;

        }

        System.out.println(Arrays.toString(merged));


    }


}
