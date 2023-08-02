package thrones9;

/**
 * A king can move one square in any direction (including diagonally), and
 * always causes 8 points of damage when attacking.
 *
 * @author Robert Clifton-Everest
 *
 */
public class King extends Character {
    private static final int DAMAGE = 8;

    public King(int x, int y) {
        super(x, y);
    }

    /**
     * This character attacks the given victim, causing them damage according to
     * their rules.
     *
     * @param victim
     */
    public void attack(Character victim) {
        victim.damage(DAMAGE);
    }

    /**
     * Can this character move by the given amount along the x and y axes.
     *
     * @param x
     * @param y
     * @return True if they can move by that amount, false otherwise
     */
    public boolean canMove(int dx, int dy) {
        return Math.abs(dx) <= 1 && Math.abs(dy) <= 1;
    }

}
