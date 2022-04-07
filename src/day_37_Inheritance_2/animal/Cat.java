package day_37_Inheritance_2.animal;

public class Cat extends Animal {

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void Scratch(){

        System.out.println(name+" is scratching");



    }



}
