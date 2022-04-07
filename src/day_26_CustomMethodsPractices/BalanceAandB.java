package day_26_CustomMethodsPractices;

public class BalanceAandB {

    public static void main(String[] args) {

        String str = "bazbccabbddab";

        int counta = 0;
        int countb = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a')
                counta++;

            if (str.charAt(i) == 'b')
                countb++;

        }

        boolean isaBefore=str.indexOf('a')<str.indexOf('b');

        if ((counta == countb)&&isaBefore)
            System.out.println("it is balanced");

        else
            System.out.println("it is not balanced");


    }
}
