import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubblesortTest {
    // /mvn test
    @Test
    void testUnsortedArray() {
        int[] array = {2, 5, 32, 7, 13, 9, 1};
        BubbleSort.bubbleSort(array);
        assertArrayEquals(new int[]{1, 2, 5, 7, 9, 13, 32}, array);
    }

    @Test
    void testSortedArray() {
        int[] array = {1, 3, 4, 6, 7};
        BubbleSort.bubbleSort(array);
        assertArrayEquals(new int[]{1, 3, 4, 6, 7}, array);
    }

    @Test
    void singleNumberInArray() {
        int[] array = {42};
        assertArrayEquals(new int[]{42}, array);
    }

    @Test
    void testBubbleSortEmptyArray() {
        int[] array = {};
        assertArrayEquals(new int[]{}, array);
    }


}
