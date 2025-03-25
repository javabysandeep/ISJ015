package _3_operators._7_logical;

public class Demo3 {
    public static void main(String[] args) {
        int year = 2025;
        //leap year: it is divisible by 4, if it is century, then it must be divisible by 400
        //e.g. 2024, 2000
        //e.g. not a leap : 1900, 2100, 2025
        System.out.println(
                year %400==0 ||
                        (year%4==0 && year!=100)
        );
    }
}
