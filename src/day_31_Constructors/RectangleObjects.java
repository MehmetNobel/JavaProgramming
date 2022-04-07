package day_31_Constructors;

import java.util.ArrayList;

public class RectangleObjects {

    public static void main(String[] args) {

        Rectangle rc1=new Rectangle(4,5);

        ArrayList<Rectangle> listOfRectangles=new ArrayList<>();
        System.out.println("rc1 = " + rc1);

        for (int i = 0; i <5 ; i++) {

            Rectangle rc=new Rectangle(4,5);
            listOfRectangles.add(rc);

        }

        System.out.println("listOfRectangles = " + listOfRectangles);


    }




}
