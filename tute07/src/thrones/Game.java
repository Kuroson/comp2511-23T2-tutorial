package thrones;

public class Game {

    // // superclass
    // public Satellite createSatellite(String type) {
    //     if (type.equals("StandardSatellite")) {
    //         return new StandardSatellite(...);
    //     } else if (type.equals("RelaySatellite")) {
    //         return ...;
    //     }
    // }
    // // superclass extending superclass
    // // overriding the method
    // public Satellite createSatellite(String type) {
    //     if (type.equals("quantumSatellite")) {
    //         return ...;
    //     }
    //     return super.createSatellite(type);
    // }

    public static void main(String[] args) {
        King king = new King(0, 0);
        Queen queen = new Queen(0, 1);
        Knight knight = new Knight(0, 2);
        Dragon dragon = new Dragon(-1, 0);

        knight.attack(dragon);
    }

}