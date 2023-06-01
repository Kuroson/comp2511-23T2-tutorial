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
    // Declare class variables aka attributes
    private String message;

    public Shouter(String message) {
        this.message = message;
        // this.message = message1;
    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
    }

    public String getMessage() {
        return this.message;
    }

    public static void main(String[] args) {
        Shouter s = new Shouter("Hello World");
        System.out.println(s.getMessage());
        s.setMessage("Hello Comp2511");
        System.out.println(s.getMessage());
        // System.out.println(this.message);
    }
}
