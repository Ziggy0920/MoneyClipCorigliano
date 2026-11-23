// subclass

public class EmployeeBadge extends Card {
    // fields
    private String badgeNumber;

    // constructor
    public EmployeeBadge(){
        super();
    }

    public EmployeeBadge(String badgeNumber){
        this.badgeNumber = badgeNumber;
    }

    // getters and setters
    public String getBadgeNumber(){
        return this.badgeNumber;
    }

    // toString
    @Override
    public String toString() {
        return "EmployeeBadge{" +
                "badgeNumber='" + badgeNumber + '\'' +
                '}';
    }
}