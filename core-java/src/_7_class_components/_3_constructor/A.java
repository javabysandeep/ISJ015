package _7_class_components._3_constructor;

public class A {
    int x;
    int y;
    int z;

    A(int x, int y, int z) {
        this();
        System.out.println("param constructor");
        this.x = x;
        this.y = y;
        this.z = z;
    }

    A() {
       // this(1, 2, 3);
        System.out.println("zero param constructor");
    }

    public static void main(String[] args) {
        A a = new A(1,2,3);
    }
}
