package day_31_Constructors;



public class BankOfAmerica {

    public static void main(String[] args) {

        BankAccount acc1=new BankAccount("mehmet", 12345,1000);

        System.out.println("acc1.balance = " + acc1.balance);

        System.out.println("acc1.accountHolder = " + acc1.accountHolder);

        acc1.withDraw(2000);

        acc1.withDraw(-100);


    }



}
