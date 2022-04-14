package day_39_Recap.cydeoTask;

public class Tester extends Employee{


    public Tester(String name, int age, char gender, int employeeId, double salary, String jobTitle) {
        super(name, age, gender, employeeId, salary, jobTitle);
    }

    public void createTicket(){

        System.out.println(getName()+" " + getEmployeeId() +" is creating ticket now ");
    }

    @Override
    public String toString() {
        return "Tester {" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", gender=" + super.getGender() +
                ", emloyeeID=" + getEmployeeId() +
                ", salary=" + getSalary()+
                ", jobTitle=" + getJobTitle()+
                '}';
    }
    public void work(){

        System.out.println(getJobTitle()+" "+getName()+" is working hard");
    }





}
