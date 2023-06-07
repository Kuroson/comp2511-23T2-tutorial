package shapes;

public class Circle extends Object {
    // Every class extends Object, it is not needed though
    public static final double pi = 3.14159;
    public int x, y;
    public int r;
    // Only 1 variable for all Circle objects
    static int no_circles = 0;

    public Circle() {
        super(); // not needed
        no_circles++;
    }

    public double circumference() {
        return 2 * pi * r;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.x);
        Circle c2 = new Circle();
        System.out.println(c2.x);
        System.out.println(c1.pi);
        System.out.println(Circle.pi);
    }
}