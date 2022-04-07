package day_27_WrapperClassess;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Tasks {

    public static int[] insert(int arr[], int index, int value) {

        int arrNew[] = {};

        for (int i = 0; i < arr.length; i++) {

            if (i == index) {
                arrNew = ArraysUtility.addElement(arrNew, value);
            }
            arrNew = ArraysUtility.addElement(arrNew, arr[i]);
        }

        return arrNew;


    }


    public static int[] swap(int arr[], int index1, int index2) {

        int temp = arr[index2];

        arr[index2] = arr[index1];

        arr[index1] = temp;

        return arr;

    }

    public static String retrieve(String str) {

        String letters = "";
        String digits = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {

            if (Character.isLetter(str.charAt(i)))
                letters += str.charAt(i);

            if (Character.isDigit(str.charAt(i)))
                digits += str.charAt(i);

            if (!Character.isLetterOrDigit(str.charAt(i)))
                specialChars += str.charAt(i);

        }
        String result = "letters : " + letters + "\n" + "digits : " + digits +
                "\n" + "specialchars : " + specialChars;
        return result;
    }

    public static boolean isUppercaseAndLowercaseEqual(String str){

        int countUppercase=0;
        int countLowercase=0;

        for (int i = 0; i <str.length() ; i++) {

            if(Character.isUpperCase(str.charAt(i)))
                countUppercase++;
            if(Character.isLowerCase(str.charAt(i)))
                countLowercase++;

        }
        if(countLowercase==countUppercase)
            return true;

            return false;
    }


    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        String st[] = {"ahmet", "ayse"};

        System.out.println(Arrays.toString(ArraysUtility.insert(st, 0, "esad")));

        int arrNew[] = insert(arr, 2, 10);

        System.out.println(Arrays.toString(arrNew));

        arr = swap(arr, 1, 4);

        System.out.println(Arrays.toString(arr));

        String st1="wooden spoon 23\"585!";

        System.out.println(retrieve(st1));

        String s="JAVA java JAVA";

        System.out.println(isUppercaseAndLowercaseEqual(s));




    }
}
/*
1. Insert Task:
1.1 Create a method named insert that passes three
parameters: integer array, integer index, integer element. the method
inserts the given element to the given index of the array and returns the
new array
Ex:
arr = {10, 20, 30, 40, 50};
insert(arr, 2, 100) ==> {10,
20, 100, 30, 40, 50}
1.2 Create the same function for double array, char array
and string array
2. Swap Task:
2.1 Create a method named swap that passes three parameters: integer
array, integer i, integer j. the method swaps the element at index i with
the element at index j, and returns the new array
Ex:
arr = {10, 20, 30, 40, 50};
swap(arr, 2, 4) ==>  {10, 20, 50, 40,
30}
2.2 Create the same function for double array, char array and string
array
3. Write a program that can retrieve the letters, digits and special
characters from the string
Ex:
str = "Wooden Spoon!"
output:
letters= "WoodenSpoon";
Digits = "";
specialChars = " !";
4. Write program that returns true if the total number of upper case
characters are equal to total number of Lowercase characters of a
string
Ex:
str = "JAVA java";
output:
true
 */