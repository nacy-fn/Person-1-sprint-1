package structures.basic;

/**
 * Represents a single tile on the game board.
 * Each tile has a position.
 * 
 * @author Your Name
 */
public class Tile {

    Position position;

    public Tile() {}

    public Tile(Position position) {
        super();
        if (position == null) {
            throw new IllegalArgumentException("Position cannot be null");
        }
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
