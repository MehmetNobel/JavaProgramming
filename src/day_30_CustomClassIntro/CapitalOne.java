package day_30_CustomClassIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CapitalOne {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Ahmet", 340, 'M', "SDET", 5000, true);

        Employee emp2 = new Employee("Mehmet", 140, 'M', "QA", 5500, true);

        Employee emp3 = new Employee("Ayşe", 120, 'F', "SDET", 2000, false);

        Employee emp4 = new Employee("Zeynep", 990, 'F', "Dev", 6000, true);

        Employee emp5 = new Employee("Esad", 190, 'M', "Dev", 7000, true);


        ArrayList<Employee> list = new ArrayList<>();

        list.addAll(Arrays.asList(emp1, emp2, emp3, emp4, emp5));

        System.out.println("list = " + list);

        System.out.println("***********************************************");

        for (Employee employee : list) {

            System.out.println(employee);
        }

        int count = 0;
        for (Employee employee : list) {

            if (employee.isFullTime == true)
                count++;

        }
        System.out.println("count = " + count);

        int max = 0;

        String name="";

        for (Employee employee : list) {

           if(employee.salary>max) {
               max = employee.salary;
               name=employee.name;
           }
        }
        int countPartTime=0;

        int countFullTime=0;

        for (Employee employee : list) {

            if(employee.isFullTime)
               countFullTime++;
            else
                countPartTime++;
        }
        System.out.println("max = " + max + "\nName: "+name);

        System.out.println("countFullTime = " + countFullTime);

        System.out.println("countPartTime = " + countPartTime);

        emp5.work();


    }
}
