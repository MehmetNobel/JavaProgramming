package day_22_Multi_DimensionalArray;

import java.util.Arrays;

public class ReverseTheArrayZeynepYayla {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        int[][] reverse = new int[arr.length][];

        for (int i = arr.length - 1, k = 0; i >= 0; i--, k++) {

            reverse[k] = new int[arr[k].length];

            for (int j = arr[i].length - 1, l = 0; j >= 0; j--, l++) {

                reverse[k][l] = arr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(reverse));
    }
}
