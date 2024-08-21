public class Blackjack{

    private DeckOfCards deck;

    public Blackjack() {
        DeckOfCards newdeck = new DeckOfCards();
        setDeck(newdeck);

        this.deck.printDeck();
        System.out.println("!!!!");
        this.deck.shuffleDeck();


        System.out.println(deck.getDeck()[0].toString());
        System.out.println(deck.getDeck()[0].getFace());
        System.out.println(deck.getDeck()[0].getSuit());
        System.out.println(deck.getDeck()[0].toString());
        System.out.println(deck.getDeck()[0].getSpecial());
        deck.getDeck()[0].setSpecial(true);
        System.out.println(deck.getDeck()[0].getSpecial());
        System.out.println(deck.getDeck()[0].value);

    }
    

    private void setDeck(DeckOfCards deck){
        this.deck = deck;
    }



}
