package _4_control_statements.looping.forLoops;

public class Demo11 {
    public static void main(String[] args) {
        //find sum of numbers in a range of 1 to 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
            //sum +=i;
        }
        System.out.println("Loop sum = " + sum);
        System.out.println("formula sum = " + 100 * 101 / 2);
        // sum = n*(n+1)/2
    }
}
