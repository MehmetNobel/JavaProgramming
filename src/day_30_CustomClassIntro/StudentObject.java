package day_30_CustomClassIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {

    public static void main(String[] args) {
        
        
        Student st1=new Student("Mehmet", "151",42,'M','A');
        Student st2=new Student("Ahmet", "181",40,'M','B');
        Student st3=new Student("Ayşe", "201",40,'F','A');
        Student st4=new Student("Zeynep", "340",12,'F','A');
        Student st5=new Student("Esad", "89",8,'M','C');
        
        Student[] arr={st1,st2,st3,st4,st5};

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        ArrayList<Student> list=new ArrayList<>(Arrays.asList(arr));
        ArrayList<Student> earlyBirds=new ArrayList<>();
        ArrayList<Student> secondBirds=new ArrayList<>();

        System.out.println("list = " + list);

        list.removeIf(p->!(p.age>30));

        System.out.println("list  age >30  = " + list);

        for (Student student : arr) {

            if(student.grade=='A') {
                earlyBirds.add(student);
            }
            else {
                secondBirds.add(student);
            }

        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("secondBirds = " + secondBirds);


    }
}
