import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplesOf3or5Test {
    @Test
    public void test() {
        assertEquals(23, new Multiplesof3or5().solveMultiplesOf3or5(10));
    }
}
