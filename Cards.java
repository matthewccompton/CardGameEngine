import java.util.ArrayList;

//The point of this class is to be a dynamic collection of cards.  
public class Cards {

    private ArrayList all;

    Cards(){
    ArrayList<Card> cards = new ArrayList<>();
    this.all = cards;
    }

    public void addCard(Card card){
        System.out.println(card + " added");
        this.all.add(card);
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

}
