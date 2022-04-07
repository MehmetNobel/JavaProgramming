package day_22_Multi_DimensionalArray;

public class IterationOfMultiDimensionalArray {

    public static void main(String[] args) {

        int array2d[][]={{1,2},{3,4,5},{6,7,8,9,10}};


        for (int i = array2d.length - 1; i >= 0; i--) {

            for (int i1 = 0; i1 < array2d[i].length; i1++) {

                System.out.print(array2d[i][i1]+" ");
            }
            System.out.println();
        }

        System.out.println("========================0");


        for (int i = 0; i < array2d.length; i++) {

            for (int i1 = array2d[i].length - 1; i1 >= 0; i1--) {

                System.out.print(array2d[i][i1]+" ");

            }

            System.out.println();

        }
        System.out.println("/////////////////////////////////////////////////////");

        for (int i = array2d.length - 1; i >= 0; i--) {

            for (int i1 = array2d[i].length - 1; i1 >= 0; i1--) {

                System.out.print(array2d[i][i1]+" ");
            }
            System.out.println();
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        for (int[] ints : array2d) {

            for (int anInt : ints) {

                System.out.print(anInt+" ");

            }

            System.out.println();

        }




    }
}
