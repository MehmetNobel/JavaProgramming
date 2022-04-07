package day_34_GarbageColeections_AccessModifiers;


import day_35_Encapsulation.Person;

import static day_35_Encapsulation.Person.*;

public class StaticImportTest {

    public static void main(String[] args) {

        printPlanetName();  // automatically imports the static datas from the interested class.

        System.out.println("numberOfHead = " + numberOfHead);


    }



}
