public final class Game {
    // Attributes
    private int gamenumber;
    public static Credits credits;

    // Constructor
    public Game(int selection) {
        setGameSelection(selection);
        Credits newcredits = makeCredits();
        Game.credits = newcredits;
        LaunchGame();
    }

    public void setGameSelection(int selection){
        this.gamenumber = selection;
    }

    private void LaunchGame(){
        switch(this.gamenumber){
            case 1 -> {
                System.out.println("Launching Blackjack...");
                Blackjack blackjack = new Blackjack();
            }
            case 2 -> {
                System.out.println("Launching Go Fish...");
                GoFish gofish = new GoFish();
            }
            case 3 -> {
                System.out.println("Launching Poker...");
                Poker poker = new Poker();
            }
        }

        //System.out.println(credits.getCredits());

    }

    //STUBB: Can add credits from external sources in the future here.
    private Credits makeCredits(){
        Credits credits = new Credits();
        //Check for external credits here... in the future 
        return credits;
    }

}