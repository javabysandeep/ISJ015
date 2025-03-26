package _4_control_statements.jumpStatements;

public class Demo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 6) {
                break;
            }
        }
        //output : 0, 1, 2, 3, 4,5,6
    }
}
