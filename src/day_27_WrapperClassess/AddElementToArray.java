package day_27_WrapperClassess;

import java.util.Arrays;

public class AddElementToArray {


    public static int[] addElement2(int arr[], int a){

        int arrNew[]=new int[arr.length+1];

        int j=0;

        for (int i = 0; i <arr.length ; i++) {

            arrNew[j]=arr[i];

            j++;

        }
        arrNew[j]=a;


        return arrNew;
    }




    public static void main(String[] args) {


        int arr[]={1,2};

        int arr2[]=addElement2(arr,5);

        System.out.println(Arrays.toString(arr2));





    }
}
