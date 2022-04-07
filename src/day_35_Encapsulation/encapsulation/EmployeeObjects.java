package day_35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee emp1=new Employee("mehmet",'A',52000,42);

        System.out.println("emp1 = " + emp1);

       // emp1.setGender('h');

        //emp1.setName("");

        emp1.setSalary(20000);

        System.out.println("emp1 = " + emp1);

       // emp1.setAge(95);

        //System.out.println("emp1 = " + emp1);


    }



}
