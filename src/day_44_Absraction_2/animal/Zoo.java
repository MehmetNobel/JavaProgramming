package day_44_Absraction_2.animal;

public class Zoo {

    public static void main(String[] args) {

        Dog d1=new Dog("Husky","white",2,'M',"medium","dogy");

        Cat c1=new Cat("Nanu","white",3,'M',"medium","caddy");

        Tiger t1=new Tiger("Tiger02","white",3,'M',"medium","Tie");

        System.out.println("d1 = " + d1);

        System.out.println("c1 = " + c1);

        c1.drink();

        c1.eat();

        System.out.println("t1 = " + t1);

        t1.eat();

        c1.playable();

        d1.playable();


    }
}
