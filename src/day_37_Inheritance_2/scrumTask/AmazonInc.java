package day_37_Inheritance_2.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class AmazonInc {

    public static void main(String[] args) {

        Tester tester1=new Tester("mehmet",'M',42,"sdet","Amazon",151,125000);
        Developer dev1=new Developer("zeynep",'F',25,"Developer","Amazon",200,150000);
        ProductOwner po1=new ProductOwner("ayşe",'F',25,"Amazon",200,150000);
        BusinessAnalyst ba1=new BusinessAnalyst("zeynep",'F',25,"Amazon",200,150000);
        ScrumMaster sm1=new ScrumMaster("esad",'m',25,"Amazon",89,150000);
        Tester tester2=new Tester("ahmet",'M',42,"sdet","Amazon",151,125000);
        Tester tester3=new Tester("latif",'M',42,"sdet","Amazon",151,125000);
        Tester tester4=new Tester("hasan",'M',42,"sdet","Amazon",151,125000);
        Developer dev2=new Developer("zeyne",'F',25,"Developer","Amazon",200,150000);
        Developer dev3=new Developer("zeyn",'F',25,"Developer","Amazon",200,150000);
        Developer dev4=new Developer("zey",'F',25,"Developer","Amazon",200,150000);

        /*ArrayList<Tester> listTesters=new ArrayList<>();
        ArrayList<Developer> listDevelopers=new ArrayList<>();

        listDevelopers.add(dev1);
        listTesters.add(tester1);*/

        System.out.println("tester1 = " + tester1);
        System.out.println("dev1 = " + dev1);
        System.out.println("po1 = " + po1);
        System.out.println("ba1 = " + ba1);
        System.out.println("sm1 = " + sm1);

        ScrumTeam team1=new ScrumTeam(po1,sm1,ba1);

        Tester testers[]={tester1,tester2,tester3,tester4};
        Developer devs[]={dev1,dev2,dev3,dev4};

        team1.addDeveloper(dev1);
        team1.addTester(tester1);
        team1.addTesters(testers);

        team1.addDevelopers(devs);


        System.out.println("team1 = " + team1);

       // System.out.println("team1.listTest = " + team1.listTest);

        for (Tester tester : team1.listTest) {

            System.out.println(tester.name+" "+tester.salary);

        }

        for (Developer developer : team1.listDev) {
            System.out.println("developer.name = " + developer.name);
        }


    }
}
