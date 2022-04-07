package day_20_Arrays;

import java.util.Arrays;

public class AnagramWords {

    public static void main(String[] args) {

        String one = "listenfdggfdfg";

        String two = "silentffsdfgfdfg";

        char oneArray[] = new char[one.length()];

        char twoArray[] = new char[two.length()];

        for (int i = 0; i < one.length(); i++) {

            oneArray[i] = one.charAt(i);
            twoArray[i] = two.charAt(i);

        }

        System.out.println(Arrays.toString(oneArray));
        System.out.println(Arrays.toString(twoArray));

        Arrays.sort(oneArray);

        Arrays.sort(twoArray);

        if (Arrays.equals(oneArray, twoArray))
            System.out.println("these are anagram words");
        else
            System.out.println("this are not anagram words");


    }

}
