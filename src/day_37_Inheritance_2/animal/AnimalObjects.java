package day_37_Inheritance_2.animal;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1=new Dog("hus","husky",'M',5,"medium","white");
        Dog dog2=new Dog("hus","husky",'M',6,"medium","white");
        Cat cat1=new Cat("hus","husky",'M',5,"medium","white");

        System.out.println("cat1 = " + cat1);

        System.out.println("dog1 = " + dog1);

        cat1.Scratch();

        dog1.bark();

    }



}
