package day_22_Multi_DimensionalArray;

import java.util.Arrays;

public class ThreeDimensionalArray {

    public static void main(String[] args) {


        int array2d[][]={{1,2},{3,4,5},{6,7,8,9,10}};


        int array3d[][][]={{{1,2},{3,4,5},{6,7,8,9,10}}, {{10,20},{30,40,50},{60,70,80,90,100}}};


        System.out.println(Arrays.deepToString(array3d));

        System.out.println("******************************");

        for (int[][] ints : array3d) {

            for (int[] anInt : ints) {

                for (int i : anInt) {

                    System.out.print(i+" ");

                }

                System.out.println();

            }

            System.out.println();

        }






    }
}
