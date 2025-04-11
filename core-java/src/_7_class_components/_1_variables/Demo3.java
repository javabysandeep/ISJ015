package _7_class_components._1_variables;

public class Demo3 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountNumber = 1;
        bankAccount.accountType = "Savings";
        bankAccount.balance = 2000;

        bankAccount.deposit(10000);
        bankAccount.withdraw(1000);
        System.out.println("Current balance is: " + bankAccount.getBalance());
        System.out.println("Bank Name "+BankAccount.BANK_NAME);
        BankAccount.printBankAddress();

    }
}
