package _4_control_statements.looping.whileDemos;

public class Demo8 {
    public static void main(String[] args) {
        int number = 12345;
        //output --> 54321
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reversed number is: " + reverse);

    }
}
