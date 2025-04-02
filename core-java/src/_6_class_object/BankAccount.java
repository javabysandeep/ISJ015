package _6_class_object;

public class BankAccount {
    int customerId;
    int accountNumber;
    double balance;
    String accountHolderName;
    String accountType;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}
