package day_51_Map;

import java.util.*;

public class MapClassess {

    public static void main(String[] args) {


        //   key    value
        Map<Integer,String> hashmap=new HashMap<>();

        Map<Integer, String > linkedHashMap=new LinkedHashMap<>();

        Map<Integer,String> hashtable=new Hashtable<>();

        Map<Integer, String > treeMap=new TreeMap<>();

        hashmap.put(5,"ahmet");
        hashmap.put(70,"mehmet");
        hashmap.put(3,"ayşe");
        hashmap.put(32,"zeynep");   // we can give just one null for the key but we can give more than null for the value.
        hashmap.put(35,"ayş");
        hashmap.put(null,"kadir");
        hashmap.put(58,null);

        System.out.println("hashmap = " + hashmap);

        linkedHashMap.put(1,"sezai");
        linkedHashMap.put(5,"seza");
        linkedHashMap.put(2,"seza");
        linkedHashMap.put(3,"seza");
        linkedHashMap.put(null,null); // we can add 1 null key to the linkedhashmap

        System.out.println("linkedHashMap = " + linkedHashMap);

        treeMap.put(10,"a");
        treeMap.put(8,"b");
        treeMap.put(1,"z");
        treeMap.put(2,"d");
        treeMap.put(3,"s");   // we can not give null both for key and value since internally sorting acc. to the ascii table

        System.out.println("treeMap = " + treeMap);

        hashtable.put(1,"sezai");
        hashtable.put(5,"seza");
        hashtable.put(2,"seza");
        hashtable.put(3,"seza");

        System.out.println("hashtable = " + hashtable);  // random order ++ syncronized ++ slow since it is thread safe
        //does nut accpet null value


    }


}
