package day_39_Recap.cydeoTask;

public class Employee extends Person{

    private int employeeId;
    private double salary;
    private String jobTitle;

    public Employee(String name, int age, char gender, int employeeId, double salary, String jobTitle) {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void work(){
        System.out.println(super.getName()+" is working");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public char getGender() {
        return super.getGender();
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " "+ employeeId+ " is eating now");
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void setGender(char gender) {
        super.setGender(gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", gender=" + super.getGender() +
                ", emloyeeID=" + employeeId +
                ", salary=" + salary +
                ", jobTitle=" + jobTitle +
                '}';
    }
}
