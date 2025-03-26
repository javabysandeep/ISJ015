package _4_control_statements.looping.forLoops;

public class Demo12 {
    public static void main(String[] args) {
        for (int left = 0, right = 10; ; left++, right--) {
            System.out.println(left + "\t" + right);
        }
        //output
        //0 10
        //1 9
        //2 8
        //3 7
        //.....
        //infinite
    }
}
