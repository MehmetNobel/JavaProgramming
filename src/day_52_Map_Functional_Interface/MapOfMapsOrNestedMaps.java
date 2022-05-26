package day_52_Map_Functional_Interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapOfMapsOrNestedMaps {

    public static void main(String[] args) {

        // it is hard to organize. not readable..
        // map comsumes more memory according to the others
        
        Map<String,String> idAndJobTitle=new LinkedHashMap<>();

        idAndJobTitle.put("11","tester");
        idAndJobTitle.put("12","dev");
        idAndJobTitle.put("13","dev");
        idAndJobTitle.put("14","tester");


        Map<String,String> nameAndSalary=new LinkedHashMap<>();

        nameAndSalary.put("mehmet","100000");
        nameAndSalary.put("sema","125000");
        nameAndSalary.put("kader","135000");
        nameAndSalary.put("heidi","105000");


        Map<Map<String,String>,Map<String,String>> emploeeInf=new LinkedHashMap<>();

        emploeeInf.put(idAndJobTitle,nameAndSalary);

        System.out.println("emploeeInf = " + emploeeInf);


        for (Map.Entry<Map<String, String>, Map<String, String>> mapMapEntry : emploeeInf.entrySet()) {

            for (Map.Entry<String, String> entry : mapMapEntry.getKey().entrySet()) {

                System.out.println("entry.getKey()+\":\"+entry.getValue() = " + entry.getKey() + ":" + entry.getValue());

            }

        }


        for (Map.Entry<Map<String, String>, Map<String, String>> entry : emploeeInf.entrySet()) {
            for (Map.Entry<String, String> entry2 : entry.getValue().entrySet()) {
                System.out.println("entry2.getKey()+\" : \"+entry2.getValue() = " + entry2.getKey() + " : " + entry2.getValue());
            }

        }




    }
}
