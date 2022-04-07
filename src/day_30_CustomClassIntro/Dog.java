package day_30_CustomClassIntro;

public class Dog {

    String name;
    String size;
    int age;
    char gender;

    public Dog(String name, String size, int age, char gender) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.gender = gender;
    }

    public void eat(){

        System.out.println(name+" is eating");

    }


    public void bark(){

        System.out.println(name+" is barking");

    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
