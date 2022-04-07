package day_30_CustomClassIntro;

public class Student {

    String name;
    String studentId;
    int age;
    char gender;
    char grade;

    public Student(String name, String studentId, int age, char gender,char grade) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.gender = gender;
        this.grade=grade;
    }

    public void eat(){

        System.out.println(name+" is eating");

    }


    public void drink(){

        System.out.println(name+" is drinking");

    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
