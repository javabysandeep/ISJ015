package _3_operators._8_bitwise;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("bitwise and operation for boolean");
        System.out.println(true & true);//true
        System.out.println(false & false);//false
        System.out.println(true & false);//false
        System.out.println(false & true);//false


        System.out.println("bitwise or operation for boolean");
        System.out.println(true | true);//true
        System.out.println(false | false);//false
        System.out.println(true | false);//true
        System.out.println(false | true);//true

        System.out.println("bitwise xor operation for boolean");
        System.out.println(true ^ true);//false
        System.out.println(false ^ false);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ true);//true
    }
}
