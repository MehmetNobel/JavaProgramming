package day_31_Constructors;

public class Pizza {

    public char size;
    public int numberOfCheeseToopping;
    public int numberOfPepperoniToopping;
    double cost ;

    public Pizza(char size, int numberOfCheeseToopping, int numberOfPepperoniToopping) {

        this.size = size;
        this.numberOfCheeseToopping = numberOfCheeseToopping;
        this.numberOfPepperoniToopping = numberOfPepperoniToopping;

    }

    public String toString() {

        return "size :" + size + "\nNumberOfCheeseTopping: " + numberOfCheeseToopping +
                "\nNumberOfPepporoniTopping : " + numberOfPepperoniToopping+ "\nPizza Cost is : $"+calcCost();

    }

    public double calcCost() {

        if (size == 'S')
            cost=10+(numberOfPepperoniToopping*2)+(numberOfCheeseToopping*2);
        if (size == 'M')
            cost=10+(numberOfPepperoniToopping*2)+(numberOfCheeseToopping*2);
        if (size == 'L')
            cost=10+(numberOfPepperoniToopping*2)+(numberOfCheeseToopping*2);

        return cost;

    }


}



