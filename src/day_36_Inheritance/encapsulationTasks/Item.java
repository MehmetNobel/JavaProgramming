package day_36_Inheritance.encapsulationTasks;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setQuantity(quantity);
        setUnitPrice(unitPrice);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        boolean isletter = Character.isLetter(name.charAt(0));
        boolean isBlank = name.isBlank();
        boolean isEmpty = name.isEmpty();
        boolean isLetterOrDigits = false;

        for (int i = 0; i < name.length(); i++) {
            if (Character.isLetterOrDigit(name.charAt(0)))
                isLetterOrDigits = true;
        }
        if (!(name == null) && isletter && !isBlank && !isEmpty && isLetterOrDigits) {
            this.name = name;
        } else {
            System.err.println("invalid item name");
        }

    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0)
            return;
        else
            this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if (name.equalsIgnoreCase("toilet paper") && quantity > 1) {
            System.err.println("you cannot buy more than 1 toilet paper!");
            return;
        }
        if (quantity <= 0) {
            System.err.println("quantity cannot be zero or negative!");
            return;
        } else
            this.quantity = quantity;
    }

    public double calcCost() {

        return quantity * unitPrice;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", cost=" + calcCost() +
                '}';
    }

    public static void main(String[] args) {

        Item i1 = new Item("bread", 3, 3);
        System.out.println("i1 = " + i1);
        // i1.setName("toilet paper");
        //System.out.println("i1 = " + i1);


    }
}


/*
4. Item Task
4.1create a class called Item
            private variables:
            name, unitPrice, quantity
Encapsulate all the fields:
Conditions:
name can not be empty or blank
name can not contain any special
characters other than space
name must start with letters
unit price can not be negative
quantity can not be negative
if the Item name is toilet paper
(case insensitive) then the quantity can not be more than 1
Add a constructor that allows user to set all the fields when
the object is created.
(If the arguments
not valid it should not be set to the instances)
instance methods:
calcCost(): returns the total cost
toString(): returns the name, unit price, quantity and
total cost info as calculated by calcCost()
 */