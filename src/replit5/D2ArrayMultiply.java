package replit5;

import java.util.Arrays;

public class D2ArrayMultiply {
    public static int[][] scalar(int[][] matrix, int n) {

        int new2D[][] = new int[2][3];

        for (int i1 = 0; i1 < matrix.length; i1++) {

            for (int i2 = 0; i2 < matrix[i1].length; i2++) {


                new2D[i1][i2] = matrix[i1][i2] * n;

            }


        }

        return new2D;

    }

    public static void main(String[] args) {

        int[][] i = new int[][]  { {1, 1, 1}, {1, 1, 1}};
        i = scalar(i, 3);
        System.out.println(Arrays.deepToString(i));

    }//end main
}