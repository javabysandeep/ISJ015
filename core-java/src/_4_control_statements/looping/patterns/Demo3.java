package _4_control_statements.looping.patterns;

public class Demo3 {
    public static void main(String[] args) {
        /*
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5

        * */

        for (int row = 1; row <=5 ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
