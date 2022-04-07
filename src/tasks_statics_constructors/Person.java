package tasks_statics_constructors;

public class Person {

    public int age;
    public String name;
    public char gender;
    public static boolean isHuman, hasNose, hasWings;
    public static int numberOfHead, numberOfEyes;


    public Person(int age, String name, char gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    static {
        isHuman = true;
        hasNose = true;
        hasWings = false;
        numberOfHead = 1;
        numberOfEyes = 2;
    }

    public String eat(String food){

        return name+" is now eating "+food;

    }

    public String drink(String drink){

        return name + " is now drinking "+ drink;
    }

    public String sleep(){

        return name + " is now sleeping ";
    }

    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", isHuman=" + isHuman +
                ", hasNose=" + hasNose +
                ", hasWings=" + hasWings +
                ", numberOfHead=" + numberOfHead +
                ", numberOfEyes=" + numberOfEyes +
                '}';
    }
}



class Test3{

    public static void main(String[] args) {

        Person p1=new Person(42,"mehmet",'M');

        System.out.println("p1 = " + p1);

        System.out.println("p1.eat(\"watermelon\") = " + p1.eat("watermelon"));

        System.out.println("p1.drink(\"water\") = " + p1.drink("water"));

        System.out.println("p1.sleep() = " + p1.sleep());

    }



}
/*
3. Person Task:
1. Create a class named Person:
Attributes:
instance: name, age, gender
static: isHuman(boolean),
hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,
Add a constructor that can set All the
fields (instances)
Actions:
eat(String food)
drink(String drink)
sleep()
toString()
 */