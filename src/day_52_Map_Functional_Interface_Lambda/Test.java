package day_52_Map_Functional_Interface_Lambda;

public class Test {

    public static void main(String[] args) {

        MyFirstFunctionalInterface oddOrEven = (n) -> {
            if (n % 2 == 0)
                System.out.println("even number");
            if (n % 2 == 1)
                System.out.println("odd number");
        };

        oddOrEven.apply(20);

        MyFirstFunctionalInterface eligibleToVote = (n) -> {

            if (n >= 18)
                System.out.println("yes, you can vote");
            else
                System.out.println("yes, you can NOT vote");
        };

        eligibleToVote.apply(25);

        MyFirstFunctionalInterface cubeOfTheNumber = (n) -> {
            System.out.println(n * n * n);

        };


        // we can write like that too.

       /* MyFirstFunctionalInterface cubeOfTheNumber = n ->
            System.out.println(n * n * n);


        */
        cubeOfTheNumber.apply(2);

        MyFirstFunctionalInterface dividedBy3Or5 = (n) -> {
            if (n % 15 == 0)
                System.out.println("can be divided by 15");
            else
                System.out.println("can NOT be divided by 15");

        };

        dividedBy3Or5.apply(28);

        dividedBy3Or5.apply(30);


    }


}
