import java.util.ArrayList;
import java.util.Collections;

//The point of this class is to be a dynamic collection of cards.  
public class Cards {

    public ArrayList<Card> all;

    Cards(){
    ArrayList<Card> cards = new ArrayList<>();
    this.all = cards;
    }

    public Card getCard(int index) {
        int indexToCheck = index;
        if (indexToCheck >= 0 && indexToCheck < this.all.size()) {
            return this.all.get(index);
        } else {
            System.out.println("ERROR!" + indexToCheck + " does not exist in the Cards list.");
        }
        return null;
    }

    public void addCard(Card card){
        //System.out.println(card + " added");
        this.all.add(card);
    }

    // Method to shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(this.all);
        System.out.println("Cards Shuffled!");
    }

    // Method to remove a specific card from the ArrayList
    public void removeCard(Card card) {
        if (this.all.contains(card)) {
            this.all.remove(card);
            //System.out.println(card + " has been removed.");
        } else {
            System.out.println("ERROR: " + card + " is not in the list.");
        }
    }

    public Card pullCard(){
        Card returnCard = null;
        if(!this.all.isEmpty()){
            returnCard = this.all.get(0);
            this.all.remove(0);
            return returnCard;
        }
        else{
            System.out.println("ERROR: EMPTY CARD STACK!");
        }
        return returnCard;
    }

}
