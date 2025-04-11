package _7_class_components._2_methods;

public class Demo1 {
    void m1(){
        //call m2()
        m2();
        this.m2();

        //call m3
        m3();//not recommended
        Demo1.m3();
        this.m3();//not recommended
    }
    void m2(){}
    static void m3(){
        //call m2
        Demo1 demo1 = new Demo1();
        demo1.m2();

        //call m4
        m4();
        Demo1.m4();
        demo1.m4();
    }
    static void m4(){}
}
