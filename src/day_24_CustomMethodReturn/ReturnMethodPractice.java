package day_24_CustomMethodReturn;

public class ReturnMethodPractice {


    public static int maxNumberBetween(int a, int b) {

        int max = -2000000;

        for (int i = a; i <= b; i++) {

            if (i >= max)

                max = i;

        }
        return max;

    }

    public static void main(String[] args) {

        System.out.println(maxNumberBetween(100, 200));

        int result = maxNumberBetween(100, 200) * 2;

        System.out.println(result);


    }
}
