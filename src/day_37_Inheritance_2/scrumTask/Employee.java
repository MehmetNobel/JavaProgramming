package day_37_Inheritance_2.scrumTask;

public class Employee extends Person{


    public String jobTitle, companyName;
    public int id;
    public double salary;

    public Employee(String name, char gender, int age, String jobTitle, String companyName, int id, double salary) {
        super(name, gender, age);
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.id = id;
        this.salary = salary;
    }

    public void work(){

        System.out.println(jobTitle+" "+name+" is working now");

    }

    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                "jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
