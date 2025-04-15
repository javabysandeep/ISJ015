package _7_class_components._3_constructor;

public class P {
    int x;
    int y;
    int z;
    static int objectCounter = 0;

    P(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        objectCounter++;
    }

    P() {
        objectCounter++;
    }

    P(int x, int y) {
        this.x = x;
        this.y = y;
        objectCounter++;
    }

    P(int x) {
        this.x = x;
        objectCounter++;
    }

    public static void main(String[] args) {
        P p1 = new P(1, 2, 3);
        P p2 = new P();
        P p3 = new P(1, 2);
        P p4 = new P(1);

        System.out.println("Object count = " + objectCounter);

    }
}
