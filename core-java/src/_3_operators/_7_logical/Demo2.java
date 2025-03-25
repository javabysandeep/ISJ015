package _3_operators._7_logical;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(2025 % 400 == 0);//false
        System.out.println(2025 % 4 == 0);//false
        System.out.println(2025 % 100 != 0);//true

        System.out.println((2025 % 400 == 0) || ((2025 % 100 != 0) && (2025 % 4 == 0)));//false
    }
}
