// subclass
package model;

import java.util.Objects;

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
        return super.format() + ", Membership Number: " + cardNumber;
    }

    // overrides
    @Override
    public String toString() {
        return "GymMembership{" +
                "cardNumber='" + cardNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GymMembership that = (GymMembership) o;
        return Objects.equals(cardNumber, that.cardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cardNumber);
    }
}