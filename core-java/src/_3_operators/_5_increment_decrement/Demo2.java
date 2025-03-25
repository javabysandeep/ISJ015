package _3_operators._5_increment_decrement;

public class Demo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = --a;
        System.out.println(a);//9
        System.out.println(b);//9

        int c = 10;
        int d = c--;
        System.out.println(c);//9
        System.out.println(d);//10
    }
}
