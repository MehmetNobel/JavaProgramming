package day_35_Encapsulation;

public class CybertekStudent {

    public String name, fieldOfStudy;
    public char gender;
    public int age,batchNumber,groupNumber;

    public static String schoolName, programmingLanguage;

    static {
        schoolName="CYDEO";
        programmingLanguage="Java";
    }

    public CybertekStudent(String name, String fieldOfStudy,char gender, int age, int batchNumber, int groupNumber) {
        this.name = name;
        this.fieldOfStudy=fieldOfStudy;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                " fieldOfStudy='" + fieldOfStudy + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", schoolName=" + schoolName +
                ", programmingLanguage=" + programmingLanguage +
                '}';
    }

    public void attendClass(){

        System.out.println(name+" is attending the classess");
    }

    public void study(){

        System.out.println(name+" from the batch " + batchNumber+" and from group "+ groupNumber+" is studiying now");
    }


    public static void main(String[] args) {

        CybertekStudent st1=new CybertekStudent("mehmet","SDET",'M',42,8,31);

        st1.attendClass();

        st1.study();

        System.out.println("st1 = " + st1);


        // intance methods can access both instance variables and static variables.

        // but static methods can not access instance variables just can access static variables.

        // toString method is an instance method.

        //we can access class datas and object datas after creating the object

        //but we can access static members just via class.

    }




}
