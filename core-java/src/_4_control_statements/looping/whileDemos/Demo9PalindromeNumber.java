package _4_control_statements.looping.whileDemos;

public class Demo9PalindromeNumber {
    public static void main(String[] args) {
        //palindrome number : given number = its reverse
        int number = 121;
        int originalNumber = number;
        //output --> 121
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reversed number is: " + reverse);
        System.out.println(originalNumber == reverse?"palindrome":"not palindrome");

    }
}
