package day_20_Arrays;

import java.util.Arrays;

public class MultiArrayFindTheMax {

    public static void main(String[] args) {

        int array2d[][]={{1,2},{3,4,5},{6,7,8,9,10}};

        int max[]=new int[3];

int max1=-2000000;
int j=0;

        for (int[] ints : array2d) {

            for (int i1 : ints) {

                if(i1>max1)
                    max1=i1;

            }
            max[j++]=max1;

        }

        System.out.println("Arrays.toString(max) = " + Arrays.toString(max));


    }
}
