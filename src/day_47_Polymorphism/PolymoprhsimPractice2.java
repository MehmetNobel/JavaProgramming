package day_47_Polymorphism;

import day_43_Abstraction.employeeTask.Developer;
import day_43_Abstraction.employeeTask.Employee;
import day_43_Abstraction.employeeTask.Tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolymoprhsimPractice2 {

    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("Sherali", 32, 'M', 1, 11000, "QA"),
                new Developer("Zuhal", 27, 'F', 2, 125000, "Dev"),
                new Tester("George", 28, 'M', 3, 135000, "SDET"),
                new Developer("Cristina", 23, 'F', 4, 145000, "Software Developer"),
                new Tester("Cihad", 30, 'M', 5, 105000, "SDET"),
                new Developer("Gulistan", 26, 'F', 6, 13000, "Web Developer"),
                new Tester("Yuliya", 28, 'F', 7, 12000, "QA"),
                new Developer("Cassendra", 25, 'm', 'F', 88000, "Front-end Dev"),
                new Tester("Aygu", 25, 'F', 9, 138000, "SDET"),
                new Developer("Sophie", 26, 'F', 10, 15000, "Back-end Developer"),
                new Tester("Timur", 29, 'M', 11, 115000, "SDET"),
                new Developer("Fady", 26, 'F', 12, 142000, "Full Stack Developer"),
                new Tester("Iryna", 24, 'F', 13, 125000, "QA"),
                new Developer("Enes", 26, 'M', 14, 142000, "Full Stack Developer"),
                new Tester("Mikael", 30, 'M', 15, 105000, "SDET"),
        };
           List<Employee> scrumMembers = new ArrayList<>(Arrays.asList(employees));

        System.out.println("scrumMembers.size() = " + scrumMembers.size());

        System.out.println("scrumMembers = " + scrumMembers);

        List<Tester> testers = new ArrayList<>();

        for (Employee scrumMember : scrumMembers) {

            if(scrumMember instanceof Tester){

                testers.add((Tester) scrumMember);
        }

        }

        System.out.println("testers = " + testers);
        System.out.println("testers.size() = " + testers.size());

        List<Developer> developers = new ArrayList<>();

        for (Employee scrumMember : scrumMembers) {

            if(scrumMember.getJobTitle().contains("Dev")){

                developers.add((Developer) scrumMember);
            }

        }

        System.out.println("developers = " + developers);
        System.out.println("developers.size() = " + developers.size());

        Developer developerHighestSalary=developers.get(0);

        for (Developer developer1 : developers) {

            if(developer1.getSalary()>developerHighestSalary.getSalary()){

                developerHighestSalary=developer1;
            }

        }

        System.out.println("developerHighestSalary = " + developerHighestSalary);


        Tester testerHighestSalary=testers.get(0);
        for (Tester tester : testers) {

            if(tester.getSalary()>testerHighestSalary.getSalary()){
                testerHighestSalary=tester;
            }

        }

        System.out.println("testerHighestSalary = " + testerHighestSalary);

        System.out.println("testerHighestSalary.getSalary() = " + testerHighestSalary.getSalary());


    }
}
