package day_37_Inheritance_2.restaurant;

public class Employee {


    public String name;
    public int employeeId;
    public double hourlyRate;
    public boolean isFullTime;

    public Employee(String name, int employeeId, double hourlyRate, boolean isFullTime) {
        this.name = name;
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
/*

6.1  Create a class called Server
        Attributes:
                name (String), employeeID (int),
hourlyRate (double), fullTime (boolean)
Add A constructor that can set all the fields
        Actions: (all void methods)
            takeOrder(): server's name + "is taking an
order"
            cleanTable(): server's name + "is cleaning
the table"
            toString(): Returns (String) all the
information of a Server
                -> Extra: For fullTime status,
instead of printing a boolean value, print "full-time" or "part-time"
 */