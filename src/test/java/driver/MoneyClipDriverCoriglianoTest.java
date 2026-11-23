package driver;

import model.EmployeeBadge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyClipDriverCoriglianoTest {
    @Test
    void cardEqualsTest() {
        EmployeeBadge me = new EmployeeBadge("Ziggy C", "0920TLVX");
        EmployeeBadge friend = new EmployeeBadge("Dylan K", "0919DNDM");
        assertEquals(me.equals(friend), false);

        friend = new EmployeeBadge("Ziggy C", "0920TLVX");
        assertEquals(me.equals(friend), true);


        me = new EmployeeBadge("Ziggy S", "0920TLVX");
        assertEquals(me.equals(friend), false);
    }
}