package day_51_Map;

import java.util.*;

public class MapPractice4 {

    public static void main(String[] args) {

        String group1[]={"mehmet","ali","latif"};
        String group2[]={"ahmet","aşkın","selahattin"};
        String group3[]={"esad","tuna","mustafa"};
        String group4[]={"zeynep","elif","sema"};
        String group5[]={"ayşe","fehmi","kader"};


        Map<Integer, String[] > map1=new LinkedHashMap<>();


        map1.put(1,group1);
        map1.put(2,group2);
        map1.put(3,group3);
        map1.put(4,group4);
        map1.put(5,group5);

        for (Map.Entry<Integer, String[]> entry : map1.entrySet()) {

            System.out.print("group "+ entry.getKey() +" : ");
            System.out.println(Arrays.toString(entry.getValue()));
        }



        System.out.println("group 5");
        for (Map.Entry<Integer, String[]> entry : map1.entrySet()) {

            if(entry.getKey()==5){

                for (int i = 0; i < entry.getValue().length; i++) {

                    if(i==1) {
                        System.out.println(entry.getValue()[i]);
                    }

                }

            }

        }

        Map<Integer, LinkedList<String> > map2=new LinkedHashMap<>();
        LinkedList<String> gr1=new LinkedList<>(Arrays.asList(group1));
        LinkedList<String> gr2=new LinkedList<>(Arrays.asList(group2));
        LinkedList<String> gr3=new LinkedList<>(Arrays.asList(group3));
        LinkedList<String> gr4=new LinkedList<>(Arrays.asList(group4));
        LinkedList<String> gr5=new LinkedList<>(Arrays.asList(group5));

        map2.put(1,gr1);
        map2.put(2,gr2);
        map2.put(3,gr3);
        map2.put(4,gr4);
        map2.put(5,gr5);

        System.out.println("map2 = " + map2);

        for (Map.Entry<Integer, LinkedList<String>> entry : map2.entrySet()) {

            for (int i = 0; i <entry.getValue().size() ; i++) {

                System.out.println("entry.getValue().get(i) = " + entry.getValue().get(i));

            }

        }

        System.out.println("*****************the other way");

        for (LinkedList<String> value : map2.values()) {

            for (String s : value) {

                System.out.println("s = " + s);

            }

        }




    }


    }


