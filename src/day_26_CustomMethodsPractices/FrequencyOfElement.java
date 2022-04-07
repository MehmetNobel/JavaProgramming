package day_26_CustomMethodsPractices;

public class FrequencyOfElement {

    // returns the frequency of the given element in the given array
    public static int frequencyOfElement(int arr[], int a) {

        int count = 0;

        for (int i : arr) {
            if (i == a)
                count++;

        }
        return count;
    }

    // returns the frequency of the given element in the given array
    public static int frequencyOfElement(double arr[], double a) {

        int count = 0;

        for (double i : arr) {
            if (i == a)
                count++;

        }
        return count;
    }

    // returns the frequency of the given element in the given array
    public static int frequencyOfElement(char arr[], char a) {

        int count = 0;

        for (char i : arr) {
            if (i == a)
                count++;

        }
        return count;
    }

    // returns the frequency of the given element in the given array
    public static int frequencyOfElement(String arr[], String str) {

        int count = 0;

        for (String i : arr) {
            if (i.equals(str))
                count++;

        }
        return count;
    }


    public static void main(String[] args) {


        System.out.println(frequencyOfElement(new int[]{1, 2, 3}, 1));

        System.out.println(frequencyOfElement(new double[]{1.1, 2, 3}, 2));

        System.out.println(frequencyOfElement(new char[]{'a', 'b', 'd'}, 'a'));

        System.out.println(frequencyOfElement(new String[]{"ahmet", "ayse", "zeynep"}, "ahmet"));

    }
}
