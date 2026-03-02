/**
 * Manages the turn system for the game
 * US11 - Turn System
 * US12 - Switch Player
 */
public class TurnManager {
    private Player currentPlayer;
    private Player otherPlayer;
    private int turnNumber;

    /**
     * Creates a turn manager with two players
     * @param player1 the first player
     * @param player2 the second player
     * @throws IllegalArgumentException if any player is null
     */
    public TurnManager(Player player1, Player player2) {
        if (player1 == null || player2 == null) {
            throw new IllegalArgumentException("Both players must be non-null");
        }
        if (player1.equals(player2)) {
            throw new IllegalArgumentException("Players must be different");
        }
        
        this.currentPlayer = player1;
        this.otherPlayer = player2;
        this.turnNumber = 1;
        System.out.println("Turn 1 begins.");
    }

    /**
     * Gets the current player
     * @return the player whose turn it is
     */
    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    /**
     * Gets the current turn number
     * @return the turn number
     */
    public int getTurnNumber() {
        return turnNumber;
    }

    /**
     * Gets the other player (not currently playing)
     * @return the player who is not taking their turn
     */
    public Player getOtherPlayer() {
        return otherPlayer;
    }

    /**
     * Switches to the next player's turn
     */
    public void switchTurn() {
        Player temp = currentPlayer;
        currentPlayer = otherPlayer;
        otherPlayer = temp;
        turnNumber++;
    }
}