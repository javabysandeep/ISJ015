package _3_operators._1_arithmetic;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println(10.0 / 0);//Infinity
        System.out.println(10.0 % 0);//NaN
        System.out.println(10 / 0);//ArithmeticException :: divide by zero
        System.out.println(10 % 0);//ArithmeticException :: divide by zero
    }
}
