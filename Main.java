public class Main {
    public static void main(String[] args) {
        Menu newMenu = new Menu();
        //System.out.println(newMenu.selection);
        // Create an instance of a new game
        Game game = new Game(newMenu.selection);
        //game.LaunchGame();

        //Card card = new Card(null, null, 0);

    }
}