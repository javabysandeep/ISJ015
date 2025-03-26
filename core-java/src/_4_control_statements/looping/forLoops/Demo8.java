package _4_control_statements.looping.forLoops;

public class Demo8 {
    public static void main(String[] args) {
        //print even numbers in a range of 1 to 100
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
