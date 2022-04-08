package day_37_Inheritance_2.restaurant;

public class Server extends Employee{

    public Server(String name, int employeeId, double hourlyRate, boolean isFullTime) {
        super(name, employeeId, hourlyRate, isFullTime);

    }
    public void takeOrder(){

        System.out.println(name + " is taking order now");
    }

    public void cleanTable(){

        System.out.println(name + " is cleaning table now");
    }

    @Override
    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + isFullTime +
                '}';

    }
}
