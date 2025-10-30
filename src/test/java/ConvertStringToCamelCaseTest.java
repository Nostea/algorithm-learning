import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertStringToCamelCaseTest {
    @Nested
    class SolutionTest {
        @Test
        public void testSomeUnderscoreLowerStart() {
            String input = "the_Stealth_Warrior";
            System.out.println("input: " + input);
            assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase(input));
        }

        @Test
        public void testSomeDashLowerStart() {
            String input = "the-Stealth-Warrior";
            System.out.println("input: " + input);
            assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase(input));
        }
    }

}
