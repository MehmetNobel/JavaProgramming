package tasks_statics_constructors;

public class CydeoStudent {

    public String name;

    public int age, id, batchNumber,groupNumber;

    public char grade,gender;

    public static String schoolName,programmingLanguage;

    public CydeoStudent(String name, int age, int id, int batchNumber, int groupNumber, char grade, char gender) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.grade = grade;
        this.gender = gender;
    }


    static {
        schoolName= "Cydeo School";
        programmingLanguage="java";

    }

    public void attendClass(){

        System.out.println(name+" attending class now\nId: "+id);

    }

    public void study(){

        System.out.println(name+" studying now\nId: "+id);

    }

    public static String printSchoolName(){

        return schoolName;
    }

    public static  String printProgLangugauge(){

        return  programmingLanguage;


    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", grade=" + grade +
                ", gender=" + gender +
                ", proglanguage is= " +printProgLangugauge()+
                ", schoolName is =" + printSchoolName() +
                '}';
    }
}


class test{

    public static void main(String[] args) {

        CydeoStudent st1=new CydeoStudent("Mehmet",42,151,8,31,'A','M');

        System.out.println("st1 = " + st1);


    }


}


/*
1. CydeoStudent Task
1. Create a class named CydeoStudent:
Attributes:
instances: name, age,
gender, id, grade, batchNumber, groupNumber
statics: schoolName,
programmingLanguage
Add a constructor that can set All the
fields (instances)
Actions:
study()
attendClass()
printSchoolName(): displays
the school name
printProgLanguage():
displays the name of programming language
toString()
 */