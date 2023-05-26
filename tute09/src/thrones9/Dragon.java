package thrones9;

/**
 * A dragon can only move up, down, left or right, and has a 1 in 6 chance of
 * inflicting 20 points of damage.
 *
 * @author Robert Clifton-Everest
 *
 */
public class Dragon extends Character {
    public Dragon(int x, int y) {
        super(x, y);
    }

    @Override
    public void attack(Character victim) {
        if (Math.random() * 6 < 1) {
            victim.damage(20);
        }
    }

    @Override
    public boolean canMove(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        return ((x == 1 && y == 0) || (x == 0 && y == 1));
        //          up or down           left or right
    }
}
