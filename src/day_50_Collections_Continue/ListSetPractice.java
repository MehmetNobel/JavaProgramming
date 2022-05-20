package day_50_Collections_Continue;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set1=new HashSet<>();

        set1.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println("set1 = " + set1);

        System.out.println("set1.size() = " + set1.size());

        Integer arr[]=set1.toArray(new Integer[0]);

        System.out.println(Arrays.toString(arr));

        List<Integer> list1=new ArrayList<>(set1);

        System.out.println("list1 = " + list1);

        Queue<String> q1=new LinkedList<>();
        Queue<String> q2=new PriorityQueue<>();

        q1.addAll(Arrays.asList("ahmet","mehmet","can","fehmi","hasan"));
        q2.addAll(Arrays.asList("ahmet","mehmet","can","fehmi","hasan"));

        System.out.println(" before poll : q1 = " + q1);

        q1.poll();   // the first element will be removed from the queue.becasue of FIFO.

        Queue<String> q3=new ArrayDeque<>(q1);
        System.out.println("after poll : q1 = " + q1);

        q2.poll();

        q3.poll();

        System.out.println("q2 = " + q2);

        System.out.println("q3 = " + q3);

    }




}
