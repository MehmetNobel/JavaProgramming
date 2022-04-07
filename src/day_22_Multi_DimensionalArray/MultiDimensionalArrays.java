package day_22_Multi_DimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {


        int array2d[][]={{1,2},{3,4,5},{6,7,8,9,10}};

        System.out.println(Arrays.deepToString(array2d));

        System.out.println(Arrays.toString(array2d[1]));  // we are now getting the single dimesional
        // array so we use tostring method.

        System.out.println(array2d[2][3]);

        System.out.println("*****************************************");

        for (int[] ints : array2d) {

            System.out.println(Arrays.toString(ints));

        }

        System.out.println("*************************************");

        for (int i = 0; i < array2d.length; i++) {

            System.out.println(Arrays.toString(array2d[i]));
        }

        System.out.println("========================================0000");

        for (int i = 0; i < array2d.length; i++) {

            for (int j = 0; j < array2d[i].length; j++) {

                System.out.print(array2d[i][j]+" ");

            }
            System.out.println();
        }



    }
}
