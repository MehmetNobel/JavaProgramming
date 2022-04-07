package day_22_Multi_DimensionalArray;

import java.util.Arrays;

public class ReverseTheArray {

    public static void main(String[] args) {

        int arr[][] = {{1, 2, 3}, {4, 5, 6}};



        int arrNew[][] = new int[2][3];

        for (int i = arr.length - 1, k = 0; i >= 0; i--, k++) {

            int s = 0;

            for (int i1 = arr[i].length - 1; i1 >= 0; i1--, s++) {

                arrNew[k][s] = arr[i][i1];
            }
            }
        System.out.println(Arrays.deepToString(arrNew));
    }
}
 /* for (int[] ints : arr) {

            for (int anInt : ints) {

                System.out.print(anInt + " ");

            }

            System.out.println();

        }
        System.out.println("/////////////////////////////////////");

        */