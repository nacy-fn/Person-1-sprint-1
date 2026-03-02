/**
 * Entry point of the game application.
 * Responsible for starting the game instance.
 *
 * @author 
 */
public class Main {

	/**
	 * Application entry method.
	 *
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		Game game = new Game();

		// US01 - Start Game
		game.startGame();

		// US12 - Demonstrate turn switching
		game.endTurn();
		game.endTurn();
	}

}
