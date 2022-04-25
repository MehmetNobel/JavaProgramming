package day_44_Absraction_2.animal;

public class Cat extends Animal implements Playable{

    public Cat(String breed, String color, int age, char gender, String size, String name) {
        super(breed, color, age, gender, size, name);
    }

    @Override
    public void eat() {

        System.out.println(getName()+ " is eating cat food now");

    }


    @Override
    public void playable() {

        System.out.println(getName()+ " is so enjoyfull to play with");

    }
}
