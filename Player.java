/**
 * Represents a player in the game.
 * Handles player identity and validation.
 *
 * US03 - Player Setup
 *
 * @author 
 */
public class Player {

	private final String name;

	/**
	 * Constructor for the Player class.
	 * Creates a new player with the specified name.
	 *
	 * @param name the name of the player
	 * @throws IllegalArgumentException if name is null or empty
	 */
	public Player(String name) {

		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Player name cannot be null or empty");
		}

		this.name = name.trim();
		System.out.println(this.name + " created.");
	}

	/**
	 * Gets the name of the player.
	 *
	 * @return the player name
	 */
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

}
