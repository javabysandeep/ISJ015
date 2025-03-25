package _3_operators._4_shorthand_artithmetic;

public class Demo1 {
    public static void main(String[] args) {
        int a = 10;
        a = a + 10; //---> a +=10
        System.out.println(a);//20


        int b = 10;
        b = b - 1; // --> b -=1;
        System.out.println(b);//9

        int c = 10;
        c = c * 2; //---> c *=2
        System.out.println(c);//20

        int d = 10;
        d = d / 2; // --> d /=2;
        System.out.println(d);//5

        int e = 11;
        e = e % 3; //---> e %=3;
        System.out.println(e);//2

    }
}
