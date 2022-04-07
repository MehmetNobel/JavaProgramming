package tasks_statics_constructors;

public class Dog {

    public String size, breed, color;
    public int age;
    public char gender;
    public static int numberOfLegs, numberOfEyes, numberOfWings;
    public static boolean isFriendly;

    public Dog(String size, String breed, String color, int age, char gender) {
        this.size = size;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.gender = gender;
    }

    static {
        numberOfEyes = 2;
        numberOfLegs=4;
        numberOfWings = 0;
        isFriendly = false;
    }

    public String toString() {
        return "Dog{" +
                "size='" + size + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public void eat(){

        System.out.println(breed+" is eating now");
    }

    public void drink(){

        System.out.println(breed+" is drinking now");
    }

    public void sleep(){

        System.out.println(breed+" is sleeping now");
    }


}

class Test4{

    public static void main(String[] args) {

        Dog d1=new Dog("small","Beagle","white",4,'M');

        System.out.println("d1 = " + d1);

        d1.eat();
        d1.drink();
        d1.sleep();


    }
}


/*
6. Dog Task:
1. Create a class called Dog
            Attributes:
            instance: breed, size, gender,
age, color
            statics: numberOfLegs,
numberOfEyes, numberOfWings, isFriendly
            Add a constructor to initialized all the
fields (instances)
            Methods:
            eat()
            sleep()
            play()
                toString()
 */