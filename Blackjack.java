public class Blackjack{

    private Cards playerHand;
    private Cards dealerHand;
    private Cards cardStack;
    private boolean playGame;


    public Blackjack() {
        System.out.println("\nWelcome to BlackJack!\n");
        
        // Get a deck of cards
        DeckOfCards newdeck = new DeckOfCards(); // Unshuffled generic deck

        // Form the cards for this game
        makeCardsReady(newdeck.getDeck()); 
        PlayGame();

    }

    private void PlayGame(){
        this.playGame = true;
         do { 
            // Deal to player and dealer
            firstDeal();
            readItOut();


            this.playGame = false;
         } while (playGame);
    }

    private void readItOut(){
        System.out.println("\nReading the situation...");
        int handval = 0;
        for(Card c: this.playerHand.all) {
            int value = c.getValue();
            String face = c.getFace().toString();
            System.out.println("Card Value:" + value);
            boolean isace = false;
            System.out.println("Card Face: " + face);
            if(face.equals("Ace")){
            isace = true;
            System.out.println("Ace Face!");
            }
            if(value == 1){
                System.out.println("Ace is present");
                handval += 11;
            }
            else{
                handval +=c.getValue();
            }
        }
        System.out.println("Hand Value after eval: " + handval + "\n");
        //Debug
        System.out.println("Dealer is showing: " + this.dealerHand.getCard(0));
        System.out.println("Player has: (" + this.playerHand.getCard(0) + ") and is showing: " + this.playerHand.getCard(1));
        System.out.println("Dealer is not showing: ("+this.dealerHand.getCard(1)+")");
        System.out.println("Dealer has a hand value of: " + (this.dealerHand.getCard(0))); //+this.dealerHand.getCard(0).getValue()) );
    }

    // First deal in blackjack is worthy of its own function
    private void firstDeal(){
        this.playerHand = new Cards();
        this.dealerHand = new Cards();
        for(int i=0; i < 2; i++){
            this.playerHand.addCard(this.cardStack.pullCard());
            this.dealerHand.addCard(this.cardStack.pullCard());
        }
    // DATABASE UPDATE HERE ???
    }



    private void makeCardsReady(Card[] deck){
        Cards newCardStack = new Cards();
        this.cardStack = newCardStack;
        for (Card card : deck) {
            this.cardStack.addCard(card);
        }
        cardStack.shuffleDeck();
    }
}