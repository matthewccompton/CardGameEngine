public class Credits {
    private int credits;
    
    public Credits(){
        this.credits = 0;
    }

    public int getCredits(){
        return this.credits;
    }
    //add credits
    public void aCredits(int amt){
        this.credits += amt;
    }
    //subtract credits
    public void sCredits(int amt){
        this.credits -= amt;
    }

}
    
