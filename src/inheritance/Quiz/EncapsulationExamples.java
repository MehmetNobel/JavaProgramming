package inheritance.Quiz;

public class EncapsulationExamples {

    private String name;

    private double salary;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("name cannot be empty");
            return;
        }else
            this.name=name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.err.println("salary cannot be less than 0");
            return;
        }
        this.salary = salary;
    }
}
