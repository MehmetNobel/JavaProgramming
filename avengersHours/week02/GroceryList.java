package week02;

import java.util.ArrayList;

public class GroceryList {

    public ArrayList<String> groceryList = new ArrayList<>();


    public void addItem(String str) {

        groceryList.add(str);
    }

    public void printGroceryList() {

        System.out.println(groceryList);
    }

    public void remove(String str) {

        groceryList.removeIf(p -> p.equals("str"));
    }

    public void modify(String strOld, String strNew) {

        remove(strOld);
        addItem(strNew);
    }

    public boolean findItem(String str) {
        if (groceryList.contains(str))
            return true;
            return false;


    }


}
