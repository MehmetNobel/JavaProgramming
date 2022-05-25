package day_51_Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Integer> employeeList = new LinkedHashMap<>();

        employeeList.put("ahmet", 110000);
        employeeList.put("davud", 120000);
        employeeList.put("kadir", 130000);
        employeeList.put("ayşe", 140000);
        employeeList.put("zeynep", 90000);
        employeeList.put("esad", 95000);

        System.out.println("employeeList = " + employeeList);

        int maxSalary = Integer.MIN_VALUE;

        String maxSalaryName = "";
        String minSalaryName = "";

        int minSalary= Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : employeeList.entrySet()) {

            if (entry.getValue() > maxSalary) {
                maxSalary = entry.getValue();
                maxSalaryName = entry.getKey();

            }
            if (entry.getValue() < minSalary) {
                minSalary = entry.getValue();
                minSalaryName=entry.getKey();

            }




        }
        System.out.println("maxSalary = " + maxSalary);

        System.out.println("maxSalaryName = " + maxSalaryName);

        System.out.println(maxSalaryName+" : "+ maxSalary);
        System.out.println(minSalaryName+" : "+ minSalary);

        int countLessThan100k=0;

        for (Map.Entry<String, Integer> entry : employeeList.entrySet()) {

            if(entry.getValue()<100000)
                countLessThan100k++;
        }

        System.out.println("countLessThan100k = " + countLessThan100k);

        for (Map.Entry<String, Integer> entry : employeeList.entrySet()) {
            if(entry.getValue()<100000)
                System.out.println(entry.getKey()+" : "+ entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : employeeList.entrySet()) {

            if(entry.getValue()<100000)
            entry.setValue(entry.getValue()+10000);
        }

        System.out.println("employeeList = " + employeeList);


    }
}
