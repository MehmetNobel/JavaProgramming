package day_22_Multi_DimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;

public class FourDimensionalArray {

    public static void main(String[] args) {


        int array3d[][][]={{{1,2},{3,4,5},{6,7,8,9,10}}, {{10,20},{30,40,50},{60,70,80,90,100}}};

        ArrayList<Integer> list=new ArrayList<>();

        for (int[][] ints : array3d) {

            for (int[] anInt : ints) {

                for (int i : anInt) {

                    list.add(i);

                }

            }

        }
        System.out.println("list = " + list);


        int arr4d[][][][]={{{{1,2},{3,4,5},{6,7,8,9,10}}, {{10,20},{30,40,50},{60,70,80,90,100}}},{{{10,20},{30,4,5},{6,7,8,9,10}}, {{10,20},{30,40,50},{60,70,80,90,100}}}};

        System.out.println("*******************************//////////////////////////////////");

        for (int[][][] ints : arr4d) {

            for (int[][] anInt : ints) {

                for (int[] ints1 : anInt) {

                    for (int i : ints1) {

                        System.out.print(i+" ");

                    }
                    System.out.println();
                }
                System.out.println();
            }

        }


        System.out.println(Arrays.deepToString(arr4d));

    }
}
