package structures.basic;

/**
 * Manages the turn system for the game.
 * Handles switching between two players
 * and tracking the turn number.
 * 
 * @author Your Name
 */
public class TurnManager {

    Player currentPlayer;
    Player otherPlayer;
    int turnNumber;

    public TurnManager() {}

    public TurnManager(Player player1, Player player2) {
        super();
        
        if (player1 == null || player2 == null) {
            throw new IllegalArgumentException("Both players must be non-null");
        }
        if (player1.equals(player2)) {
            throw new IllegalArgumentException("Players must be different");
        }

        this.currentPlayer = player1;
        this.otherPlayer = player2;
        this.turnNumber = 1;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Player getOtherPlayer() {
        return otherPlayer;
    }

    public void setOtherPlayer(Player otherPlayer) {
        this.otherPlayer = otherPlayer;
    }

    public int getTurnNumber() {
        return turnNumber;
    }

    public void setTurnNumber(int turnNumber) {
        this.turnNumber = turnNumber;
    }

    /**
     * Switches to the next player's turn.
     */
    public void switchTurn() {
        Player temp = currentPlayer;
        currentPlayer = otherPlayer;
        otherPlayer = temp;
        turnNumber++;
    }
}
