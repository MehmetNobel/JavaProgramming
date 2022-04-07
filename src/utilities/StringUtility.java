package utilities;

import java.util.Arrays;

public class StringUtility {

    //prints each char of the String
    public static void printEachChar(String str) {

        for (int i = 0; i < str.length(); i++) {

            System.out.print(str.charAt(i) + " ");

        }


    }

    //reverse the given string then returns the reversed string
    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            reverse += str.charAt(i);
        }
        return reverse;
    }

    //returns true or false if the string palindrom or not
    public static boolean isPalindrom(String str) {

        return reverse(str).equalsIgnoreCase(str);

    }

    // returns true or false if the string anagram or not
    public static boolean isAnagram(String str1, String str2) {

        String array1[] = str1.split("");
        String array2[] = str2.split("");

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);

    }

    //remove duplicates and gives new String
    public static String removeDuplicates(String str) {

        String newString = "";

        for (int i = 0; i < str.length(); i++) {

            if (!newString.contains("" + str.charAt(i)))
                newString += str.charAt(i);
        }
        return newString;
    }

}

