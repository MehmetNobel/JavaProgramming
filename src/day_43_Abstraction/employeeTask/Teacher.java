package day_43_Abstraction.employeeTask;

public final class Teacher extends Employee {

    private int experience;

    public Teacher(String name, int age, char gender, int id, double salary, String jobTitle,int experience) {
        super(name, age, gender, id, salary, jobTitle);
    }

    @Override
    public void work() {

        System.out.println(getName()+" is teaching now");

    }

    public void prepExams(){

        System.out.println("teacher "+getName()+ " is preparing exams now");
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + getId() +
                ", salary=" + getSalary() +
                ", jobtitle=" + getJobTitle()+
                ", experience=" +getExperience() +
                '}';
    }
}
