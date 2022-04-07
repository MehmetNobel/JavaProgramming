package day_36_Inheritance.encapsulationTasks;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepporoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepporoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepporoniTopping(numberOfPepporoniTopping);
    }

    public String getSize() {
        return size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public int getNumberOfPepporoniTopping() {
        return numberOfPepporoniTopping;
    }


    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium")
                || size.equalsIgnoreCase("large")) {
            this.size = size;
        } else {
            System.err.println("invalid size entry");
            return;
        }

    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {

        if (numberOfCheeseTopping < 0) {
            System.err.println("numberofcheeseTopping cannot be negative");
            return;
        }

        if (size.equalsIgnoreCase("small") && numberOfCheeseTopping > 3) {

            System.err.println("the maximum number of cheese topping \n" +
                    "is:\n" +
                    "small: 3\n" +
                    "medium: 4\n" +
                    "large: 5");
            return;
        }
        if (size.equalsIgnoreCase("medium") && numberOfCheeseTopping > 4) {

            System.err.println("the maximum number of cheese topping \n" +
                    "is:\n" +
                    "small: 3\n" +
                    "medium: 4\n" +
                    "large: 5");
            return;
        }

        if (size.equalsIgnoreCase("large") && numberOfCheeseTopping > 5) {

            System.err.println("the maximum number of cheese topping \n" +
                    "is:\n" +
                    "small: 3\n" +
                    "medium: 4\n" +
                    "large: 5");
            return;
        }

        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public void setNumberOfPepporoniTopping(int numberOfPepporoniTopping) {


        if (numberOfPepporoniTopping < 0) {
            System.err.println("numberofpepporoniTopping cannot be negative");
            return;
        }

        if (size.equalsIgnoreCase("small") && numberOfPepporoniTopping > 4) {

            System.err.println("the maximum number of pepporoni topping \n" +
                    "is:\n" +
                    "small: 4\n" +
                    "medium: 5\n" +
                    "large: 6");
            return;
        }
        if (size.equalsIgnoreCase("medium") && numberOfPepporoniTopping > 5) {

            System.err.println("the maximum number of pepporoni topping \n" +
                    "is:\n" +
                    "small: 4\n" +
                    "medium: 5\n" +
                    "large: 6");
            return;
        }

        if (size.equalsIgnoreCase("large") && numberOfPepporoniTopping > 6) {

            System.err.println("the maximum number of pepporoni topping \n" +
                    "is:\n" +
                    "small: 4\n" +
                    "medium: 5\n" +
                    "large: 6");
            return;
        }

        this.numberOfPepporoniTopping = numberOfPepporoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepporoniTopping=" + numberOfPepporoniTopping +
                ", totalCost=" + calcCost() +
                '}';
    }

    public double calcCost() {

        double cost=0;

        if (size.equalsIgnoreCase("small"))
            cost= 10 + 2 * (numberOfCheeseTopping + numberOfPepporoniTopping);
        if (size.equalsIgnoreCase("medium"))
            cost= 12 + 2 * (numberOfCheeseTopping + numberOfPepporoniTopping);
        if (size.equalsIgnoreCase("large"))
            cost= 14 + 2 * (numberOfCheeseTopping + numberOfPepporoniTopping);

        return cost;
    }


    public static void main(String[] args) {

        Pizza p1 = new Pizza("small", 2, 3);
        System.out.println("p1 = " + p1);

        Pizza p2= new Pizza("medium", 3, 5);

        System.out.println("p2 = " + p2);

        Pizza p3= new Pizza("large", 3, 5);

        System.out.println("p3 = " + p3);


    }


}
/*
5. Pizza Task:
5.1 Create class named Pizza:
private variables:
size, numberOfCheeseTopping,
numberOfPepperoniTopping
Encapsulate all the fields
Conditions:
size of the
pizza can only be small, medium, large. case insensitive
Number of
cheese topping can not be negative, the maximum number of cheese topping
is:
small: 3
medium: 4
large: 5
Number of
pepperoni topping can not be negative, the maximum number of pepperoni
topping is:
small: 4
medium: 5
large: 6
Add a constructor that allows user to
set all the fields when the object is created.
(If the arguments not valid it should not be set to the instances)
Methods:
calcCost(): returns the
totalCost of the pizza
toString():returns a String
containing the pizza size, quantity of each topping, and the pizza cost as
calculated by calcCost()
Pizza cost is determined by:
S: $10 + $2 per topping
M: $12 + $2 per topping
L: $14 + $2 per topping

 */