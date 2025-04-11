package _7_class_components._2_methods;

public class BankAccount {
    int accountNumber;
    String accountType;
    double balance;

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public void transfer(double amount) {
        System.out.println("checking balance before transfer " +
                this.getBalance()
                /*getBalance()*/
        );
        balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.transfer(100);

        //calling static method from another static method within the same class
        BankAccount.display();//recommended
       /* display();//not recommended
        account.display();//not recommended*/
    }

    public static void display(){
        System.out.println("display is static method");
    }
}
