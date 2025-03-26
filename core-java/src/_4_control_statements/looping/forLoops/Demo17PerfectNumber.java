package _4_control_statements.looping.forLoops;

public class Demo17PerfectNumber {
    public static void main(String[] args) {
        //Perfect number :  { number = sum of its factors}
        //6 : 1, 2,3 --> sum = 6
        //28 : 1, 2, 4, 7, 14 --> sum = 28
        int number = 28;
        int sumOfFactors = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfFactors = sumOfFactors + i;
            }
        }
        System.out.println(number == sumOfFactors ? "Its perfect number" : "Its not perfect number");
    }
}
