/**
 * Main Game class that orchestrates game flow
 * Handles game initialization and turn management
 */
public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private TurnManager turnManager;
    private boolean gameStarted;

    /**
     * US01 - Start Game
     * Initializes all game components and begins the game
     */
    public void startGame() {
        if (gameStarted) {
            System.out.println("Game already started!");
            return;
        }

        System.out.println("Starting Game...");
        
        // US02 - Initialise Board
        board = new Board(8, 8);
        
        // US03 - Player Setup
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
        
        // US11 - Turn System
        turnManager = new TurnManager(player1, player2);
        gameStarted = true;
        
        System.out.println("Game Started Successfully!");
        System.out.println("Current Turn: " + turnManager.getCurrentPlayer().getName());
    }

    /**
     * US12 - Switch Player
     * Ends current turn and switches to the other player
     */
    public void endTurn() {
        if (!gameStarted) {
            System.out.println("Game has not started yet!");
            return;
        }

        turnManager.switchTurn();
        System.out.println("Turn Switched.");
        System.out.println("Current Turn: " + turnManager.getCurrentPlayer().getName());
    }

    /**
     * Gets the current game board
     */
    public Board getBoard() {
        return board;
    }

    /**
     * Checks if the game is currently active
     */
    public boolean isGameStarted() {
        return gameStarted;
    }

    /**
     * Gets the turn manager
     */
    public TurnManager getTurnManager() {
        return turnManager;
    }
}