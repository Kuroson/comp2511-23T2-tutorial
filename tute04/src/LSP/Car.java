package LSP;

public class Car {
    /**
     * @precondition 0 <= speed <= 90
     * @param speed
     */
    public void drive(double speed) {
        if (!(0 <= speed && speed <= 90)) {
            throw new RuntimeException(String.format("Speed, %f, out of range", speed));
        }
        // Do stuff
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.drive(0); // oks
        c.drive(90); // ok
        // c.drive(180); // doesn't work with car as expected
    }
}
