package thrones;

import java.util.Random;

public class CharacterFactory {
    private static Random r = new Random();

    private static int getRandomInt() {
        return r.nextInt(4);
    }

    public static King createKing() {
        return new King(getRandomInt(), getRandomInt(), 5);
    }

    public static Queen createQueen() {
        return new Queen(getRandomInt(), getRandomInt());
    }
}
