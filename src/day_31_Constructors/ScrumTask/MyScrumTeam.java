package day_31_Constructors.ScrumTask;

import java.util.Arrays;

public class MyScrumTeam {

    public static void main(String[] args) {
        
        Tester t1=new Tester("ahmet",123,"sdet",60000);

        Tester t2=new Tester("latif",124,"sdet",55000);

        Tester t3=new Tester("coşkun",125,"sdet",50000);

        Developer d1=new Developer("ahmet",123,"sdet",60000);

        Developer d2=new Developer("latif",124,"sdet",55000);

        Developer d3=new Developer("coşkun",125,"sdet",50000);

        ScrumTeam sc1=new ScrumTeam("onur","paşa","ayşe",14);

        Tester tArr[]={t1,t2,t3};

        Developer dArr[]={d1,d2,d3};

        sc1.addTesters(tArr);

        sc1.addDevelopers(dArr);

        System.out.println(sc1);

        System.out.println(sc1.devopsList);

        System.out.println(sc1.testerList);

        for (Developer developer : sc1.devopsList) {

            System.out.println(developer.name+" :"+developer.salary);

        }

        for (Tester tester : sc1.testerList) {

            System.out.println(tester.name+" :"+tester.salary);

        }

        sc1.removeTester(125);

        for (Tester tester : sc1.testerList) {
            System.out.println(tester.name);
        }







        
    }
}
