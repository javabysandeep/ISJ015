package _3_operators._3_assignment;

public class Demo1 {
    public static void main(String[] args) {
        int a = 10; //direct value
        int b = 10 * 10 + 20;//expression
        int c = b;//another variable
        int d = add(100,200);
        System.out.println(a);//10
        System.out.println(b);//120
        System.out.println(c);//120
        System.out.println(d);//300



    }
    public static int add(int number1, int number2){
        return number1 + number2;
    }
}
