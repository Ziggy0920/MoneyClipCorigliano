// subclass
package model;

public class GymMembership extends Card {
    // fields
    private String cardNumber;

    // constructor
    public GymMembership(){
        super();
    }

    public GymMembership(String name, String cardNumber){
        super(name);
        this.cardNumber = cardNumber;
    }

    // getters and setters
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // helper methods
    public String format(){
        return super.format() + ", Card Number: " + cardNumber;
    }

    // toString
    @Override
    public String toString() {
        return "GymMembership{" +
                "cardNumber='" + cardNumber + '\'' +
                '}';
    }
}