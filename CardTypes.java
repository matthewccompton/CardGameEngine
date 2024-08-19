
public class CardTypes {
    /** Face type is the card faces (Ace through King)
     *  @value - data field : value of the card (1, 2, ... 10)
     *  @icon - data field : the character for the card (A, 2, ... Q, K)
     *  @name - method : returns the string name (Ace, Two... Queen, King)
     */
    public enum Face { 
        Ace(1, 'A'), Two(2, '2'), Three(3, '3'), Four(4, '4'), 
        Five(5, '5'), Six(6, '6'), Seven(7, '7'), Eight(8, '8'), 
        Nine(9, '9'), Ten(10, 'T'), Jack(10, 'J'), Queen(10, 'Q'), King(10, 'K');
        int value;
        char icon;
        Face(int v, char i) {
            value = v;
            this.icon = i;
        }
    }
    /** Suit type is the card suits (Spade, Heart, Diamond, Club)
     *  @symbol - data field: the character for the suit (S, H, D, C)
     *  @name - method: returns the string name (Spades, Hearts, Diamonds, Clubs)
     */
    public enum Suit { 
        Spades('S'), Hearts('H'), Diamonds('D'), Clubs('C');
        char symbol;
        Suit(char c) {
            symbol = c;
        } 
    };
}