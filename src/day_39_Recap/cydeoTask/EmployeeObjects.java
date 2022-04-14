package day_39_Recap.cydeoTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee e1 = new Employee("mehmet", 42, 'M', 151, 110000, "QA");

        System.out.println("e1 = " + e1);

        e1.eat();

        Tester t1=new Tester("mehmet", 42, 'M', 151, 110000, "QA");
        t1.createTicket();

        System.out.println("t1 = " + t1);

        System.out.println("t1.getName() = " + t1.getName());

        t1.eat();


        Developer dev1=new Developer("ahmet", 42, 'M', 151, 110000, "Dev.");

        dev1.fixingBugs();

        Teacher teacher1=new Teacher("muhtar", 42, 'M', 151, 110000, "Teacher");
        teacher1.work();

        Student st1=new Student("ahmet",42,'M',151,"JAVA");

        System.out.println("st1 = " + st1);

        st1.study();

        dev1.setEmployeeId(155);

        System.out.println(dev1.getEmployeeId());

        System.out.println("dev1 = " + dev1);

        dev1.work();

        t1.work();

    }


}


