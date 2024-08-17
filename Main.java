public class Main {
    public static void main(String[] args) {
        Menu newMenu = new Menu();
        //System.out.println(newMenu.selection);
        // Create an instance of a new game
        Game game = new Game(newMenu.selection,5000);
        game.LaunchGame();
    }
}