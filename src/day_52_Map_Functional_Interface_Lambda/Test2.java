package day_52_Map_Functional_Interface_Lambda;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {

       MySecondFunctionalInterface<Integer> squareOfTheNumber=n-> System.out.println(n*n);;

        squareOfTheNumber.test(2);

        MySecondFunctionalInterface<String> printEach=n-> {
            String[] split = n.split("");

            System.out.println(Arrays.asList(split));
        };

        printEach.test("mehmet");

        // if it is generic we must define the data type within <>.
        MySecondFunctionalInterface<Integer> msı=n->{
            System.out.println(n*n*n);
        };

        msı.test(5);






    }
}
