package _7_class_components._3_constructor;

public class Q {
    int x;
    int y;
    int z;
    static int objectCounter = 0;

    Q(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Q() {
    }

    Q(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Q(int x) {
        this.x = x;
    }

    {
        objectCounter++;
    }

    public static void main(String[] args) {
        Q q1 = new Q(1, 2, 3);
        Q q2 = new Q();
        Q q3 = new Q(1, 2);
        Q q4 = new Q(1);

        System.out.println("Object count = " + objectCounter);

    }
}
