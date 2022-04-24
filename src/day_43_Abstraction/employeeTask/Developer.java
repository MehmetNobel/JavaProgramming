package day_43_Abstraction.employeeTask;

public final class Developer extends Employee {


    public Developer(String name, int age, char gender, int id, double salary, String jobTitle) {
        super(name, age, gender, id, salary, jobTitle);
    }

    @Override
    public void work() {

        System.out.println(getName()+" is developing new features");

    }

    public void fixBugs(){

        System.out.println(getId()+" "+ getJobTitle()+" is now fixing bugs");
    }






}
