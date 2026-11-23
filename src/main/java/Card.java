// superclass

public class Card{
    // fields
    private String name;

    // constructors
    public Card(){}

    public Card(String name){
        this.name = name;
    }

    // getters and setters
    public boolean isExpired(){
        return false;
    }

    public String format(){
        return "Card holder: " + name;
    }

    // toString

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                '}';
    }
}