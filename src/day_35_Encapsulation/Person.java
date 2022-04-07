package day_35_Encapsulation;

public class Person {

    public String name, language;

    public int age;

    public char gender;

    public static String planet;

    public static boolean isHuman,hasNose;

    public static int numberOfWings,numberOfHead;

    static {
        planet="World";
        isHuman=true;
        hasNose=true;
        numberOfHead=1;
        numberOfWings=0;

    }

    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }

    public static void printPlanetName(){

        System.out.println("planet name is: "+ planet);
    }
    public void eat(String food){

        System.out.println(name+ " is eating " + food + " now.");
    }
    public void drink(String drink){

        System.out.println(name+ " is drinking " + drink + " now.");
    }

    public String toString(){

        return "name is :"+name+
                " language is :"+language+
                " age is :"+age+
                " gender is :"+gender+
                " planet is :"+planet+
                " is Human :"+isHuman+
                " Has Nose :"+hasNose+
                " number of Wings :"+numberOfWings+
                " number of Heads :"+numberOfHead;

    }

    public static void main(String[] args) {

        Person p1=new Person("mehmet","turkish",42,'M');

        System.out.println("p1 = " + p1);

        p1.drink("water");

        p1.eat("meat");

        Person.printPlanetName();





    }



}
