package _7_class_components._1_variables;

public class Demo1 {
    public static void main(String[] args) {
        //args - local non-primitive


        //local --> temp : primitive variable
        //local variables won't get default value
        int temp = 10;
        System.out.println("*************** local variables *****************");
        System.out.println("local variable " + temp);

        //user1 : local -->non-primitive
        User user1 = new User();
        System.out.println("************* instance variables : user 1 details *****************");
        System.out.println("user id : " + user1.id);
        System.out.println("user name : " + user1.name);
        System.out.println("user age : " + user1.age);
        System.out.println("user email : " + user1.email);
        System.out.println("user username : " + user1.username);
        System.out.println("user password : " + user1.password);

        //user2 : local -->non-primitive
        User user2 = new User();
        System.out.println("************* instance variable : user 2 details *****************");
        System.out.println("user id : " + user2.id);
        System.out.println("user name : " + user2.name);
        System.out.println("user age : " + user2.age);
        System.out.println("user email : " + user2.email);
        System.out.println("user username : " + user2.username);
        System.out.println("user password : " + user2.password);

        System.out.println("************* static variable **************** ");
        System.out.println("user count is " + User.userCount);
    }
}
