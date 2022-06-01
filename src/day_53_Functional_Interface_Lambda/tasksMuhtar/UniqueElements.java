package day_53_Functional_Interface_Lambda.tasksMuhtar;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class UniqueElements {

    public static void main(String[] args) {

        int arr[]={27,28,28,27,30,32,35,40,40,45,52,45,52,80,85,100};

        int[] array = Arrays.stream(arr).distinct().toArray();

        int[] array1 = Arrays.stream(arr).limit(3).toArray();

        OptionalInt max = Arrays.stream(array).max();

        System.out.println("max = " + max);

        //String s = Arrays.stream(arr).max().toString();

        // System.out.println("s = " + s);

        System.out.println("Arrays.toString(array1) = " + Arrays.toString(array1));

        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

        List<Integer> list1=new LinkedList<>();

        list1.addAll(Arrays.asList(-2,3,6,6,-2,4,5,5,12,15,18));

        List<Integer> collect = list1.stream().distinct().filter(p -> p > 0).collect(Collectors.toList());

        System.out.println("collect = " + collect);

        int arr2[]={27,-28,28,-27,30,32,-35,40,-40,45,52,45,-52,80,85,100};

        int[] arr3 = Arrays.stream(arr2).filter(p -> p < 0).toArray();

        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));

        long count = Arrays.stream(arr2).filter(p -> p < 0).count();

        System.out.println("count = " + count);

        List<String> list2=new LinkedList<>(Arrays.asList("ahmet","mehmet","mehmet","ayşe","zeynep"));

        long count1 = list2.stream().filter(p -> p.equalsIgnoreCase("mehmet")).count();

        System.out.println("count1 = " + count1);

    }
}
