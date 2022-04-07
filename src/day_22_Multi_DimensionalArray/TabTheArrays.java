package day_22_Multi_DimensionalArray;

public class TabTheArrays {

    public static void main(String[] args) {

        String[][] items = {{"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"}, {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

        for (String[] item : items) {

            for (String s : item) {

                System.out.print(s + "\t");
            }
        }
        System.out.println("************************************");

        System.out.println();

        for (String[] strings : items) {

            for (int i = strings.length - 1; i >= 0; i--) {

                System.out.print(strings[i] + "\t");
            }
            System.out.println();
        }
        System.out.println("//////////////////////////////////");

        for (int i = items.length - 1; i >= 0; i--) {

            for (String s : items[i]) {

                System.out.print(s + " ");

            }

        }

    }

}

/*
2. Given the Array:
String[][] items = {
{"Apple", "Banana", "Grape",
"Avocado"},
{"Paper Towels", "Toilet
Papers", "Tissues", "Diapers"},
{"Coke", "Fanta", "Arizona
Tea", "Pepsi", "Water"}
};
1. print the following output: (add \t between two words)
Apple    Banana   Grape    Avocado
Paper Towels     Toilet Papers
Tissues    Diapers
Coke   Fanta   Arizona Tea   Pepsi
Water
2. print the following output: (add \t between two words)
Avocado   Grape    Banana    Apple
Diapers   Tissues   Toilet Papers
Paper Towels
Water    Pepsi    Arizona Tea    Fanta
Coke
3. print the following output: (add \t between two words)
Coke   Fanta   Arizona Tea   Pepsi
Water
Paper Towels     Toilet Papers
Tissues    Diapers
Apple    Banana   Grape    Avocado
 */