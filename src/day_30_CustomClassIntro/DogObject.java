package day_30_CustomClassIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObject {

    public static void main(String[] args) {

        Dog dog1=new Dog("olisha","small",5,'F');
        Dog dog2=new Dog("Pasha","big",5,'M');
        Dog dog3=new Dog("olisha","small",5,'M');
        Dog dog4=new Dog("olisha","small",5,'F');
        Dog dog5=new Dog("olisha","small",5,'M');
        Dog dog6=new Dog("olisha","small",5,'F');
        Dog dog7=new Dog("olisha","small",5,'M');


        /*dog1.name="olishe";
        dog1.size="small";
        dog1.age=5;
        dog1.gender='m';

        System.out.println(dog1);

         */

        //We can store datas in Arrays ==>> primitives and non-primitives
        // But in arraylist we can just store non-primitives.


        Dog arr[]={dog1,dog2,dog3,dog4,dog5,dog6,dog7};

        System.out.println("arr = " + Arrays.toString(arr));

        System.out.println("arr.length = " + arr.length);

        ArrayList<Dog> listMale=new ArrayList<>();

        ArrayList<Dog> listFemale=new ArrayList<>();

        for (Dog dog : arr) {

            if(dog.gender=='M')
                listMale.add(dog);
            else
                listFemale.add(dog);
        }
        System.out.println("listMale = " + listMale);

        System.out.println("listFemale = " + listFemale);

        System.out.println("listMale.size() = " + listMale.size());

        System.out.println("listFemale.size() = " + listFemale.size());

        ArrayList<Dog> listOfDogs=new ArrayList<>();

        listOfDogs.addAll(listFemale);

        listOfDogs.addAll(listMale);

        System.out.println("listOfDogs = " + listOfDogs);

        System.out.println("listOfDogs.size() = " + listOfDogs.size());

        listOfDogs.removeIf(p->!p.name.equals("Pasha"));

        System.out.println("listOfDogs = " + listOfDogs);

        System.out.println("listOfDogs.size() = " + listOfDogs.size());


    }
}
