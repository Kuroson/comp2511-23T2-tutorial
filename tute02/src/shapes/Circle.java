package shapes;

public class Circle extends Object {
    // Every class extends Object, it is not needed though
    public static final double pi = 3.14159;
    public int x, y;
    public int r;

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        // c1.x
        // c2.x
        System.out.println(Circle.pi);
        System.out.println(c1.pi);
        // System.out.println(Circle.main())
    }
}