package _3_operators._4_shorthand_artithmetic;

public class Demo2 {
    public static void main(String[] args) {
        int a = 10;
        a += 10 * a;
        System.out.println("a value is " + a);//100

        int b = 11;
        b -= b * 10 + b / 10;
       // b = b - 111; ///-100
        System.out.println("b value is " + b);//-100

    }
}
