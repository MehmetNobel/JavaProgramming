package replit_1.tasks_muhtar;

import java.util.Arrays;

public class day21tasks2 {

    public static void main(String[] args) {

        int arr1[] = {30, 10, 20};
        int arr2[] = {15, 40, 25, 35};
        int arr3[] = {8, 9, 17, 5, 4, 1};

        int arrMerged[]=new int[arr3.length+ arr2.length+ arr1.length];

        int k=0;

        for (int i : arr1) {

            arrMerged[k]=i;
            k++;

        }

        for (int i2 : arr2) {

            arrMerged[k]=i2;
            k++;

        }

        for (int i3 : arr3) {

            arrMerged[k]=i3;
            k++;

        }

        System.out.println(Arrays.toString(arrMerged));

    }
}
