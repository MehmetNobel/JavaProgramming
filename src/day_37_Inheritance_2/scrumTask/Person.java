package day_37_Inheritance_2.scrumTask;

public class Person {

    public String name;
    public char gender;
    public int age;


    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void eat(String food){
        System.out.println(name+ " is eating");
    }

    public void drink(String drink){
        System.out.println(name+ " is drinking");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }




}
