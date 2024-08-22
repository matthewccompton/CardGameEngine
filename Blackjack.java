

public class Blackjack{
    private Credits credits = Game.credits;

    private Cards playerHand;
    private Cards dealerHand;
    private Cards cardStack;
    private int playerHandEvaluation;

    public Blackjack() {
        DeckOfCards newdeck = new DeckOfCards();
        Card[] deck = newdeck.getDeck();

        makeCardsReady(deck);
        //Deal to player and dealer
        firstDeal();
        System.out.println("Player hand values");


        System.out.println("!!");
        int handval = 0;
        for(Card c: this.playerHand.all) {
            int value = c.getValue();
            String face = c.getFace().toString();
            System.out.println("Card Value:" + value);
            boolean isace = false;
            System.out.println("Card Face: "+face);
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

    private void firstDeal(){
        Cards newPlayerHand = new Cards();
        this.playerHand = newPlayerHand;
        Cards newDealerHand = new Cards();
        this.dealerHand = newDealerHand;

        
        Card playerCard1 = this.cardStack.pullCard();
        this.playerHand.addCard(playerCard1);
        Card dealerCard1 = this.cardStack.pullCard();
        this.dealerHand.addCard(dealerCard1);
        Card playerCard2 = this.cardStack.pullCard();
        this.playerHand.addCard(playerCard2);
        Card dealerCard2 = this.cardStack.pullCard();
        this.dealerHand.addCard(dealerCard2);
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