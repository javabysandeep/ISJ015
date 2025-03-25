package _3_operators._2_string_concatenation;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(10 + 20);//addition : 30
        System.out.println(10 + "20");//concatenation : 1020
        System.out.println('A' + 'A' + "A"); //130A
        System.out.println('A' + "A" + "A"); //AAA
        System.out.println('A' + "A" + 'A' + 10); //AAA10
        System.out.println('A' + "A" + 'A' + "A");//AAAA

    }
}
