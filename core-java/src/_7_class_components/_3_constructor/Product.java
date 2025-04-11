package _7_class_components._3_constructor;

public class Product {
    int id;
    String name;
    double price;

    //zero param constructor
    Product() {
        id = 1;
        name = "abc";
        price = 10;
        System.out.println("Product constructor : zero param");
    }

    //parameterized constructor
    Product(int i, String n, double p) {
        //assigning local variable value to instance variable
        id = i;
        name = n;
        price = p;
    }

    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setPrice(double price) {
        this.price = price;
    }

    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    void printProductDetails() {
        System.out.println("Product details : ");
        System.out.println("Id : " + this.getId());
        System.out.println("Name : " + this.getName());
        System.out.println("Price : " + this.getPrice());

    }

    public static void main(String[] args) {
        //this.printProductDetails();
    }
}
