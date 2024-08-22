public class DeckOfCards {
    private Card[] deck; // Array to hold 52 card objects

    public DeckOfCards() {
        deck = new Card[52]; // Initialize the array with 52 elements
        initializeDeck();    // Populate the deck with card objects
    }

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

    // Method to print the deck
    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }
}