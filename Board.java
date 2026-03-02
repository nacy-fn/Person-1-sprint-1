/**
 * Represents the game board with a grid of tiles
 * US02 - Initialise Board
 */
public class Board {
    private final int width;
    private final int height;
    private final Tile[][] tiles;

    /**
     * Creates a board with specified dimensions
     * @param width the width of the board
     * @param height the height of the board
     * @throws IllegalArgumentException if width or height is less than 1
     */
    public Board(int width, int height) {
        if (width < 1 || height < 1) {
            throw new IllegalArgumentException("Board dimensions must be at least 1x1");
        }
        
        this.width = width;
        this.height = height;
        this.tiles = new Tile[width][height];
        initialiseBoard();
    }

    /**
     * Initializes the board by creating tiles at each position
     */
    private void initialiseBoard() {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                tiles[x][y] = new Tile(new Position(x, y));
            }
        }
        System.out.println("Board Initialised: " + width + "x" + height);
    }

    /**
     * Gets a tile at the specified coordinates
     * @param x the x-coordinate
     * @param y the y-coordinate
     * @return the tile at the specified position
     * @throws IndexOutOfBoundsException if coordinates are out of bounds
     */
    public Tile getTile(int x, int y) {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            throw new IndexOutOfBoundsException(
                String.format("Coordinates (%d, %d) are out of bounds for board size %dx%d", 
                x, y, width, height)
            );
        }
        return tiles[x][y];
    }

    /**
     * Gets the width of the board
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets the height of the board
     */
    public int getHeight() {
        return height;
    }
}