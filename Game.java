public class Game {
    // Attributes (fields)
    private int gamenumber;
    private int credits;

    // Constructor
    public Game(int slection, int credits) {
        this.gamenumber = slection;
        this.credits = credits;
    }

    public void LaunchGame(){
        switch(this.gamenumber){
            case 1 -> System.out.println("Selection 1, This is intended to play Black Jack");
            case 2 -> System.out.println("Selection 2, This is meant to play go fish");
            case 3 -> System.out.println("Selection 3, this is meant to play poker");
        }

        System.out.println("Credits: " + this.credits);
    }
    // Method to display person's details
    // public void displayInfo() {
    //     System.out.println("Name: " + name);
    //     System.out.println("Age: " + age);
    // }

    // Getters and Setters (optional)
    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public int getAge() {
    //     return age;
    // }

    // public void setAge(int age) {
    //     this.age = age;
    // }
}