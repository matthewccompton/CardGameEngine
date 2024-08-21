public final class Game {
    // Attributes (fields)
    private int gamenumber;
    public static Credits credits;

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
        Credits newcredits = makeCredits();
        this.credits = newcredits;

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

        //System.out.println(credits.getCredits());

    }

    private Credits makeCredits(){
        Credits credits = new Credits();
        return credits;
    }

}