package _4_control_statements.jumpStatements;

public class Demo5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Rest of the main method");
    }
}
