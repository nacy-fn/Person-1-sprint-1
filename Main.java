public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.startGame(); // US01 - Start Game
        
        // Demonstrate turn switching
        game.endTurn(); // US12
        game.endTurn(); // US12
    }
}