package model;

public class MoneyClip {
    // fields
    private Card slot1;
    private Card slot2;

    // constructors
    public MoneyClip(){
        super();
    }

    public MoneyClip(Card slot1, Card slot2){
        this.slot1 = slot1;
        this.slot2 = slot2;
    }

    // helper methods
    public void addCard(Card newCard){
        if(slot1 == null){
            slot1 = newCard;
        } else if(slot2 == null){
            slot2 = newCard;
        }
    }

    public String format(){
        return "Slot 1: " + slot1.format() + " | Slot 2: " + slot2.format();
    }
}
