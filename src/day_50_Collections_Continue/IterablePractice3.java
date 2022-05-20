package day_50_Collections_Continue;

import utilities.StringUtility;

import java.util.*;

public class IterablePractice3 {


    public static void main(String[] args) {


        List<String> list2 = new ArrayList<>(Arrays.asList("madam", "kayak", "ahmet", "mehmet"));

        //list2.removeIf(p-> StringUtility.isPalindrom(p));

        System.out.println("before palindrom list2 = " + list2);

        Iterator<String> it = list2.iterator();

        while (it.hasNext()) {

            String result = "";

            String each=it.next();

            for (int i = (each.length() - 1); i >= 0; i--) {

                result += (each.charAt(i));
            }

            if (each.equalsIgnoreCase(result)) {

                it.remove();
            }

        }

        System.out.println("after palindrom list2 = " + list2);




      /*  Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 5, 2, 1, 3, 6, 7, 8, 9, 9, 10, 10));

        System.out.println("set1 before iterator= " + set1);

        Iterator<Integer> it2 = set1.iterator();

        while (it2.hasNext()) {
            if (it2.next() >= 4) {
                it2.remove();
            }
        }

        System.out.println("set1 after iterator= " + set1);

       */


    }
}
