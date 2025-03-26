package _4_control_statements.looping.whileDemos;

public class Demo4 {
    public static void main(String[] args) {
        int left = 0;
        int right = 10;
        while (left <= right) {
            System.out.println(left + "\t" + right);
            left++;
        }
    }
    //output:
    //0 10
    //1 10
    //2 10
    //3 10
    //4 10
    //5 10
    //6 10
    //7 10
    //8 10
    //9 10
    //10 10
}
