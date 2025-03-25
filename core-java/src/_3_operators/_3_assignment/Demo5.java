package _3_operators._3_assignment;

public class Demo5 {
    public static void main(String[] args) {
        int number = 123456789;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("sum of digits is : " + sum);
    }
}
