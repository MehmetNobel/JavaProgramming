package day_53_Functional_Interface_Lambda;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterface2 {

    public static void main(String[] args) {

        // we use this function if there is two type of data type and returning boolean..

        //   a refers to array and p refers to the Integer
        BiPredicate<Integer[], Integer> contains = (a, p) -> {

            for (Integer each : a) {

                if (each == p)
                    return true;

            }

            return false;

        };

        Integer arr[] = {1, 2, 3, 4, 5};

        System.out.println("contains.test(arr,5) = " + contains.test(arr, 6));

        BiPredicate<String, String> isAnagram = (a, b) -> {

            String[] arr1 = a.split("");
            String[] arr2 = a.split("");

            // her iki arrayi de collection gibi sort ediyoruz.

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // ve eşit olup olmadığına bakıyoruz.
                return Arrays.equals(arr1,arr2);
        };

        System.out.println("isAnagram.test(\"listen\",\"silent\") = " + isAnagram.test("listen", "silent"));


        //BICONSUMER INTERFACE

        BiConsumer<String, Integer> printMultipleTimes=(a,b)->{

            for (int i = 1; i <=b ; i++) {

                System.out.println(a);
            }

        };

        printMultipleTimes.accept("mehmet",3);

        //BİCONSUMER INTERFACE accpets 2 differne or same data type and returs boolean at the end.
        // short way of printing the map key and values

        Map<String, Double> unit1 = new LinkedHashMap<>();
        unit1.put("Print Statements", 6.0);
        unit1.put("Escape Sequences", 3.0);
        unit1.put("Primitives", 6.0);
        unit1.put("Operators", 9.0);
        unit1.put("If Statements", 9.0);
        unit1.put("Switch Statement", 4.0);
        unit1.put("Scanner", 6.0);

        // printing with lambda expression

        unit1.forEach((k,v)->{
            System.out.println(k+":"+v);
        });

            //    given, given , return type
        BiFunction<Integer,Integer,Integer> findTheMax=(a,b)->{

            Integer max=a>b?a:b;

            return max;
        };

        System.out.println("findTheMax.apply(6,5) = " + findTheMax.apply(6, 5));


        BiFunction<Integer[],Integer[], List<Integer>> mergeTheArraysIntoTheList=(a,b)->{
            List<Integer> list1=new ArrayList<>();

            for (Integer each : a) {
                list1.add(each);

            }
            for (Integer each : b) {
                list1.add(each);

            }

            return list1;

        };

        Integer arr1[]={1,2,3};
        Integer arr2[]={4,5,6};
        System.out.println("mergeTheArraysIntoTheList.apply(arr1,arr2) = " +
                mergeTheArraysIntoTheList.apply(arr1, arr2));

        BiFunction<List<String>,List<Integer>,Map<String,Integer>> createMap=(a,b)->{

            Map<String, Integer> map1=new LinkedHashMap<>();

            for (int i = 0; i < a.size(); i++) {

                map1.put(a.get(i),b.get(i));

            }


            return map1;

        };

        Map<String, Integer> map2=new LinkedHashMap<>();

        List<String> list10=new ArrayList<>(Arrays.asList("ahmet","mehmet"));
        List<Integer> list11=new ArrayList<>(Arrays.asList(90,100));

        System.out.println("createMap.apply(list10,list11) = " + createMap.apply(list10, list11));

    }
}
