

public class Card {
    private final CardTypes.Face face;
    private final CardTypes.Suit suit;
    private final int value;
    private boolean special;

    public Card(CardTypes.Face face, CardTypes.Suit suit, int value) {
        this.face = face;
        this.suit = suit;
        this.value = value;
        this.special = false;
    }

    public CardTypes.Face getFace() {
        return this.face;
    }

    public CardTypes.Suit getSuit() {
        return this.suit;
    }

    public int getValue(){
        return this.value;
    }

    public boolean getSpecial(){
        return this.special;
    }

    public void setSpecial(boolean setting){
        this.special = setting;
    }

    @Override
    public String toString() {
        return face.getIcon() + "" + suit.getSymbol(); // For example: "AS" for Ace of Spades
    }
}
