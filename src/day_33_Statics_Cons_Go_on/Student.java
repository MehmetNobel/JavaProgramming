package day_33_Statics_Cons_Go_on;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    public String name;
    public char gender, grade;
    public int age, studentID;
    public static String schoolName="Cydeoschool";


    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender) {
        this(name);
        this.gender = gender;
    }


    public Student(String name, char gender, char grade) {
        this(name, gender);
        this.grade = grade;
    }

    public Student(String name, char gender, char grade, int age) {
        this(name, gender, grade);
        this.age = age;
    }

    public Student(String name, char gender, char grade, int age, int studentID) {
        this(name, gender, grade, age);   // ctrl + space gives the intellijs advices
        this.studentID = studentID;
    }

    public String study() {

        return name + " student is studing lesson now";

    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", age=" + age +
                ", studentID=" + studentID +
                ", studyposition=" + study() +
                ", schoolname=" + schoolName +
                '}';
    }
}

    class StudentObjects {
        public static void main(String[] args) {

            Student st1 = new Student("ahmet");

            Student st2 = new Student("ahmet", 'M');

            Student st3 = new Student("ahmet", 'M', 'A');

            Student st4 = new Student("ahmet", 'M', 'A', 42);

            Student st5 = new Student("ahmet", 'M', 'A', 42, 151);


            ArrayList<Student> list = new ArrayList<>();

            System.out.println("st1 = " + st1);

            System.out.println("st2 = " + st2);

            System.out.println("st3 = " + st3);

            System.out.println("st4 = " + st4);

            System.out.println("st5 = " + st5);

            list.addAll(Arrays.asList(st1, st2, st3, st4, st5));

            System.out.println("list = " + list);

            System.out.println("list.size() = " + list.size());

            int sum = 0;

            for (Student student : list) {

                System.out.print(student.gender + " ");

                sum += student.age;

                System.out.println(sum);

            }

            System.out.println("*********************************");

            Student arr[] = list.toArray(new Student[0]);

            System.out.println("arr = " + Arrays.toString(arr));

            System.out.println("arr.length = " + arr.length);

            Student arr2[] = new Student[arr.length + 1];

            int j = 0;

            for (int i = 0; i < arr.length; i++) {

                arr2[j++] = arr[i];

            }

            arr2[j] = st5;

            System.out.println("arr2 = " + Arrays.toString(arr2));

            System.out.println("arr2.length = " + arr2.length);

            System.out.println("st5.study() = " + st5.study());

            System.out.println("st5 = " + st5);


        }

    }



