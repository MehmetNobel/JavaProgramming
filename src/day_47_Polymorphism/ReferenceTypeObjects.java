package day_47_Polymorphism;

import day_37_Inheritance_2.animal.Animal;
import day_37_Inheritance_2.animal.Cat;
import day_37_Inheritance_2.animal.Dog;
import day_37_Inheritance_2.scrumTask.Developer;
import day_37_Inheritance_2.scrumTask.Employee;
import day_37_Inheritance_2.scrumTask.Tester;
import day_45_Abstraction_2.shapeTask.Circle;
import day_45_Abstraction_2.shapeTask.Shape;

public class ReferenceTypeObjects {

    public static void main(String[] args) {

        Shape shape=new Circle(4); // there is upcasting here. from sub ==>> to the parent.

        // without casting we cannot convert the sub to the parent.

        System.out.println("shape.area() = " + shape.area());

        Animal animal=new Dog("bed","husky",'m',5,"medium","black");

        Cat cat=new Cat("bed","husky",'m',5,"medium","black");

        ((Dog) animal).bark();  // now we are able to achieve the the dog's proporties. via down casting.

        if(cat instanceof Animal)   // cat bir animal dir
            System.out.println(true);
        if(animal instanceof Animal)   // burdaki animal dog u ifade ediyor. dog bir animaldır.
            System.out.println(true);

        Employee employee=new Tester("ahmet",'M',42,"SDET","AMAZON",151,110000);

        Developer developer=new Developer("ahmet",'M',42,"SDET","AMAZON",151,110000);


       // ((Developer)employee).fixBugs();  // will give error. because in this employee object type is tester.we wanna convert tester
        //to developer. there is no is a relation

        Father father =new Father("mehmet");

        if(father instanceof Person)
            System.out.println( "yes");

        EncapsulationExample e1=new EncapsulationExample("adam",null);

        System.out.println("e1 = " + e1);
  

    }
}
