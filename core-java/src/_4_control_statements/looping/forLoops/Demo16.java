package _4_control_statements.looping.forLoops;

public class Demo16 {
    public static void main(String[] args) {
        //find the factors of given number

        //factors --> 6 : 1,2,3
        //factors --> 20 : 1,2,4,5,10
        //factors --> 28 : 1,2,4,7,14
        int number = 28;
        // 6 %1 ==0
        // 6 %2 ==0
        // 6 %3 ==0
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
