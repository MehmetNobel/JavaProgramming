package day_28_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists_Tasks {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(list);

        // list.set(4,0);

        System.out.println(list);

        int temp = list.get(0);

        list.set(0, list.get(4));

        list.set(4, temp);

        System.out.println(list);


        ArrayList<Integer> oddList = new ArrayList<>();

        for (Integer integer : list) {

            if (integer % 2 == 1)
                oddList.add(integer * 2);
            else
                oddList.add(integer);
        }

        System.out.println(oddList);

        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        ArrayList<String> mergedArrays = new ArrayList<>();


        arr1.addAll(Arrays.asList("A", "B", "C"));

        arr2.addAll(Arrays.asList("D", "E", "F", "G"));
        //arr1 = {"A", "B", "C"};
        //arr2 = {"D", "E", "F", "G"};

        System.out.println(arr1);

        System.out.println(arr2);

        for (String s : arr1) {
            mergedArrays.add(s);
        }

        for (String s : arr2) {
            mergedArrays.add(s);
        }

        System.out.println(mergedArrays);

        int max = -2000000;
        for (Integer integer : oddList) {

            if (integer > max)
                max = integer;
        }
        System.out.println(max);

        int min = 2000000;
        for (Integer integer : oddList) {

            if (integer < min)
                min = integer;
        }
        System.out.println(min);

        //list = [1,2,2,3,4,4,5,6,7,7];

        ArrayList<Integer> list2=new ArrayList<>();

        list2.addAll(Arrays.asList(1,5,2,3,3,4,4,5,6,7,7));

        System.out.println(list2);

        for (int i = 0; i < list2.size(); i++) {

            if(list2.get(i)==list2.get((i+1))){
                System.out.println(list2.get(i));
                System.out.println(list2.get(i+1));
                System.out.println("duplicated value  is: "+ list2.get(i));
                break;
            }


        }


    }
}
/*
1. write a program that can set the last element of the Integer arraylist
to zero
            ex:
                list = [1,2,3,4,5];
                output: [1,2,3,4,0];
2. write a program that can swap the first and last elements of an
integer arraylist
            ex:
                list = [1,2,3,4,5];
                output: [5,2,3,4,1];
3. write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]
4. write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E",
"F", "G"}
5. Write a program that can find the maximum number from an ArrayList of
integers
Ex:
list = [1,2,3,4,5];
output:
5
6. Write a program that can find the minimum number from an ArrayList of
integers
Ex:
list = [1,2,3,4,5];
output:
1
7. Write a program that can return the first duplicated element from an
arrayList of Integer
Ex:
list = [1,2,2,3,4,4,5,6,7,7];
output:
2
8. Given the following arraylists:
ArrayList<Integer>  scores = new ArrayList<>();
scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55,
45, 73, 73, 35, 47));
ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~
100
ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59
Write a program that can count the total numbers of grade A, B, C,
D and F
 */