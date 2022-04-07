package day_24_CustomMethodReturn;

import java.util.Arrays;

public class ReturnMethodTasks1 {

    public static int frequencyOfTheWord(String str, String str2) {

        int result = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.contains(str2)) {

                str = str.replaceFirst(str2, " ");

                result++;

            }

        }
        return result;
    }

    public static String isAnagram(String str, String str2) {

        String result = "";

        String strArray[] = str.split("");

        String str2Array[] = str2.split("");

        Arrays.sort(strArray);

        Arrays.sort(str2Array);

        if (Arrays.equals(str2Array, strArray))

            result = "is anagram";
        else
            result = "is not anagram";

        return result;

    }
    public static String reverseTheWord(String str) {

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            result += str.charAt(i);
        }
        return result;
    }

    public static int[] addElement(int[] arr, int num){

        int arrayNew[]=new int[arr.length+1];

        for (int i = 0; i < arrayNew.length-1; i++) {

            arrayNew[i]=arr[i];
        }
        arrayNew[arrayNew.length-1]=num;

        return arrayNew;
    }

    public static int[] reverseArray(int arr[]){

        int reverseArray[]=new int[arr.length];

        for (int i = arr.length - 1,j=0; i >= 0; i--,j++) {

            reverseArray[j]=arr[i];
        }
        return reverseArray;

    }

    public static void main(String[] args) {

        System.out.println(frequencyOfTheWord("javajava pyhton java ahmet mehmet java", "java"));

        System.out.println(isAnagram("silent", "listen"));

        System.out.println(reverseTheWord("mehmet"));

        System.out.println(Arrays.toString(addElement(new int[]{1,2,3}, 4)));

        System.out.println(Arrays.toString(reverseArray(new int[]{10,20,30,40})));

    }
}
