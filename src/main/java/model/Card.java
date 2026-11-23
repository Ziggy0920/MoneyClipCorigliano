// superclass
package model;

import java.util.Objects;

public class Card {
    // fields
    private String name;

    // constructors
    public Card(){}

    public Card(String name){
        this.name = name;
    }

    // helper methods
    public boolean isExpired(){
        return false;
    }

    public String format(){
        return "Card holder: " + name;
    }

    // overrides
    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(name, card.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}