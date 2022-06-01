package day_53_Functional_Interface_Lambda.tasks;

import java.util.Arrays;
import java.util.function.Function;

public class SwapFirstAndLastElementFromAnArray {

    public static void main(String[] args) {

        Function<Integer[], Integer[]> swapFirstAndLastElement = n -> {

            int template = 0;

            template = n[0];  // template=27
            n[0] = n[n.length - 1];  // n[0]=52
            n[n.length - 1] = template;  //

            return n;

        };
        Integer arr[] = {27, 28, 30, 32, 35, 40, 45, 52};

        Integer[] arr2 = swapFirstAndLastElement.apply(arr);

        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));


    }
}
