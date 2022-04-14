package week02;

public class GroceryMain {

    public static void main(String[] args) {

        GroceryList gl=new GroceryList();

        gl.addItem("armut");
        gl.addItem("elma");

        gl.printGroceryList();

        System.out.println("gl.findItem(\"elma\") = " + gl.findItem("elma"));

        gl.modify("elma","ayva");

        System.out.println("gl.groceryList = " + gl.groceryList);


    }
}
