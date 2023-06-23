package LSP;

public class Car {
    public void drive(double speed) {
        // Speed: 0 <= speed <= 90
        if (!(0 <= speed && speed <= 90)) {
            throw new RuntimeException(String.format("Speed, %f, out of range", speed));
        }
        // Do stuff
    }
}
