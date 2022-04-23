package day_29_CollectionClass_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Unique3 {

    public static void main(String[] args) {


        String str="aabbddeerrgh";

        String result="";

        ArrayList<String> list=new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println("list = " + list);

        list.removeIf(p-> Collections.frequency(list,p)>1);

        System.out.println("list = " + list);


    }
}
