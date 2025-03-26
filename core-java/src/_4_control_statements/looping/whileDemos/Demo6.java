package _4_control_statements.looping.whileDemos;

public class Demo6 {
    public static void main(String[] args) {
        //find the sum of digits ---> 15
        int number = 12345;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println(sum);

    }
}
