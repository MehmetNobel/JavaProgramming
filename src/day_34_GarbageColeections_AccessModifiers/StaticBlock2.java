package day_34_GarbageColeections_AccessModifiers;

public class StaticBlock2 {


    public String studentName;
    public static String schoolName;

    public StaticBlock2(String studentName) {

        this.studentName = studentName;

    }

    static {

        schoolName = "Cydeo School";
    }


    public String toString() {
        return "StaticBlock2{" +
                "studentName='" + studentName + '\'' +
                "schoolName='" + schoolName + '\'' +
                '}';
    }
}
    class StudentObjects{


        public static void main(String[] args){


            StaticBlock2 st1=new StaticBlock2("ahmet");

            StaticBlock2 st2=new StaticBlock2("ayşe");

            System.out.println("st1 = " + st1);

            System.out.println("st2 = " + st2);


        }





    }



