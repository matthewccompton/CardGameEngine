public final class Game {
    // Attributes (fields)
    private int gamenumber;

    // Constructor
    public Game(int selection) {
        System.out.println("Game Class!");
        setGameSelection(selection);
        LaunchGame();

    }

    private void setGameSelection(int selection){
        this.gamenumber = selection;
    }

    private void LaunchGame(){
        switch(this.gamenumber){
            case 1:
                System.out.println("Launching Blackjack...");
                Blackjack blackjack = new Blackjack();
                break;
            case 2:
                System.out.println("Launching Go Fish...");
                GoFish gofish = new GoFish();
                break;
            case 3:
                System.out.println("Launching Poker...");
                Poker poker = new Poker();
                break;
        }

    }

}