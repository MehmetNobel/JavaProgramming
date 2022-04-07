package day_37_Inheritance_2.scrumTask;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, char gender, int age, String companyName, int id, double salary) {
        super(name, gender, age, "Business Analyst", companyName, id, salary);
    }

    public void analyse(){
        System.out.println(jobTitle+" "+ name+" is analysing the docs");
    }
}
