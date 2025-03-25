package _4_control_statements.conditional;

public class Demo5 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is a max");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is a max");
        } else {
            System.out.println(number3 + " is a max");
        }
    }
}
