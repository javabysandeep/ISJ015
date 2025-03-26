package _4_control_statements.looping.patterns;

public class Demo7 {
    public static void main(String[] args) {
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print((int) (Math.random()*1000) +" ");
            }
            System.out.println();
        }

    }
}
