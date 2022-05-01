package day_44_Absraction_2.animal;

public class Parrot extends Animal implements Flyable,Playable{

    public Parrot(String breed, String color, int age, char gender, String size, String name) {
        super(breed, color, age, gender, size, name);
    }

    @Override
    public void eat() {

    }

    @Override
    public void Flyable() {

    }

    @Override
    public void playable() {

    }
}
