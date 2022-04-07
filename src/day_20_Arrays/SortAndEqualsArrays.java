package day_20_Arrays;

import java.util.Arrays;

public class SortAndEqualsArrays {

    public static void main(String[] args) {


        int numbers[] = {2, 4, 6, 8, 11, 15, -1, -4, 0};

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        String classmates[] = {"mehmet", "ali", "mehmet", "eray", "latif", "coşkun", "omer"};

        Arrays.sort(classmates);

        System.out.println(Arrays.toString(classmates));

        String result[] = new String[classmates.length];

        int j = 0;

        for (int i = classmates.length - 1; i >= 0; i--) {

            result[j] = classmates[i];

            j++;

        }
        System.out.println(Arrays.toString(result));

        char arr1[] = {'a', 'b', 'c'};

        char arr2[] = {'b', 'a', 'c'};

        System.out.println(Arrays.equals(arr1,arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1,arr2));


    }
}
