package day_53_Functional_Interface_Lambda.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ReverseList {

    public static void main(String[] args) {

        Function<List<Integer>,List<Integer>> reverseList=n->{

            List<Integer> list=new ArrayList<>();

            for (int i = n.size() - 1; i >= 0; i--) {

                list.add(n.get(i));
            }
            return list;


        };

        List<Integer> list=new ArrayList<>(Arrays.asList(10,12,14,16,18,20));

        List<Integer> reversedList = reverseList.apply(list);

        System.out.println("reversedList = " + reversedList);


    }
}
