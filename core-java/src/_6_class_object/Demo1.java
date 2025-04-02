package _6_class_object;

public class Demo1 {
    public static void main(String[] args) {
        //age is a variable which stores the primitive type data
        //age is called as primitive variable
        int age = 30;
        /*

        1. BankAccount --> name of the class or type of data
        2. bankAccount --> it is a variable which stores the reference or address of an object
                --> it stores non-primitive value i.e. reference of an object
                so it is called as reference variable

         3. = ---> assignment operator --> assigns the RHS to LHS variable
         4. new --> keyword to create a new object
         5. BankAccount() ---> constructor which constructs the object
         6. new BankAccount(); ---> it is an object
        * */
        BankAccount bankAccount = new BankAccount();
        System.out.println("1. Customer ID = "+bankAccount.customerId);
        System.out.println("2. Account number = "+bankAccount.accountNumber);
        System.out.println("3. Balance = "+bankAccount.balance);
        System.out.println("4. Account Holder Name = "+bankAccount.accountHolderName);

        bankAccount.customerId = 1;
        bankAccount.accountNumber = 101;
        bankAccount.balance = 10000;
        bankAccount.accountHolderName = "John Doe";
        System.out.println("After update");
        System.out.println("1. Customer ID = "+bankAccount.customerId);
        System.out.println("2. Account number = "+bankAccount.accountNumber);
        System.out.println("3. Balance = "+bankAccount.balance);
        System.out.println("4. Account Holder Name = "+bankAccount.accountHolderName);
    }
}
