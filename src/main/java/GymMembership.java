// subclass

public class GymMembership extends Card {
    // fields
    private String cardNumber;

    // constructor
    public GymMembership(){
        super();
    }

    public GymMembership(String cardNumber){
        this.cardNumber = cardNumber;
    }

    // getters and setters
    public String getCardNumber(){
        return this.cardNumber;
    }

    // toString
    @Override
    public String toString() {
        return "GymMembership{" +
                "cardNumber='" + cardNumber + '\'' +
                '}';
    }
}