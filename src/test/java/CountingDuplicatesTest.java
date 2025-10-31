import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingDuplicatesTest {
    @Test
    public void sampleTests() {
        doTest("", 0);
        doTest("abcde", 0);
        doTest("abcdeaa", 1);
        doTest("abcdeaB", 2);
        doTest("Indivisibilities", 2);
        doTest("abcdefghijklmnopqrstuvwxyz", 0);
        doTest("abcdefghijklmnopqrstuvwxyzaaAb", 2);
        doTest("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz", 26);
        doTest("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", 26);
    }

    private static void doTest(String input, int expected) {
        String message = String.format("for input \"%s\"\n", input);
        int actual = CountingDuplicates.duplicateCount(input);
        assertEquals(expected, actual, message);
    }
}
