package day_53_Functional_Interface_Lambda;

import java.util.*;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Double> unit1 = new LinkedHashMap<>();
        unit1.put("Print Statements", 6.0);
        unit1.put("Escape Sequences", 3.0);
        unit1.put("Primitives", 6.0);
        unit1.put("Operators", 9.0);
        unit1.put("If Statements", 9.0);
        unit1.put("Switch Statement", 4.0);
        unit1.put("Scanner", 6.0);

        Map<String, Double> unit2 = new LinkedHashMap<>();
        unit2.put("String Manipulation", 12.0);
        unit2.put("Loops", 17.5);
        unit2.put("Branching Statements", 1.5);
        unit2.put("Arrays", 14.5);
        unit2.put("Custom Methods", 16.5);
        unit2.put("Wrapper Classes", 3.0);
        unit2.put("Scanner", 6.0);

        Map<String, Double> unit3 = new LinkedHashMap<>();
        unit3.put("Custom Methods", 16.5);
        unit3.put("Wrapper Classes", 3.0);
        unit3.put("ArrayList", 11.5);

        Map<String, Double> unit4 = new LinkedHashMap<>();
        unit4.put("Custom Class", 23.5);
        unit4.put("Access Modifiers", 2.5);

        Map<String, Double> unit5 = new LinkedHashMap<>();
        unit5.put("OOP Encapsulation", 4.5);
        unit5.put("OOP Inheritance", 13.5);
        unit5.put("Final keyword", 2.5);
        unit5.put("Exceptions", 8.5);

        Map<String, Double> unit6 = new LinkedHashMap<>();
        unit6.put("OOP Abstraction", 14.5);
        unit6.put("OOP Polymorphism", 8.5);
        unit6.put("Collection", 9.5);
        unit6.put("Map", 7.5);

        List<Map<String, Double>> list1 = new ArrayList<>();

        list1.addAll(Arrays.asList(unit1, unit2, unit3, unit4, unit5, unit6));

        System.out.println("list1 = " + list1);

        System.out.println("list1.size() = " + list1.size());

        int count = 0;
        for (Map<String, Double> each : list1) {
            for (Map.Entry<String, Double> entry : each.entrySet()) {
                System.out.println("entry.getKey() = " + entry.getKey());
                count++;
            }
        }

        System.out.println("count = " + count);

        for (Map<String, Double> each : list1) {
            for (Map.Entry<String, Double> entry : each.entrySet()) {
                System.out.println("entry.getKey()+\" : \"+entry.getValue() = " + entry.getKey() + " : " + entry.getValue());
            }
        }
        Double total = 0.0;

        for (Map<String, Double> each : list1) {
            for (Map.Entry<String, Double> each2 : each.entrySet()) {
                total += each2.getValue();
            }
        }

        System.out.println("total = " + total);

        for (Map<String, Double> entry : list1) {

            for (Map.Entry<String, Double> each : entry.entrySet()) {
                if (each.getValue() > 7)
                    System.out.println(each.getKey() + " : " + each.getValue());
            }
        }
        for (Map<String, Double> entry : list1) {

            for (Map.Entry<String, Double> each : entry.entrySet()) {
                if (each.getValue() < 7)
                    System.out.println(each.getKey() + " : " + each.getValue());
            }
        }

        Double max = Double.MIN_VALUE;
        String name = "";

        for (Map<String, Double> each : list1) {
            for (Map.Entry<String, Double> entry : each.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    name = entry.getKey();
                }
            }
        }

        System.out.println("max = " + max);
        System.out.println("name = " + name);

        Double min=Double.MAX_VALUE;
        String nameMın="";

        for (Map<String, Double> each : list1) {
            for (Map.Entry<String, Double> entry : each.entrySet()) {
                if(entry.getValue()<min){
                    min= entry.getValue();
                    nameMın=entry.getKey();

                }

            }
        }

        System.out.println("min = " + min);
        System.out.println("nameMın = " + nameMın);


    }
}
