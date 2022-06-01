package day_53_Functional_Interface_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static utilities.StringUtility.isPalindrom;

public class BuildInFunctionalInterface1 {

    public static void main(String[] args) {

        // one value and return true or false
        //most commonly used for removeif method for collection

        Predicate<String> isPalindrom = n -> {

            String reverse = new StringBuilder(n).reverse().toString();

            boolean b1 = n.equals(reverse);

            return b1;
        };

        System.out.println("isPalindrom(\"KAYAK\") = " + isPalindrom("KAYAK"));


        Predicate<Integer> isEven = n -> {

            if (n % 2 == 0)
                return true;
            else
                return false;

        };

        System.out.println("evenOrOdd.test(100) = " + isEven.test(100));

        List<String> list1 = new ArrayList<>(Arrays.asList("ahmet", "kayak", "bal"));

        list1.removeIf(isPalindrom);

        System.out.println("list1 = " + list1);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 8, 10));

        list2.removeIf(isEven);

        System.out.println("list2 = " + list2);


        // takes one type and return no value.. only performs the function.

        Consumer<String> test = (n) -> {

            String[] split = n.split("");

            System.out.println(Arrays.asList(split));

        };

        test.accept("mehmet");

        list2.addAll(Arrays.asList(10, 12, 14, 16));

        //not to remove but to give conditions we can use forEach method of Consumer Interface.

        list2.forEach(p -> {
            if (p % 3 == 0) System.out.println(p);
        });

        List<String> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList("mehmet nobel", "ali deveci", "latif kaya"));

        list3.forEach(p -> {

            System.out.println("p.substring(0,p.indexOf(\" \")) = " + p.substring(0, p.indexOf(" ")));

        });

        list3.forEach(p -> {

            String result = "";

            result += "" + p.charAt(0) + "." + p.charAt(p.lastIndexOf(" ") + 1);

            System.out.println(result);

        });

        // Function Interface

        //very useful since we can give two diffrenet paramater (T or R) and return any parameter.(T or R)

        // in this ex we give n for array and returning list.

        Function<Integer[], List<Integer>> convertoToList = (n -> {

            List<Integer> list4 = new ArrayList<>();

            for (Integer each : n) {

                list4.add(each);

            }

            return list4;


        });

        Integer arr[] = {1, 3, 5};


        System.out.println("convertoToList.apply(arr) = " + convertoToList.apply(arr));

        System.out.println("list2.size() = " + list2.size());


        Function<List<Integer>, Integer[]> convertListToArray = (n -> {

            Integer arr2[] = new Integer[n.size()];

            for (int i = 0; i < arr2.length; i++) {

                arr2[i] = n.get(i);

            }
            return arr2;


        });

        Integer[] arr3 = convertListToArray.apply(list2);

        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));

        Function<Integer[], Integer>  maxValue=(p->{

            int max=Integer.MIN_VALUE;

            for (Integer each : p) {

                if(each>max)
                    max=each;

            }

            return max;

        });

        System.out.println("maxValue.apply(arr3) = " + maxValue.apply(arr3));


    }
}
