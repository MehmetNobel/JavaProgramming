package day_43_Abstraction.employeeTask;

public abstract class Employee extends Person {

    private final int id;
    private double salary;
    private String jobTitle;

    public Employee(String name, int age, char gender, int id, double salary, String jobTitle) {
        super(name, age, gender);
        this.id = id;
        setSalary(salary);
        setJobTitle(jobTitle);
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            throw new RuntimeException("salary cannot be less than zero");
        }
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle.isBlank()||jobTitle.isEmpty()){
            throw new RuntimeException("job title cannot be empty or blank");
        }
        this.jobTitle = jobTitle;
    }

    @Override
    public void sleep() {
        System.out.println(getName() +" is sleeping now.");

    }

    @Override
    public void eat(){
        System.out.println(getName() +" is eating now.");

    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ", salary=" + salary +
                ", jobtitle=" + jobTitle +
                '}';
    }
}

