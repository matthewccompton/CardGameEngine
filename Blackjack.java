public class Blackjack{
    private Credits credits = Game.credits;

    private Cards playerHand;
    private Cards dealerHand;
    private Cards cardStack;

    public Blackjack() {
        DeckOfCards newdeck = new DeckOfCards();
        Card[] deck = newdeck.getDeck();

        makeCardsReady(deck);
        //Deal to player and dealer
        firstDeal();

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