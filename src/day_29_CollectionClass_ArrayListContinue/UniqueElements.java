package day_29_CollectionClass_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 1, 2, 3, 4, 5, 6, 5, 6, 10, 11));

        for (Integer each : list) {
            int count = 0;
            if (Collections.frequency(list, each) == 1)
                System.out.println("each = " + each);

        }

        String str = "aaabbcccdde";

        String arr[] = str.split("");

        ArrayList<String> task = new ArrayList<>();

        task.addAll(Arrays.asList(arr));

        System.out.println("task = " + task);

        ArrayList<String> taskUnique = new ArrayList<>();

        String result="";

        for (String s : task) {

            int count = Collections.frequency(task, s);

            result += s + count;

        }
        String result1="";
        System.out.println("result = " + result);

        
        for (String s : task) {

            int count = Collections.frequency(task, s);

            if (count == 1)

                taskUnique.add(s);

        }

        System.out.println("taskUnique = " + taskUnique);


    }


}

