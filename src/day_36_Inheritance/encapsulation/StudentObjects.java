package day_36_Inheritance.encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student st1=new Student("mehmet",'M','B',42);
        Student st2=new Student("ahmet",'M','B',40);
        Student st3=new Student("latif",'M','B',32);
        Student st4=new Student("ali",'M','B',42);
        Student st5=new Student("coşkun",'M','B',42);



        System.out.println("st1 = " + st1);

        st1.study();

        ArrayList<Student> list=new ArrayList<>();

        list.addAll(Arrays.asList(st1,st2,st3,st4,st5));

        for (Student student : list) {

            System.out.println("student.getAge() = " + student.getAge());

        }

        System.out.println("list = " + list);

        System.out.println("list.size() = " + list.size());


    }
}
