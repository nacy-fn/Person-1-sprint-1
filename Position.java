import java.util.Objects;

/**
 * Represents a position on the game board
 * Immutable class for x, y coordinates
 */
public class Position {
    private final int x;
    private final int y;

    /**
     * Creates a position with specified coordinates
     * @param x the x-coordinate
     * @param y the y-coordinate
     * @throws IllegalArgumentException if coordinates are negative
     */
    public Position(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Coordinates cannot be negative");
        }
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Gets the y-coordinate
     */
    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position that = (Position) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}