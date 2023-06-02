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
    // Generally attributes/class variables
    private String message;

    // Constructor
    public Shouter(String initialMessage) {
        this.message = initialMessage;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
    }

    public static void main(String[] args) {
        Shouter s = new Shouter("Hello World");
        System.out.println(s.getMessage());
        s.setMessage("Hello COMP2511");
        System.out.println(s.getMessage());
    }
}
