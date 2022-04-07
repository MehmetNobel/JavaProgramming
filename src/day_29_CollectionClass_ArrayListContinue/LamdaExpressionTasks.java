package day_29_CollectionClass_ArrayListContinue;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class LamdaExpressionTasks {

    public static void main(String[] args) {


        ArrayList<String> list=new ArrayList<>();

        list.addAll(Arrays.asList("java","pyhton","javascrpit","go","ji"));

        System.out.println("list = " + list);

        list.removeIf(p->!p.startsWith("j"));

        //list.removeIf(p->!(""+p.charAt(0)).equals("j"));

        System.out.println("list = " + list);

        ArrayList<String> list2=new ArrayList<>();

        list2.addAll(Arrays.asList("java","pyhton","anna","javascrpit","go","ji"));

        list2.removeIf(p-> !StringUtility.isPalindrom(p));

        System.out.println("list2 = " + list2);

        list2.remove("anna");

        System.out.println("list2 = " + list2);

        list2.addAll(Arrays.asList("java","pyhton","anna","javascrpit","go","ji"));

        System.out.println("list2 = " + list2);




    }
}
