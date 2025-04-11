package _7_class_components._1_variables;

public class Demo2 {
    public static void main(String[] args) {
        //user1 : local -->non-primitive
        User user1 = new User();
        user1.id = 101;
        user1.name = "Vaibhav";
        user1.email = "vaibhav@gmail.com";
        user1.password = "12345";
        user1.age = 19;
        user1.role = "Job Seeker";

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
