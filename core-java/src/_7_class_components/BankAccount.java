package _7_class_components;

public class BankAccount {
    int accountNumber;
    String accountType;
    double balance;
    static String BANK_NAME = "Bank of Mallya";

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public static void printBankAddress() {
        System.out.println("India - UK - US");
    }
}
