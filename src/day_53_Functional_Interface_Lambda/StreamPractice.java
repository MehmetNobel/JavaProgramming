package day_53_Functional_Interface_Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {

        //stream is temporary container not a collection type.or data structure.

        //distinct() method .. avoid the duplicates from the list.

        List<Integer> list1=new ArrayList<>(Arrays.asList(2,4,6,6,5,5,3,1,1,2,2));

        // with collect it collects the the elements to convert to the list : press ctrl+space to see this :Collectors.toList()
        list1=list1.stream().distinct().collect(Collectors.toList());

        System.out.println("list1 = " + list1);

        //toArray : converts to array

        //collect(): converts to the list.

        int arr[]={1,2,2,3,3,4,5,5,6,6,7};

        int[] unique= Arrays.stream(arr).distinct().toArray();

        System.out.println("Arrays.toString(unique) = " + Arrays.toString(unique));

        List<Integer> list2=new ArrayList<>(Arrays.asList(2,4,6,6,5,5,3,1,1,2,2));

        //we skip first 5 elemnts and convert it to the set


        Set<Integer> collect = list2.stream().skip(5).collect(Collectors.toSet());

        System.out.println("collect = " + collect);

        int arr2[]={1,2,2,3,3,4,5,5,6,6,7};

        int[] ints = Arrays.stream(arr2).skip(3).toArray();

        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));

        List<Integer> list3=new ArrayList<>(Arrays.asList(2,4,6,6,5,5,3,1,1,2,2));

        //limit() method puts limits inside the list and just gives the ones to the limit.
        // 5. elemena kadar olanlar yaz demek
        List<Integer> collect1 = list3.stream().limit(5).collect(Collectors.toList());

        System.out.println("collect1 = " + collect1);

        int arr3[]={1,2,2,3,3,4,5,5,6,6,7};


        int[] ints1 = Arrays.stream(arr3).limit(3).toArray();

        System.out.println("Arrays.toString(ints1) = " + Arrays.toString(ints1));

        List<Integer> list4=new ArrayList<>(Arrays.asList(2,4,6,6,5,5,3,1,1,2,2));

        List<Integer> list = list4.stream().map(p -> p * 10).collect(Collectors.toList());

        System.out.println("list = " + list);

        List<Integer> list5 = list.stream().limit(4).collect(Collectors.toList());

        System.out.println("list5 = " + list5);

        System.out.println("list5.stream().map(p->p*3).collect(Collectors.toList()) = " + list5.stream().map(p -> p * 3).collect(Collectors.toList()));

        List<String> list6=new LinkedList<>(Arrays.asList("monday","tuesday","wednesday","thursday","firday","saturday","sunday"));

        List<String> list7 = list6.stream().map(p -> p.substring(0, 4)).collect(Collectors.toList());

        System.out.println("list7 = " + list7);

        List<Integer> list8=new ArrayList<>(Arrays.asList(2,4,6,6,5,5,3,8,12,21,24));

        List<Integer> list9 = list8.stream().filter(p -> p % 3 == 0).collect(Collectors.toList());

        System.out.println("list9 = " + list9);

        List<String> list10=new ArrayList<>(Arrays.asList("java","ahmet","mehmet","selim","ayşe"));

        long a = list10.stream().filter(p -> p.startsWith("a")).count();

        System.out.println("a = " + a);
        // forEach uses consumer function that is void.
        list10.stream().filter(p->p.contains("et")).forEach(p-> System.out.println(p));

        List<Integer> list11=new ArrayList<>(Arrays.asList(2,4,6,6,5,5,3,8,12,21,24));

        boolean b = list11.stream().allMatch(p -> (p % 2) == 0);

        System.out.println("b = " + b);

        boolean b1 = list11.stream().anyMatch(p -> p % 2 == 0);

        System.out.println("b1 = " + b1);

        System.out.println("list11.stream().noneMatch(p->p%5==0) = " + list11.stream().noneMatch(p -> p % 5 == 0));

        System.out.println("list11.stream().anyMatch(p->p%5==0) = " + list11.stream().anyMatch(p -> p % 5 == 0));


    }
}
