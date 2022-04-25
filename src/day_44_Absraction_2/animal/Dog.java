package day_44_Absraction_2.animal;

public class Dog extends Animal{


    public Dog(String breed, String color, int age, char gender, String size, String name) {
        super(breed, color, age, gender, size,name);
    }

    @Override
    public void eat() {  // parentta public abstract void eat yazarken burada abstarct ortadan kalkıyor.

        System.out.println(getName()+" is eating dog food");

    }

    public void bark(){

        System.out.println();
    }


}
