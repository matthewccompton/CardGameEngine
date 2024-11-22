// The deck of cards class is a strict array filled with cards.

public class DeckOfCards {
    private final Card[] deck; // Strictly sized to hold cards

    public DeckOfCards() {
        deck = new Card[52]; // Initialize the array with 52 elements
        initializeDeck();    // Populate the deck with card objects
    }

    //Takes the CardTypes class and its enumeration and puts 52 cards into the array
       private void initializeDeck() {
        int index = 0;
        for (CardTypes.Suit suit : CardTypes.Suit.values()) {
            for (CardTypes.Face face : CardTypes.Face.values()) {
                deck[index++] = new Card(face, suit, face.value); // Create a new card and add it to the deck
            }
        }
    }

    // Method to get the deck of cards
    public Card[] getDeck() {
        return deck;
    }

    // Method to print the deck, this probably never gets called but can be a debug tool.
    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }
}