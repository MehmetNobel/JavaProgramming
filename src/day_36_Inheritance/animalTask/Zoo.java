package day_36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog1=new Dog();

        dog1.setInfo("akbaş","kutup",'M',5,"small","white");

        System.out.println("dog1 = " + dog1);

        dog1.eat();

        dog1.bark();

        Cat cat1=new Cat();
        cat1.setInfo("bebi","keli",'f',4,"medium","black");

        cat1.scratch();

        Tiger tg1=new Tiger();
        tg1.setInfo("tigi2","tigi",'f',5,"large","yellow");

        tg1.roar();

        tg1.drink();

    }






}
