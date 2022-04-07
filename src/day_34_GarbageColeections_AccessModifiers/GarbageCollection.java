package day_34_GarbageColeections_AccessModifiers;

import java.util.ArrayList;

public class GarbageCollection {

    public static void main(String[] args) {

        //1.way for garbage:

        String str = null;   //  ==>> eligible for garbage collection.

        String str2 = "";

        System.out.println("str2.length() = " + str2.length()); // dont give any error.

       // System.out.println("str.length() = " + str.length());// gives null pointer exception


        //2. way for garbage:

        String s1 = "ahmet";  // after the line 22 "ahmet" object is eligible for garbage collector..because new value is mehmet..

        s1 = "mehmet";

        String language = "turkish"; // after the line 26 "turkish" object is eligible for garbage collector..because new value is mehmet..

        language = "english";

        ArrayList<Integer> list1=new ArrayList<>();

        ArrayList<Integer> list2=list1;                   // there is one room but 2 doors.
                                                        // we can add element from both list1 and list2

        list1.add(10);

        list2.add(20);

        System.out.println("list1 = " + list1);

        System.out.println("list2 = " + list2);

    }


}
