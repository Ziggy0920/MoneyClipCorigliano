// subclass

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

    // toString
    @Override
    public String toString() {
        return "EmployeeBadge{" +
                "badgeNumber='" + badgeNumber + '\'' +
                '}';
    }
}