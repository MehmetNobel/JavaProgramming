package day_31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonObjects {

    public static void main(String[] args) {

        Person p1=new Person("mehmet",'M',42);

        Person p2=new Person("esad",'M',8);

        Person p3=new Person("ayşe",'F',40);

        Person p4=new Person("zeynep",'F',12);


        Person arrPerson[]={p1,p2,p3,p4};

        System.out.println("arrPerson = " + Arrays.toString(arrPerson));

        ArrayList<Person> list=new ArrayList<>(Arrays.asList(arrPerson));

        System.out.println("**************************");

        System.out.println("list = " + list);

        System.out.println("arrPerson.length = " + arrPerson.length);

        System.out.println("list.size() = " + list.size());







    }
}
