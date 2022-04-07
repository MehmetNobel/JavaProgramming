package day_37_Inheritance_2.scrumTask;

public class Developer extends Employee{


    public Developer(String name, char gender, int age, String jobTitle, String companyName, int id, double salary) {
        super(name, gender, age, jobTitle, companyName, id, salary);
    }

    public void fixBugs(){
        System.out.println(name+ " is fixing bugs");

    }



}
