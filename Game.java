public class Game {
    // Attributes (fields)
    private int gamenumber;
    private int credits;

    // Constructor
    public Game(int slection, int credits) {
        this.gamenumber = slection;
        this.credits = credits;
    }

    public void LaunchGame(){
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
        System.out.println("Credits: " + this.credits);
    }

}