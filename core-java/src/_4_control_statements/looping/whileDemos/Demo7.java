package _4_control_statements.looping.whileDemos;

public class Demo7 {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println(number % 10);//5
        number = number / 10;//1234

        System.out.println(number % 10);//4
        number = number / 10; //123

        System.out.println(number % 10);//3
        number = number / 10;//12

        System.out.println(number % 10);//2
        number = number / 10;//1
        System.out.println(number % 10);//1
    }
}
