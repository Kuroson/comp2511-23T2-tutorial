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
    // `private` is an access identifier. `public` is another access identifier
    // Generally we set ALL attributes to private for
    // security and data encapsulation (explored next week by the course)
    private String message;

    public Shouter(String message) {
        // Here, we have to use `this.message` to refer to the class's version of the message variable
        // This is because there are two conflicting names in the same scope.
        // 1. Parameter of constructor
        // 2. Class attribute/variable itself
        this.message = message;
        //              ^ refers to the value passed into the constructor
        // ^ Refers to the class's attribute message
    }

    public String getMessage() {
        // NOTE: You don't have to use the keyword `this`
        // But I use it because of clarity
        // I generally use `this.` as it makes it very clear
        // Where the variable is coming from (from the class itself)
        // Thereby, any other variable can be assumed to belong to the scope of the function/codeblock
        return this.message;
    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
    }

    public String toString() {
        return String.format("Shouter message = %s", this.message);
    }

    public void printMe() {
        System.out.println(this.message);
    }

    public void shout() {
        System.out.println(this.message.toUpperCase());
    }

    public void printAndShout() {
        // NOTE: You don't have to use the keyword `this`
        // But I use it because of clarity
        this.printMe();
        this.shout();
    }

    public static void main(String[] args) {
        Shouter s = new Shouter("This is my message");
        s.printMe();
        s.shout();
        // When printing objects, Java will try and stringify
        // In this case, it calls the .toString() method
        System.out.println(s);
        // Equivalent is
        // System.out.println(s.toString());
    }
}
