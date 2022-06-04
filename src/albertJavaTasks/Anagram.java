package albertJavaTasks;

import java.util.Arrays;

public class Anagram {


    public static void main(String[] args) {

        String str1="listen";
        String str2="silent";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("Arrays.equals(arr1,arr2) = " + Arrays.equals(arr1, arr2));

        //System.out.println("arr1.toString() = " + arr1.toString());
       // System.out.println("arr2.toString() = " + arr2.toString());

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


    }
}
