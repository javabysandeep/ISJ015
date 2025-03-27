package _4_control_statements.jumpStatements;

public class Demo4 {
    public static void main(String[] args) {
        //continue;//CTE
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
