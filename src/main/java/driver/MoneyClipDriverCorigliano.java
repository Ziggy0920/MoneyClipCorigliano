package driver;

import model.*;

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

        System.out.println("\n\n\n\n\n\n\n\n");

        MoneyClip clip1 = new MoneyClip(gym, employee);
        MoneyClip clip2 = new MoneyClip();

        clip2.addCard(student);
        clip2.addCard(basic);

        System.out.println(clip1.displayContents());
        System.out.println(clip2.displayContents());

        System.out.println("\n\n\n\n\n\n\n\n");

        StudentAccess s1 = new StudentAccess("Mickey Smith", "123456", LocalDate.of(2028, 2, 29));
        System.out.println(s1.format());
        System.out.println("Is it expired: " + s1.isExpired());
        StudentAccess s2 = new StudentAccess("Jackie Tyler", "905002", LocalDate.of(1970, 4, 4));
        System.out.println(s2.format());
        System.out.println("Is it expired: " + s2.isExpired());
    }
}