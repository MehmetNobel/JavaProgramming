package day_31_Constructors;

public class BankAccount {

    public String accountHolder;
    public int accountNumber;
    public double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void chackBalance() {

        System.out.println("your balance is" + balance);
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            System.err.println("amount cannot be zero or negative");
            return;
        }

        balance += amount;
    }

    public void withDraw(double amount) {

        if (amount > balance) {
            System.err.println("you cannot withdraw over then your balance");
            return;
        }

        if(amount<0){
            System.err.println("the amount cannot be zero or negative!");
            return;
        }
        balance -= amount;
    }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';


    }
}
