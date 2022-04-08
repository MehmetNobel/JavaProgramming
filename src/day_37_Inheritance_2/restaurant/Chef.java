package day_37_Inheritance_2.restaurant;

public class Chef extends Employee{

    public Chef(String name, int employeeId, double hourlyRate, boolean isFullTime) {
        super(name, employeeId, hourlyRate, isFullTime);
    }

    public void makeOrder(){

        System.out.println(name + " is making order now");
    }

    public void wahsDishes(){

        System.out.println(name + " is washing dishes now");
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + isFullTime +
                '}';

    }
}
