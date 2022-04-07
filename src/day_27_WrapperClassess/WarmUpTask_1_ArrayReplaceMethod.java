package day_27_WrapperClassess;

import java.util.Arrays;

public class WarmUpTask_1_ArrayReplaceMethod {

    public static int[] replace(int arr[], int index, int value){

        if(index<0||index> arr.length-1){
            System.err.println( "invalid index: ==>"+ index);
            System.exit(0);

        }

        arr[index]=value;

        return arr;

    }

    public static int[] replaceAll(int arr[], int value, int newValue){

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == value) {
                arr[i] = newValue;

            }
        }
        return arr;

    }


    public static void main(String[] args) {

        int a[]={1,2,3,4,1,1};

        int newArr[]=replace(a,1,6);

        System.out.println(Arrays.toString(newArr));

        newArr=replaceAll(a,1,10);

        System.out.println(Arrays.toString(newArr));




    }
}
