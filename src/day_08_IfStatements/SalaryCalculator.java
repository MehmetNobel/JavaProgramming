package day_08_IfStatements;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 50, weeklyhours = 45;

        double stateTaxRate = 6.5, federalTaxRate = 26.2;


        double salaryBeforeTax = hourlyRate * weeklyhours * 52;
        double stateTax = salaryBeforeTax * 6.5 / 100;
        double federalTax = salaryBeforeTax * 26.2 / 100;

        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("salaryBeforeTax = " + salaryBeforeTax);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("salaryAfterTax = " + salaryAfterTax);

    }
}
