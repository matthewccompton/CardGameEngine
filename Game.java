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
        //This is code not supported in earlier versions of Java...  STUBB Complie this code instead?
        //     case 1 -> {
        //         System.out.println("Launching Blackjack...");
        //         Blackjack blackjack = new Blackjack();
        //     }
        //     case 2 -> {
        //         System.out.println("Launching Go Fish...");
        //         GoFish gofish = new GoFish();
        //     }
        //     case 3 -> {
        //         System.out.println("Launching Poker...");
        //         Poker poker = new Poker();
        //     }
        // }
    }

    //STUBB: Can add credits from external sources in the future here.
    private Credits makeCredits(){
        Credits credits = new Credits();
        //Check for external credits here... in the future 
        return credits;
    }

}