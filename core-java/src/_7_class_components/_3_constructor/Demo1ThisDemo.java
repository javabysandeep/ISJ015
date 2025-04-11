package _7_class_components._3_constructor;

public class Demo1ThisDemo {
    public static void main(String[] args) {
        // constructor
        Product product1 = new Product();
        System.out.println("Product 1 : " + product1.id + "\t" + product1.name + "\t" + product1.price);

        Product product2 = new Product();
        System.out.println("Product 2: " + product2.id + "\t" + product2.name + "\t" + product2.price);


        Product product3 = new Product(101, "Laptop", 90000);
        System.out.println("Product 3: " + product3.id + "\t" + product3.name + "\t" + product3.price);

        Product product4 = new Product(102, "Camera", 35000);
        System.out.println("Product 4: " + product4.id + "\t" + product4.name + "\t" + product4.price);
    }
}
