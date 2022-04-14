package day_39_Recap.cydeoTask;

public class Teacher extends Employee{

    public Teacher(String name, int age, char gender, int employeeId, double salary, String jobTitle) {
        super(name, age, gender, employeeId, salary, jobTitle);
    }

    public void work(){
        System.out.println(getJobTitle()+" "+getName()+" is teaching now");
    }

}
