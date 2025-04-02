package _5_accept_user_input;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number1");
        int number1 = scanner.nextInt();
        System.out.println("Enter the number2");
        int number2 = scanner.nextInt();
        System.out.println("Addition of two numbers is "
                + (number1 + number2));
    }
}
