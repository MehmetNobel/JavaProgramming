package day_43_Abstraction.employeeTask;

public final class Tester extends Employee{   //we dont tester to be parent so we define as final.

    public Tester(String name, int age, char gender, int id, double salary, String jobTitle) {
        super(name, age, gender, id, salary, jobTitle);
    }

    @Override
    public void work() {

        System.out.println(getName()+" is now working hard.");

    }

    public void test(){

        System.out.println(getId()+" "+getName()+" is testing now");
    }




}
