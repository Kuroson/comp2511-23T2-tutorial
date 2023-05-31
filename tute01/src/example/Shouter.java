package example;

/**
 * Write a program that stores a message and has methods for getting the message,
 * updating the message and printing it out in all caps. Write a `main()` method
 * for testing this class.
 *
 * Create a:
 * - Getter
 * - Setter
 * - Constructor
 * - printMe
 * - shout
 * - toString
 */
public class Shouter {
    private String name; // this.name

    public Shouter(String initialName) {
        this.name = initialName;
    }

    public void setName(String name1) {
        this.name = name1;
    }

    public String getName() {
        return this.name;
        // return name;
    }

    public static void main(String[] args) {
        Shouter s = new Shouter("Hello");
        System.out.println(s.getName());
    }
}
