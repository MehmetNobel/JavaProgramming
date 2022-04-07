package day_28_ArrayLists;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromArrayList {

    public static void main(String[] args) {

        String str="ahmkksjkjdflsdkflskflksfkrsşfk";

        ArrayList<String> list=new ArrayList<>();

        String st[]=str.split("");

        System.out.println(Arrays.toString(st));

        for (int i = 0; i < st.length; i++) {

            list.add(st[i]);

        }

        System.out.println(list);

        ArrayList<String> listUnique=new ArrayList<>();


        for (String s : list) {

            if(list.indexOf(s)==list.lastIndexOf(s))

                listUnique.add(s);

        }

        System.out.println(listUnique);

        //listUnique.clear();

        ArrayList<Integer> listUnique2=new ArrayList<>();

        ArrayList<Integer> intlist=new ArrayList<>();

        intlist.add(10);
        intlist.add(20);
        intlist.add(30);
        intlist.add(30);
        intlist.add(20);
        intlist.add(40);

        /*for (Integer integer : intlist) {

            if(intlist.indexOf(integer)==intlist.lastIndexOf(integer))
                listUnique2.add(integer);

        }

         */

        for (Integer integer : intlist) {

            if(!listUnique2.contains(integer))
                listUnique2.add(integer);

        }


        System.out.println(listUnique2);

        System.out.println(listUnique.equals(listUnique2));  // comparase if the arraylist contens are the same or not

// equals: must be same elements in the same order!!

        System.out.println(listUnique2.isEmpty());  // defines if the arraylist is empty or not!! gives true or false

            listUnique2.addAll(Arrays.asList(51,52,53,54,55));

        System.out.println(listUnique2);






    }


}
