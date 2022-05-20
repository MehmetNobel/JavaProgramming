package day_50_Collections_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice2 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList("ahmet", "mehmet", "mustafa", "recai", "davud", "fırat", "AHMET"));

        System.out.println("list1 before iterator= " + list1);

        Iterator<String> it = list1.iterator();  // iterotor medodunu kullanıp iterator interface ini baz alıyoruz.

        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase("ahmet")) {
                it.remove();
            }
        }

        System.out.println("list1 after iterator= " + list1);


        list1.removeIf(p->p.equalsIgnoreCase("davud"));

        System.out.println("list1 after lambda expression = " + list1);




    }


}
