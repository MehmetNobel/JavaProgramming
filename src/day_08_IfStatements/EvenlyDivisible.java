package day_08_IfStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int num=68;

        boolean isDivBy2=num%2==0;
        boolean isDivBy3=num%3==0;
        boolean isDivBy4=num%2==0;

        System.out.println(num+" is divisible by 2 : " + isDivBy2);
        System.out.println(num+" is divisible by 3 : " + isDivBy3);
        System.out.println(num+" is divisible by 4 : " + isDivBy4);
    }
}
