package day_31_Constructors.ScrumTask;

public class Tester {

    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';

    }

    public void smokeTesting(){

        System.out.println(name+ " performing smoke test");

    }

    public void creatingTicket(){

        System.out.println(name+ " has created a ticket");

    }

    public void dailyStandup(){

        System.out.println(name+ " has performing daily standup");

    }






}
