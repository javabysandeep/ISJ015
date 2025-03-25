package _4_control_statements.conditional;

public class Demo9 {
    public static void main(String[] args) {
        int number = 2;
        String result = switch (number) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            default -> "invalid number";
        };
        System.out.println(result);
    }
}
