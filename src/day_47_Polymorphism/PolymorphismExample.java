package day_47_Polymorphism;


class Person{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void whatsdoing(){

        System.out.println(getName() + " is ");

    }

}

class Father extends Person{


    public Father(String name){
        setName(name);
    }

    @Override
    public void whatsdoing() {
        System.out.println("father "+ getName() + " is studing java ");
    }
}


class Mother extends Person{

    public Mother(String name){
        setName(name);
    }

    @Override
    public void whatsdoing() {
        System.out.println("mother "+ getName() + " is preparing exam for the Math students ");
    }
}


class Son extends Person{

    public Son(String name){
        setName(name);
    }

    @Override
    public void whatsdoing() {
        System.out.println("son "+ getName() + " is playing chess ");
    }
}

class Daughter extends Person{

    public Daughter(String name){
        setName(name);
    }

    @Override
    public void whatsdoing() {
        System.out.println("Daughter "+ getName() + " is studying English ");
    }
}


public class PolymorphismExample {

    public static void whoAndWhat(Person person){

        person.whatsdoing();
    }



    public static void main(String[] args) {

        whoAndWhat(new Father("Mehmet"));

        whoAndWhat(new Daughter("Zeynep"));

        whoAndWhat(new Son("Esat"));

        whoAndWhat(new Mother("Ayşe"));

        // static polymprhsm  == metod overloadig

        // dynamic polymprhsm  == metod overriding



    }
}
