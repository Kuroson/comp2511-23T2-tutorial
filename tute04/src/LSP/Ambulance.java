package LSP;

public class Ambulance extends Car {
    @Override
    public void drive(double speed) {
        // Speed: 0 <= speed <= 180
        // Range of speed is now smaller
        if (!(0 <= speed && speed <= 180)) {
            throw new RuntimeException("Speed out of range");
        }
        // Do stuff
    }

    public static void main(String[] args) {
        Car c = new Ambulance();
        c.drive(0); // oks
        c.drive(90); // ok
        // c.drive(180); // doesn't work with car as expected
        String[] s = { "1" };
        System.out.println(s instanceof String[]);
    }
}