package day_44_Absraction_2.animal;

public interface Flyable {

    boolean isFly=true;

    void Flyable();

    default void highFly(){

        System.out.println("can higth fly");

    }



}
