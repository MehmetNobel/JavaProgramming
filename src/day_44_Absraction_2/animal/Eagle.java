package day_44_Absraction_2.animal;

public class Eagle extends Animal implements Flyable{

    public Eagle(String breed, String color, int age, char gender, String size, String name) {
        super(breed, color, age, gender, size, name);
    }

    @Override
    public void eat() {
        System.out.println("eagle can eat snake");

    }

    @Override
    public void Flyable() {

        System.out.println(getName()+ " can fly");

    }

    @Override
    public void highFly() {
        System.out.println(getName()+" can high fly easily");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "breed='" + getBreed() + '\'' +
                ", color='" + getColor() + '\'' +
                ", age=" + getAge()+
                ", gender=" + getGender() +
                ", size='" + getSize()+ '\'' +
                ", canFly='" + isFly+ '\'' +
                '}';

    }
}
