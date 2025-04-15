package _7_class_components._5_nested_classes;

public class Demo1 {
    //1. non-static nested class - inner class ---> non-static members
    class A {
    }

    //2. static nested classes  ---> static as well as non-static members
    static class B {
    }

    public static void main(String[] args) {
        //3. local inner class  ---> non-static members
        class C {
            int a;
            void m1(){
                System.out.println("C::m1");
            }
        }
        C c = new C();
        System.out.println(c.a);
        c.m1();
    }
}
