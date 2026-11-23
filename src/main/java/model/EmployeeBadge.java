// subclass
package model;

import java.util.Objects;

public class EmployeeBadge extends Card {
    // fields
    private String badgeNumber;

    // constructor
    public EmployeeBadge(){
        super();
    }

    public EmployeeBadge(String name, String badgeNumber){
        super(name);
        this.badgeNumber = badgeNumber;
    }

    // getters and setters
    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    // helper methods
    public String format(){
        return super.format() + ", Badge Number: " + badgeNumber;
    }

    // overrides
    @Override
    public String toString() {
        return "EmployeeBadge{" +
                "badgeNumber='" + badgeNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EmployeeBadge that = (EmployeeBadge) o;
        return Objects.equals(badgeNumber, that.badgeNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), badgeNumber);
    }
}