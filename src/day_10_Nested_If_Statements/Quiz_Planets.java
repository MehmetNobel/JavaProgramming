package day_10_Nested_If_Statements;

import java.util.*;

public class Quiz_Planets {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");

        String a = s.nextLine();

        if (a.equals("a") || a.equals("b") || a.equals("c")) {


            if (a.equals("a")) {

                System.out.println("a is wrong"); }

       else if (a.equals("b")) {

                    System.out.println("b is correct");}

                else{

                        System.out.println("c is wrong");
                    }
                } else {
                    System.out.println(a + " is not a valid answer");


                }
            }
        }