package driver;

import model.Card;
import model.EmployeeBadge;
import model.GymMembership;
import model.StudentAccess;

import java.time.LocalDate;

public class MoneyClipDriverCorigliano {
    static void main(String[] args) {
        Card basic = new Card("John Smith");
        EmployeeBadge employee = new EmployeeBadge("Donna Noble", "10101010");
        GymMembership gym = new GymMembership("Jack Harkness", "4224");
        StudentAccess student = new StudentAccess("Rose Tyler", "200509", LocalDate.of(2005, 12, 25));

        System.out.println(basic.format());
        System.out.println(employee.format());
        System.out.println(gym.format());
        System.out.println(student.format());
    }
}