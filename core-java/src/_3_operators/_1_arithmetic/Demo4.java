package _3_operators._1_arithmetic;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println(10 + 20 - 1 * 100 + 20);//-50
        System.out.println(10 + 20 - 1 * 10 + 20 / 100);//20
        System.out.println(10 + (20 - 1 * 10) + 20 / 100);//20
        System.out.println(10 + 20 - 1 * (10 + 20) / 100);//30
        System.out.println('A' + 35);//100
        System.out.println('A' + 'A');//130

    }
}
