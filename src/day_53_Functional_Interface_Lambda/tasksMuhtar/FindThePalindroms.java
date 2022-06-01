package day_53_Functional_Interface_Lambda.tasksMuhtar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FindThePalindroms {

    public static void main(String[] args) {

        Function<List<String>, List<String>> palindrom = n -> {

            List<String> list1 = new ArrayList<>();

            for (String s : n) {

                String reversedString = new StringBuilder(s).reverse().toString();

                if (s.equalsIgnoreCase(reversedString))

                    list1.add(s);
            }

            return list1;
        };


        List<String> list=new ArrayList<>(Arrays.asList("anna","kayak","mehmet","ayşe"));

        List<String> list1 = palindrom.apply(list);

        System.out.println("list1 = " + list1);


    }

}
