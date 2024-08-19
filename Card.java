public class Card {
    private String face;
    private String suit;
    private int value;

    public Card(String face, String suit, int value){
        this.face = face;
        this.suit = suit;
        this.value = value;
        System.out.println("!!");
    }

    public String getFace(){
        return face;
    }
    public String getSuit(){
        return suit;
    }
    public int getValue(){
        return value;
    }

    public void setFace(String face){
        this.face = face;
    }
    public void setSuit(String suit){
        this.suit = suit;
    }
    public void setValue(int value){
        this.value = value;
    }

}
