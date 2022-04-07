package day_29_CollectionClass_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraystoArraylists {

    public static ArrayList<Integer> convertArrayToArrayList(int arr[]){

        ArrayList<Integer> list2=new ArrayList<>();

        for (int i : arr) {

            list2.add(i);
        }

         return  list2;
        }


    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};

        ArrayList<Integer> list=new ArrayList<>(convertArrayToArrayList(arr));

        System.out.println("list = " + list);

        System.out.println("***************************");

        System.out.println("arr = " + Arrays.toString(arr));

        System.out.println("list.size() = " + list.size());

        list.addAll(Arrays.asList(8,9,10,11,12,13,14,15));

        System.out.println("list = " + list);

        list.removeIf(p->p>10);

        System.out.println("list = " + list);


        System.out.println("list.containsAll(Arrays.asList(3,4,5)) = " + list.containsAll(Arrays.asList(3, 4, 5)));

        System.out.println("list.retainAll(Arrays.asList(3,4,5)) = " + list.retainAll(Arrays.asList(3, 4, 5)));

        System.out.println("list = " + list);

        list.addAll(Arrays.asList(10,15,20,25,30));

        System.out.println("list = " + list);

        list.removeAll(Arrays.asList(10,20,30));

        System.out.println("list = " + list);

        ArrayList<String> list3=new ArrayList<>();

        String arr2[]={"ahmet","b","c","d","e"};

        list3.addAll(Arrays.asList(arr2));

        System.out.println("list3 = " + list3);

        System.out.println("list3.retainAll(Arrays.asList(\"b\",\"c\")) = " + list3.retainAll(Arrays.asList("b", "c")));

        System.out.println("list3 = " + list3);

        list.addAll(Arrays.asList(50,55,60,65,70));

        System.out.println("list = " + list);

        list.removeIf(p->p%2==0);

        System.out.println("list = " + list);




    }
}
