package LSP;

public class Ambulance extends Car {
    @Override
    public void drive(double speed) {
        // Speed: 0 <= speed <= 45
        // Range of speed is now smaller
        if (!(0 <= speed && speed <= 45)) {
            throw new RuntimeException("Speed out of range");
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