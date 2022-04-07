package day_35_Encapsulation.encapsulation;

public class Employee {

    private String name;
    private char gender;
    private double salary;
    private int age;

    public Employee(String name, char gender, double salary, int age) {
        setName(name);
        setGender(gender);
        setSalary(salary);
        setAge(age);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (!name.equals("")) {
            this.name = name;
        } else {

            System.err.println("invalid entry");
            System.exit(0);
        }

    }

    public char getGender() {

        return gender;

    }

    public void setGender(char gender) {

        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            System.err.println("invalid gender type");
            System.exit(0);

        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 16 || age >= 90) {
            System.err.println("invalid entry.age is not available");
            System.exit(0);
        } else
            this.age = age;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            System.err.println("invalid salary. salary cannot be zero or negative!");
            System.exit(0);
        } else {

            this.salary = salary;
        }

    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
