package _4_control_statements.looping.forLoops;

public class Demo14 {
    public static void main(String[] args) {
        for (int left = 0, right = 10; left < right; right--) {
            System.out.println(left + "\t" + right);
        }
        //output
        //0 10
        //0 9
        //0 8
        //0 7
        //0 6
        //0 5
        //0 4
        //0 3
        //0 2
        //0 1

    }
}
