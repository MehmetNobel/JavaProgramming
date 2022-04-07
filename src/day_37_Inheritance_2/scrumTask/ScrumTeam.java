package day_37_Inheritance_2.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public ProductOwner po;
    public Developer dev;
    public Tester test;
    public ScrumMaster sm;
    public BusinessAnalyst ba;


    public ScrumTeam(ProductOwner po, ScrumMaster sm, BusinessAnalyst ba) {
        this.po = po;
        this.sm = sm;
        this.ba = ba;

    }

    public ArrayList<Tester> listTest=new ArrayList<>();
    public ArrayList<Developer> listDev=new ArrayList<>();


    public void addTester(Tester test){
        listTest.add(test);
    }

    public void addTesters(Tester arr[]){
        listTest.addAll(Arrays.asList(arr));
    }

    public void removeTester(int id){
        listTest.removeIf(p->p.id==id);

    }

    public void addDeveloper(Developer developer){

        listDev.add(developer);
    }

    public void addDevelopers(Developer developer[]){

        listDev.addAll(Arrays.asList(developer));
    }

    public void removeDeveloper(int id){
        listDev.removeIf(p->p.id==id);

    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "po=" + po.name +
                ", sm=" + sm.name +
                ", ba=" + ba.name +
                ", number of testers=" + listTest.size() +
                ",  number of developers=" + listDev.size() +
                '}';
    }
}
