/**
 * Main Game class responsible for orchestrating the game flow.
 * Handles initialisation and turn management.
 *
 * @author 
 */
public class Game {

	private Board board;
	private Player player1;
	private Player player2;
	private TurnManager turnManager;
	private boolean gameStarted;

	/**
	 * US01 - Start Game
	 * Initialises all core game components and starts the game.
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
	 * Ends the current turn and switches to the other player.
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
	 * Gets the current game board.
	 *
	 * @return the board
	 */
	public Board getBoard() {
		return board;
	}

	/**
	 * Checks whether the game has started.
	 *
	 * @return true if the game is active
	 */
	public boolean isGameStarted() {
		return gameStarted;
	}

	/**
	 * Gets the turn manager.
	 *
	 * @return the turn manager
	 */
	public TurnManager getTurnManager() {
		return turnManager;
	}

}
