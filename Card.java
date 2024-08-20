public class Card {
    private final CardTypes.Face face;
    private final CardTypes.Suit suit;

    public Card(CardTypes.Face face, CardTypes.Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    public CardTypes.Face getFace() {
        return face;
    }

    public CardTypes.Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return face.getIcon() + "" + suit.getSymbol(); // For example: "AS" for Ace of Spades
    }
}