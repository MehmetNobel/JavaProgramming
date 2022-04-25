package day_44_Absraction_2.animal;

public class Tiger extends Animal{

    public Tiger(String breed, String color, int age, char gender, String size, String name) {
        super(breed, color, age, gender, size, name);
    }

    @Override
    public void eat() {

        System.out.println(getName()+" is eating beer now");

    }






}
