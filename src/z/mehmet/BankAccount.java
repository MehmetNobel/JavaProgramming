package z.mehmet;

class Bank {

    static int quantity;

    String name;

    public Bank(String name, int quantity) {
        this.quantity = quantity;
        this.name = name;
    }

    public static void withdraw(int q) {


        System.out.println("initial bank account quantity:" + quantity);

        quantity -= q;

        System.out.println("the quantity that withdrawn : " + q);
        System.out.println("the remain quantity : " + quantity);
    }


}

public class BankAccount {


    public static void main(String[] args) {


        Bank b = new Bank("mehmet", 500);

        b.withdraw(200);





    }


}
