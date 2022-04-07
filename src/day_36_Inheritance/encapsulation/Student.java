package day_36_Inheritance.encapsulation;

import javax.swing.*;

public class Student {

    private String name;
    private char gender, grade;
    private int age;
    private static String schoolName;


    static {
        schoolName = "CYDEO";
    }

    public Student(String name, char gender, char grade, int age) {
        setName(name);
        setGender(gender);
        setGrade(grade);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F')
            this.gender = gender;
        else
            return;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 5 || age > 90)
            return;
        else
            this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'E')
            this.grade = grade;
        else
            return;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", age=" + age +
                ", schoolName=" + schoolName +
                '}';
    }

    public void study(){

        System.out.println(name+" is studying now");

    }




}


