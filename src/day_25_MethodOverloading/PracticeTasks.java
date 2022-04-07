package day_25_MethodOverloading;

import java.util.Arrays;

public class PracticeTasks { // add elements to arrays


    public static int[] addElement(int arr[], int a) {

        int newArray[] = new int[arr.length + 1];


        for (int i = 0; i < arr.length; i++) {

            newArray[i] = arr[i];

        }

        newArray[arr.length] = a;

        return newArray;

    }

    public static char[] addElement(char array[], char ch) {

        char newArray[] = new char[array.length + 1];

        int i = 0;

        for (char c : array) {

            newArray[i++] = c;

        }
        newArray[array.length] = ch;

        return newArray;

    }

    public static String[] addElement(String array[], String ch) {

        String newArray[] = new String[array.length + 1];

        int i = 0;

        for (String c : array) {

            newArray[i++] = c;

        }
        newArray[array.length] = ch;

        return newArray;

    }

    public static double[] addElement(double array[], double ch) {

        double newArray[] = new double[array.length + 1];

        int i = 0;

        for (double c : array) {

            newArray[i++] = c;

        }
        newArray[array.length] = ch;

        return newArray;

    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(addElement(new int[]{1, 2, 3}, 4)));

        System.out.println(Arrays.toString(addElement(new char[]{'a', 'b'}, 'c')));

        System.out.println(Arrays.toString(addElement(new String[]{"esad", "deniz"}, "cenk")));

        System.out.println(Arrays.toString(addElement(new double[]{1.1, 2, 3}, 4.1)));





        //System.out.println(Arrays.toString(addElement(new double[]{1.1, 2.0, 3.0}, 4.1)));
    }

}
