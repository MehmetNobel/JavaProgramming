package day_40_Final_Keyword;

public class FinalVariable {

    //we can overload final methods.

    public static final int sum(int a, int b){
        return a+b;

    }

    public static final int sum(int a, int b,int c){
        return a+b+c;

    }

    public static void main(String[] args) {

      final int num=20; // we can not re assign a new value to a final variable.

        System.out.println("sum(3,4) = " + sum(3, 4));

        System.out.println("sum(3,4,5) = " + sum(3, 4, 5));


    }
}
