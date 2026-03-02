/**
 * Represents a single tile on the game board
 * Each tile has a position and can hold game pieces
 */
public class Tile {
    private final Position position;

    /**
     * Creates a tile at the specified position
     * @param position the position of this tile
     * @throws IllegalArgumentException if position is null
     */
    public Tile(Position position) {
        if (position == null) {
            throw new IllegalArgumentException("Position cannot be null");
        }
        this.position = position;
    }

    /**
     * Gets the position of this tile
     */
    public Position getPosition() {
        return position;
    }
}