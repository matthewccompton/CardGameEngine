

public class Blackjack{

    private DeckOfCards deck;


    public Blackjack() {

        DeckOfCards newdeck = new DeckOfCards();
        Card[] deck = newdeck.getDeck();
        Cards hand = new Cards();
        hand.addCard(deck[5]);

        System.out.println(deck[5].getValue());
        
        hand.removeCard(deck[5]);

        // System.out.println(Game.credits.getCredits());
        // Game.credits.aCredits(100);
        // System.out.println(Game.credits.getCredits());
        // setDeck(newdeck);
        // //this.deck.printDeck();
        // System.out.println("!!!!");
        // this.deck.shuffleDeck();
        // System.out.println(deck.getDeck()[0].toString());
        // System.out.println(deck.getDeck()[0].getFace());
        // System.out.println(deck.getDeck()[0].getSuit());
        // System.out.println(deck.getDeck()[0].toString());
        // System.out.println(deck.getDeck()[0].getSpecial());
        // deck.getDeck()[0].setSpecial(true);
        // System.out.println(deck.getDeck()[0].getSpecial());
        // System.out.println(deck.getDeck()[0].getValue());

    }

    private void setDeck(DeckOfCards deck){
        this.deck = deck;
    }



}
