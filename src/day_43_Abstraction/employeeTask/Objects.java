package day_43_Abstraction.employeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Objects {

    public static void main(String[] args) {

        Tester t1=new Tester("mehmet",42,'M',151,110000,"SDET");
        Developer d1=new Developer("ahmet",42,'M',151,120000,"dev");
        Teacher tch1=new Teacher("ahmet",42,'M',151,120000,"teacher",5);

        ArrayList<Employee> list=new ArrayList<>(Arrays.asList(t1,d1,tch1));

        System.out.println("list = " + list);


        t1.work();

        t1.test();

        System.out.println("t1.getName() = " + t1.getName());

        t1.sleep();

        d1.fixBugs();

        d1.work();






    }
}
