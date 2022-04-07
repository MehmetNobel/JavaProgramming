package day_28_ArrayLists;

import java.util.ArrayList;

public class FindUniqueElementsInArrayList {

    public static void main(String[] args) {


        ArrayList<String> list=new ArrayList<>();

        list.add("ahmet");
        list.add("ahmet");
        list.add("java");
        list.add("pyhton");
        list.add("ruby");
        list.add("angular");
        list.add("java");
        list.add("ruby");


        System.out.println(list);

        ArrayList<String> uniques=new ArrayList<>();

        String element="Ahmet";


        /*for (int i = 0; i <list.size() ; i++) {

            if (list.indexOf(list.get(i)) == list.lastIndexOf(list.get(i)))
                uniques.add(list.get(i));

        }

         */

        for (String s : list) {

            if(list.indexOf(s)==list.lastIndexOf(s))
                uniques.add(s);

        }



        System.out.println(uniques);



    }
}
