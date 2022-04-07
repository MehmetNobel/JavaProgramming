package day_31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaObjects {

    public static void main(String[] args) {

        ArrayList<Pizza> listPizza=new ArrayList<>();

        for (int i = 1; i <=25 ; i++) {
            Pizza smallPizza=new Pizza('S',2,3);
            Pizza mediumPizza=new Pizza('M',3,4);
            Pizza largePizza=new Pizza('L',4,5);
            listPizza.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza));

        }

        System.out.println("listPizza.size() = " + listPizza.size());

        double sumCost=0;

        for (Pizza pizza : listPizza) {

            System.out.println(pizza);

            sumCost+= pizza.calcCost();

        }

        System.out.println(sumCost);
    }


}
