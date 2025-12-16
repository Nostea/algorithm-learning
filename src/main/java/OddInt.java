import java.util.HashMap;
import java.util.Map;

public class OddInt {

    public static int findInt(int[] a) {

        if (a.length == 1) {
            return a[0];
        } else {
            HashMap<Integer, Integer> uniqueNumbers = new HashMap<>();
            for (int number : a) {
                uniqueNumbers.put(number, uniqueNumbers.getOrDefault(number, 0) + 1);
            }

            for (Map.Entry<Integer, Integer> entry : uniqueNumbers.entrySet()) {
                if (entry.getValue() % 2 != 0) {
                    return entry.getKey();
                }
            }
        }

        return 0; // unreachable

    }

    public static void main(String[] args) {
        int[] numberArray = {1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1};
        findInt(numberArray);
        System.out.println(findInt(numberArray));
    }
}
