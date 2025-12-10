import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {
    @Test
    public void testIsLeapYear() {
        assertTrue(LeapYear.evaluateLeapyear(1980));
        assertTrue(LeapYear.evaluateLeapyear(1972));
        assertTrue(LeapYear.evaluateLeapyear(1720));
        assertTrue(LeapYear.evaluateLeapyear(1600));
        assertTrue(LeapYear.evaluateLeapyear(2000));
    }

    @Test
    public void testNotLeapYear() {
        assertFalse(LeapYear.evaluateLeapyear(1900));
        assertFalse(LeapYear.evaluateLeapyear(1800));
        assertFalse(LeapYear.evaluateLeapyear(2100));
        assertFalse(LeapYear.evaluateLeapyear(2001));
        assertFalse(LeapYear.evaluateLeapyear(2023));
    }
}
