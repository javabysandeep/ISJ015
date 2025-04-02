package _5_accept_user_input;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a char value");
        char ch = scanner.next().charAt(0);
        System.out.println("Entered character is " + ch);
    }
}
