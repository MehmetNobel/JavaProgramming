package day_24_CustomMethodReturn;

import java.util.Arrays;

public class ReturnMethodTasks2 {

    public static String contains(int[] arr, int num) {

        String result = "";

        String result1 = "";

        String num1 = "" + num;

        for (int each : arr) {

            result += each;
        }
        if (result.contains(num1))

            result1 = "true";

        else
            result1 = "false";

        return result1;

    }

    public static int[] removeTheElement(int[] arr, int index) {

        int newArray[] = new int[arr.length-1];

        for (int i = 0, j = 0; i < arr.length; i++, j++) {

            if (i == index) {
                    --j;
                continue;
            }
            newArray[j] = arr[i];
        }
        return newArray;

    }

    public static void main(String[] args) {

        System.out.println(contains(new int[]{1, 2, 3}, 2));

        System.out.println(Arrays.toString(removeTheElement(new int[]{1,2,3,4},1)));


    }
}
