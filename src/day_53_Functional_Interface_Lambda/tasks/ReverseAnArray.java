package day_53_Functional_Interface_Lambda.tasks;

import java.util.Arrays;
import java.util.function.Function;

public class ReverseAnArray {

    public static void main(String[] args) {


        Function<Integer[],Integer[]> reverseAnArray=n->{

            Integer arr[]=new Integer[n.length];

            int k=0;

            for (int i = n.length - 1; i >= 0; i--) {

                arr[k++]=n[i];

            }
            return arr;

        };

        Integer arr[]={27,28,30,32,35,40,45,52,80,85,100};

        Integer[] reversedArray = reverseAnArray.apply(arr);

        System.out.println("Arrays.toString(reversedArray) = " + Arrays.toString(reversedArray));

    }
}
