package _5_accept_user_input;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a byte value");
        byte byteValue = sc.nextByte();

        System.out.println("Enter a short value");
        short shortValue = sc.nextShort();

        System.out.println("Enter a int value");
        int intValue = sc.nextInt();

        System.out.println("Enter a long value");
        long longValue = sc.nextLong();

        System.out.println("Enter a float value");
        float floatValue = sc.nextFloat();

        System.out.println("Enter a double value");
        double doubleValue = sc.nextDouble();

        System.out.println("Enter a boolean value");
        boolean booleanValue = sc.nextBoolean();

        System.out.println("Enter a String value");
        String stringValue = sc.next();

        System.out.println("Enter a multiple String values");
        String multipleStringValue = sc.nextLine();


        System.out.println("byte value: " + byteValue);
        System.out.println("short value: " + shortValue);
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("boolean value: " + booleanValue);
        System.out.println("String value: " + stringValue);
        System.out.println("multiple String value: " + multipleStringValue);
    }
}
