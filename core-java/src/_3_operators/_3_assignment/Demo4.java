package _3_operators._3_assignment;

public class Demo4 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 12345;
        int digit = number % 10;
        sum = sum + digit;
        System.out.println(digit);//5

        number = number /10; //1234
        digit = number % 10; //4
        sum = sum + digit;
        System.out.println(digit);//4

        number = number / 10;//123
        digit = number % 10; //3
        sum = sum + digit;
        System.out.println(digit);//3

        number = number / 10; //12
        digit = number % 10; //2
        sum = sum + digit;
        System.out.println(digit);

        number = number / 10;//1
        digit = number % 10; //1
        sum = sum + digit;
        System.out.println(digit);//1

        number = number / 10; //0 ---> last
        System.out.println("Sum of digits is  "+sum); //15


    }
}
