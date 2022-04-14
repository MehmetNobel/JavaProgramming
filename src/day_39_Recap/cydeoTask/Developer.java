package day_39_Recap.cydeoTask;

public class Developer extends Employee {


    public Developer(String name, int age, char gender, int employeeId, double salary, String jobTitle) {
        super(name, age, gender, employeeId, salary, jobTitle);
    }

    public void fixingBugs(){

        System.out.println(getJobTitle()+" "+getName()+" is fixing bugs now");
    }

    public void work(){

        System.out.println(getJobTitle()+" "+getName()+" is working hard");
    }

}
