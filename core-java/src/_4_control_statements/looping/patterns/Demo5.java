package _4_control_statements.looping.patterns;

public class Demo5 {
    public static void main(String[] args) {
        /*

         *****
         ****
         ***
         **
         *

         */

        for (int row = 5; row >= 1; row--) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
        }
    }
}
