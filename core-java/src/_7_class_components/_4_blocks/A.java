package _7_class_components._4_blocks;

public class A {
    static {
        System.out.println("A::static block");
    }

    {
        System.out.println("A::instance block");
    }

    public A() {
        //1. call to the constructor
        super();
        //2. call to the same class instance block
        System.out.println("A::constant block");
    }
}
