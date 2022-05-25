package day_51_Map;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aaabbbcccddddeee";

        String[] chars = str.split("");

        List<String> list1 = new ArrayList<>(Arrays.asList(chars));

        System.out.println("Collections.frequency(list1,\"a\") = " + Collections.frequency(list1, "a"));

        Map<String, Integer> map1 = new LinkedHashMap<>();

        String result = "";

        for (String s : list1) {

            map1.put(s, Collections.frequency(list1, s));

        }

        System.out.println("map1 = " + map1);


    }
}
