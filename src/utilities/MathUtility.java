package utilities;

public class MathUtility {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int substraction(int a, int b) {
        return a - b;
    }

    public static double substraction(double a, double b) {
        return a - b;
    }

    public static boolean isEven(int a) {

        if (a % 2 == 0)
            return true;
        return false;
    }

    public static boolean isEven(double a) {

        if (a % 2 == 0)
            return true;
        return false;
    }

    public static boolean isOdd(int a) {

        if (a % 2 == 1)
            return true;
        return false;
    }

    public static boolean isOdd(double a) {

        if (a % 2 == 1)
            return true;
        return false;
    }

    public static int max(int a, int b) {

        if (a > b)
            return a;
        return b;
    }

    public static double max(double a, double b) {

        if (a > b)
            return a;
        return b;
    }

    public static int min(int a, int b) {

            if (a > b)
            return b;
            return a;
    }

    public static double min(double a, double b) {

            if (a > b)
            return b;
            return a;
    }

    public static int square(int a) {
            return a*a;
    }

    public static double square(double a) {
        return a*a;
    }

    public static int cube(int a) {
        return a*a*a;
    }

    public static double cube(double a) {
        return a*a*a;
    }


}




