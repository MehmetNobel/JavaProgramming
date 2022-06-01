package day_53_Functional_Interface_Lambda.tasks;

import java.util.function.Function;

public class FindMaxFromAnArray {

    public static void main(String[] args) {

        Function<Integer[], Integer> findMaxFromAnArray = n -> {

            int max = Integer.MIN_VALUE;

            for (Integer each : n) {

                if (each > max)
                    max = each;
            }
            return max;
        };

        Integer arr[]={27,28,30,32,35,40,45,52};
        System.out.println("findMaxFromAnArray.apply(arr) = " + findMaxFromAnArray.apply(arr));


    }
}
