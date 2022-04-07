package day_31_Constructors.salaryCalculator;

public class Employee {

    public static void main(String[] args) {

        SalaryCalculator sc=new SalaryCalculator(40,0.10,0.05,40);

        System.out.println("sc = " + sc);

        System.out.println("sc.stateTax() = " + sc.stateTax());


    }
}
