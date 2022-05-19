package day_49_Collections_Set;

import java.util.*;

public class SetPractice2 {

    public static void main(String[] args) {


        String arr[]={"wooden", "spoon", "egg","Milk","spoon", "egg","milk"};

        Set<String> set1=new HashSet<String>(Arrays.asList(arr));
        Set<String> set2=new LinkedHashSet<String>(Arrays.asList(arr));
        Set<String> set3=new TreeSet<String>(Arrays.asList(arr));

        arr=set1.toArray(new String[0]);

        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        System.out.println("set3 = " + set3);

        System.out.println("arr = " + Arrays.toString(arr));

        ArrayList<Integer> list2=new ArrayList<>();

        list2.addAll(Arrays.asList(10,20,30,30,50,50,200,10,20,30,51,65,75,85,96));


        Set<Integer> set7=new HashSet<>(list2);

        Set<Integer> set5=new LinkedHashSet<>(list2);

        Set<Integer> set6=new TreeSet<>(list2);

        System.out.println("Treeset6 = " + set6);

        System.out.println("Linkedset5 = " + set5);

        System.out.println("Hashset7 = " + set7);

        List list10=new ArrayList<>(new TreeSet<>(list2));  // hem duplicate leri attı hem de sıraladı

        List list11=new ArrayList(new LinkedHashSet(list2));

        System.out.println("list10 = " + list10);

        System.out.println("list11 = " + list11);


        //  int arr2[]=list2.toArray(new int[0]);




    }


}
